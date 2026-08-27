public class cdm extends cdd implements ddh {
   private boolean f = true;

   public cdm(bik<? extends cdm> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cdm(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.X, $$1, $$2, $$3, $$0);
   }

   @Override
   public cdc.a t() {
      return cdc.a.f;
   }

   @Override
   public dey w() {
      return csl.hc.n();
   }

   @Override
   public int y() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.F()) {
         this.p($$4);
      }
   }

   public boolean F() {
      return this.f;
   }

   public void p(boolean $$0) {
      this.f = $$0;
   }

   @Override
   public double G() {
      return this.dp();
   }

   @Override
   public double H() {
      return this.dr() + 0.5;
   }

   @Override
   public double J() {
      return this.dv();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B && this.bv() && this.F() && this.K()) {
         this.e();
      }
   }

   public boolean K() {
      if (ddi.a(this.dK(), this)) {
         return true;
      } else {
         for (bye $$1 : this.dK().a(bye.class, this.cG().c(0.25, 0.0, 0.25), bij.a)) {
            if (ddi.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cir j() {
      return ciz.ne;
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("Enabled", this.f);
   }

   @Override
   protected void a(qs $$0) {
      super.a($$0);
      this.f = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cec a(int $$0, cbk $$1) {
      return new cez($$0, $$1, this);
   }
}
