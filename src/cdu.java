public class cdu extends cdl {
   private static final aef<Boolean> e = aei.a(cdu.class, aeh.k);
   private int f;
   public double c;
   public double d;
   private static final cmg g = cmg.a(cji.nI, cji.nJ);

   public cdu(biu<? extends cdu> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public cdu(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public cdl.a z() {
      return cdl.a.c;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().w_()) {
         if (this.f > 0) {
            this.f--;
         }

         if (this.f <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.p(this.f > 0);
      }

      if (this.G() && this.ag.a(4) == 0) {
         this.dL().a(ix.S, this.dq(), this.ds() + 0.8, this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double s() {
      return (this.aY() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cja q() {
      return cji.nc;
   }

   @Override
   protected void c(gw $$0, dfj $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      ehn $$4 = this.do();
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
   protected void v() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         ehn $$1 = this.do().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aY()) {
            $$1 = $$1.a(0.1);
         }

         this.f($$1);
      } else {
         this.f(this.do().d(0.98, 0.0, 0.98));
      }

      super.v();
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if (g.a($$2) && this.f + 3600 <= 32000) {
         if (!$$0.fS().d) {
            $$2.h(1);
         }

         this.f += 3600;
      }

      if (this.f > 0) {
         this.c = this.dq() - $$0.dq();
         this.d = this.dw() - $$0.dw();
      }

      return bgy.a(this.dL().B);
   }

   @Override
   protected void b(qx $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.f);
   }

   @Override
   protected void a(qx $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.f = $$0.g("Fuel");
   }

   protected boolean G() {
      return this.an.b(e);
   }

   protected void p(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public dfj B() {
      return csw.cD.n().a(cvy.a, hc.c).a(cvy.b, Boolean.valueOf(this.G()));
   }
}
