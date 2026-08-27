public abstract class blw extends bmh {
   protected blw(blt<? extends blw> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dja $$2, hx $$3) {
   }

   @Override
   public void a(elm $$0) {
      if (this.cX()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bml.a, this.dp());
            this.g(this.dp().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bml.a, this.dp());
            this.g(this.dp().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dM().a_(this.aI()).b().i() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dM().a_(this.aI()).b().i() * 0.91F;
            }

            this.a(this.aC() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bml.a, this.dp());
            this.g(this.dp().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean e_() {
      return false;
   }
}
