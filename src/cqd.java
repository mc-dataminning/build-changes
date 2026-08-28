public class cqd extends cpp implements cqb {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final crf p = new crf();
   private final cpz q;
   private final cms r;
   private final cqf s;

   public cqd(int $$0, cmr $$1) {
      super(cqw.h, $$0);
      this.r = $$1.l;
      this.q = new crj(10);
      this.s = new crr(this, 3, 3);
      this.a($$1);
   }

   public cqd(int $$0, cmr $$1, cqf $$2, cpz $$3) {
      super(cqw.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(cmr $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cqe(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new crk($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new crk($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cra(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cqe $$2 = (cqe)this.b($$0);
      this.q.a($$2.d, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.q.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.q.a(9) == 1;
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cuk.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.f(cuk.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cms $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof arc $$0) {
         dbt $$1 = $$0.dP();
         cuk $$2 = dgn.a($$1, this.s).map($$1x -> $$1x.b().a(this.s, $$1.H_())).orElse(cuk.l);
         this.p.a(0, $$2);
      }
   }

   public bqi m() {
      return this.s;
   }

   @Override
   public void a(cpp $$0, int $$1, cuk $$2) {
      this.n();
   }

   @Override
   public void a(cpp $$0, int $$1, int $$2) {
   }
}
