public class ciu extends cib {
   private static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final bju p;

   public ciu(int $$0, cfh $$1) {
      this($$0, $$1, new bkj(9));
   }

   public ciu(int $$0, cfh $$1, bju $$2) {
      super(cji.g, $$0);
      a($$2, 9);
      this.p = $$2;
      $$2.d_($$1.m);

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cjw($$2, $$4 + $$3 * 3, 62 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cjw($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cjw($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return this.p.a($$0);
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cmy.f;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cmy.f;
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmy.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public void b(cfi $$0) {
      super.b($$0);
      this.p.c($$0);
   }
}
