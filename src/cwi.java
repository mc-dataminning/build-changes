public class cwi extends cvs implements cwg {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cxk r = new cxk();
   private final cwe s;
   private final crz t;
   private final cwk u;

   public cwi(int $$0, cry $$1) {
      super(cxb.h, $$0);
      this.t = $$1.h;
      this.s = new cxo(10);
      this.u = new cxw(this, 3, 3);
      this.a($$1);
   }

   public cwi(int $$0, cry $$1, cwk $$2, cwe $$3) {
      super(cxb.h, $$0);
      this.t = $$1.h;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.h);
      this.a($$1);
      this.a(this);
   }

   private void a(cry $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cwj(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cxf(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cwj $$2 = (cwj)this.b($$0);
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
   public daa b(crz $$0, int $$1) {
      daa $$2 = daa.k;
      cxp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         daa $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return daa.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return daa.k;
         }

         if ($$4.f()) {
            $$3.f(daa.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return daa.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(crz $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arv $$0) {
         aru $$1 = $$0.y();
         def $$2 = this.u.aC_();
         daa $$3 = doy.a($$1, $$2).map($$2x -> ((deg)$$2x.b()).a($$2, $$1.J_())).orElse(daa.k);
         this.r.a(0, $$3);
      }
   }

   public bum m() {
      return this.u;
   }

   @Override
   public void a(cvs $$0, int $$1, daa $$2) {
      this.n();
   }

   @Override
   public void a(cvs $$0, int $$1, int $$2) {
   }
}
