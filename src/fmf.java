import java.util.function.Consumer;

public class fmf implements fmc {
   private int a;
   private int b;
   private final int c;
   private final int d;

   public fmf(int $$0, int $$1) {
      this(0, 0, $$0, $$1);
   }

   public fmf(int $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public static fmf a(int $$0) {
      return new fmf($$0, 0);
   }

   public static fmf b(int $$0) {
      return new fmf(0, $$0);
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
   public int C() {
      return this.a;
   }

   @Override
   public int D() {
      return this.b;
   }

   @Override
   public int x() {
      return this.c;
   }

   @Override
   public int v() {
      return this.d;
   }

   @Override
   public void a(Consumer<fil> $$0) {
   }
}
