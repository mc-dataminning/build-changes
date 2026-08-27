public abstract class bmt extends bmm {
   protected static final float bS = 0.0F;

   protected bmt(bly<? extends bmt> $$0, cto $$1) {
      super($$0, $$1);
   }

   public float h(hx $$0) {
      return this.a($$0, this.dM());
   }

   public float a(hx $$0, ctr $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(ctp $$0, bmo $$1) {
      return this.a(this.dm(), $$0) >= 0.0F;
   }

   public boolean ga() {
      return !this.N().l();
   }

   public boolean gb() {
      return this.bz.a(bvm.Y) ? this.bz.c(bvm.Y).isPresent() : this.bO.c().anyMatch($$0 -> $$0.k() instanceof btz);
   }

   @Override
   protected void fR() {
      super.fR();
      blu $$0 = this.fT();
      if ($$0 != null && $$0.dM() == this.dM()) {
         this.a($$0.dm(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bnf && ((bnf)this).A()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(btg.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dr() - this.dr()) / (double)$$1;
            double $$3 = ($$0.dt() - this.dt()) / (double)$$1;
            double $$4 = ($$0.dx() - this.dx()) / (double)$$1;
            this.g(this.dp().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cn();
         } else if (this.gc() && !this.gb()) {
            this.bO.b(btg.a.a);
            float $$5 = 2.0F;
            els $$6 = new els($$0.dr() - this.dr(), $$0.dt() - this.dt(), $$0.dx() - this.dx()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.N().a(this.dr() + $$6.c, this.dt() + $$6.d, this.dx() + $$6.e, this.gd());
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
