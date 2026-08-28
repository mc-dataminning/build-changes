public abstract class btc extends btn {
   protected btc(bsw<? extends btc> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
   }

   @Override
   public void a(eww $$0) {
      if (this.db()) {
         if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(btq.a, this.dt());
            this.i(this.dt().a(0.8F));
         } else if (this.bt()) {
            this.a(0.02F, $$0);
            this.a(btq.a, this.dt());
            this.i(this.dt().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aF()) {
               $$1 = this.dQ().a_(this.aL()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aF()) {
               $$1 = this.dQ().a_(this.aL()).b().h() * 0.91F;
            }

            this.a(this.aF() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(btq.a, this.dt());
            this.i(this.dt().a((double)$$1));
         }
      }

      this.s(false);
   }

   @Override
   public boolean p_() {
      return false;
   }
}
