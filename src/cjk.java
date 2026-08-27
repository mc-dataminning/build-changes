public class cjk extends cjb implements djr {
   private boolean i = true;

   public cjk(bnu<? extends cjk> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cjk(cvn $$0, double $$1, double $$2, double $$3) {
      super(bnu.Z, $$1, $$2, $$3, $$0);
   }

   @Override
   public cja.a w() {
      return cja.a.f;
   }

   @Override
   public dlf y() {
      return cyq.hc.o();
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
      if (djs.a(this.dM(), this)) {
         return true;
      } else {
         for (cds $$1 : this.dM().a(cds.class, this.cH().c(0.25, 0.0, 0.25), bnt.a)) {
            if (djs.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cou ai_() {
      return cpc.nP;
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
   public ckb a(int $$0, chg $$1) {
      return new cla($$0, $$1, this);
   }
}
