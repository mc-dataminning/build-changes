public abstract class bst extends bte {
   protected bst(bsn<? extends bst> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dsl $$2, ja $$3) {
   }

   @Override
   public void a(ewh $$0) {
      if (this.dc()) {
         if (this.bg()) {
            this.a(0.02F, $$0);
            this.a(bth.a, this.du());
            this.j(this.du().a(0.8F));
         } else if (this.bu()) {
            this.a(0.02F, $$0);
            this.a(bth.a, this.du());
            this.j(this.du().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aG()) {
               $$1 = this.dR().a_(this.aM()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aG()) {
               $$1 = this.dR().a_(this.aM()).b().h() * 0.91F;
            }

            this.a(this.aG() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bth.a, this.du());
            this.j(this.du().a((double)$$1));
         }
      }

      this.s(false);
   }

   @Override
   public boolean p_() {
      return false;
   }
}
