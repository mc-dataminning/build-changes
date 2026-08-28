public class cqh extends cps implements cqf {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final crj p = new crj();
   private final cqd q;
   private final cmv r;
   private final cqj s;

   public cqh(int $$0, cmu $$1) {
      super(cra.h, $$0);
      this.r = $$1.l;
      this.q = new crn(10);
      this.s = new crv(this, 3, 3);
      this.a($$1);
   }

   public cqh(int $$0, cmu $$1, cqj $$2, cqd $$3) {
      super(cra.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(cmu $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cqi(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cro($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cro($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cre(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cqi $$2 = (cqi)this.b($$0);
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
   public cuo b(cmv $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cuo.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.f(cuo.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cmv $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof aqu $$0) {
         dcu $$1 = $$0.dQ();
         cyn $$2 = this.s.aA_();
         cuo $$3 = dhp.a($$1, $$2).map($$2x -> ((cyo)$$2x.b()).a($$2, $$1.H_())).orElse(cuo.l);
         this.p.a(0, $$3);
      }
   }

   public bqj m() {
      return this.s;
   }

   @Override
   public void a(cps $$0, int $$1, cuo $$2) {
      this.n();
   }

   @Override
   public void a(cps $$0, int $$1, int $$2) {
   }
}
