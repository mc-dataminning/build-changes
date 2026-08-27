public class bvv extends bwg {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bmf $$0, bmf $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bwm.c($$0, $$1);
   }

   private boolean e(bmf $$0, bmf $$1) {
      return !$$0.dO().a(bvh.T) && $$1.ai().a(ase.j);
   }

   private boolean b(bmf $$0) {
      return $$0.ai().a(ase.i);
   }

   private boolean f(bmf $$0, bmf $$1) {
      return $$1.f((blp)$$0) <= 64.0;
   }

   @Override
   protected bvh<bmf> b() {
      return bvh.B;
   }
}
