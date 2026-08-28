public class coq extends cog implements dqo {
   private boolean c = true;

   public coq(bsm<? extends coq> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public coq(dcf $$0, double $$1, double $$2, double $$3) {
      super(bsm.aa, $$1, $$2, $$3, $$0);
   }

   @Override
   public cof.a v() {
      return cof.a.f;
   }

   @Override
   public dsk x() {
      return dfj.hc.o();
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
      if (!this.dQ().B && this.bE() && this.G() && this.M()) {
         this.e();
      }
   }

   public boolean M() {
      if (dqp.a(this.dQ(), this)) {
         return true;
      } else {
         for (ciu $$1 : this.dQ().a(ciu.class, this.cL().c(0.25, 0.0, 0.25), bsl.a)) {
            if (dqp.a(this, $$1)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected ctx ag_() {
      return cuf.nQ;
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
   public cph a(int $$0, cmj $$1) {
      return new cqh($$0, $$1, this);
   }
}
