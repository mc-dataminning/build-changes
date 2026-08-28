public class coh {
   private static final double a = 50.0;

   public static fcu a(bwr $$0, azs $$1) {
      int $$2 = 90;
      float $$3 = $$0.aW + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azk.h($$1.i(), 4.0F, 8.0F);
      fcu $$5 = fcu.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cof $$0, fcu $$1) {
      fcu $$2 = new fcu($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new dgy($$2, $$1, dgy.a.a, dgy.b.a, $$0)).d() == fcs.a.a;
   }

   private static double a(cof $$0) {
      return Math.max(50.0, $$0.h(bxx.m));
   }
}
