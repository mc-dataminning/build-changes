public abstract class btk extends btd {
   protected static final float bZ = 0.0F;

   protected btk(bsm<? extends btk> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public float c(ja $$0) {
      return this.a($$0, this.dQ());
   }

   public float a(ja $$0, dci $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dcg $$0, btf $$1) {
      return this.a(this.dq(), $$0) >= 0.0F;
   }

   public boolean gk() {
      return !this.K().l();
   }

   public boolean gl() {
      if (this.bF.a(ccf.Z)) {
         return this.bF.c(ccf.Z).isPresent();
      } else {
         for (cbn $$0 : this.bU.b()) {
            if ($$0.h() && $$0.k() instanceof cas) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected void fZ() {
      super.fZ();
      bsg $$0 = this.gc();
      if ($$0 != null && $$0.dQ() == this.dQ()) {
         this.a($$0.dq(), 5);
         float $$1 = this.f($$0);
         if (this instanceof bty && ((bty)this).y()) {
            if ($$1 > 10.0F) {
               this.a(true, true);
            }

            return;
         }

         this.G($$1);
         if ($$1 > 10.0F) {
            this.a(true, true);
            this.bU.a(bzz.a.a);
         } else if ($$1 > 6.0F) {
            double $$2 = ($$0.dv() - this.dv()) / (double)$$1;
            double $$3 = ($$0.dx() - this.dx()) / (double)$$1;
            double $$4 = ($$0.dB() - this.dB()) / (double)$$1;
            this.i(this.dt().b(Math.copySign($$2 * $$2 * 0.4, $$2), Math.copySign($$3 * $$3 * 0.4, $$3), Math.copySign($$4 * $$4 * 0.4, $$4)));
            this.cr();
         } else if (this.gm() && !this.gl()) {
            this.bU.b(bzz.a.a);
            float $$5 = 2.0F;
            ewf $$6 = new ewf($$0.dv() - this.dv(), $$0.dx() - this.dx(), $$0.dB() - this.dB()).d().a((double)Math.max($$1 - 2.0F, 0.0F));
            this.K().a(this.dv() + $$6.c, this.dx() + $$6.d, this.dB() + $$6.e, this.gn());
         }
      }
   }

   protected boolean gm() {
      return true;
   }

   protected double gn() {
      return 1.0;
   }

   protected void G(float $$0) {
   }
}
