public abstract class bjf extends biy {
   protected static final float bS = 0.0F;

   protected bjf(bik<? extends bjf> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public float h(gv $$0) {
      return this.a($$0, this.dK());
   }

   public float a(gv $$0, cpn $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cpl $$0, bja $$1) {
      return this.a(this.dk(), $$0) >= 0.0F;
   }

   public boolean fV() {
      return !this.H().l();
   }

   public boolean fW() {
      return this.bz.a(bry.Y) ? this.bz.c(bry.Y).isPresent() : this.bO.c().anyMatch($$0 -> $$0.k() instanceof bql);
   }

   @Override
   protected void fN() {
      super.fN();
      big $$0 = this.fP();
      if ($$0 != null && $$0.dK() == this.dK()) {
         this.a($$0.dk(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bjs && ((bjs)this).t()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bps.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dp() - this.dp()) / (double)$$1;
            double $$3 = ($$0.dr() - this.dr()) / (double)$$1;
            double $$4 = ($$0.dv() - this.dv()) / (double)$$1;
            this.f(this.dn().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cm();
         } else if (this.fX() && !this.fW()) {
            this.bO.b(bps.a.a);
            float $$5 = 2.0F;
            ehf $$6 = new ehf($$0.dp() - this.dp(), $$0.dr() - this.dr(), $$0.dv() - this.dv()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
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
