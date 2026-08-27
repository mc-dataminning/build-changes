public class cfu extends cfl {
   private static final afo<Boolean> e = afr.a(cfu.class, afq.k);
   private int i;
   public double c;
   public double d;
   private static final cok j = cok.a(clm.ot, clm.ou);

   public cfu(bku<? extends cfu> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cfu(csa $$0, double $$1, double $$2, double $$3) {
      super(bku.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public cfl.a w() {
      return cfl.a.c;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, false);
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

         this.p(this.i > 0);
      }

      if (this.C() && this.ag.a(4) == 0) {
         this.dN().a(js.S, this.ds(), this.du() + 0.8, this.dy(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double q() {
      return (this.aZ() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected cle ag_() {
      return clm.nN;
   }

   @Override
   protected void c(ht $$0, dhi $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      eju $$4 = this.dq();
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
         eju $$1 = this.dq().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
         if (this.aZ()) {
            $$1 = $$1.a(0.1);
         }

         this.g($$1);
      } else {
         this.g(this.dq().d(0.98, 0.0, 0.98));
      }

      super.u();
   }

   @Override
   public bix a(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if (j.a($$2) && this.i + 3600 <= 32000) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         this.i += 3600;
      }

      if (this.i > 0) {
         this.c = this.ds() - $$0.ds();
         this.d = this.dy() - $$0.dy();
      }

      return bix.a(this.dN().B);
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

   protected boolean C() {
      return this.an.b(e);
   }

   protected void p(boolean $$0) {
      this.an.b(e, $$0);
   }

   @Override
   public dhi y() {
      return cvc.cD.o().a(cyh.a, hx.c).a(cyh.b, Boolean.valueOf(this.C()));
   }
}
