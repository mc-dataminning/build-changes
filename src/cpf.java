public class cpf extends cow implements dqh {
   private boolean c = true;

   public cpf(btc<? extends cpf> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cpf(dca $$0, double $$1, double $$2, double $$3) {
      super(btc.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cov.a v() {
      return cov.a.f;
   }

   @Override
   public dse x() {
      return dfd.hc.o();
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
      if (dqi.a(this.dP(), this)) {
         return true;
      } else {
         for (cjj $$1 : this.dP().a(cjj.class, this.cK().c(0.25, 0.0, 0.25), btb.a)) {
            if (dqi.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cum ag_() {
      return cuu.nQ;
   }

   @Override
   protected void b(us $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(us $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cpw a(int $$0, cmy $$1) {
      return new cqv($$0, $$1, this);
   }
}
