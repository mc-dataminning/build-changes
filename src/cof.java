public class cof extends cnw {
   private static final ajy<Boolean> e = akc.a(cof.class, aka.k);
   private int i;
   public double c;
   public double d;
   private static final cyv j = cyv.a(cuk.pM, cuk.pN);

   public cof(bsb<? extends cof> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cof(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.U, $$0, $$1, $$2, $$3);
   }

   @Override
   public cnw.a u() {
      return cnw.a.c;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dU().x_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.b(this.i > 0);
      }

      if (this.B() && this.al.a(4) == 0) {
         this.dU().a(lb.V, this.dz(), this.dB() + 0.8, this.dF(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double p() {
      return (this.bi() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cuc ah_() {
      return cuk.pe;
   }

   @Override
   protected void c(ir $$0, dtc $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      ewu $$4 = this.dx();
      double $$5 = $$4.i();
      double $$6 = this.c * this.c + this.d * this.d;
      if ($$6 > 1.0E-4 && $$5 > 0.001) {
         double $$7 = Math.sqrt($$5);
         double $$8 = Math.sqrt($$6);
         this.c = $$4.c / $$7 * $$8;
         this.d = $$4.e / $$7 * $$8;
      }
   }

   @Override
   protected void t() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         ewu $$1 = this.dx().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.bi()) {
            $$1 = $$1.a(0.1);
         }

         this.g($$1);
      } else {
         this.g(this.dx().d(0.98, 0.0, 0.98));
      }

      super.t();
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.dz() - $$0.dz();
         this.d = this.dF() - $$0.dF();
      }

      return bqa.a(this.dU().C);
   }

   @Override
   protected void b(uk $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(uk $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean B() {
      return this.as.a(e);
   }

   protected void b(boolean $$0) {
      this.as.a(e, $$0);
   }

   @Override
   public dtc x() {
      return dfe.dp.n().a(din.a, iw.c).a(din.b, Boolean.valueOf(this.B()));
   }
}
