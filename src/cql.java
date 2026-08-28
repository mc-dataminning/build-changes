public class cql extends cqf {
   private float c;
   private float d;

   public cql(bug<?> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cql(dev $$0, double $$1, double $$2, double $$3) {
      super(bug.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public bry a(coh $$0, brx $$1) {
      if (!$$0.ga() && !this.cb() && (this.dX().C || $$0.n(this))) {
         this.d = this.c;
         if (!this.dX().C) {
            return (bry)($$0.n(this) ? bry.c : bry.e);
         } else {
            return bry.a;
         }
      } else {
         return bry.e;
      }
   }

   @Override
   protected cvt al_() {
      return cwb.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.cb()) {
            this.bQ();
         }

         if (this.R() == 0) {
            this.m(-this.S());
            this.d(10);
            this.b(50.0F);
            this.bE();
         }
      }
   }

   @Override
   public cqf.a y() {
      return cqf.a.a;
   }

   @Override
   public void l() {
      double $$0 = (double)this.dN();
      ezh $$1 = this.dv();
      super.l();
      double $$2 = ((double)this.dN() - $$0) % 360.0;
      if (this.dX().C && $$1.f(this.dv()) > 0.01) {
         this.c += (float)$$2;
         this.c %= 360.0F;
      }
   }

   @Override
   protected void a(btz $$0, btz.a $$1) {
      super.a($$0, $$1);
      if (this.dX().C && $$0 instanceof coh $$2 && $$2.gP() && b(this.dX())) {
         float $$3 = (float)azj.e(0.5, (double)this.d, (double)this.c);
         $$2.v($$2.dN() - ($$3 - this.d));
         this.d = $$3;
      }
   }
}
