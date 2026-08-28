public class cqk extends cpw implements cqi {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final crm p = new crm();
   private final cqg q;
   private final cmz r;
   private final cqm s;

   public cqk(int $$0, cmy $$1) {
      super(crd.h, $$0);
      this.r = $$1.l;
      this.q = new crq(10);
      this.s = new cry(this, 3, 3);
      this.a($$1);
   }

   public cqk(int $$0, cmy $$1, cqm $$2, cqg $$3) {
      super(crd.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(cmy $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cql(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new crr($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new crr($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new crh(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cql $$2 = (cql)this.b($$0);
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
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cur.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.f(cur.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cur.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cmz $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof arg $$0) {
         dca $$1 = $$0.dP();
         cur $$2 = dgu.a($$1, this.s).map($$1x -> $$1x.b().a(this.s, $$1.H_())).orElse(cur.l);
         this.p.a(0, $$2);
      }
   }

   public bqp m() {
      return this.s;
   }

   @Override
   public void a(cpw $$0, int $$1, cur $$2) {
      this.n();
   }

   @Override
   public void a(cpw $$0, int $$1, int $$2) {
   }
}
