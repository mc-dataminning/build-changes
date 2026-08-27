public class bvl extends bvw {
   public static final float a = 8.0F;

   @Override
   protected boolean a(blv $$0, blv $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bwc.c($$0, $$1);
   }

   private boolean e(blv $$0, blv $$1) {
      return !$$0.dO().a(bux.T) && $$1.ai().a(aru.j);
   }

   private boolean b(blv $$0) {
      return $$0.ai().a(aru.i);
   }

   private boolean f(blv $$0, blv $$1) {
      return $$1.f((blf)$$0) <= 64.0;
   }

   @Override
   protected bux<blv> b() {
      return bux.B;
   }
}
