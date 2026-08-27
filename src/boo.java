public abstract class boo extends boi {
   protected static final float bS = 0.0F;

   protected boo(bnu<? extends boo> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public float h(hz $$0) {
      return this.a($$0, this.dM());
   }

   public float a(hz $$0, cvq $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(cvo $$0, bok $$1) {
      return this.a(this.dm(), $$0) >= 0.0F;
   }

   public boolean gc() {
      return !this.N().l();
   }

   public boolean gd() {
      if (this.bz.a(bxh.Z)) {
         return this.bz.c(bxh.Z).isPresent();
      } else {
         for (bwp $$0 : this.bO.b()) {
            if ($$0.h() && $$0.k() instanceof bvu) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void fT() {
      super.fT();
      bno $$0 = this.fV();
      if ($$0 != null && $$0.dM() == this.dM()) {
         this.a($$0.dm(), 5);
         float $$1 = this.e($$0);
         if (this instanceof bpa && ((bpa)this).A()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.D($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bO.a(bvb.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dr() - this.dr()) / (double)$$1;
            double $$3 = ($$0.dt() - this.dt()) / (double)$$1;
            double $$4 = ($$0.dx() - this.dx()) / (double)$$1;
            this.g(this.dp().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cn();
         } else if (this.ge() && !this.gd()) {
            this.bO.b(bvb.a.a);
            float $$5 = 2.0F;
            ens $$6 = new ens($$0.dr() - this.dr(), $$0.dt() - this.dt(), $$0.dx() - this.dx()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.N().a(this.dr() + $$6.c, this.dt() + $$6.d, this.dx() + $$6.e, this.gf());
         }
      }
   }

   protected boolean ge() {
      return true;
   }

   protected double gf() {
      return 1.0;
   }

   protected void D(float $$0) {
   }
}
