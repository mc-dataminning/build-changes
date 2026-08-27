public class chj extends cha implements dhs {
   private boolean i = true;

   public chj(bly<? extends chj> $$0, cto $$1) {
      super($$0, $$1);
   }

   public chj(cto $$0, double $$1, double $$2, double $$3) {
      super(bly.Y, $$1, $$2, $$3, $$0);
   }

   @Override
   public cgz.a w() {
      return cgz.a.f;
   }

   @Override
   public djg y() {
      return cwr.hc.o();
   }

   @Override
   public int A() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.H()) {
         this.p($$4);
      }
   }

   public boolean H() {
      return this.i;
   }

   public void p(boolean $$0) {
      this.i = $$0;
   }

   @Override
   public double I() {
      return this.dr();
   }

   @Override
   public double J() {
      return this.dt() + 0.5;
   }

   @Override
   public double K() {
      return this.dx();
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && this.bx() && this.H() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dht.a(this.dM(), this)) {
         return true;
      } else {
         for (cbt $$1 : this.dM().a(cbt.class, this.cH().c(0.25, 0.0, 0.25), blx.a)) {
            if (dht.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cms ah_() {
      return cna.nP;
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      $$0.a("Enabled", this.i);
   }

   @Override
   protected void a(sn $$0) {
      super.a($$0);
      this.i = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cia a(int $$0, cfg $$1) {
      return new ciz($$0, $$1, this);
   }
}
