public class cnu {
   private static final double a = 50.0;

   public static fbx a(bwf $$0, bam $$1) {
      int $$2 = 90;
      float $$3 = $$0.aZ + 180.0F + (float)$$1.k() * 90.0F / 2.0F;
      float $$4 = bae.h($$1.i(), 4.0F, 8.0F);
      fbx $$5 = fbx.a(0.0F, $$3).c((double)$$4);
      return $$0.dt().e($$5);
   }

   public static boolean a(cns $$0, fbx $$1) {
      fbx $$2 = new fbx($$0.dA(), $$0.dC(), $$0.dG());
      return $$1.f($$2) > a($$0) ? false : $$0.dV().a(new dgp($$2, $$1, dgp.a.a, dgp.b.a, $$0)).d() == fbv.a.a;
   }

   private static double a(cns $$0) {
      return Math.max(50.0, $$0.h(bxn.m));
   }
}
