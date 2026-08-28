public class cst extends csd implements csr {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final ctv r = new ctv();
   private final csp s;
   private final coy t;
   private final csv u;

   public cst(int $$0, cox $$1) {
      super(ctm.h, $$0);
      this.t = $$1.k;
      this.s = new ctz(10);
      this.u = new cuh(this, 3, 3);
      this.a($$1);
   }

   public cst(int $$0, cox $$1, csv $$2, csp $$3) {
      super(ctm.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cox $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new csu(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new ctq(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      csu $$2 = (csu)this.b($$0);
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
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.f(cwq.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(coy $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof are $$0) {
         ard $$1 = $$0.y();
         dat $$2 = this.u.aB_();
         cwq $$3 = dlg.a($$1, $$2).map($$2x -> ((dau)$$2x.b()).a($$2, $$1.K_())).orElse(cwq.j);
         this.r.a(0, $$3);
      }
   }

   public bse m() {
      return this.u;
   }

   @Override
   public void a(csd $$0, int $$1, cwq $$2) {
      this.n();
   }

   @Override
   public void a(csd $$0, int $$1, int $$2) {
   }
}
