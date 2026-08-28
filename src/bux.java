public abstract class bux extends bvi {
   protected bux(bur<? extends bux> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dww $$2, ji $$3) {
   }

   @Override
   public void a_(faz $$0) {
      if (this.dh()) {
         if (this.bj()) {
            this.a(0.02F, $$0);
            this.a(bvk.a, this.dy());
            this.i(this.dy().c(0.8F));
         } else if (this.bx()) {
            this.a(0.02F, $$0);
            this.a(bvk.a, this.dy());
            this.i(this.dy().c(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aJ()) {
               $$1 = this.dV().a_(this.aQ()).b().g() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aJ()) {
               $$1 = this.dV().a_(this.aQ()).b().g() * 0.91F;
            }

            this.a(this.aJ() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bvk.a, this.dy());
            this.i(this.dy().c((double)$$1));
         }
      }
   }

   @Override
   public boolean q_() {
      return false;
   }
}
