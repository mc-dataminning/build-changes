public class cnq {
   private static final double a = 50.0;

   public static fbx a(bvy $$0, azh $$1) {
      int $$2 = 90;
      float $$3 = $$0.aX + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = ayz.h($$1.i(), 4.0F, 8.0F);
      fbx $$5 = fbx.a(0.0F, $$3).c((double)$$4);
      return $$0.ds().e($$5);
   }

   public static boolean a(cno $$0, fbx $$1) {
      fbx $$2 = new fbx($$0.dz(), $$0.dB(), $$0.dF());
      return $$1.f($$2) > a($$0) ? false : $$0.dU().a(new dgi($$2, $$1, dgi.a.a, dgi.b.a, $$0)).d() == fbv.a.a;
   }

   private static double a(cno $$0) {
      return Math.max(50.0, $$0.h(bxg.m));
   }
}
