public class cii extends chu implements cig {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cjk p = new cjk();
   private final cie q;
   private final cfb r;
   private final cik s;

   public cii(int $$0, cfa $$1) {
      super(cjb.h, $$0);
      this.r = $$1.m;
      this.q = new cjo(10);
      this.s = new cju(this, 3, 3);
      this.a($$1);
   }

   public cii(int $$0, cfa $$1, cik $$2, cie $$3) {
      super(cjb.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cfa $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cij(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cjp($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cjp($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cjf(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cij $$2 = (cij)this.b($$0);
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
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cmr.f;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cmr.f;
         }

         if ($$4.b()) {
            $$3.f(cmr.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmr.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cfb $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof ana $$0) {
         cti $$1 = $$0.dM();
         cmr $$2 = cyc.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.I_())).orElse(cmr.f);
         this.p.a(0, $$2);
      }
   }

   public bjo m() {
      return this.s;
   }

   @Override
   public void a(chu $$0, int $$1, cmr $$2) {
      this.n();
   }

   @Override
   public void a(chu $$0, int $$1, int $$2) {
   }
}
