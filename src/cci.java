public class cci extends ccu {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bsq $$0, bsq $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && cda.c($$0, $$1);
   }

   private boolean e(bsq $$0, bsq $$1) {
      return !$$0.dS().a(cbu.U) && $$1.ak().a(awa.j);
   }

   private boolean b(bsq $$0) {
      return $$0.ak().a(awa.i);
   }

   private boolean f(bsq $$0, bsq $$1) {
      return $$1.g((brw)$$0) <= 64.0;
   }

   @Override
   protected cbu<bsq> b() {
      return cbu.B;
   }
}
