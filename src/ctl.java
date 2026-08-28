public class ctl extends cte {
   private float b;
   private float c;

   public ctl(bwj<?> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   public bty a(cqs $$0, btx $$1) {
      if (!$$0.fX() && !this.ca() && (this.dV().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dV().C) {
            return (bty)($$0.n(this) ? bty.c : bty.e);
         } else {
            return bty.a;
         }
      } else {
         return bty.e;
      }
   }

   @Override
   protected cyo o() {
      return cyw.oq;
   }

   @Override
   public cys dI() {
      return new cys(cyw.oq);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.ca()) {
            this.bO();
         }

         if (this.I() == 0) {
            this.l(-this.J());
            this.d(10);
            this.b(50.0F);
            this.bC();
         }
      }
   }

   @Override
   public boolean z() {
      return true;
   }

   @Override
   public void h() {
      double $$0 = (double)this.dL();
      fdw $$1 = this.dt();
      super.h();
      double $$2 = ((double)this.dL() - $$0) % 360.0;
      if (this.dV().C && $$1.f(this.dt()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bwa $$0, bwa.b $$1) {
      super.a($$0, $$1);
      if (this.dV().C && $$0 instanceof cqs $$2 && $$2.gP() && b(this.dV())) {
         float $$3 = (float)azk.e(0.5, (double)this.c, (double)this.b);
         $$2.w($$2.dL() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
