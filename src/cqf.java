public class cqf extends cpv {
   private static final akh<Boolean> e = akl.a(cqf.class, akj.k);
   private static final int i = 3600;
   private static final int j = 32000;
   private int k;
   public double c;
   public double d;

   public cqf(bty<? extends cqf> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cqf(dej $$0, double $$1, double $$2, double $$3) {
      super(bty.S, $$0, $$1, $$2, $$3);
   }

   @Override
   public cpv.a y() {
      return cpv.a.c;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dS().x_()) {
         if (this.k > 0) {
            this.k--;
         }

         if (this.k <= 0) {
            this.c = 0.0;
            this.d = 0.0;
         }

         this.s(this.k > 0);
      }

      if (this.F() && this.af.a(4) == 0) {
         this.dS().a(lo.X, this.dx(), this.dz() + 0.8, this.dD(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double t() {
      return this.bi() ? super.t() * 0.75 : super.t() * 0.5;
   }

   @Override
   protected cvn ak_() {
      return cvw.nO;
   }

   @Override
   protected void v() {
      double $$0 = 1.0E-4;
      double $$1 = 0.001;
      super.v();
      eyw $$2 = this.dv();
      double $$3 = $$2.j();
      double $$4 = this.c * this.c + this.d * this.d;
      if ($$4 > 1.0E-4 && $$3 > 0.001) {
         double $$5 = Math.sqrt($$3);
         double $$6 = Math.sqrt($$4);
         this.c = $$2.d / $$5 * $$6;
         this.d = $$2.f / $$5 * $$6;
      }
   }

   @Override
   protected eyw a(eyw $$0) {
      double $$1 = this.c * this.c + this.d * this.d;
      eyw $$2;
      if ($$1 > 1.0E-7) {
         $$1 = Math.sqrt($$1);
         this.c /= $$1;
         this.d /= $$1;
         $$2 = $$0.d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.bi()) {
            $$2 = $$2.c(0.1);
         }
      } else {
         $$2 = $$0.d(0.98, 0.0, 0.98);
      }

      return super.a($$2);
   }

   @Override
   public brs a(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if ($$2.a(axe.bE) && this.k + 3600 <= 32000) {
         $$2.a(1, $$0);
         this.k += 3600;
      }

      if (this.k > 0) {
         this.c = this.dx() - $$0.dx();
         this.d = this.dD() - $$0.dD();
      }

      return brs.a;
   }

   @Override
   protected void b(ug $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.k);
   }

   @Override
   protected void a(ug $$0) {
      super.a($$0);
      this.c = $$0.k("PushX");
      this.d = $$0.k("PushZ");
      this.k = $$0.g("Fuel");
   }

   protected boolean F() {
      return this.am.a(e);
   }

   protected void s(boolean $$0) {
      this.am.a(e, $$0);
   }

   @Override
   public dus A() {
      return dho.cD.n().b(dkt.a, jk.c).b(dkt.b, Boolean.valueOf(this.F()));
   }
}
