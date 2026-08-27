public class cnm extends cnd implements dok {
   private boolean c = true;

   public cnm(brn<? extends cnm> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cnm(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cnc.a v() {
      return cnc.a.f;
   }

   @Override
   public dqh x() {
      return ddg.hc.n();
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
      return this.ds();
   }

   @Override
   public double I() {
      return this.du() + 0.5;
   }

   @Override
   public double J() {
      return this.dy();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B && this.bB() && this.G() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dol.a(this.dN(), this)) {
         return true;
      } else {
         for (chr $$1 : this.dN().a(chr.class, this.cI().c(0.25, 0.0, 0.25), brm.a)) {
            if (dol.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected csu ag_() {
      return ctc.nQ;
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cod a(int $$0, clg $$1) {
      return new cpd($$0, $$1, this);
   }
}
