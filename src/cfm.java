public class cfm extends cfd {
   private static final afm<Boolean> e = afp.a(cfm.class, afo.k);
   private int i;
   public double c;
   public double d;
   private static final coc j = coc.a(cle.nI, cle.nJ);

   public cfm(bkm<? extends cfm> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cfm(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public cfd.a v() {
      return cfd.a.c;
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
   protected ckw ag_() {
      return cle.nc;
   }

   @Override
   protected void c(ht $$0, dgw $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      eji $$4 = this.do();
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
         eji $$1 = this.do().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
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
   public biq a(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
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

      return biq.a(this.dL().B);
   }

   @Override
   protected void b(rz $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(rz $$0) {
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
   public dgw x() {
      return cuv.cD.o().a(cxz.a, hx.c).a(cxz.b, Boolean.valueOf(this.B()));
   }
}
