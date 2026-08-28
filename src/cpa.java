public class cpa extends cor {
   private static final ajv<Boolean> e = ajz.a(cpa.class, ajx.k);
   private int i;
   public double c;
   public double d;
   private static final cyu j = cyu.a(cur.ox, cur.oy);

   public cpa(bsw<? extends cpa> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cpa(dcu $$0, double $$1, double $$2, double $$3) {
      super(bsw.S, $$0, $$1, $$2, $$3);
   }

   @Override
   public cor.a v() {
      return cor.a.c;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().x_()) {
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
         this.dQ().a(lm.X, this.dv(), this.dx() + 0.8, this.dB(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double p() {
      return (this.bf() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cuj ag_() {
      return cur.nO;
   }

   @Override
   protected void c(jd $$0, dta $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      eww $$4 = this.dt();
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
         eww $$1 = this.dt().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.bf()) {
            $$1 = $$1.a(0.1);
         }

         this.i($$1);
      } else {
         this.i(this.dt().d(0.98, 0.0, 0.98));
      }

      super.t();
   }

   @Override
   public bqq a(cmv $$0, bqp $$1) {
      cuo $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.dv() - $$0.dv();
         this.d = this.dB() - $$0.dB();
      }

      return bqq.a(this.dQ().B);
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
   public dta x() {
      return dfy.cD.o().a(djd.a, ji.c).a(djd.b, Boolean.valueOf(this.B()));
   }
}
