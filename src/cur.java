public class cur extends cuk {
   private float b;
   private float c;

   public cur(bxc<?> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   public bur a(crx $$0, buq $$1) {
      if (!$$0.fY() && !this.bZ() && (this.dV().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dV().C) {
            return (bur)($$0.n(this) ? bur.c : bur.e);
         } else {
            return bur.a;
         }
      } else {
         return bur.e;
      }
   }

   @Override
   protected czu o() {
      return dac.ov;
   }

   @Override
   public czy dI() {
      return new czy(dac.ov);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bZ()) {
            this.bN();
         }

         if (this.H() == 0) {
            this.l(-this.I());
            this.d(10);
            this.b(50.0F);
            this.bB();
         }
      }
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public void h() {
      double $$0 = (double)this.dL();
      ffq $$1 = this.dt();
      super.h();
      double $$2 = ((double)this.dL() - $$0) % 360.0;
      if (this.dV().C && $$1.f(this.dt()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bwt $$0, bwt.a $$1) {
      super.a($$0, $$1);
      if (this.dV().C && $$0 instanceof crx $$2 && $$2.gQ() && b(this.dV())) {
         float $$3 = (float)azo.e(0.5, (double)this.c, (double)this.b);
         $$2.w($$2.dL() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
