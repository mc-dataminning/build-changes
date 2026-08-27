public abstract class bgi extends bgb {
   protected static final float bS = 0.0F;

   protected bgi(bfn<? extends bgi> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public float h(gu $$0) {
      return this.a($$0, this.dI());
   }

   public float a(gu $$0, cmp $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cmn $$0, bgd $$1) {
      return this.a(this.di(), $$0) >= 0.0F;
   }

   public boolean fV() {
      return !this.J().l();
   }

   @Override
   protected void fN() {
      super.fN();
      bfj $$0 = this.fP();
      if ($$0 != null && $$0.dI() == this.dI()) {
         this.a($$0.di(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bgv && ((bgv)this).w()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.C($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bmv.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dn() - this.dn()) / (double)$$1;
            double $$3 = ($$0.dp() - this.dp()) / (double)$$1;
            double $$4 = ($$0.dt() - this.dt()) / (double)$$1;
            this.f(this.dl().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.ck();
         } else if (this.fW()) {
            this.bO.b(bmv.a.a);
            float $$5 = 2.0F;
            eei $$6 = new eei($$0.dn() - this.dn(), $$0.dp() - this.dp(), $$0.dt() - this.dt()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.J().a(this.dn() + $$6.c, this.dp() + $$6.d, this.dt() + $$6.e, this.fX());
         }
      }
   }

   protected boolean fW() {
      return true;
   }

   protected double fX() {
      return 1.0;
   }

   protected void C(float $$0) {
   }
}
