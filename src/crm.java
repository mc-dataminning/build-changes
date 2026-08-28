public class crm extends cqw implements crk {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cso r = new cso();
   private final cri s;
   private final cnu t;
   private final cro u;

   public crm(int $$0, cnt $$1) {
      super(csf.h, $$0);
      this.t = $$1.k;
      this.s = new css(10);
      this.u = new cta(this, 3, 3);
      this.a($$1);
   }

   public crm(int $$0, cnt $$1, cro $$2, cri $$3) {
      super(csf.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.d_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cnt $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new crn(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new csj(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      crn $$2 = (crn)this.b($$0);
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
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.f(cvp.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cnu $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof ari $$0) {
         deg $$1 = $$0.dS();
         czw $$2 = this.u.aC_();
         cvp $$3 = djc.a($$1, $$2).map($$2x -> ((czx)$$2x.b()).a($$2, $$1.F_())).orElse(cvp.k);
         this.r.a(0, $$3);
      }
   }

   public bri m() {
      return this.u;
   }

   @Override
   public void a(cqw $$0, int $$1, cvp $$2) {
      this.n();
   }

   @Override
   public void a(cqw $$0, int $$1, int $$2) {
   }
}
