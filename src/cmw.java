public class cmw extends cmp {
   private static final int k = 9;
   private final bnt l;
   private final int m;

   private cmw(cnw<?> $$0, int $$1, cjs $$2, int $$3) {
      this($$0, $$1, $$2, new boj(9 * $$3), $$3);
   }

   public static cmw a(int $$0, cjs $$1) {
      return new cmw(cnw.a, $$0, $$1, 1);
   }

   public static cmw b(int $$0, cjs $$1) {
      return new cmw(cnw.b, $$0, $$1, 2);
   }

   public static cmw c(int $$0, cjs $$1) {
      return new cmw(cnw.c, $$0, $$1, 3);
   }

   public static cmw d(int $$0, cjs $$1) {
      return new cmw(cnw.d, $$0, $$1, 4);
   }

   public static cmw e(int $$0, cjs $$1) {
      return new cmw(cnw.e, $$0, $$1, 5);
   }

   public static cmw f(int $$0, cjs $$1) {
      return new cmw(cnw.f, $$0, $$1, 6);
   }

   public static cmw a(int $$0, cjs $$1, bnt $$2) {
      return new cmw(cnw.c, $$0, $$1, $$2, 3);
   }

   public static cmw b(int $$0, cjs $$1, bnt $$2) {
      return new cmw(cnw.f, $$0, $$1, $$2, 6);
   }

   public cmw(cnw<?> $$0, int $$1, cjs $$2, bnt $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cok($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cok($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cok($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return this.l.a($$0);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return crj.i;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bnt l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
