public class crx extends crq {
   private float b;
   private float c;

   public crx(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   public bsy a(cpr $$0, bsx $$1) {
      if (!$$0.ga() && !this.bZ() && (this.dU().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dU().C) {
            return (bsy)($$0.n(this) ? bsy.c : bsy.e);
         } else {
            return bsy.a;
         }
      } else {
         return bsy.e;
      }
   }

   @Override
   protected cxd o() {
      return cxl.oq;
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.oq);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bZ()) {
            this.bN();
         }

         if (this.I() == 0) {
            this.l(-this.J());
            this.d(10);
            this.b(50.0F);
            this.bB();
         }
      }
   }

   @Override
   public boolean z() {
      return true;
   }

   @Override
   public void h() {
      double $$0 = (double)this.dK();
      fbx $$1 = this.ds();
      super.h();
      double $$2 = ((double)this.dK() - $$0) % 360.0;
      if (this.dU().C && $$1.f(this.ds()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bva $$0, bva.a $$1) {
      super.a($$0, $$1);
      if (this.dU().C && $$0 instanceof cpr $$2 && $$2.gS() && b(this.dU())) {
         float $$3 = (float)ayz.e(0.5, (double)this.c, (double)this.b);
         $$2.w($$2.dK() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
