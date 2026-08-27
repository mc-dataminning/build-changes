public class btb extends btl {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bjm $$0, bjm $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && btr.c($$0, $$1);
   }

   private boolean e(bjm $$0, bjm $$1) {
      return !$$0.dN().a(bsn.T) && $$1.ag().a(apy.j);
   }

   private boolean b(bjm $$0) {
      return $$0.ag().a(apy.i);
   }

   private boolean f(bjm $$0, bjm $$1) {
      return $$1.f((biw)$$0) <= 64.0;
   }

   @Override
   protected bsn<bjm> b() {
      return bsn.B;
   }
}
