public class cvg extends cuq implements cve {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cwi r = new cwi();
   private final cvc s;
   private final cqy t;
   private final cvi u;

   public cvg(int $$0, cqx $$1) {
      super(cvz.h, $$0);
      this.t = $$1.k;
      this.s = new cwm(10);
      this.u = new cwu(this, 3, 3);
      this.a($$1);
   }

   public cvg(int $$0, cqx $$1, cvi $$2, cvc $$3) {
      super(cvz.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cqx $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cvh(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cwd(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cvh $$2 = (cvh)this.b($$0);
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
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.f(cyy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cyy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cqy $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arr $$0) {
         arq $$1 = $$0.y();
         ddd $$2 = this.u.ax_();
         cyy $$3 = dnt.a($$1, $$2).map($$2x -> ((dde)$$2x.b()).a($$2, $$1.F_())).orElse(cyy.k);
         this.r.a(0, $$3);
      }
   }

   public btu m() {
      return this.u;
   }

   @Override
   public void a(cuq $$0, int $$1, cyy $$2) {
      this.n();
   }

   @Override
   public void a(cuq $$0, int $$1, int $$2) {
   }
}
