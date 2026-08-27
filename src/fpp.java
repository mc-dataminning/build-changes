public class fpp implements fpg<ddd> {
   public static final gak a = new gak(fyf.e, new aep("entity/enchanting_table_book"));
   private final fdt b;

   public fpp(fph.a $$0) {
      this.b = new fdt($$0.a(fhi.m));
   }

   public void a(ddd $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + aro.a($$6 * 0.1F) * 0.01F, 0.0F);
      float $$7 = $$0.h - $$0.i;

      while ($$7 >= (float) Math.PI) {
         $$7 -= (float) (Math.PI * 2);
      }

      while ($$7 < (float) -Math.PI) {
         $$7 += (float) (Math.PI * 2);
      }

      float $$8 = $$0.i + $$7 * $$1;
      $$2.a(a.d.rotation(-$$8));
      $$2.a(a.f.rotationDegrees(80.0F));
      float $$9 = aro.i($$1, $$0.c, $$0.b);
      float $$10 = aro.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = aro.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = aro.i($$1, $$0.g, $$0.f);
      this.b.a($$6, aro.a($$10, 0.0F, 1.0F), aro.a($$11, 0.0F, 1.0F), $$12);
      ell $$13 = a.a($$3, fno::b);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
