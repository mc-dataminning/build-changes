public class cnm {
   private static final double a = 50.0;

   public static fbr a(bvx $$0, bac $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = azu.h($$1.i(), 4.0F, 8.0F);
      fbr $$5 = fbr.a(0.0F, $$3).c((double)$$4);
      return $$0.du().e($$5);
   }

   public static boolean a(cnk $$0, fbr $$1) {
      fbr $$2 = new fbr($$0.dB(), $$0.dD(), $$0.dH());
      return $$1.f($$2) > a($$0) ? false : $$0.dW().a(new dgh($$2, $$1, dgh.a.a, dgh.b.a, $$0)).d() == fbp.a.a;
   }

   private static double a(cnk $$0) {
      return Math.max(50.0, $$0.h(bxf.m));
   }
}
