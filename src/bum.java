public abstract class bum extends bux {
   protected bum(bug<? extends bum> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
   }

   @Override
   public void a_(ezh $$0) {
      if (this.dj()) {
         if (this.bk()) {
            this.a(0.02F, $$0);
            this.a(buz.a, this.dA());
            this.h(this.dA().c(0.8F));
         } else if (this.by()) {
            this.a(0.02F, $$0);
            this.a(buz.a, this.dA());
            this.h(this.dA().c(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aJ()) {
               $$1 = this.dX().a_(this.aQ()).b().g() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aJ()) {
               $$1 = this.dX().a_(this.aQ()).b().g() * 0.91F;
            }

            this.a(this.aJ() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(buz.a, this.dA());
            this.h(this.dA().c((double)$$1));
         }
      }
   }

   @Override
   public boolean q_() {
      return false;
   }
}
