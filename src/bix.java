public abstract class bix extends bji {
   protected bix(biu<? extends bix> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfj $$2, gw $$3) {
   }

   @Override
   public void h(ehn $$0) {
      if (this.cX()) {
         if (this.aY()) {
            this.a(0.02F, $$0);
            this.a(bjm.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bm()) {
            this.a(0.02F, $$0);
            this.a(bjm.a, this.do());
            this.f(this.do().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aB()) {
               $$1 = this.dL().a_(this.aH()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aB()) {
               $$1 = this.dL().a_(this.aH()).b().h() * 0.91F;
            }

            this.a(this.aB() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bjm.a, this.do());
            this.f(this.do().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean c_() {
      return false;
   }
}
