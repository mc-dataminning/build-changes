public abstract class bwx extends bxl {
   protected bwx(bwr<? extends bwx> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, eat $$2, iv $$3) {
   }

   @Override
   public void a_(ffc $$0) {
      if (this.bh()) {
         this.a(0.02F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.8F));
      } else if (this.bu()) {
         this.a(0.02F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.5));
      } else {
         float $$1 = 0.91F;
         if (this.aH()) {
            $$1 = this.dU().a_(this.aO()).b().g() * 0.91F;
         }

         float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
         $$1 = 0.91F;
         if (this.aH()) {
            $$1 = this.dU().a_(this.aO()).b().g() * 0.91F;
         }

         this.a(this.aH() ? 0.1F * $$2 : 0.02F, $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c((double)$$1));
      }
   }

   @Override
   public boolean d_() {
      return false;
   }
}
