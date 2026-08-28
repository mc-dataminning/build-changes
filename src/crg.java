public class crg extends cqq implements cre {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final csi r = new csi();
   private final crc s;
   private final cnp t;
   private final cri u;

   public crg(int $$0, cno $$1) {
      super(crz.h, $$0);
      this.t = $$1.k;
      this.s = new csm(10);
      this.u = new csu(this, 3, 3);
      this.a($$1);
   }

   public crg(int $$0, cno $$1, cri $$2, crc $$3) {
      super(crz.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.d_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cno $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new crh(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new csd(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      crh $$2 = (crh)this.b($$0);
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
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.f(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cnp $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof arh $$0) {
         dds $$1 = $$0.dS();
         czi $$2 = this.u.aE_();
         cvl $$3 = dio.a($$1, $$2).map($$2x -> ((czj)$$2x.b()).a($$2, $$1.F_())).orElse(cvl.k);
         this.r.a(0, $$3);
      }
   }

   public brd m() {
      return this.u;
   }

   @Override
   public void a(cqq $$0, int $$1, cvl $$2) {
      this.n();
   }

   @Override
   public void a(cqq $$0, int $$1, int $$2) {
   }
}
