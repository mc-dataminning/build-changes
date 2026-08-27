public abstract class boo extends boz {
   protected boo(bol<? extends boo> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
   }

   @Override
   public void a(eov $$0) {
      if (this.cU()) {
         if (this.aZ()) {
            this.a(0.02F, $$0);
            this.a(bpc.a, this.dm());
            this.g(this.dm().a(0.8F));
         } else if (this.bn()) {
            this.a(0.02F, $$0);
            this.a(bpc.a, this.dm());
            this.g(this.dm().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dJ().a_(this.aI()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aC()) {
               $$1 = this.dJ().a_(this.aI()).b().h() * 0.91F;
            }

            this.a(this.aC() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bpc.a, this.dm());
            this.g(this.dm().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean e_() {
      return false;
   }
}
