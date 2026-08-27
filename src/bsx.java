public abstract class bsx extends bsq {
   protected static final float bX = 0.0F;

   protected bsx(bsa<? extends bsx> $$0, dax $$1) {
      super($$0, $$1);
   }

   public float d(io $$0) {
      return this.a($$0, this.dP());
   }

   public float a(io $$0, dba $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(day $$0, bss $$1) {
      return this.a(this.dp(), $$0) >= 0.0F;
   }

   public boolean gl() {
      return !this.K().l();
   }

   public boolean gm() {
      if (this.bE.a(cbs.Z)) {
         return this.bE.c(cbs.Z).isPresent();
      } else {
         for (cba $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof caf) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void gb() {
      super.gb();
      bru $$0 = this.ge();
      if ($$0 != null && $$0.dP() == this.dP()) {
         this.a($$0.dp(), 5);
         float $$1 = this.f($$0);
         if (this instanceof btl && ((btl)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.F($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bS.a(bzm.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.du() - this.du()) / (double)$$1;
            double $$3 = ($$0.dw() - this.dw()) / (double)$$1;
            double $$4 = ($$0.dA() - this.dA()) / (double)$$1;
            this.g(this.ds().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cq();
         } else if (this.gn() && !this.gm()) {
            this.bS.b(bzm.a.a);
            float $$5 = 2.0F;
            euk $$6 = new euk($$0.du() - this.du(), $$0.dw() - this.dw(), $$0.dA() - this.dA()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.K().a(this.du() + $$6.c, this.dw() + $$6.d, this.dA() + $$6.e, this.go());
         }
      }
   }

   protected boolean gn() {
      return true;
   }

   protected double go() {
      return 1.0;
   }

   protected void F(float $$0) {
   }
}
