public abstract class bsp extends bta {
   protected bsp(bsj<? extends bsp> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsh $$2, ja $$3) {
   }

   @Override
   public void a(evz $$0) {
      if (this.da()) {
         if (this.be()) {
            this.a(0.02F, $$0);
            this.a(btd.a, this.ds());
            this.h(this.ds().a(0.8F));
         } else if (this.bs()) {
            this.a(0.02F, $$0);
            this.a(btd.a, this.ds());
            this.h(this.ds().a(0.5));
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
            this.a(btd.a, this.ds());
            this.h(this.ds().a((double)$$1));
         }
      }

      this.r(false);
   }

   @Override
   public boolean q_() {
      return false;
   }
}
