public class cva extends cuk implements cuy {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cwc r = new cwc();
   private final cuw s;
   private final cqs t;
   private final cvc u;

   public cva(int $$0, cqr $$1) {
      super(cvt.h, $$0);
      this.t = $$1.k;
      this.s = new cwg(10);
      this.u = new cwo(this, 3, 3);
      this.a($$1);
   }

   public cva(int $$0, cqr $$1, cvc $$2, cuw $$3) {
      super(cvt.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cqr $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cvb(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cvx(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cvb $$2 = (cvb)this.b($$0);
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
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cys.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.f(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cqs $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arp $$0) {
         aro $$1 = $$0.y();
         dcx $$2 = this.u.ax_();
         cys $$3 = dnn.a($$1, $$2).map($$2x -> ((dcy)$$2x.b()).a($$2, $$1.F_())).orElse(cys.k);
         this.r.a(0, $$3);
      }
   }

   public btr m() {
      return this.u;
   }

   @Override
   public void a(cuk $$0, int $$1, cys $$2) {
      this.n();
   }

   @Override
   public void a(cuk $$0, int $$1, int $$2) {
   }
}
