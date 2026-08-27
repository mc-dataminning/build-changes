public abstract class bmx extends bmq {
   protected static final float bT = 0.0F;

   protected bmx(bmc<? extends bmx> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public float d(hx $$0) {
      return this.a($$0, this.dL());
   }

   public float a(hx $$0, cua $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cty $$0, bms $$1) {
      return this.a(this.dl(), $$0) >= 0.0F;
   }

   public boolean gb() {
      return !this.N().l();
   }

   public boolean gc() {
      if (this.bz.a(bvq.Z)) {
         return this.bz.c(bvq.Z).isPresent();
      } else {
         for (buy $$0 : this.bP.b()) {
            if ($$0.h() && $$0.k() instanceof bud) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void fS() {
      super.fS();
      blw $$0 = this.fU();
      if ($$0 != null && $$0.dL() == this.dL()) {
         this.a($$0.dl(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bnj && ((bnj)this).A()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.C($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bP.a(btk.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dq() - this.dq()) / (double)$$1;
            double $$3 = ($$0.ds() - this.ds()) / (double)$$1;
            double $$4 = ($$0.dw() - this.dw()) / (double)$$1;
            this.g(this.do().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cn();
         } else if (this.gd() && !this.gc()) {
            this.bP.b(btk.a.a);
            float $$5 = 2.0F;
            emc $$6 = new emc($$0.dq() - this.dq(), $$0.ds() - this.ds(), $$0.dw() - this.dw()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.N().a(this.dq() + $$6.c, this.ds() + $$6.d, this.dw() + $$6.e, this.ge());
         }
      }
   }

   protected boolean gd() {
      return true;
   }

   protected double ge() {
      return 1.0;
   }

   protected void C(float $$0) {
   }
}
