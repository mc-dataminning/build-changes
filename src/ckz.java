public class ckz extends ckq implements dlg {
   private boolean d = true;

   public ckz(bpd<? extends ckz> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public ckz(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.ab, $$1, $$2, $$3, $$0);
   }

   @Override
   public ckp.a v() {
      return ckp.a.f;
   }

   @Override
   public dnb x() {
      return dae.hc.o();
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
         this.p($$4);
      }
   }

   public boolean G() {
      return this.d;
   }

   public void p(boolean $$0) {
      this.d = $$0;
   }

   @Override
   public double H() {
      return this.dr();
   }

   @Override
   public double I() {
      return this.dt() + 0.5;
   }

   @Override
   public double J() {
      return this.dx();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B && this.bA() && this.G() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dlh.a(this.dM(), this)) {
         return true;
      } else {
         for (cfe $$1 : this.dM().a(cfe.class, this.cH().c(0.25, 0.0, 0.25), bpc.a)) {
            if (dlh.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cqh ah_() {
      return cqp.nP;
   }

   @Override
   protected void b(ta $$0) {
      super.b($$0);
      $$0.a("Enabled", this.d);
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.d = $$0.e("Enabled") ? $$0.q("Enabled") : true;
   }

   @Override
   public clq a(int $$0, cit $$1) {
      return new cmp($$0, $$1, this);
   }
}
