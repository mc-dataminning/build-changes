public class cnk extends cmw implements cni {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final com p = new com();
   private final cng q;
   private final cka r;
   private final cnm s;

   public cnk(int $$0, cjz $$1) {
      super(cod.h, $$0);
      this.r = $$1.m;
      this.q = new cor(10);
      this.s = new coz(this, 3, 3);
      this.a($$1);
   }

   public cnk(int $$0, cjz $$1, cnm $$2, cng $$3) {
      super(cod.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cjz $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cnl(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cos($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cos($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new coh(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cnl $$2 = (cnl)this.b($$0);
      this.q.a($$2.e, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.q.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.q.a(9) == 1;
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return crs.i;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.f(crs.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cka $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof apv $$0) {
         czg $$1 = $$0.dM();
         crs $$2 = dea.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.H_())).orElse(crs.i);
         this.p.a(0, $$2);
      }
   }

   public bny m() {
      return this.s;
   }

   @Override
   public void a(cmw $$0, int $$1, crs $$2) {
      this.n();
   }

   @Override
   public void a(cmw $$0, int $$1, int $$2) {
   }
}
