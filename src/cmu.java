public class cmu {
   private static final double a = 50.0;

   public static fay a(bvf $$0, azg $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = ayy.h($$1.i(), 4.0F, 8.0F);
      fay $$5 = fay.a(0.0F, $$3).c((double)$$4);
      return $$0.du().e($$5);
   }

   public static boolean a(cms $$0, fay $$1) {
      fay $$2 = new fay($$0.dB(), $$0.dD(), $$0.dH());
      return $$1.f($$2) > a($$0) ? false : $$0.dW().a(new dfo($$2, $$1, dfo.a.a, dfo.b.a, $$0)).d() == faw.a.a;
   }

   private static double a(cms $$0) {
      return Math.max(50.0, $$0.h(bwn.m));
   }
}
