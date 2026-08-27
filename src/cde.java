public abstract class cde extends cdp {
   public double b;
   public double c;
   public double d;

   protected cde(bjx<? extends cde> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cde(bjx<? extends cde> $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, cqz $$7) {
      this($$0, $$7);
      this.b($$1, $$2, $$3, this.dB(), this.dD());
      this.ap();
      double $$8 = Math.sqrt($$4 * $$4 + $$5 * $$5 + $$6 * $$6);
      if ($$8 != 0.0) {
         this.b = $$4 / $$8 * 0.1;
         this.c = $$5 / $$8 * 0.1;
         this.d = $$6 / $$8 * 0.1;
      }
   }

   public cde(bjx<? extends cde> $$0, bkj $$1, double $$2, double $$3, double $$4, cqz $$5) {
      this($$0, $$1.dq(), $$1.ds(), $$1.dw(), $$2, $$3, $$4, $$5);
      this.b($$1);
      this.a($$1.dB(), $$1.dD());
   }

   @Override
   protected void b_() {
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 4.0;
      if (Double.isNaN($$1)) {
         $$1 = 4.0;
      }

      $$1 *= 64.0;
      return $$0 < $$1 * $$1;
   }

   @Override
   public void l() {
      bjt $$0 = this.v();
      if (this.dL().B || ($$0 == null || !$$0.dG()) && this.dL().A(this.dl())) {
         super.l();
         if (this.af_()) {
            this.g(1);
         }

         eid $$1 = cdq.a(this, this::a);
         if ($$1.c() != eid.a.a) {
            this.a($$1);
         }

         this.aO();
         eif $$2 = this.do();
         double $$3 = this.dq() + $$2.c;
         double $$4 = this.ds() + $$2.d;
         double $$5 = this.dw() + $$2.e;
         cdq.a(this, 0.2F);
         float $$6 = this.t();
         if (this.aX()) {
            for (int $$7 = 0; $$7 < 4; $$7++) {
               float $$8 = 0.25F;
               this.dL().a(js.e, $$3 - $$2.c * 0.25, $$4 - $$2.d * 0.25, $$5 - $$2.e * 0.25, $$2.c, $$2.d, $$2.e);
            }

            $$6 = 0.8F;
         }

         this.f($$2.b(this.b, this.c, this.d).a((double)$$6));
         this.dL().a(this.s(), $$3, $$4 + 0.5, $$5, 0.0, 0.0, 0.0);
         this.e($$3, $$4, $$5);
      } else {
         this.ak();
      }
   }

   @Override
   protected boolean a(bjt $$0) {
      return super.a($$0) && !$$0.af;
   }

   protected boolean af_() {
      return true;
   }

   protected jq s() {
      return js.Z;
   }

   protected float t() {
      return 0.95F;
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("power", this.a(new double[]{this.b, this.c, this.d}));
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("power", 9)) {
         rz $$1 = $$0.c("power", 6);
         if ($$1.size() == 3) {
            this.b = $$1.h(0);
            this.c = $$1.h(1);
            this.d = $$1.h(2);
         }
      }
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public float bD() {
      return 1.0F;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bo();
         bjt $$2 = $$0.d();
         if ($$2 != null) {
            if (!this.dL().B) {
               eif $$3 = $$2.bE();
               this.f($$3);
               this.b = $$3.c * 0.1;
               this.c = $$3.d * 0.1;
               this.d = $$3.e * 0.1;
               this.b($$2);
            }

            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public float bm() {
      return 1.0F;
   }

   @Override
   public wb<xu> di() {
      bjt $$0 = this.v();
      int $$1 = $$0 == null ? 0 : $$0.ah();
      return new xv(this.ah(), this.cv(), this.dq(), this.ds(), this.dw(), this.dD(), this.dB(), this.ag(), $$1, new eif(this.b, this.c, this.d), 0.0);
   }

   @Override
   public void a(xv $$0) {
      super.a($$0);
      double $$1 = $$0.i();
      double $$2 = $$0.j();
      double $$3 = $$0.k();
      double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
      if ($$4 != 0.0) {
         this.b = $$1 / $$4 * 0.1;
         this.c = $$2 / $$4 * 0.1;
         this.d = $$3 / $$4 * 0.1;
      }
   }
}
