public class csp extends crz implements csn {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final ctr r = new ctr();
   private final csl s;
   private final cou t;
   private final csr u;

   public csp(int $$0, cot $$1) {
      super(cti.h, $$0);
      this.t = $$1.k;
      this.s = new ctv(10);
      this.u = new cud(this, 3, 3);
      this.a($$1);
   }

   public csp(int $$0, cot $$1, csr $$2, csl $$3) {
      super(cti.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cot $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new csq(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new ctm(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      csq $$2 = (csq)this.b($$0);
      this.s.a($$2.d, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.s.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.s.a(9) == 1;
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.f(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cou $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arq $$0) {
         dfm $$1 = $$0.dV();
         dap $$2 = this.u.aB_();
         cwm $$3 = dkj.a($$1, $$2).map($$2x -> ((daq)$$2x.b()).a($$2, $$1.J_())).orElse(cwm.k);
         this.r.a(0, $$3);
      }
   }

   public bsd m() {
      return this.u;
   }

   @Override
   public void a(crz $$0, int $$1, cwm $$2) {
      this.n();
   }

   @Override
   public void a(crz $$0, int $$1, int $$2) {
   }
}
