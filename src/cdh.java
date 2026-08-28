public class cdh extends cdt {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btp $$0, btp $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && cdz.c($$0, $$1);
   }

   private boolean e(btp $$0, btp $$1) {
      return !$$0.dS().a(cct.U) && $$1.ak().a(awt.j);
   }

   private boolean b(btp $$0) {
      return $$0.ak().a(awt.i);
   }

   private boolean f(btp $$0, btp $$1) {
      return $$1.g((bsu)$$0) <= 64.0;
   }

   @Override
   protected cct<btp> b() {
      return cct.B;
   }
}
