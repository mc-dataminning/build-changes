public class cpz {
   private static final double a = 50.0;

   public static ffs a(bxw $$0, azz $$1) {
      int $$2 = 90;
      float $$3 = $$0.aX + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azq.h($$1.i(), 4.0F, 8.0F);
      ffs $$5 = ffs.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cpx $$0, ffs $$1) {
      ffs $$2 = new ffs($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new djg($$2, $$1, djg.a.a, djg.b.a, $$0)).d() == ffq.a.a;
   }

   private static double a(cpx $$0) {
      return Math.max(50.0, $$0.h(bzc.m));
   }
}
