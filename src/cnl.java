public class cnl extends cnc {
   private static final ajm<Boolean> e = ajq.a(cnl.class, ajo.k);
   private int i;
   public double c;
   public double d;
   private static final cxa j = cxa.a(ctc.ow, ctc.ox);

   public cnl(brn<? extends cnl> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cnl(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.S, $$0, $$1, $$2, $$3);
   }

   @Override
   public cnc.a v() {
      return cnc.a.c;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().x_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.b(this.i > 0);
      }

      if (this.B() && this.ah.a(4) == 0) {
         this.dN().a(kx.U, this.ds(), this.du() + 0.8, this.dy(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double p() {
      return (this.bc() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected csu ag_() {
      return ctc.nO;
   }

   @Override
   protected void c(in $$0, dqh $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      etp $$4 = this.dq();
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
   protected void u() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         etp $$1 = this.dq().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.bc()) {
            $$1 = $$1.a(0.1);
         }

         this.g($$1);
      } else {
         this.g(this.dq().d(0.98, 0.0, 0.98));
      }

      super.u();
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.ds() - $$0.ds();
         this.d = this.dy() - $$0.dy();
      }

      return bpm.a(this.dN().B);
   }

   @Override
   protected void b(ua $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(ua $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean B() {
      return this.ao.a(e);
   }

   protected void b(boolean $$0) {
      this.ao.a(e, $$0);
   }

   @Override
   public dqh x() {
      return ddg.cD.n().a(dgl.a, is.c).a(dgl.b, Boolean.valueOf(this.B()));
   }
}
