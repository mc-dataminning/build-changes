public class cjo extends cjf implements djv {
   private boolean i = true;

   public cjo(bnw<? extends cjo> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cjo(cvr $$0, double $$1, double $$2, double $$3) {
      super(bnw.Z, $$1, $$2, $$3, $$0);
   }

   @Override
   public cje.a w() {
      return cje.a.f;
   }

   @Override
   public dlj y() {
      return cyu.hc.o();
   }

   @Override
   public int A() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.H()) {
         this.p($$4);
      }
   }

   public boolean H() {
      return this.i;
   }

   public void p(boolean $$0) {
      this.i = $$0;
   }

   @Override
   public double I() {
      return this.dr();
   }

   @Override
   public double J() {
      return this.dt() + 0.5;
   }

   @Override
   public double K() {
      return this.dx();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && this.bx() && this.H() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (djw.a(this.dM(), this)) {
         return true;
      } else {
         for (cdw $$1 : this.dM().a(cdw.class, this.cH().c(0.25, 0.0, 0.25), bnv.a)) {
            if (djw.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected coy ai_() {
      return cpg.nP;
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(sw $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public ckf a(int $$0, chk $$1) {
      return new cle($$0, $$1, this);
   }
}
