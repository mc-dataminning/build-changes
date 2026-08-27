public class bun extends bux {
   public static final float a = 8.0F;

   @Override
   protected boolean a(bky $$0, bky $$1) {
      return this.f($$0, $$1) && $$1.ba() && (this.b($$1) || this.e($$0, $$1)) && bvd.c($$0, $$1);
   }

   private boolean e(bky $$0, bky $$1) {
      return !$$0.dN().a(btz.T) && $$1.ag().a(arf.j);
   }

   private boolean b(bky $$0) {
      return $$0.ag().a(arf.i);
   }

   private boolean f(bky $$0, bky $$1) {
      return $$1.f((bki)$$0) <= 64.0;
   }

   @Override
   protected btz<bky> b() {
      return btz.B;
   }
}
