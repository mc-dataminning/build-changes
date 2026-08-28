public class cpw extends cph implements cpu {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cqy p = new cqy();
   private final cps q;
   private final cmk r;
   private final cpy s;

   public cpw(int $$0, cmj $$1) {
      super(cqp.h, $$0);
      this.r = $$1.l;
      this.q = new crc(10);
      this.s = new crk(this, 3, 3);
      this.a($$1);
   }

   public cpw(int $$0, cmj $$1, cpy $$2, cps $$3) {
      super(cqp.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(cmj $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cpx(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new crd($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new crd($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cqt(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cpx $$2 = (cpx)this.b($$0);
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
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.f(cuc.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cmk $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof aqn $$0) {
         dcf $$1 = $$0.dQ();
         cxy $$2 = this.s.aA_();
         cuc $$3 = dha.a($$1, $$2).map($$2x -> ((cxz)$$2x.b()).a($$2, $$1.H_())).orElse(cuc.l);
         this.p.a(0, $$3);
      }
   }

   public bpz m() {
      return this.s;
   }

   @Override
   public void a(cph $$0, int $$1, cuc $$2) {
      this.n();
   }

   @Override
   public void a(cph $$0, int $$1, int $$2) {
   }
}
