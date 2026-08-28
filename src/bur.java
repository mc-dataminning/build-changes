public abstract class bur extends bvc {
   protected bur(bul<? extends bur> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvj $$2, jh $$3) {
   }

   @Override
   public void a_(ezn $$0) {
      if (this.dj()) {
         if (this.bk()) {
            this.a(0.02F, $$0);
            this.a(bve.a, this.dA());
            this.h(this.dA().c(0.8F));
         } else if (this.by()) {
            this.a(0.02F, $$0);
            this.a(bve.a, this.dA());
            this.h(this.dA().c(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aK()) {
               $$1 = this.dX().a_(this.aR()).b().g() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aK()) {
               $$1 = this.dX().a_(this.aR()).b().g() * 0.91F;
            }

            this.a(this.aK() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bve.a, this.dA());
            this.h(this.dA().c((double)$$1));
         }
      }
   }

   @Override
   public boolean q_() {
      return false;
   }
}
