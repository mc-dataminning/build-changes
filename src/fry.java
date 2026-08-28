import java.util.function.Consumer;

public class fry implements frv {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public fry(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public fry(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static fry a(int $$0) {
      return new fry($$0, 0);
   }

   public static fry b(int $$0) {
      return new fry(0, $$0);
   }

   @Override
   public void k(int $$0) {
      this.a = $$0;
   }

   @Override
   public void l(int $$0) {
      this.b = $$0;
   }

   @Override
   public int D() {
      return this.a;
   }

   @Override
   public int E() {
      return this.b;
   }

   @Override
   public int y() {
      return this.c;
   }

   @Override
   public int w() {
      return this.d;
   }

   @Override
   public void a(Consumer<foc> $$0) {
   }
}
