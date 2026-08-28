public class cor extends coh implements dqp {
   private boolean c = true;

   public cor(bsn<? extends cor> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cor(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cog.a v() {
      return cog.a.f;
   }

   @Override
   public dsl x() {
      return dfk.hc.o();
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
      if ($$4 != this.F()) {
         this.b($$4);
      }
   }

   public boolean F() {
      return this.c;
   }

   public void b(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double H() {
      return this.dw();
   }

   @Override
   public double I() {
      return this.dy() + 0.5;
   }

   @Override
   public double J() {
      return this.dC();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dR().B && this.bF() && this.F() && this.L()) {
         this.e();
      }
   }

   public boolean L() {
      if (dqq.a(this.dR(), this)) {
         return true;
      } else {
         for (civ $$1 : this.dR().a(civ.class, this.cM().c(0.25, 0.0, 0.25), bsm.a)) {
            if (dqq.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cty ag_() {
      return cug.nQ;
   }

   @Override
   protected void b(tx $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(tx $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cpi a(int $$0, cmk $$1) {
      return new cqi($$0, $$1, this);
   }
}
