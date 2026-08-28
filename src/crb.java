public class crb extends cpi {
   private static final int k = 27;
   private final bqa l;

   public crb(int $$0, cmk $$1) {
      this($$0, $$1, new bqq(27));
   }

   public crb(int $$0, cmk $$1, bqa $$2) {
      super(cqq.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.l);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crc($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cre($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cre($$1, $$9, 8 + $$9 * 18, 142));
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
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cud.l;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
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
}
