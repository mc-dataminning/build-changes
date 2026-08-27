public class bxv extends byh {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bog $$0, bog $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && byn.c($$0, $$1);
   }

   private boolean e(bog $$0, bog $$1) {
      return !$$0.dO().a(bxh.U) && $$1.ai().a(auc.j);
   }

   private boolean b(bog $$0) {
      return $$0.ai().a(auc.i);
   }

   private boolean f(bog $$0, bog $$1) {
      return $$1.f((bno)$$0) <= 64.0;
   }

   @Override
   protected bxh<bog> b() {
      return bxh.B;
   }
}
