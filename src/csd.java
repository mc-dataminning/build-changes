public class csd extends crw {
   private float b;
   private float c;

   public csd(bvr<?> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Override
   public btj a(cpx $$0, bti $$1) {
      if (!$$0.fY() && !this.ca() && (this.dW().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dW().C) {
            return (btj)($$0.n(this) ? btj.c : btj.e);
         } else {
            return btj.a;
         }
      } else {
         return btj.e;
      }
   }

   @Override
   protected cxl u() {
      return cxt.of;
   }

   @Override
   public cxp dJ() {
      return new cxp(cxt.of);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.ca()) {
            this.bP();
         }

         if (this.N() == 0) {
            this.l(-this.O());
            this.d(10);
            this.b(50.0F);
            this.bD();
         }
      }
   }

   @Override
   public boolean D() {
      return true;
   }

   @Override
   public void h() {
      double $$0 = (double)this.dM();
      fby $$1 = this.du();
      super.h();
      double $$2 = ((double)this.dM() - $$0) % 360.0;
      if (this.dW().C && $$1.f(this.du()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bvk $$0, bvk.a $$1) {
      super.a($$0, $$1);
      if (this.dW().C && $$0 instanceof cpx $$2 && $$2.gO() && b(this.dW())) {
         float $$3 = (float)bae.e(0.5, (double)this.c, (double)this.b);
         $$2.v($$2.dM() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
