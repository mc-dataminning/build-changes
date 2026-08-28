public class cpb extends cos implements dqd {
   private boolean c = true;

   public cpb(bsy<? extends cpb> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cpb(dbw $$0, double $$1, double $$2, double $$3) {
      super(bsy.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cor.a v() {
      return cor.a.f;
   }

   @Override
   public dsa x() {
      return dez.hc.o();
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
      if (dqe.a(this.dP(), this)) {
         return true;
      } else {
         for (cjf $$1 : this.dP().a(cjf.class, this.cK().c(0.25, 0.0, 0.25), bsx.a)) {
            if (dqe.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cui ah_() {
      return cuq.nQ;
   }

   @Override
   protected void b(ur $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(ur $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cps a(int $$0, cmu $$1) {
      return new cqr($$0, $$1, this);
   }
}
