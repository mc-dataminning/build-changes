public class cpq extends cpi {
   private static final int k = 9;
   private final bqa l;
   private final int m;

   private cpq(cqq<?> $$0, int $$1, cmk $$2, int $$3) {
      this($$0, $$1, $$2, new bqq(9 * $$3), $$3);
   }

   public static cpq a(int $$0, cmk $$1) {
      return new cpq(cqq.a, $$0, $$1, 1);
   }

   public static cpq b(int $$0, cmk $$1) {
      return new cpq(cqq.b, $$0, $$1, 2);
   }

   public static cpq c(int $$0, cmk $$1) {
      return new cpq(cqq.c, $$0, $$1, 3);
   }

   public static cpq d(int $$0, cmk $$1) {
      return new cpq(cqq.d, $$0, $$1, 4);
   }

   public static cpq e(int $$0, cmk $$1) {
      return new cpq(cqq.e, $$0, $$1, 5);
   }

   public static cpq f(int $$0, cmk $$1) {
      return new cpq(cqq.f, $$0, $$1, 6);
   }

   public static cpq a(int $$0, cmk $$1, bqa $$2) {
      return new cpq(cqq.c, $$0, $$1, $$2, 3);
   }

   public static cpq b(int $$0, cmk $$1, bqa $$2) {
      return new cpq(cqq.f, $$0, $$1, $$2, 6);
   }

   public cpq(cqq<?> $$0, int $$1, cmk $$2, bqa $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cre($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cre($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cre($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean b(cml $$0) {
      return this.l.a($$0);
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cud.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.e(cud.l);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.l.c($$0);
   }

   public bqa l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
