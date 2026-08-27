public abstract class bjr extends bjk {
   protected static final float bS = 0.0F;

   protected bjr(biw<? extends bjr> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public float h(gw $$0) {
      return this.a($$0, this.dL());
   }

   public float a(gw $$0, cqa $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cpy $$0, bjm $$1) {
      return this.a(this.dl(), $$0) >= 0.0F;
   }

   public boolean fZ() {
      return !this.L().l();
   }

   public boolean ga() {
      return this.bz.a(bsj.Y) ? this.bz.c(bsj.Y).isPresent() : this.bO.c().anyMatch($$0 -> $$0.k() instanceof bqw);
   }

   @Override
   protected void fQ() {
      super.fQ();
      bis $$0 = this.fS();
      if ($$0 != null && $$0.dL() == this.dL()) {
         this.a($$0.dl(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bkd && ((bkd)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bqd.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dq() - this.dq()) / (double)$$1;
            double $$3 = ($$0.ds() - this.ds()) / (double)$$1;
            double $$4 = ($$0.dw() - this.dw()) / (double)$$1;
            this.f(this.do().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cm();
         } else if (this.gb() && !this.ga()) {
            this.bO.b(bqd.a.a);
            float $$5 = 2.0F;
            ehp $$6 = new ehp($$0.dq() - this.dq(), $$0.ds() - this.ds(), $$0.dw() - this.dw()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.L().a(this.dq() + $$6.c, this.ds() + $$6.d, this.dw() + $$6.e, this.gc());
         }
      }
   }

   protected boolean gb() {
      return true;
   }

   protected double gc() {
      return 1.0;
   }

   protected void D(float $$0) {
   }
}
