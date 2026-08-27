public abstract class bsi extends bsc {
   protected static final float bX = 0.0F;

   protected bsi(brn<? extends bsi> $$0, dad $$1) {
      super($$0, $$1);
   }

   public float h(in $$0) {
      return this.a($$0, this.dN());
   }

   public float a(in $$0, dag $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dae $$0, bse $$1) {
      return this.a(this.dn(), $$0) >= 0.0F;
   }

   public boolean gl() {
      return !this.K().l();
   }

   public boolean gm() {
      if (this.bE.a(cbd.Z)) {
         return this.bE.c(cbd.Z).isPresent();
      } else {
         for (cal $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof bzq) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void gb() {
      super.gb();
      brh $$0 = this.ge();
      if ($$0 != null && $$0.dN() == this.dN()) {
         this.a($$0.dn(), 5);
         float $$1 = this.f($$0);
         if (this instanceof bsw && ((bsw)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.F($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bS.a(byx.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.ds() - this.ds()) / (double)$$1;
            double $$3 = ($$0.du() - this.du()) / (double)$$1;
            double $$4 = ($$0.dy() - this.dy()) / (double)$$1;
            this.g(this.dq().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.co();
         } else if (this.gn() && !this.gm()) {
            this.bS.b(byx.a.a);
            float $$5 = 2.0F;
            etp $$6 = new etp($$0.ds() - this.ds(), $$0.du() - this.du(), $$0.dy() - this.dy()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.K().a(this.ds() + $$6.c, this.du() + $$6.d, this.dy() + $$6.e, this.go());
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
