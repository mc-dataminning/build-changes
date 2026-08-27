public class chr extends chk {
   private static final int k = 9;
   private final bje l;
   private final int m;

   private chr(cir<?> $$0, int $$1, ceq $$2, int $$3) {
      this($$0, $$1, $$2, new bjt(9 * $$3), $$3);
   }

   public static chr a(int $$0, ceq $$1) {
      return new chr(cir.a, $$0, $$1, 1);
   }

   public static chr b(int $$0, ceq $$1) {
      return new chr(cir.b, $$0, $$1, 2);
   }

   public static chr c(int $$0, ceq $$1) {
      return new chr(cir.c, $$0, $$1, 3);
   }

   public static chr d(int $$0, ceq $$1) {
      return new chr(cir.d, $$0, $$1, 4);
   }

   public static chr e(int $$0, ceq $$1) {
      return new chr(cir.e, $$0, $$1, 5);
   }

   public static chr f(int $$0, ceq $$1) {
      return new chr(cir.f, $$0, $$1, 6);
   }

   public static chr a(int $$0, ceq $$1, bje $$2) {
      return new chr(cir.c, $$0, $$1, $$2, 3);
   }

   public static chr b(int $$0, ceq $$1, bje $$2) {
      return new chr(cir.f, $$0, $$1, $$2, 6);
   }

   public chr(cir<?> $$0, int $$1, ceq $$2, bje $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cjf($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cjf($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cjf($$2, $$10, 8 + $$10 * 18, 161 + $$5));
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
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cmh.f;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
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

   public bje l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
