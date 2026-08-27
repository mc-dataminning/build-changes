public class ckt extends ckf implements ckr {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final clv p = new clv();
   private final ckp q;
   private final chl r;
   private final ckv s;

   public ckt(int $$0, chk $$1) {
      super(clm.h, $$0);
      this.r = $$1.m;
      this.q = new clz(10);
      this.s = new cmf(this, 3, 3);
      this.a($$1);
   }

   public ckt(int $$0, chk $$1, ckv $$2, ckp $$3) {
      super(clm.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(chk $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cku(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cma($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cma($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new clq(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cku $$2 = (cku)this.b($$0);
      this.q.a($$2.e, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.q.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.q.a(9) == 1;
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cpd.h;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cpd.h;
         }

         if ($$4.b()) {
            $$3.f(cpd.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpd.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(chl $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof aox $$0) {
         cvr $$1 = $$0.dM();
         cpd $$2 = dal.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.I_())).orElse(cpd.h);
         this.p.a(0, $$2);
      }
   }

   public blp m() {
      return this.s;
   }

   @Override
   public void a(ckf $$0, int $$1, cpd $$2) {
      this.n();
   }

   @Override
   public void a(ckf $$0, int $$1, int $$2) {
   }
}
