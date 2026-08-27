public abstract class bkx extends bli {
   protected bkx(bku<? extends bkx> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dhi $$2, ht $$3) {
   }

   @Override
   public void a(eju $$0) {
      if (this.cY()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(blm.a, this.dq());
            this.g(this.dq().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(blm.a, this.dq());
            this.g(this.dq().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dN().a_(this.aI()).b().i() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dN().a_(this.aI()).b().i() * 0.91F;
            }

            this.a(this.aC() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(blm.a, this.dq());
            this.g(this.dq().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean d_() {
      return false;
   }
}
