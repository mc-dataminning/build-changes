public class cfr extends cec {
   private static final int k = 27;
   private final bgh l;

   public cfr(int $$0, cbk $$1) {
      this($$0, $$1, new bgv(27));
   }

   public cfr(int $$0, cbk $$1, bgh $$2) {
      super(cfh.t, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.m);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cfs($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cfu($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cfu($$1, $$9, 8 + $$9 * 18, 142));
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
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return ciw.b;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
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
}
