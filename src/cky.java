public class cky extends ckp {
   private static final aim<Boolean> e = aiq.a(cky.class, aio.k);
   private int i;
   public double c;
   public double d;
   private static final ctm j = ctm.a(cqp.ov, cqp.ow);

   public cky(bpd<? extends cky> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cky(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.T, $$0, $$1, $$2, $$3);
   }

   @Override
   public ckp.a v() {
      return ckp.a.c;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().x_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.p(this.i > 0);
      }

      if (this.B() && this.ag.a(4) == 0) {
         this.dM().a(kc.V, this.dr(), this.dt() + 0.8, this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double p() {
      return (this.bc() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cqh ah_() {
      return cqp.nN;
   }

   @Override
   protected void c(ib $$0, dnb $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      ept $$4 = this.dp();
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
   protected void s() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         ept $$1 = this.dp().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.bc()) {
            $$1 = $$1.a(0.1);
         }

         this.g($$1);
      } else {
         this.g(this.dp().d(0.98, 0.0, 0.98));
      }

      super.s();
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.dr() - $$0.dr();
         this.d = this.dx() - $$0.dx();
      }

      return bnd.a(this.dM().B);
   }

   @Override
   protected void b(ta $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(ta $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean B() {
      return this.an.a(e);
   }

   protected void p(boolean $$0) {
      this.an.a(e, $$0);
   }

   @Override
   public dnb x() {
      return dae.cD.o().a(ddj.a, ih.c).a(ddj.b, Boolean.valueOf(this.B()));
   }
}
