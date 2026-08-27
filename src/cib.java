public class cib extends chu {
   private static final int k = 9;
   private final bjo l;
   private final int m;

   private cib(cjb<?> $$0, int $$1, cfa $$2, int $$3) {
      this($$0, $$1, $$2, new bkd(9 * $$3), $$3);
   }

   public static cib a(int $$0, cfa $$1) {
      return new cib(cjb.a, $$0, $$1, 1);
   }

   public static cib b(int $$0, cfa $$1) {
      return new cib(cjb.b, $$0, $$1, 2);
   }

   public static cib c(int $$0, cfa $$1) {
      return new cib(cjb.c, $$0, $$1, 3);
   }

   public static cib d(int $$0, cfa $$1) {
      return new cib(cjb.d, $$0, $$1, 4);
   }

   public static cib e(int $$0, cfa $$1) {
      return new cib(cjb.e, $$0, $$1, 5);
   }

   public static cib f(int $$0, cfa $$1) {
      return new cib(cjb.f, $$0, $$1, 6);
   }

   public static cib a(int $$0, cfa $$1, bjo $$2) {
      return new cib(cjb.c, $$0, $$1, $$2, 3);
   }

   public static cib b(int $$0, cfa $$1, bjo $$2) {
      return new cib(cjb.f, $$0, $$1, $$2, 6);
   }

   public cib(cjb<?> $$0, int $$1, cfa $$2, bjo $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cjp($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cjp($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cjp($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return this.l.a($$0);
   }

   @Override
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cmr.f;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cmr.f;
         }

         if ($$4.b()) {
            $$3.e(cmr.f);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cfb $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bjo l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
