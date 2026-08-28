public abstract class buv extends bvg {
   protected buv(bup<? extends buv> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk()) {
         if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bvi.a, this.dB());
            this.h(this.dB().c(0.8F));
         } else if (this.bz()) {
            this.a(0.02F, $$0);
            this.a(bvi.a, this.dB());
            this.h(this.dB().c(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aL()) {
               $$1 = this.dY().a_(this.aS()).b().g() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aL()) {
               $$1 = this.dY().a_(this.aS()).b().g() * 0.91F;
            }

            this.a(this.aL() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bvi.a, this.dB());
            this.h(this.dB().c((double)$$1));
         }
      }
   }

   @Override
   public boolean q_() {
      return false;
   }
}
