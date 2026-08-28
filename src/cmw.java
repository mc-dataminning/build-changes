public class cmw {
   private static final double a = 50.0;

   public static fba a(bvh $$0, azh $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = ayz.h($$1.i(), 4.0F, 8.0F);
      fba $$5 = fba.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cmu $$0, fba $$1) {
      fba $$2 = new fba($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new dfq($$2, $$1, dfq.a.a, dfq.b.a, $$0)).d() == fay.a.a;
   }

   private static double a(cmu $$0) {
      return Math.max(50.0, $$0.h(bwp.m));
   }
}
