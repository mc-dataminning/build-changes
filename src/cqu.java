public class cqu extends cqo {
   private float c;
   private float d;

   public cqu(bup<?> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      if (!$$0.gb() && !this.cc() && (this.dY().C || $$0.n(this))) {
         this.d = this.c;
         if (!this.dY().C) {
            return (bsh)($$0.n(this) ? bsh.c : bsh.e);
         } else {
            return bsh.a;
         }
      } else {
         return bsh.e;
      }
   }

   @Override
   protected cwb al_() {
      return cwj.nM;
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.nM);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.cc()) {
            this.bR();
         }

         if (this.S() == 0) {
            this.m(-this.T());
            this.d(10);
            this.b(50.0F);
            this.bF();
         }
      }
   }

   @Override
   public boolean D() {
      return true;
   }

   @Override
   public void l() {
      double $$0 = (double)this.dO();
      ezr $$1 = this.dw();
      super.l();
      double $$2 = ((double)this.dO() - $$0) % 360.0;
      if (this.dY().C && $$1.f(this.dw()) > 0.01) {
         this.c += (float)$$2;
         this.c %= 360.0F;
      }
   }

   @Override
   protected void a(bui $$0, bui.a $$1) {
      super.a($$0, $$1);
      if (this.dY().C && $$0 instanceof cor $$2 && $$2.gR() && b(this.dY())) {
         float $$3 = (float)azn.e(0.5, (double)this.d, (double)this.c);
         $$2.v($$2.dO() - ($$3 - this.d));
         this.d = $$3;
      }
   }
}
