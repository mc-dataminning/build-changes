public class css extends csc implements csq {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final ctu r = new ctu();
   private final cso s;
   private final cox t;
   private final csu u;

   public css(int $$0, cow $$1) {
      super(ctl.h, $$0);
      this.t = $$1.k;
      this.s = new cty(10);
      this.u = new cug(this, 3, 3);
      this.a($$1);
   }

   public css(int $$0, cow $$1, csu $$2, cso $$3) {
      super(ctl.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cow $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cst(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new ctp(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cst $$2 = (cst)this.b($$0);
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
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.f(cwp.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cox $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof ard $$0) {
         arc $$1 = $$0.y();
         das $$2 = this.u.aB_();
         cwp $$3 = dlf.a($$1, $$2).map($$2x -> ((dat)$$2x.b()).a($$2, $$1.K_())).orElse(cwp.j);
         this.r.a(0, $$3);
      }
   }

   public bsc m() {
      return this.u;
   }

   @Override
   public void a(csc $$0, int $$1, cwp $$2) {
      this.n();
   }

   @Override
   public void a(csc $$0, int $$1, int $$2) {
   }
}
