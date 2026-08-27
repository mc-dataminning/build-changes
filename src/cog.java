public class cog extends cnx implements drb {
   private boolean c = true;

   public cog(bsb<? extends cog> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cog(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.ac, $$1, $$2, $$3, $$0);
   }

   @Override
   public cnw.a u() {
      return cnw.a.f;
   }

   @Override
   public dtc x() {
      return dfe.hW.n();
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
   public double G() {
      return this.dz();
   }

   @Override
   public double I() {
      return this.dB() + 0.5;
   }

   @Override
   public double J() {
      return this.dF();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dU().C && this.bI() && this.F() && this.L()) {
         this.e();
      }
   }

   public boolean L() {
      if (drc.a(this.dU(), this)) {
         return true;
      } else {
         for (cig $$1 : this.dU().a(cig.class, this.cP().c(0.25, 0.0, 0.25), bsa.a)) {
            if (drc.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cuc ah_() {
      return cuk.pg;
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cpg a(int $$0, clx $$1) {
      return new cqg($$0, $$1, this);
   }
}
