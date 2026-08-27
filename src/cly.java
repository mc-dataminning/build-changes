public class cly extends clp implements dnd {
   private boolean d = true;

   public cly(bqb<? extends cly> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public cly(cyx $$0, double $$1, double $$2, double $$3) {
      super(bqb.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public clo.a v() {
      return clo.a.f;
   }

   @Override
   public doz x() {
      return dca.hc.n();
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
         this.p($$4);
      }
   }

   public boolean G() {
      return this.d;
   }

   public void p(boolean $$0) {
      this.d = $$0;
   }

   @Override
   public double H() {
      return this.dr();
   }

   @Override
   public double I() {
      return this.dt() + 0.5;
   }

   @Override
   public double J() {
      return this.dx();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && this.bA() && this.G() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dne.a(this.dM(), this)) {
         return true;
      } else {
         for (cgd $$1 : this.dM().a(cgd.class, this.cH().c(0.25, 0.0, 0.25), bqa.a)) {
            if (dne.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cre ag_() {
      return crm.nP;
   }

   @Override
   protected void b(tm $$0) {
      super.b($$0);
      $$0.a("Enabled", this.d);
   }

   @Override
   protected void a(tm $$0) {
      super.a($$0);
      this.d = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cmp a(int $$0, cjs $$1) {
      return new cno($$0, $$1, this);
   }
}
