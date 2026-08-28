public class cnq {
   private static final double a = 50.0;

   public static fbs a(bwb $$0, bam $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = bae.h($$1.i(), 4.0F, 8.0F);
      fbs $$5 = fbs.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cno $$0, fbs $$1) {
      fbs $$2 = new fbs($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new dgi($$2, $$1, dgi.a.a, dgi.b.a, $$0)).d() == fbq.a.a;
   }

   private static double a(cno $$0) {
      return Math.max(50.0, $$0.h(bxj.m));
   }
}
