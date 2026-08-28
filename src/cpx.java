public class cpx {
   private static final double a = 50.0;

   public static ffq a(bxu $$0, azx $$1) {
      int $$2 = 90;
      float $$3 = $$0.aX + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azo.h($$1.i(), 4.0F, 8.0F);
      ffq $$5 = ffq.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cpv $$0, ffq $$1) {
      ffq $$2 = new ffq($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new dje($$2, $$1, dje.a.a, dje.b.a, $$0)).d() == ffo.a.a;
   }

   private static double a(cpv $$0) {
      return Math.max(50.0, $$0.h(bza.m));
   }
}
