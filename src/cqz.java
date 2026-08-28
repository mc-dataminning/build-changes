public class cqz extends cqp implements dtr {
   private boolean c = true;
   private boolean d = false;

   public cqz(bup<? extends cqz> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public dvo z() {
      return dil.hc.m();
   }

   @Override
   public int B() {
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
      return this.dD();
   }

   @Override
   public double M() {
      return this.dF() + 0.5;
   }

   @Override
   public double O() {
      return this.dJ();
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
   protected double a(jh $$0, dwr $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.U();
      return $$3;
   }

   private void U() {
      if (!this.dY().C && this.bN() && this.K() && !this.d && this.Q()) {
         this.d = true;
         this.e();
      }
   }

   public boolean Q() {
      if (dts.a(this.dY(), this)) {
         return true;
      } else {
         for (ckz $$1 : this.dY().a(ckz.class, this.cT().c(0.25, 0.0, 0.25), bun.a)) {
            if (dts.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cwb al_() {
      return cwj.nQ;
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.nQ);
   }

   @Override
   protected void b(un $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(un $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public crs a(int $$0, coq $$1) {
      return new cst($$0, $$1, this);
   }
}
