import java.util.function.Supplier;

public enum ckm implements ckk {
   a(0, 59, 2.0F, 0.0F, 15, () -> clx.a(apt.b)),
   b(1, 131, 4.0F, 1.0F, 5, () -> clx.a(apt.ax)),
   c(2, 250, 6.0F, 2.0F, 14, () -> clx.a(cja.nQ)),
   d(3, 1561, 8.0F, 3.0F, 10, () -> clx.a(cja.nK)),
   e(0, 32, 12.0F, 0.0F, 22, () -> clx.a(cja.nU)),
   f(4, 2031, 9.0F, 4.0F, 15, () -> clx.a(cja.nV));

   private final int g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final ark<clx> l;

   private ckm(int $$0, int $$1, float $$2, float $$3, int $$4, Supplier<clx> $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = new ark<>($$5);
   }

   @Override
   public int a() {
      return this.h;
   }

   @Override
   public float b() {
      return this.i;
   }

   @Override
   public float c() {
      return this.j;
   }

   @Override
   public int d() {
      return this.g;
   }

   @Override
   public int e() {
      return this.k;
   }

   @Override
   public clx f() {
      return this.l.a();
   }
}
