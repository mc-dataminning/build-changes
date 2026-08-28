public class cru extends crn {
   private float b;
   private float c;

   public cru(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public bta a(cpo $$0, bsz $$1) {
      if (!$$0.fY() && !this.ca() && (this.dW().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dW().C) {
            return (bta)($$0.n(this) ? bta.c : bta.e);
         } else {
            return bta.a;
         }
      } else {
         return bta.e;
      }
   }

   @Override
   protected cxc u() {
      return cxk.oo;
   }

   @Override
   public cxg dJ() {
      return new cxg(cxk.oo);
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
      fbr $$1 = this.du();
      super.h();
      double $$2 = ((double)this.dM() - $$0) % 360.0;
      if (this.dW().C && $$1.f(this.du()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bvb $$0, bvb.a $$1) {
      super.a($$0, $$1);
      if (this.dW().C && $$0 instanceof cpo $$2 && $$2.gO() && b(this.dW())) {
         float $$3 = (float)azu.e(0.5, (double)this.c, (double)this.b);
         $$2.v($$2.dM() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
