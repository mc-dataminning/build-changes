public class cej extends cec {
   private static final int k = 9;
   private final bgh l;
   private final int m;

   private cej(cfh<?> $$0, int $$1, cbk $$2, int $$3) {
      this($$0, $$1, $$2, new bgv(9 * $$3), $$3);
   }

   public static cej a(int $$0, cbk $$1) {
      return new cej(cfh.a, $$0, $$1, 1);
   }

   public static cej b(int $$0, cbk $$1) {
      return new cej(cfh.b, $$0, $$1, 2);
   }

   public static cej c(int $$0, cbk $$1) {
      return new cej(cfh.c, $$0, $$1, 3);
   }

   public static cej d(int $$0, cbk $$1) {
      return new cej(cfh.d, $$0, $$1, 4);
   }

   public static cej e(int $$0, cbk $$1) {
      return new cej(cfh.e, $$0, $$1, 5);
   }

   public static cej f(int $$0, cbk $$1) {
      return new cej(cfh.f, $$0, $$1, 6);
   }

   public static cej a(int $$0, cbk $$1, bgh $$2) {
      return new cej(cfh.c, $$0, $$1, $$2, 3);
   }

   public static cej b(int $$0, cbk $$1, bgh $$2) {
      return new cej(cfh.f, $$0, $$1, $$2, 6);
   }

   public cej(cfh<?> $$0, int $$1, cbk $$2, bgh $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cfu($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cfu($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cfu($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return this.l.a($$0);
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return ciw.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return ciw.b;
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cbl $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bgh l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
