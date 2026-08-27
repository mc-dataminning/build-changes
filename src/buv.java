public class buv extends bvf {
   public static final float a = 8.0F;

   @Override
   protected boolean a(blg $$0, blg $$1) {
      return this.f($$0, $$1) && $$1.bc() && (this.b($$1) || this.e($$0, $$1)) && bvl.c($$0, $$1);
   }

   private boolean e(blg $$0, blg $$1) {
      return !$$0.dP().a(buh.T) && $$1.ai().a(arj.j);
   }

   private boolean b(blg $$0) {
      return $$0.ai().a(arj.i);
   }

   private boolean f(blg $$0, blg $$1) {
      return $$1.f((bkq)$$0) <= 64.0;
   }

   @Override
   protected buh<blg> b() {
      return buh.B;
   }
}
