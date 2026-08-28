public class csq extends csa implements cso {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cts r = new cts();
   private final csm s;
   private final cov t;
   private final css u;

   public csq(int $$0, cou $$1) {
      super(ctj.h, $$0);
      this.t = $$1.k;
      this.s = new ctw(10);
      this.u = new cue(this, 3, 3);
      this.a($$1);
   }

   public csq(int $$0, cou $$1, css $$2, csm $$3) {
      super(ctj.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cou $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new csr(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new ctn(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      csr $$2 = (csr)this.b($$0);
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
   public cwn b(cov $$0, int $$1) {
      cwn $$2 = cwn.j;
      ctx $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwn $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cwn.j;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cwn.j;
         }

         if ($$4.f()) {
            $$3.f(cwn.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwn.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cov $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof ard $$0) {
         arc $$1 = $$0.y();
         daq $$2 = this.u.aB_();
         cwn $$3 = dld.a($$1, $$2).map($$2x -> ((dar)$$2x.b()).a($$2, $$1.K_())).orElse(cwn.j);
         this.r.a(0, $$3);
      }
   }

   public bsb m() {
      return this.u;
   }

   @Override
   public void a(csa $$0, int $$1, cwn $$2) {
      this.n();
   }

   @Override
   public void a(csa $$0, int $$1, int $$2) {
   }
}
