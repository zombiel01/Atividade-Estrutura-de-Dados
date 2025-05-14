import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Stack;

public class ClienteDePilhaStack {

    public static void main(String[] args) {
        Stack<String> pilha;
        pilha = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String str = StdIn.readString();
            if (!str.equals("-"))
                pilha.push(str);
            else if (!pilha.isEmpty())
                StdOut.print(pilha.pop() + " ");
        }
        StdOut.println("(" + pilha.size() + " left on stack)");
    }
}