public class cpb extends cos implements dre {
   private boolean c = true;

   public cpb(bsw<? extends cpb> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cpb(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cor.a v() {
      return cor.a.f;
   }

   @Override
   public dta x() {
      return dfy.hc.o();
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
      return this.dv();
   }

   @Override
   public double I() {
      return this.dx() + 0.5;
   }

   @Override
   public double J() {
      return this.dB();
   }

   @Override
   public boolean K() {
      return false;
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().B && this.bE() && this.F() && this.L()) {
         this.e();
      }
   }

   public boolean L() {
      if (drf.a(this.dQ(), this)) {
         return true;
      } else {
         for (cjf $$1 : this.dQ().a(cjf.class, this.cL().c(0.25, 0.0, 0.25), bsv.a)) {
            if (drf.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected cuj ag_() {
      return cur.nQ;
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
   public cps a(int $$0, cmu $$1) {
      return new cqs($$0, $$1, this);
   }
}
