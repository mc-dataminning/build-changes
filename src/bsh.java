public abstract class bsh extends bss {
   protected bsh(bsc<? extends bsh> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, drd $$2, io $$3) {
   }

   @Override
   public void a(eum $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(bsv.a, this.ds());
            this.g(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(bsv.a, this.ds());
            this.g(this.ds().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aE()) {
               $$1 = this.dP().a_(this.aK()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aE()) {
               $$1 = this.dP().a_(this.aK()).b().h() * 0.91F;
            }

            this.a(this.aE() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bsv.a, this.ds());
            this.g(this.ds().a((double)$$1));
         }
      }

      this.r(false);
   }

   @Override
   public boolean q_() {
      return false;
   }
}
