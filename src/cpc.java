public class cpc extends cot implements dqe {
   private boolean c = true;

   public cpc(bsz<? extends cpc> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cpc(dbx $$0, double $$1, double $$2, double $$3) {
      super(bsz.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cos.a v() {
      return cos.a.f;
   }

   @Override
   public dsb x() {
      return dfa.hc.o();
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
      if (dqf.a(this.dP(), this)) {
         return true;
      } else {
         for (cjg $$1 : this.dP().a(cjg.class, this.cK().c(0.25, 0.0, 0.25), bsy.a)) {
            if (dqf.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cuj ag_() {
      return cur.nQ;
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
   public cpt a(int $$0, cmv $$1) {
      return new cqs($$0, $$1, this);
   }
}
