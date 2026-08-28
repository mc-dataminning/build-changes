public abstract class bxi extends bxw {
   protected bxi(bxc<? extends bxi> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebe $$2, iv $$3) {
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bi()) {
         this.a(0.02F, $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.8F));
      } else if (this.bv()) {
         this.a(0.02F, $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.5));
      } else {
         float $$1 = 0.91F;
         if (this.aH()) {
            $$1 = this.dV().a_(this.aP()).b().g() * 0.91F;
         }

         float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
         $$1 = 0.91F;
         if (this.aH()) {
            $$1 = this.dV().a_(this.aP()).b().g() * 0.91F;
         }

         this.a(this.aH() ? 0.1F * $$2 : 0.02F, $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c((double)$$1));
      }
   }

   @Override
   public boolean d_() {
      return false;
   }
}
