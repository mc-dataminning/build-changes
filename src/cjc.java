public class cjc extends chk {
   private static final int k = 27;
   private final bje l;

   public cjc(int $$0, ceq $$1) {
      this($$0, $$1, new bjt(27));
   }

   public cjc(int $$0, ceq $$1, bje $$2) {
      super(cir.u, $$0);
      a($$2, 27);
      this.l = $$2;
      $$2.d_($$1.m);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cjd($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cjf($$1, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cjf($$1, $$9, 8 + $$9 * 18, 142));
      }
   }

   @Override
   public boolean a(cer $$0) {
      return this.l.a($$0);
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < this.l.b()) {
            if (!this.a($$4, this.l.b(), this.i.size(), true)) {
               return cmh.f;
            }
         } else if (!this.a($$4, 0, this.l.b(), false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.l.c($$0);
   }
}
