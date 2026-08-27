public class cip extends cib implements cin {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cjr p = new cjr();
   private final cil q;
   private final cfi r;
   private final cir s;

   public cip(int $$0, cfh $$1) {
      super(cji.h, $$0);
      this.r = $$1.m;
      this.q = new cjv(10);
      this.s = new ckb(this, 3, 3);
      this.a($$1);
   }

   public cip(int $$0, cfh $$1, cir $$2, cil $$3) {
      super(cji.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cfh $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new ciq(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cjw($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cjw($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cjm(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      ciq $$2 = (ciq)this.b($$0);
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
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cmy.f;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cmy.f;
         }

         if ($$4.b()) {
            $$3.f(cmy.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmy.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cfi $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof ane $$0) {
         ctp $$1 = $$0.dM();
         cmy $$2 = cyj.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.I_())).orElse(cmy.f);
         this.p.a(0, $$2);
      }
   }

   public bju m() {
      return this.s;
   }

   @Override
   public void a(cib $$0, int $$1, cmy $$2) {
      this.n();
   }

   @Override
   public void a(cib $$0, int $$1, int $$2) {
   }
}
