import java.util.function.Consumer;

public class fey implements fev {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public fey(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public fey(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static fey a(int $$0) {
      return new fey($$0, 0);
   }

   public static fey b(int $$0) {
      return new fey(0, $$0);
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
   public void a(Consumer<fbe> $$0) {
   }
}
