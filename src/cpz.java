public class cpz extends cps {
   private static final int k = 9;
   private final bql l;
   private final int m;

   private cpz(cqz<?> $$0, int $$1, cmu $$2, int $$3) {
      this($$0, $$1, $$2, new brb(9 * $$3), $$3);
   }

   public static cpz a(int $$0, cmu $$1) {
      return new cpz(cqz.a, $$0, $$1, 1);
   }

   public static cpz b(int $$0, cmu $$1) {
      return new cpz(cqz.b, $$0, $$1, 2);
   }

   public static cpz c(int $$0, cmu $$1) {
      return new cpz(cqz.c, $$0, $$1, 3);
   }

   public static cpz d(int $$0, cmu $$1) {
      return new cpz(cqz.d, $$0, $$1, 4);
   }

   public static cpz e(int $$0, cmu $$1) {
      return new cpz(cqz.e, $$0, $$1, 5);
   }

   public static cpz f(int $$0, cmu $$1) {
      return new cpz(cqz.f, $$0, $$1, 6);
   }

   public static cpz a(int $$0, cmu $$1, bql $$2) {
      return new cpz(cqz.c, $$0, $$1, $$2, 3);
   }

   public static cpz b(int $$0, cmu $$1, bql $$2) {
      return new cpz(cqz.f, $$0, $$1, $$2, 6);
   }

   public cpz(cqz<?> $$0, int $$1, cmu $$2, bql $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new crn($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crn($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crn($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cmv $$0) {
      return this.l.a($$0);
   }

   @Override
   public cun a(cmv $$0, int $$1) {
      cun $$2 = cun.l;
      crn $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cun $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cun.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cun.l;
         }

         if ($$4.e()) {
            $$3.e(cun.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cmv $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bql l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
