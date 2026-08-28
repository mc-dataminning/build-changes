public class cwg extends cvq implements cwe {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cxi r = new cxi();
   private final cwc s;
   private final crx t;
   private final cwi u;

   public cwg(int $$0, crw $$1) {
      super(cwz.h, $$0);
      this.t = $$1.h;
      this.s = new cxm(10);
      this.u = new cxu(this, 3, 3);
      this.a($$1);
   }

   public cwg(int $$0, crw $$1, cwi $$2, cwc $$3) {
      super(cwz.h, $$0);
      this.t = $$1.h;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.h);
      this.a($$1);
      this.a(this);
   }

   private void a(crw $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cwh(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cxd(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cwh $$2 = (cwh)this.b($$0);
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
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return czy.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.f(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(crx $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof art $$0) {
         ars $$1 = $$0.y();
         ded $$2 = this.u.aC_();
         czy $$3 = dow.a($$1, $$2).map($$2x -> ((dee)$$2x.b()).a($$2, $$1.J_())).orElse(czy.k);
         this.r.a(0, $$3);
      }
   }

   public buk m() {
      return this.u;
   }

   @Override
   public void a(cvq $$0, int $$1, czy $$2) {
      this.n();
   }

   @Override
   public void a(cvq $$0, int $$1, int $$2) {
   }
}
