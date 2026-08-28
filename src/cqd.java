public class cqd extends cpt implements dss {
   private boolean c = true;
   private boolean d = false;

   public cqd(btv<? extends cqd> $$0, deg $$1) {
      super($$0, $$1);
   }

   public cqd(deg $$0, double $$1, double $$2, double $$3) {
      super(btv.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cps.a y() {
      return cps.a.f;
   }

   @Override
   public duo A() {
      return dhl.hc.o();
   }

   @Override
   public int C() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.K()) {
         this.s($$4);
      }
   }

   public boolean K() {
      return this.c;
   }

   public void s(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double L() {
      return this.dx();
   }

   @Override
   public double M() {
      return this.dz() + 0.5;
   }

   @Override
   public double O() {
      return this.dD();
   }

   @Override
   public boolean P() {
      return false;
   }

   @Override
   public void l() {
      this.d = false;
      super.l();
      this.U();
   }

   @Override
   protected double a(je $$0, dvs $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.U();
      return $$3;
   }

   private void U() {
      if (!this.dS().B && this.bI() && this.K() && !this.d && this.Q()) {
         this.d = true;
         this.e();
      }
   }

   public boolean Q() {
      if (dst.a(this.dS(), this)) {
         return true;
      } else {
         for (cke $$1 : this.dS().a(cke.class, this.cO().c(0.25, 0.0, 0.25), btt.a)) {
            if (dst.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cvk aj_() {
      return cvt.nQ;
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cqw a(int $$0, cnt $$1) {
      return new crx($$0, $$1, this);
   }
}
