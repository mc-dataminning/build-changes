public abstract class bjh extends bja {
   protected static final float bS = 0.0F;

   protected bjh(bim<? extends bjh> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public float h(gu $$0) {
      return this.a($$0, this.dK());
   }

   public float a(gu $$0, cpp $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cpn $$0, bjc $$1) {
      return this.a(this.dk(), $$0) >= 0.0F;
   }

   public boolean fV() {
      return !this.H().l();
   }

   public boolean fW() {
      return this.bz.a(bsa.Y) ? this.bz.c(bsa.Y).isPresent() : this.bO.c().anyMatch($$0 -> $$0.k() instanceof bqn);
   }

   @Override
   protected void fN() {
      super.fN();
      bii $$0 = this.fP();
      if ($$0 != null && $$0.dK() == this.dK()) {
         this.a($$0.dk(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bju && ((bju)this).t()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bpu.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dp() - this.dp()) / (double)$$1;
            double $$3 = ($$0.dr() - this.dr()) / (double)$$1;
            double $$4 = ($$0.dv() - this.dv()) / (double)$$1;
            this.f(this.dn().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cm();
         } else if (this.fX() && !this.fW()) {
            this.bO.b(bpu.a.a);
            float $$5 = 2.0F;
            ehe $$6 = new ehe($$0.dp() - this.dp(), $$0.dr() - this.dr(), $$0.dv() - this.dv()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.H().a(this.dp() + $$6.c, this.dr() + $$6.d, this.dv() + $$6.e, this.fY());
         }
      }
   }

   protected boolean fX() {
      return true;
   }

   protected double fY() {
      return 1.0;
   }

   protected void D(float $$0) {
   }
}
