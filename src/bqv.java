public abstract class bqv extends brg {
   protected bqv(bqr<? extends bqv> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
   }

   @Override
   public void a(etf $$0) {
      if (this.cY()) {
         if (this.bc()) {
            this.a(0.02F, $$0);
            this.a(brj.a, this.dq());
            this.g(this.dq().a(0.8F));
         } else if (this.bq()) {
            this.a(0.02F, $$0);
            this.a(brj.a, this.dq());
            this.g(this.dq().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dN().a_(this.aI()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dN().a_(this.aI()).b().h() * 0.91F;
            }

            this.a(this.aC() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(brj.a, this.dq());
            this.g(this.dq().a((double)$$1));
         }
      }

      this.r(false);
   }

   @Override
   public boolean q_() {
      return false;
   }
}
