public class ckm extends ckf {
   private static final int k = 9;
   private final blp l;
   private final int m;

   private ckm(clm<?> $$0, int $$1, chk $$2, int $$3) {
      this($$0, $$1, $$2, new bmf(9 * $$3), $$3);
   }

   public static ckm a(int $$0, chk $$1) {
      return new ckm(clm.a, $$0, $$1, 1);
   }

   public static ckm b(int $$0, chk $$1) {
      return new ckm(clm.b, $$0, $$1, 2);
   }

   public static ckm c(int $$0, chk $$1) {
      return new ckm(clm.c, $$0, $$1, 3);
   }

   public static ckm d(int $$0, chk $$1) {
      return new ckm(clm.d, $$0, $$1, 4);
   }

   public static ckm e(int $$0, chk $$1) {
      return new ckm(clm.e, $$0, $$1, 5);
   }

   public static ckm f(int $$0, chk $$1) {
      return new ckm(clm.f, $$0, $$1, 6);
   }

   public static ckm a(int $$0, chk $$1, blp $$2) {
      return new ckm(clm.c, $$0, $$1, $$2, 3);
   }

   public static ckm b(int $$0, chk $$1, blp $$2) {
      return new ckm(clm.f, $$0, $$1, $$2, 6);
   }

   public ckm(clm<?> $$0, int $$1, chk $$2, blp $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cma($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cma($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cma($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(chl $$0) {
      return this.l.a($$0);
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cpd.h;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cpd.h;
         }

         if ($$4.b()) {
            $$3.e(cpd.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(chl $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public blp l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
