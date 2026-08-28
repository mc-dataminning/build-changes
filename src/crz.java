public class crz extends crj implements crx {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final ctb r = new ctb();
   private final crv s;
   private final coh t;
   private final csb u;

   public crz(int $$0, cog $$1) {
      super(css.h, $$0);
      this.t = $$1.k;
      this.s = new ctf(10);
      this.u = new ctn(this, 3, 3);
      this.a($$1);
   }

   public crz(int $$0, cog $$1, csb $$2, crv $$3) {
      super(css.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.d_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cog $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new csa(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new csw(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      csa $$2 = (csa)this.b($$0);
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
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.f(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(coh $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arn $$0) {
         dev $$1 = $$0.dX();
         czy $$2 = this.u.aD_();
         cvx $$3 = djr.a($$1, $$2).map($$2x -> ((czz)$$2x.b()).a($$2, $$1.H_())).orElse(cvx.k);
         this.r.a(0, $$3);
      }
   }

   public brr m() {
      return this.u;
   }

   @Override
   public void a(crj $$0, int $$1, cvx $$2) {
      this.n();
   }

   @Override
   public void a(crj $$0, int $$1, int $$2) {
   }
}
