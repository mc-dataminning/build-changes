public class cme extends clq implements cmc {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cng p = new cng();
   private final cma q;
   private final ciu r;
   private final cmg s;

   public cme(int $$0, cit $$1) {
      super(cmx.h, $$0);
      this.r = $$1.m;
      this.q = new cnk(10);
      this.s = new cnq(this, 3, 3);
      this.a($$1);
   }

   public cme(int $$0, cit $$1, cmg $$2, cma $$3) {
      super(cmx.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cit $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cmf(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cnl($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cnl($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cnb(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cmf $$2 = (cmf)this.b($$0);
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
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cqm.h;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.f(cqm.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(ciu $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof apg $$0) {
         cxb $$1 = $$0.dM();
         cqm $$2 = dbv.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.H_())).orElse(cqm.h);
         this.p.a(0, $$2);
      }
   }

   public bmw m() {
      return this.s;
   }

   @Override
   public void a(clq $$0, int $$1, cqm $$2) {
      this.n();
   }

   @Override
   public void a(clq $$0, int $$1, int $$2) {
   }
}
