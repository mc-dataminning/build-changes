public class com extends cod implements dql {
   private boolean c = true;

   public com(bsj<? extends com> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public com(dcd $$0, double $$1, double $$2, double $$3) {
      super(bsj.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public coc.a v() {
      return coc.a.f;
   }

   @Override
   public dsh x() {
      return dfh.hc.o();
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
      if (dqm.a(this.dP(), this)) {
         return true;
      } else {
         for (cir $$1 : this.dP().a(cir.class, this.cK().c(0.25, 0.0, 0.25), bsi.a)) {
            if (dqm.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected ctv ag_() {
      return cud.nQ;
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
   public cpe a(int $$0, cmg $$1) {
      return new cqe($$0, $$1, this);
   }
}
