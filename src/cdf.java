public class cdf extends cdr {
   public static final float a = 8.0F;

   @Override
   protected boolean a(btn $$0, btn $$1) {
      return this.f($$0, $$1) && $$1.bh() && (this.b($$1) || this.e($$0, $$1)) && cdx.c($$0, $$1);
   }

   private boolean e(btn $$0, btn $$1) {
      return !$$0.dS().a(ccr.U) && $$1.ak().a(aws.j);
   }

   private boolean b(btn $$0) {
      return $$0.ak().a(aws.i);
   }

   private boolean f(btn $$0, btn $$1) {
      return $$1.g((bss)$$0) <= 64.0;
   }

   @Override
   protected ccr<btn> b() {
      return ccr.B;
   }
}
