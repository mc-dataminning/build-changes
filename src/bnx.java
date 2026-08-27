public abstract class bnx extends boi {
   protected bnx(bnu<? extends bnx> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dlf $$2, hz $$3) {
   }

   @Override
   public void a(ens $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bol.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bol.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dM().a_(this.aI()).b().i() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dM().a_(this.aI()).b().i() * 0.91F;
            }

            this.a(this.aC() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bol.a, this.dp());
            this.g(this.dp().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean e_() {
      return false;
   }
}
