public class cdl extends cdc {
   private static final adx<Boolean> e = aea.a(cdl.class, adz.k);
   private int f;
   public double c;
   public double d;
   private static final clw g = clw.a(ciz.nI, ciz.nJ);

   public cdl(bik<? extends cdl> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cdl(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public cdc.a t() {
      return cdc.a.c;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().r_()) {
         if (this.f > 0) {
            this.f--;
         }

         if (this.f <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.p(this.f > 0);
      }

      if (this.A() && this.ag.a(4) == 0) {
         this.dK().a(iw.S, this.dp(), this.dr() + 0.8, this.dv(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double m() {
      return (this.aX() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cir j() {
      return ciz.nc;
   }

   @Override
   protected void c(gv $$0, dey $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      ehf $$4 = this.dn();
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
   protected void p() {
      double $$0 = this.c * this.c + this.d * this.d;
      if ($$0 > 1.0E-7) {
         $$0 = Math.sqrt($$0);
         this.c /= $$0;
         this.d /= $$0;
         ehf $$1 = this.dn().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aX()) {
            $$1 = $$1.a(0.1);
         }

         this.f($$1);
      } else {
         this.f(this.dn().d(0.98, 0.0, 0.98));
      }

      super.p();
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (g.a($$2) && this.f + 3600 <= 32000) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         this.f += 3600;
      }

      if (this.f > 0) {
         this.c = this.dp() - $$0.dp();
         this.d = this.dv() - $$0.dv();
      }

      return bgo.a(this.dK().B);
   }

   @Override
   protected void b(qs $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.f);
   }

   @Override
   protected void a(qs $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.f = $$0.g("Fuel");
   }

   protected boolean A() {
      return this.an.b(e);
   }

   protected void p(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public dey w() {
      return csl.cD.n().a(cvn.a, hb.c).a(cvn.b, Boolean.valueOf(this.A()));
   }
}
