public abstract class brb extends bqv {
   protected static final float bW = 0.0F;

   protected brb(bqg<? extends brb> $$0, czg $$1) {
      super($$0, $$1);
   }

   public float h(id $$0) {
      return this.a($$0, this.dM());
   }

   public float a(id $$0, czj $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(czh $$0, bqx $$1) {
      return this.a(this.dm(), $$0) >= 0.0F;
   }

   public boolean gj() {
      return !this.K().l();
   }

   public boolean gk() {
      if (this.bC.a(bzw.Z)) {
         return this.bC.c(bzw.Z).isPresent();
      } else {
         for (bze $$0 : this.bR.b()) {
            if ($$0.h() && $$0.k() instanceof byj) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void ga() {
      super.ga();
      bqa $$0 = this.gc();
      if ($$0 != null && $$0.dM() == this.dM()) {
         this.a($$0.dm(), 5);
         float $$1 = this.f($$0);
         if (this instanceof brp && ((brp)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.F($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bR.a(bxq.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dr() - this.dr()) / (double)$$1;
            double $$3 = ($$0.dt() - this.dt()) / (double)$$1;
            double $$4 = ($$0.dx() - this.dx()) / (double)$$1;
            this.g(this.dp().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cn();
         } else if (this.gl() && !this.gk()) {
            this.bR.b(bxq.a.a);
            float $$5 = 2.0F;
            esj $$6 = new esj($$0.dr() - this.dr(), $$0.dt() - this.dt(), $$0.dx() - this.dx()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.K().a(this.dr() + $$6.c, this.dt() + $$6.d, this.dx() + $$6.e, this.gm());
         }
      }
   }

   protected boolean gl() {
      return true;
   }

   protected double gm() {
      return 1.0;
   }

   protected void F(float $$0) {
   }
}
