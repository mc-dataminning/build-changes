public class cex extends ceo {
   private static final afc<Boolean> e = aff.a(cex.class, afe.k);
   private int i;
   public double c;
   public double d;
   private static final cnk j = cnk.a(ckm.nI, ckm.nJ);

   public cex(bjx<? extends cex> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cex(cqz $$0, double $$1, double $$2, double $$3) {
      super(bjx.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public ceo.a v() {
      return ceo.a.c;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().x_()) {
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
         this.dL().a(js.S, this.dq(), this.ds() + 0.8, this.dw(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double q() {
      return (this.aX() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cke ag_() {
      return ckm.nc;
   }

   @Override
   protected void c(ht $$0, dgb $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      eif $$4 = this.do();
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
         eif $$1 = this.do().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aX()) {
            $$1 = $$1.a(0.1);
         }

         this.f($$1);
      } else {
         this.f(this.do().d(0.98, 0.0, 0.98));
      }

      super.t();
   }

   @Override
   public bib a(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.dq() - $$0.dq();
         this.d = this.dw() - $$0.dw();
      }

      return bib.a(this.dL().B);
   }

   @Override
   protected void b(rt $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(rt $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.i = $$0.g("Fuel");
   }

   protected boolean B() {
      return this.an.b(e);
   }

   protected void p(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public dgb x() {
      return cuc.cD.o().a(cxf.a, hx.c).a(cxf.b, Boolean.valueOf(this.B()));
   }
}
