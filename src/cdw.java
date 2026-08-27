public class cdw extends cdn {
   private static final aeg<Boolean> e = aej.a(cdw.class, aei.k);
   private int f;
   public double c;
   public double d;
   private static final cmi g = cmi.a(cjk.nI, cjk.nJ);

   public cdw(biw<? extends cdw> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cdw(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public cdn.a z() {
      return cdn.a.c;
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
      return (this.aX() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cjc q() {
      return cjk.nc;
   }

   @Override
   protected void c(gw $$0, dfl $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      ehp $$4 = this.do();
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
         ehp $$1 = this.do().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aX()) {
            $$1 = $$1.a(0.1);
         }

         this.f($$1);
      } else {
         this.f(this.do().d(0.98, 0.0, 0.98));
      }

      super.v();
   }

   @Override
   public bha a(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
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

      return bha.a(this.dL().B);
   }

   @Override
   protected void b(qy $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.f);
   }

   @Override
   protected void a(qy $$0) {
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
   public dfl B() {
      return csy.cD.n().a(cwa.a, hc.c).a(cwa.b, Boolean.valueOf(this.G()));
   }
}
