public class cpc {
   private static final double a = 50.0;

   public static feq a(bxe $$0, azv $$1) {
      int $$2 = 90;
      float $$3 = $$0.aX + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azm.h($$1.i(), 4.0F, 8.0F);
      feq $$5 = feq.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cpa $$0, feq $$1) {
      feq $$2 = new feq($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new dij($$2, $$1, dij.a.a, dij.b.a, $$0)).d() == feo.a.a;
   }

   private static double a(cpa $$0) {
      return Math.max(50.0, $$0.h(byk.m));
   }
}
