public class cii extends cib {
   private static final int k = 9;
   private final bju l;
   private final int m;

   private cii(cji<?> $$0, int $$1, cfh $$2, int $$3) {
      this($$0, $$1, $$2, new bkj(9 * $$3), $$3);
   }

   public static cii a(int $$0, cfh $$1) {
      return new cii(cji.a, $$0, $$1, 1);
   }

   public static cii b(int $$0, cfh $$1) {
      return new cii(cji.b, $$0, $$1, 2);
   }

   public static cii c(int $$0, cfh $$1) {
      return new cii(cji.c, $$0, $$1, 3);
   }

   public static cii d(int $$0, cfh $$1) {
      return new cii(cji.d, $$0, $$1, 4);
   }

   public static cii e(int $$0, cfh $$1) {
      return new cii(cji.e, $$0, $$1, 5);
   }

   public static cii f(int $$0, cfh $$1) {
      return new cii(cji.f, $$0, $$1, 6);
   }

   public static cii a(int $$0, cfh $$1, bju $$2) {
      return new cii(cji.c, $$0, $$1, $$2, 3);
   }

   public static cii b(int $$0, cfh $$1, bju $$2) {
      return new cii(cji.f, $$0, $$1, $$2, 6);
   }

   public cii(cji<?> $$0, int $$1, cfh $$2, bju $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cjw($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cjw($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cjw($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return this.l.a($$0);
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cmy.f;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cmy.f;
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cfi $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bju l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
