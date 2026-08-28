public abstract class bue extends bup {
   protected bue(bty<? extends bue> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dus $$2, jf $$3) {
   }

   @Override
   public void a_(eyw $$0) {
      if (this.de()) {
         if (this.bi()) {
            this.a(0.02F, $$0);
            this.a(bur.a, this.dv());
            this.h(this.dv().c(0.8F));
         } else if (this.bw()) {
            this.a(0.02F, $$0);
            this.a(bur.a, this.dv());
            this.h(this.dv().c(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aH()) {
               $$1 = this.dS().a_(this.aO()).b().g() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aH()) {
               $$1 = this.dS().a_(this.aO()).b().g() * 0.91F;
            }

            this.a(this.aH() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bur.a, this.dv());
            this.h(this.dv().c((double)$$1));
         }
      }
   }

   @Override
   public boolean q_() {
      return false;
   }
}
