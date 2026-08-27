import java.util.function.Consumer;

public class ffa implements fex {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public ffa(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public ffa(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static ffa a(int $$0) {
      return new ffa($$0, 0);
   }

   public static ffa b(int $$0) {
      return new ffa(0, $$0);
   }

   @Override
   public void m(int $$0) {
      this.a = $$0;
   }

   @Override
   public void n(int $$0) {
      this.b = $$0;
   }

   @Override
   public int B() {
      return this.a;
   }

   @Override
   public int C() {
      return this.b;
   }

   @Override
   public int w() {
      return this.c;
   }

   @Override
   public int u() {
      return this.d;
   }

   @Override
   public void a(Consumer<fbg> $$0) {
   }
}
