public class cpm {
   private static final double a = 50.0;

   public static ffc a(bxj $$0, azv $$1) {
      int $$2 = 90;
      float $$3 = $$0.aX + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azm.h($$1.i(), 4.0F, 8.0F);
      ffc $$5 = ffc.a(0.0F, $$3).c((double)$$4);
      return $$0.ds().e($$5);
   }

   public static boolean a(cpk $$0, ffc $$1) {
      ffc $$2 = new ffc($$0.dz(), $$0.dB(), $$0.dF());
      return $$1.f($$2) > a($$0) ? false : $$0.dU().a(new dit($$2, $$1, dit.a.a, dit.b.a, $$0)).d() == ffa.a.a;
   }

   private static double a(cpk $$0) {
      return Math.max(50.0, $$0.h(byp.m));
   }
}
