import java.util.function.Supplier;

public enum csx implements csv {
   a(0, 59, 2.0F, 0.0F, 15, () -> cvg.a(avk.b)),
   b(1, 131, 4.0F, 1.0F, 5, () -> cvg.a(avk.ax)),
   c(2, 250, 6.0F, 2.0F, 14, () -> cvg.a(crm.oD)),
   d(3, 1561, 8.0F, 3.0F, 10, () -> cvg.a(crm.ox)),
   e(0, 32, 12.0F, 0.0F, 22, () -> cvg.a(crm.oH)),
   f(4, 2031, 9.0F, 4.0F, 15, () -> cvg.a(crm.oI));

   private final int g;
   private final int h;
   private final float i;
   private final float j;
   private final int k;
   private final axf<cvg> l;

   private csx(int $$0, int $$1, float $$2, float $$3, int $$4, Supplier<cvg> $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = $$4;
      this.l = new axf<>($$5);
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
   public cvg f() {
      return this.l.a();
   }
}
