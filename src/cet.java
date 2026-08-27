public class cet extends cec {
   private static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final bgh p;

   public cet(int $$0, cbk $$1) {
      this($$0, $$1, new bgv(9));
   }

   public cet(int $$0, cbk $$1, bgh $$2) {
      super(cfh.g, $$0);
      a($$2, 9);
      this.p = $$2;
      $$2.d_($$1.m);

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cfu($$2, $$4 + $$3 * 3, 62 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cfu($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cfu($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return this.p.a($$0);
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return ciw.b;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return ciw.b;
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciw.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cbl $$0) {
      super.b($$0);
      this.p.c($$0);
   }
}
