public class cph extends cot implements cpf {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cqj p = new cqj();
   private final cpd q;
   private final clw r;
   private final cpj s;

   public cph(int $$0, clv $$1) {
      super(cqa.h, $$0);
      this.r = $$1.l;
      this.q = new cqn(10);
      this.s = new cqv(this, 3, 3);
      this.a($$1);
   }

   public cph(int $$0, clv $$1, cpj $$2, cpd $$3) {
      super(cqa.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(clv $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cpi(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cqo($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cqo($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cqe(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cpi $$2 = (cpi)this.b($$0);
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
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cto.i;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.f(cto.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(clw $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof aqn $$0) {
         dax $$1 = $$0.dP();
         cto $$2 = dfr.a($$1, this.s).map($$1x -> $$1x.b().a(this.s, $$1.H_())).orElse(cto.i);
         this.p.a(0, $$2);
      }
   }

   public bpn m() {
      return this.s;
   }

   @Override
   public void a(cot $$0, int $$1, cto $$2) {
      this.n();
   }

   @Override
   public void a(cot $$0, int $$1, int $$2) {
   }
}
