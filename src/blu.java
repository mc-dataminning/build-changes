public abstract class blu extends bln {
   protected static final float bS = 0.0F;

   protected blu(bkz<? extends blu> $$0, csf $$1) {
      super($$0, $$1);
   }

   public float h(hx $$0) {
      return this.a($$0, this.dN());
   }

   public float a(hx $$0, csi $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(csg $$0, blp $$1) {
      return this.a(this.dn(), $$0) >= 0.0F;
   }

   public boolean gb() {
      return !this.N().l();
   }

   public boolean gc() {
      return this.bz.a(bum.Y) ? this.bz.c(bum.Y).isPresent() : this.bO.c().anyMatch($$0 -> $$0.k() instanceof bsz);
   }

   @Override
   protected void fS() {
      super.fS();
      bkv $$0 = this.fU();
      if ($$0 != null && $$0.dN() == this.dN()) {
         this.a($$0.dn(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bmg && ((bmg)this).A()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bsg.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.ds() - this.ds()) / (double)$$1;
            double $$3 = ($$0.du() - this.du()) / (double)$$1;
            double $$4 = ($$0.dy() - this.dy()) / (double)$$1;
            this.g(this.dq().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cn();
         } else if (this.gd() && !this.gc()) {
            this.bO.b(bsg.a.a);
            float $$5 = 2.0F;
            ejz $$6 = new ejz($$0.ds() - this.ds(), $$0.du() - this.du(), $$0.dy() - this.dy()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
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
