public class cdj extends cdv {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btr $$0, btr $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && ceb.c($$0, $$1);
   }

   private boolean e(btr $$0, btr $$1) {
      return !$$0.dS().a(ccv.U) && $$1.ak().a(awt.j);
   }

   private boolean b(btr $$0) {
      return $$0.ak().a(awt.i);
   }

   private boolean f(btr $$0, btr $$1) {
      return $$1.g((bsw)$$0) <= 64.0;
   }

   @Override
   protected ccv<btr> b() {
      return ccv.B;
   }
}
