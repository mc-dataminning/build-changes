public class coy extends cop implements dqa {
   private boolean c = true;

   public coy(bsv<? extends coy> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public coy(dbt $$0, double $$1, double $$2, double $$3) {
      super(bsv.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public coo.a v() {
      return coo.a.f;
   }

   @Override
   public drx x() {
      return dew.hc.n();
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
      if (dqb.a(this.dP(), this)) {
         return true;
      } else {
         for (cjc $$1 : this.dP().a(cjc.class, this.cK().c(0.25, 0.0, 0.25), bsu.a)) {
            if (dqb.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cuf ah_() {
      return cun.nQ;
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
   public cpp a(int $$0, cmr $$1) {
      return new cqo($$0, $$1, this);
   }
}
