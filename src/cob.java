public class cob extends cns implements dpe {
   private boolean c = true;

   public cob(bsa<? extends cob> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cob(dax $$0, double $$1, double $$2, double $$3) {
      super(bsa.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cnr.a v() {
      return cnr.a.f;
   }

   @Override
   public drb x() {
      return dea.hc.n();
   }

   @Override
   public int z() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.G()) {
         this.b($$4);
      }
   }

   public boolean G() {
      return this.c;
   }

   public void b(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double H() {
      return this.du();
   }

   @Override
   public double I() {
      return this.dw() + 0.5;
   }

   @Override
   public double J() {
      return this.dA();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B && this.bD() && this.G() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dpf.a(this.dP(), this)) {
         return true;
      } else {
         for (cig $$1 : this.dP().a(cig.class, this.cK().c(0.25, 0.0, 0.25), brz.a)) {
            if (dpf.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected ctj ag_() {
      return ctr.nQ;
   }

   @Override
   protected void b(ud $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cot a(int $$0, clv $$1) {
      return new cps($$0, $$1, this);
   }
}
