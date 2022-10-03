package to.msn.wings.selflearn.challenge;

public class Sum1 {
    private int num1;
    private int num2;
    private int sum;

    public Sum1() {
    }

    public Sum1(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

    public int setSum() {
         sum = num1 + num2;
        return sum;

    }

    public void display() {
        System.out.println("合計は " + setSum() + "です");
    }

}
