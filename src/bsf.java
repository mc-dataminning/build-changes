public abstract class bsf extends bsq {
   protected bsf(bsb<? extends bsf> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
   }

   @Override
   public void a(ewu $$0) {
      if (this.df()) {
         if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(bst.a, this.dx());
            this.g(this.dx().a(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bst.a, this.dx());
            this.g(this.dx().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aE()) {
               $$1 = this.dU().a_(this.aN()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aE()) {
               $$1 = this.dU().a_(this.aN()).b().h() * 0.91F;
            }

            this.a(this.aE() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bst.a, this.dx());
            this.g(this.dx().a((double)$$1));
         }
      }

      this.r(false);
   }

   @Override
   public boolean p_() {
      return false;
   }
}
