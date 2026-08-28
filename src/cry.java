public class cry extends crr {
   private float b;
   private float c;

   public cry(bvm<?> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   public bte a(cps $$0, btd $$1) {
      if (!$$0.fW() && !this.ca() && (this.dV().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dV().C) {
            return (bte)($$0.n(this) ? bte.c : bte.e);
         } else {
            return bte.a;
         }
      } else {
         return bte.e;
      }
   }

   @Override
   protected cxg u() {
      return cxo.of;
   }

   @Override
   public cxk dI() {
      return new cxk(cxo.of);
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
      double $$0 = (double)this.dL();
      fbs $$1 = this.dt();
      super.h();
      double $$2 = ((double)this.dL() - $$0) % 360.0;
      if (this.dV().C && $$1.f(this.dt()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bvf $$0, bvf.a $$1) {
      super.a($$0, $$1);
      if (this.dV().C && $$0 instanceof cps $$2 && $$2.gM() && b(this.dV())) {
         float $$3 = (float)bae.e(0.5, (double)this.c, (double)this.b);
         $$2.v($$2.dL() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
