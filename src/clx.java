public class clx extends clq {
   private static final int k = 9;
   private final bmw l;
   private final int m;

   private clx(cmx<?> $$0, int $$1, cit $$2, int $$3) {
      this($$0, $$1, $$2, new bnm(9 * $$3), $$3);
   }

   public static clx a(int $$0, cit $$1) {
      return new clx(cmx.a, $$0, $$1, 1);
   }

   public static clx b(int $$0, cit $$1) {
      return new clx(cmx.b, $$0, $$1, 2);
   }

   public static clx c(int $$0, cit $$1) {
      return new clx(cmx.c, $$0, $$1, 3);
   }

   public static clx d(int $$0, cit $$1) {
      return new clx(cmx.d, $$0, $$1, 4);
   }

   public static clx e(int $$0, cit $$1) {
      return new clx(cmx.e, $$0, $$1, 5);
   }

   public static clx f(int $$0, cit $$1) {
      return new clx(cmx.f, $$0, $$1, 6);
   }

   public static clx a(int $$0, cit $$1, bmw $$2) {
      return new clx(cmx.c, $$0, $$1, $$2, 3);
   }

   public static clx b(int $$0, cit $$1, bmw $$2) {
      return new clx(cmx.f, $$0, $$1, $$2, 6);
   }

   public clx(cmx<?> $$0, int $$1, cit $$2, bmw $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cnl($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cnl($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cnl($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return this.l.a($$0);
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cqm.h;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bmw l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
