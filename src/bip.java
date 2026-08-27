public abstract class bip extends bja {
   protected bip(bim<? extends bip> $$0, cpm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dfa $$2, gu $$3) {
   }

   @Override
   public void h(ehe $$0) {
      if (this.cW()) {
         if (this.aX()) {
            this.a(0.02F, $$0);
            this.a(bje.a, this.dn());
            this.f(this.dn().a(0.8F));
         } else if (this.bl()) {
            this.a(0.02F, $$0);
            this.a(bje.a, this.dn());
            this.f(this.dn().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aA()) {
               $$1 = this.dK().a_(this.aG()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aA()) {
               $$1 = this.dK().a_(this.aG()).b().h() * 0.91F;
            }

            this.a(this.aA() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bje.a, this.dn());
            this.f(this.dn().a((double)$$1));
         }
      }

      this.q(false);
   }

   @Override
   public boolean j_() {
      return false;
   }
}
