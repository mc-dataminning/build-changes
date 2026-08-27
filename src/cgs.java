public class cgs extends cgj {
   private static final afz<Boolean> e = agc.a(cgs.class, agb.k);
   private int i;
   public double c;
   public double d;
   private static final cpi j = cpi.a(cmk.ot, cmk.ou);

   public cgs(blj<? extends cgs> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cgs(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.Q, $$0, $$1, $$2, $$3);
   }

   @Override
   public cgj.a w() {
      return cgj.a.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().y_()) {
         if (this.i > 0) {
            this.i--;
         }

         if (this.i <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.p(this.i > 0);
      }

      if (this.C() && this.ag.a(4) == 0) {
         this.dM().a(jv.U, this.dr(), this.dt() + 0.8, this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double q() {
      return (this.aZ() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cmc ah_() {
      return cmk.nN;
   }

   @Override
   protected void c(hv $$0, dip $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      elb $$4 = this.dp();
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
         elb $$1 = this.dp().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aZ()) {
            $$1 = $$1.a(0.1);
         }

         this.g($$1);
      } else {
         this.g(this.dp().d(0.98, 0.0, 0.98));
      }

      super.u();
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.dr() - $$0.dr();
         this.d = this.dx() - $$0.dx();
      }

      return bjl.a(this.dM().B);
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(sj $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean C() {
      return this.an.b(e);
   }

   protected void p(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public dip y() {
      return cwb.cD.o().a(czg.a, ia.c).a(czg.b, Boolean.valueOf(this.C()));
   }
}
