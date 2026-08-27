public abstract class bfq extends bgb {
   protected bfq(bfn<? extends bfq> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dcb $$2, gu $$3) {
   }

   @Override
   public void h(eei $$0) {
      if (this.cU()) {
         if (this.aV()) {
            this.a(0.02F, $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a(0.8F));
         } else if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.ay()) {
               $$1 = this.dI().a_(this.aE()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.ay()) {
               $$1 = this.dI().a_(this.aE()).b().h() * 0.91F;
            }

            this.a(this.ay() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bgf.a, this.dl());
            this.f(this.dl().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean i_() {
      return false;
   }
}
