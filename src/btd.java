public abstract class btd extends btp {
   protected btd(bsx<? extends btd> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, jd $$3) {
   }

   @Override
   public void a(exc $$0) {
      if (this.da()) {
         if (this.bf()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.dr());
            this.i(this.dr().a(0.8F));
         } else if (this.bt()) {
            this.a(0.02F, $$0);
            this.a(bts.a, this.dr());
            this.i(this.dr().a(0.5));
         } else {
            float $$1 = 0.91F;
            if (this.aF()) {
               $$1 = this.dO().a_(this.aL()).b().h() * 0.91F;
            }

            float $$2 = 0.16277137F / ($$1 * $$1 * $$1);
            $$1 = 0.91F;
            if (this.aF()) {
               $$1 = this.dO().a_(this.aL()).b().h() * 0.91F;
            }

            this.a(this.aF() ? 0.1F * $$2 : 0.02F, $$0);
            this.a(bts.a, this.dr());
            this.i(this.dr().a((double)$$1));
         }
      }

      this.s(false);
   }

   @Override
   public boolean p_() {
      return false;
   }
}
