public class cpt extends cpe implements cpr {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cqv p = new cqv();
   private final cpp q;
   private final cmh r;
   private final cpv s;

   public cpt(int $$0, cmg $$1) {
      super(cqm.h, $$0);
      this.r = $$1.l;
      this.q = new cqz(10);
      this.s = new crh(this, 3, 3);
      this.a($$1);
   }

   public cpt(int $$0, cmg $$1, cpv $$2, cpp $$3) {
      super(cqm.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(cmg $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cpu(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cra($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cra($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cqq(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cpu $$2 = (cpu)this.b($$0);
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
   public cua b(cmh $$0, int $$1) {
      cua $$2 = cua.l;
      cra $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cua $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cua.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cua.l;
         }

         if ($$4.e()) {
            $$3.f(cua.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cua.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cmh $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof aql $$0) {
         dcd $$1 = $$0.dP();
         cxw $$2 = this.s.aA_();
         cua $$3 = dgy.a($$1, $$2).map($$2x -> ((cxx)$$2x.b()).a($$2, $$1.H_())).orElse(cua.l);
         this.p.a(0, $$3);
      }
   }

   public bpw m() {
      return this.s;
   }

   @Override
   public void a(cpe $$0, int $$1, cua $$2) {
      this.n();
   }

   @Override
   public void a(cpe $$0, int $$1, int $$2) {
   }
}
