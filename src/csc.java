public class csc extends crv {
   private float b;
   private float c;

   public csc(bvq<?> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   public bti a(cpw $$0, bth $$1) {
      if (!$$0.fW() && !this.ca() && (this.dV().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dV().C) {
            return (bti)($$0.n(this) ? bti.c : bti.e);
         } else {
            return bti.a;
         }
      } else {
         return bti.e;
      }
   }

   @Override
   protected cxk u() {
      return cxs.of;
   }

   @Override
   public cxo dI() {
      return new cxo(cxs.of);
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
      fbx $$1 = this.dt();
      super.h();
      double $$2 = ((double)this.dL() - $$0) % 360.0;
      if (this.dV().C && $$1.f(this.dt()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bvj $$0, bvj.a $$1) {
      super.a($$0, $$1);
      if (this.dV().C && $$0 instanceof cpw $$2 && $$2.gM() && b(this.dV())) {
         float $$3 = (float)bae.e(0.5, (double)this.c, (double)this.b);
         $$2.v($$2.dL() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
