public class ckd extends cju implements dkj {
   private boolean i = true;

   public ckd(bol<? extends ckd> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public ckd(cwe $$0, double $$1, double $$2, double $$3) {
      super(bol.Z, $$1, $$2, $$3, $$0);
   }

   @Override
   public cjt.a w() {
      return cjt.a.f;
   }

   @Override
   public dme y() {
      return czh.hc.o();
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
      return this.do();
   }

   @Override
   public double J() {
      return this.dq() + 0.5;
   }

   @Override
   public double K() {
      return this.du();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dJ().B && this.bx() && this.H() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dkk.a(this.dJ(), this)) {
         return true;
      } else {
         for (cel $$1 : this.dJ().a(cel.class, this.cE().c(0.25, 0.0, 0.25), bok.a)) {
            if (dkk.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cpl ai_() {
      return cpt.nP;
   }

   @Override
   protected void b(sy $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(sy $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cku a(int $$0, chz $$1) {
      return new clt($$0, $$1, this);
   }
}
