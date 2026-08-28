public class cud extends ctn implements cub {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cvf r = new cvf();
   private final ctz s;
   private final cqi t;
   private final cuf u;

   public cud(int $$0, cqh $$1) {
      super(cuw.h, $$0);
      this.t = $$1.k;
      this.s = new cvj(10);
      this.u = new cvr(this, 3, 3);
      this.a($$1);
   }

   public cud(int $$0, cqh $$1, cuf $$2, ctz $$3) {
      super(cuw.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cqh $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cue(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cva(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cue $$2 = (cue)this.b($$0);
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
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cxy.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.f(cxy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cxy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cqi $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof aro $$0) {
         arn $$1 = $$0.y();
         dbz $$2 = this.u.ax_();
         cxy $$3 = dmn.a($$1, $$2).map($$2x -> ((dca)$$2x.b()).a($$2, $$1.F_())).orElse(cxy.k);
         this.r.a(0, $$3);
      }
   }

   public btj m() {
      return this.u;
   }

   @Override
   public void a(ctn $$0, int $$1, cxy $$2) {
      this.n();
   }

   @Override
   public void a(ctn $$0, int $$1, int $$2) {
   }
}
