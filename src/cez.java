public class cez extends cfl {
   public static final float a = 8.0F;

   @Override
   protected boolean a(ard $$0, bvh $$1, bvh $$2) {
      return this.b($$1, $$2) && $$2.bm() && (this.b($$2) || this.a($$1, $$2)) && cfr.c($$0, $$1, $$2);
   }

   private boolean a(bvh $$0, bvh $$1) {
      return !$$0.eb().a(cel.U) && $$1.aq().a(awt.j);
   }

   private boolean b(bvh $$0) {
      return $$0.aq().a(awt.i);
   }

   private boolean b(bvh $$0, bvh $$1) {
      return $$1.g((bul)$$0) <= 64.0;
   }

   @Override
   protected cel<bvh> b() {
      return cel.B;
   }
}
