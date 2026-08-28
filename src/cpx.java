public class cpx extends cpn implements dse {
   private boolean c = true;
   private boolean d = false;

   public cpx(btq<? extends cpx> $$0, dds $$1) {
      super($$0, $$1);
   }

   public cpx(dds $$0, double $$1, double $$2, double $$3) {
      super(btq.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cpm.a x() {
      return cpm.a.f;
   }

   @Override
   public dua z() {
      return dgx.hc.o();
   }

   @Override
   public int B() {
      return 1;
   }

   @Override
   public int b() {
      return 5;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = !$$3;
      if ($$4 != this.J()) {
         this.s($$4);
      }
   }

   public boolean J() {
      return this.c;
   }

   public void s(boolean $$0) {
      this.c = $$0;
   }

   @Override
   public double K() {
      return this.dx();
   }

   @Override
   public double L() {
      return this.dz() + 0.5;
   }

   @Override
   public double M() {
      return this.dD();
   }

   @Override
   public boolean O() {
      return false;
   }

   @Override
   public void l() {
      this.d = false;
      super.l();
      this.T();
   }

   @Override
   protected double a(je $$0, dve $$1, double $$2) {
      double $$3 = super.a($$0, $$1, $$2);
      this.T();
      return $$3;
   }

   private void T() {
      if (!this.dS().B && this.bI() && this.J() && !this.d && this.P()) {
         this.d = true;
         this.e();
      }
   }

   public boolean P() {
      if (dsf.a(this.dS(), this)) {
         return true;
      } else {
         for (cjz $$1 : this.dS().a(cjz.class, this.cO().c(0.25, 0.0, 0.25), bto.a)) {
            if (dsf.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cvg aj_() {
      return cvo.nQ;
   }

   @Override
   protected void b(uf $$0) {
      super.b($$0);
      $$0.a("Enabled", this.c);
   }

   @Override
   protected void a(uf $$0) {
      super.a($$0);
      this.c = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public cqq a(int $$0, cno $$1) {
      return new crr($$0, $$1, this);
   }
}
