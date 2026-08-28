public class cly {
   private static final double a = 50.0;

   public static eys a(buk $$0, azl $$1) {
      int $$2 = 90;
      float $$3 = $$0.aV + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azd.h($$1.i(), 4.0F, 8.0F);
      eys $$5 = eys.a(0.0F, $$3).c((double)$$4);
      return $$0.dq().e($$5);
   }

   public static boolean a(clw $$0, eys $$1) {
      eys $$2 = new eys($$0.dx(), $$0.dz(), $$0.dD());
      return $$1.f($$2) > a($$0) ? false : $$0.dS().a(new ddo($$2, $$1, ddo.a.a, ddo.b.a, $$0)).d() == eyq.a.a;
   }

   private static double a(clw $$0) {
      return Math.max(50.0, $$0.h(bvr.m));
   }
}
