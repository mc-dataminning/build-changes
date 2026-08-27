public class cpj extends cov implements cph {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cql p = new cql();
   private final cpf q;
   private final cly r;
   private final cpl s;

   public cpj(int $$0, clx $$1) {
      super(cqc.h, $$0);
      this.r = $$1.l;
      this.q = new cqp(10);
      this.s = new cqx(this, 3, 3);
      this.a($$1);
   }

   public cpj(int $$0, clx $$1, cpl $$2, cpf $$3) {
      super(cqc.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(clx $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cpk(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cqq($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cqq($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cqg(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cpk $$2 = (cpk)this.b($$0);
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
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return ctq.i;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.f(ctq.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cly $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof aqo $$0) {
         daz $$1 = $$0.dP();
         ctq $$2 = dft.a($$1, this.s).map($$1x -> $$1x.b().a(this.s, $$1.H_())).orElse(ctq.i);
         this.p.a(0, $$2);
      }
   }

   public bpp m() {
      return this.s;
   }

   @Override
   public void a(cov $$0, int $$1, ctq $$2) {
      this.n();
   }

   @Override
   public void a(cov $$0, int $$1, int $$2) {
   }
}
