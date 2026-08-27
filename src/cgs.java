public class cgs extends cge implements cgq {
   public final chu k = new chu();
   protected static final int l = 9;
   private static final int m = 9;
   private static final int n = 36;
   private static final int o = 36;
   private static final int p = 45;
   private final cgo q;
   private final cdm r;
   private final cgu s;

   public cgs(int $$0, cdl $$1) {
      super(chl.h, $$0);
      this.r = $$1.m;
      this.q = new chy(10);
      this.s = new cie(this, 3, 3);
      this.a($$1);
   }

   public cgs(int $$0, cdl $$1, cgu $$2, cgo $$3) {
      super(chl.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cdl $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cgt(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new chz($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new chz($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new chp(this.k, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cgt $$2 = (cgt)this.b($$0);
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
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clb $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return clb.b;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.f(clb.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clb.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cdm $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof amb $$0) {
         crs $$1 = $$0.dL();
         clb $$2 = cwl.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.H_())).orElse(clb.b);
         this.k.a(0, $$2);
      }
   }

   public bij m() {
      return this.s;
   }

   @Override
   public void a(cge $$0, int $$1, clb $$2) {
      this.n();
   }

   @Override
   public void a(cge $$0, int $$1, int $$2) {
   }
}
