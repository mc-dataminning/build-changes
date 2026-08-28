public class cnv {
   private static final double a = 50.0;

   public static fby a(bwg $$0, bam $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = bae.h($$1.i(), 4.0F, 8.0F);
      fby $$5 = fby.a(0.0F, $$3).c((double)$$4);
      return $$0.du().e($$5);
   }

   public static boolean a(cnt $$0, fby $$1) {
      fby $$2 = new fby($$0.dB(), $$0.dD(), $$0.dH());
      return $$1.f($$2) > a($$0) ? false : $$0.dW().a(new dgq($$2, $$1, dgq.a.a, dgq.b.a, $$0)).d() == fbw.a.a;
   }

   private static double a(cnt $$0) {
      return Math.max(50.0, $$0.h(bxo.m));
   }
}
