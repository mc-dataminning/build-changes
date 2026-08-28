public abstract class bth extends bta {
   protected static final float bZ = 0.0F;

   protected bth(bsj<? extends bth> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public float c(ja $$0) {
      return this.a($$0, this.dP());
   }

   public float a(ja $$0, dcg $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dce $$0, btc $$1) {
      return this.a(this.dp(), $$0) >= 0.0F;
   }

   public boolean gj() {
      return !this.K().l();
   }

   public boolean gk() {
      if (this.bF.a(ccc.Z)) {
         return this.bF.c(ccc.Z).isPresent();
      } else {
         for (cbk $$0 : this.bU.b()) {
            if ($$0.h() && $$0.k() instanceof cap) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void fY() {
      super.fY();
      bsd $$0 = this.gb();
      if ($$0 != null && $$0.dP() == this.dP()) {
         this.a($$0.dp(), 5);
         float $$1 = this.f($$0);
         if (this instanceof btv && ((btv)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.G($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bU.a(bzw.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.du() - this.du()) / (double)$$1;
            double $$3 = ($$0.dw() - this.dw()) / (double)$$1;
            double $$4 = ($$0.dA() - this.dA()) / (double)$$1;
            this.h(this.ds().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cq();
         } else if (this.gl() && !this.gk()) {
            this.bU.b(bzw.a.a);
            float $$5 = 2.0F;
            evz $$6 = new evz($$0.du() - this.du(), $$0.dw() - this.dw(), $$0.dA() - this.dA()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.K().a(this.du() + $$6.c, this.dw() + $$6.d, this.dA() + $$6.e, this.gm());
         }
      }
   }

   protected boolean gl() {
      return true;
   }

   protected double gm() {
      return 1.0;
   }

   protected void G(float $$0) {
   }
}
