public abstract class bkp extends bla {
   protected bkp(bkm<? extends bkp> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dgw $$2, ht $$3) {
   }

   @Override
   public void h(eji $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(ble.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(ble.a, this.do());
            this.f(this.do().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aA()) {
               $$1 = this.dL().a_(this.aG()).b().i() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aA()) {
               $$1 = this.dL().a_(this.aG()).b().i() * 0.91F;
            }

            this.a(this.aA() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(ble.a, this.do());
            this.f(this.do().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean d_() {
      return false;
   }
}
