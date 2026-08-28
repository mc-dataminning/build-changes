public abstract class bvx extends bwi {
   protected bvx(bvr<? extends bvx> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
   }

   @Override
   public void a_(fby $$0) {
      if (this.di()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bwk.a, this.dz());
            this.h(this.dz().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bwk.a, this.dz());
            this.h(this.dz().c(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aJ()) {
               $$1 = this.dW().a_(this.aQ()).b().g() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aJ()) {
               $$1 = this.dW().a_(this.aQ()).b().g() * 0.91F;
            }

            this.a(this.aJ() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bwk.a, this.dz());
            this.h(this.dz().c((double)$$1));
         }
      }
   }

   @Override
   public boolean q_() {
      return false;
   }
}
