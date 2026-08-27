public class cfz extends cfq {
   private static final afs<Boolean> e = afv.a(cfz.class, afu.k);
   private int i;
   public double c;
   public double d;
   private static final coq j = coq.a(clr.ot, clr.ou);

   public cfz(bkz<? extends cfz> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cfz(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.P, $$0, $$1, $$2, $$3);
   }

   @Override
   public cfq.a w() {
      return cfq.a.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, false);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().y_()) {
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
         this.dN().a(jw.S, this.ds(), this.du() + 0.8, this.dy(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected double q() {
      return (this.aZ() ? 3.0 : 4.0) / 20.0;
   }

   @Override
   protected clj ah_() {
      return clr.nN;
   }

   @Override
   protected void c(hx $$0, dhn $$1) {
      double $$2 = 1.0E-4;
      double $$3 = 0.001;
      super.c($$0, $$1);
      ejz $$4 = this.dq();
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
         ejz $$1 = this.dq().d(0.8, 0.0, 0.8).b(this.c, 0.0, this.d);
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
   public bjb a(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
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

      return bjb.a(this.dN().B);
   }

   @Override
   protected void b(sd $$0) {
      super.b($$0);
      $$0.a("PushX", this.c);
      $$0.a("PushZ", this.d);
      $$0.a("Fuel", (short)this.i);
   }

   @Override
   protected void a(sd $$0) {
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
   public dhn y() {
      return cvh.cD.o().a(cym.a, ib.c).a(cym.b, Boolean.valueOf(this.C()));
   }
}
