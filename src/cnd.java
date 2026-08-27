public class cnd extends cmp implements cnb {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cof p = new cof();
   private final cmz q;
   private final cjt r;
   private final cnf s;

   public cnd(int $$0, cjs $$1) {
      super(cnw.h, $$0);
      this.r = $$1.m;
      this.q = new coj(10);
      this.s = new coq(this, 3, 3);
      this.a($$1);
   }

   public cnd(int $$0, cjs $$1, cnf $$2, cmz $$3) {
      super(cnw.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cjs $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cne(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cok($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cok($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new coa(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cne $$2 = (cne)this.b($$0);
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
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return crj.i;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.f(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cjt $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof apt $$0) {
         cyx $$1 = $$0.dM();
         crj $$2 = ddr.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.H_())).orElse(crj.i);
         this.p.a(0, $$2);
      }
   }

   public bnt m() {
      return this.s;
   }

   @Override
   public void a(cmp $$0, int $$1, crj $$2) {
      this.n();
   }

   @Override
   public void a(cmp $$0, int $$1, int $$2) {
   }
}
