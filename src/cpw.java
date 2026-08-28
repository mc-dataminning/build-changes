public class cpw extends cpp {
   private static final int k = 9;
   private final bqi l;
   private final int m;

   private cpw(cqw<?> $$0, int $$1, cmr $$2, int $$3) {
      this($$0, $$1, $$2, new bqy(9 * $$3), $$3);
   }

   public static cpw a(int $$0, cmr $$1) {
      return new cpw(cqw.a, $$0, $$1, 1);
   }

   public static cpw b(int $$0, cmr $$1) {
      return new cpw(cqw.b, $$0, $$1, 2);
   }

   public static cpw c(int $$0, cmr $$1) {
      return new cpw(cqw.c, $$0, $$1, 3);
   }

   public static cpw d(int $$0, cmr $$1) {
      return new cpw(cqw.d, $$0, $$1, 4);
   }

   public static cpw e(int $$0, cmr $$1) {
      return new cpw(cqw.e, $$0, $$1, 5);
   }

   public static cpw f(int $$0, cmr $$1) {
      return new cpw(cqw.f, $$0, $$1, 6);
   }

   public static cpw a(int $$0, cmr $$1, bqi $$2) {
      return new cpw(cqw.c, $$0, $$1, $$2, 3);
   }

   public static cpw b(int $$0, cmr $$1, bqi $$2) {
      return new cpw(cqw.f, $$0, $$1, $$2, 6);
   }

   public cpw(cqw<?> $$0, int $$1, cmr $$2, bqi $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new crk($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crk($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crk($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cms $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cuk.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bqi l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
