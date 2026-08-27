public abstract class bka extends bkl {
   protected bka(bjx<? extends bka> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dgb $$2, ht $$3) {
   }

   @Override
   public void h(eif $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bkp.a, this.do());
            this.f(this.do().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bkp.a, this.do());
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
            this.a(bkp.a, this.do());
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
