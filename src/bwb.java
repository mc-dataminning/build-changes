public class bwb extends bwm {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bml $$0, bml $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bws.c($$0, $$1);
   }

   private boolean e(bml $$0, bml $$1) {
      return !$$0.dO().a(bvn.T) && $$1.ai().a(ask.j);
   }

   private boolean b(bml $$0) {
      return $$0.ai().a(ask.i);
   }

   private boolean f(bml $$0, bml $$1) {
      return $$1.f((blv)$$0) <= 64.0;
   }

   @Override
   protected bvn<bml> b() {
      return bvn.B;
   }
}
