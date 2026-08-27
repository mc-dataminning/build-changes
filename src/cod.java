public class cod extends cnu implements dpg {
   private boolean c = true;

   public cod(bsc<? extends cod> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cod(daz $$0, double $$1, double $$2, double $$3) {
      super(bsc.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cnt.a v() {
      return cnt.a.f;
   }

   @Override
   public drd x() {
      return dec.hc.n();
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
      if (dph.a(this.dP(), this)) {
         return true;
      } else {
         for (cii $$1 : this.dP().a(cii.class, this.cK().c(0.25, 0.0, 0.25), bsb.a)) {
            if (dph.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected ctl ah_() {
      return ctt.nQ;
   }

   @Override
   protected void b(ud $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(ud $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cov a(int $$0, clx $$1) {
      return new cpu($$0, $$1, this);
   }
}
