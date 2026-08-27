public abstract class blp extends bli {
   protected static final float bS = 0.0F;

   protected blp(bku<? extends blp> $$0, csa $$1) {
      super($$0, $$1);
   }

   public float h(ht $$0) {
      return this.a($$0, this.dN());
   }

   public float a(ht $$0, csd $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(csb $$0, blk $$1) {
      return this.a(this.dn(), $$0) >= 0.0F;
   }

   public boolean gb() {
      return !this.N().l();
   }

   public boolean gc() {
      return this.bz.a(buh.Y) ? this.bz.c(buh.Y).isPresent() : this.bO.c().anyMatch($$0 -> $$0.k() instanceof bsu);
   }

   @Override
   protected void fS() {
      super.fS();
      bkq $$0 = this.fU();
      if ($$0 != null && $$0.dN() == this.dN()) {
         this.a($$0.dn(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bmb && ((bmb)this).A()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bsb.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.ds() - this.ds()) / (double)$$1;
            double $$3 = ($$0.du() - this.du()) / (double)$$1;
            double $$4 = ($$0.dy() - this.dy()) / (double)$$1;
            this.g(this.dq().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cn();
         } else if (this.gd() && !this.gc()) {
            this.bO.b(bsb.a.a);
            float $$5 = 2.0F;
            eju $$6 = new eju($$0.ds() - this.ds(), $$0.du() - this.du(), $$0.dy() - this.dy()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.N().a(this.ds() + $$6.c, this.du() + $$6.d, this.dy() + $$6.e, this.ge());
         }
      }
   }

   protected boolean gd() {
      return true;
   }

   protected double ge() {
      return 1.0;
   }

   protected void D(float $$0) {
   }
}
