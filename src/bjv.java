public abstract class bjv extends bjo {
   protected static final float bS = 0.0F;

   protected bjv(bja<? extends bjv> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public float h(gw $$0) {
      return this.a($$0, this.dL());
   }

   public float a(gw $$0, cqe $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cqc $$0, bjq $$1) {
      return this.a(this.dl(), $$0) >= 0.0F;
   }

   public boolean ga() {
      return !this.L().l();
   }

   public boolean gb() {
      return this.bz.a(bsn.Y) ? this.bz.c(bsn.Y).isPresent() : this.bO.c().anyMatch($$0 -> $$0.k() instanceof bra);
   }

   @Override
   protected void fR() {
      super.fR();
      biw $$0 = this.fT();
      if ($$0 != null && $$0.dL() == this.dL()) {
         this.a($$0.dl(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bkh && ((bkh)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bqh.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dq() - this.dq()) / (double)$$1;
            double $$3 = ($$0.ds() - this.ds()) / (double)$$1;
            double $$4 = ($$0.dw() - this.dw()) / (double)$$1;
            this.f(this.do().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cm();
         } else if (this.gc() && !this.gb()) {
            this.bO.b(bqh.a.a);
            float $$5 = 2.0F;
            ehh $$6 = new ehh($$0.dq() - this.dq(), $$0.ds() - this.ds(), $$0.dw() - this.dw()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.L().a(this.dq() + $$6.c, this.ds() + $$6.d, this.dw() + $$6.e, this.gd());
         }
      }
   }

   protected boolean gc() {
      return true;
   }

   protected double gd() {
      return 1.0;
   }

   protected void D(float $$0) {
   }
}
