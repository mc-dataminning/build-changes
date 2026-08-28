public class csr extends csb implements csp {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final ctt r = new ctt();
   private final csn s;
   private final cow t;
   private final cst u;

   public csr(int $$0, cov $$1) {
      super(ctk.h, $$0);
      this.t = $$1.k;
      this.s = new ctx(10);
      this.u = new cuf(this, 3, 3);
      this.a($$1);
   }

   public csr(int $$0, cov $$1, cst $$2, csn $$3) {
      super(ctk.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cov $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new css(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cto(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      css $$2 = (css)this.b($$0);
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
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwo.j;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwo.j;
         }

         if ($$4.f()) {
            $$3.f(cwo.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwo.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cow $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof are $$0) {
         ard $$1 = $$0.y();
         dar $$2 = this.u.aB_();
         cwo $$3 = dle.a($$1, $$2).map($$2x -> ((das)$$2x.b()).a($$2, $$1.K_())).orElse(cwo.j);
         this.r.a(0, $$3);
      }
   }

   public bsc m() {
      return this.u;
   }

   @Override
   public void a(csb $$0, int $$1, cwo $$2) {
      this.n();
   }

   @Override
   public void a(csb $$0, int $$1, int $$2) {
   }
}
