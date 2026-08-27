public class chk extends chb implements dht {
   private boolean i = true;

   public chk(blz<? extends chk> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public chk(ctp $$0, double $$1, double $$2, double $$3) {
      super(blz.Y, $$1, $$2, $$3, $$0);
   }

   @Override
   public cha.a w() {
      return cha.a.f;
   }

   @Override
   public djh y() {
      return cws.hc.o();
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
      if (dhu.a(this.dM(), this)) {
         return true;
      } else {
         for (cbu $$1 : this.dM().a(cbu.class, this.cH().c(0.25, 0.0, 0.25), bly.a)) {
            if (dhu.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cmt ah_() {
      return cnb.nP;
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
   public cib a(int $$0, cfh $$1) {
      return new cja($$0, $$1, this);
   }
}
