public abstract class bvo extends bwa {
   protected bvo(bvi<? extends bvo> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dxq $$2, ji $$3) {
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(0.02F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.8F));
      } else if (this.bv()) {
         this.a(0.02F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.5));
      } else {
         float $$1 = 0.91F;
         if (this.aJ()) {
            $$1 = this.dU().a_(this.aQ()).b().g() * 0.91F;
         }

         float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
         $$1 = 0.91F;
         if (this.aJ()) {
            $$1 = this.dU().a_(this.aQ()).b().g() * 0.91F;
         }

         this.a(this.aJ() ? 0.1F * $$2 : 0.02F, $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c((double)$$1));
      }
   }

   @Override
   public boolean d_() {
      return false;
   }
}
