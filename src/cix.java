public class cix extends cij implements civ {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cjz p = new cjz();
   private final cit q;
   private final cfq r;
   private final ciz s;

   public cix(int $$0, cfp $$1) {
      super(cjq.h, $$0);
      this.r = $$1.m;
      this.q = new ckd(10);
      this.s = new ckj(this, 3, 3);
      this.a($$1);
   }

   public cix(int $$0, cfp $$1, ciz $$2, cit $$3) {
      super(cjq.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cfp $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new ciy(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cke($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cke($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cju(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      ciy $$2 = (ciy)this.b($$0);
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
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cng.f;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.f(cng.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cfq $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof anf $$0) {
         ctx $$1 = $$0.dL();
         cng $$2 = cyr.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.I_())).orElse(cng.f);
         this.p.a(0, $$2);
      }
   }

   public bjv m() {
      return this.s;
   }

   @Override
   public void a(cij $$0, int $$1, cng $$2) {
      this.n();
   }

   @Override
   public void a(cij $$0, int $$1, int $$2) {
   }
}
