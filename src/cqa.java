public class cqa extends cps {
   private static final int k = 9;
   private final bqj l;
   private final int m;

   private cqa(cra<?> $$0, int $$1, cmu $$2, int $$3) {
      this($$0, $$1, $$2, new bqz(9 * $$3), $$3);
   }

   public static cqa a(int $$0, cmu $$1) {
      return new cqa(cra.a, $$0, $$1, 1);
   }

   public static cqa b(int $$0, cmu $$1) {
      return new cqa(cra.b, $$0, $$1, 2);
   }

   public static cqa c(int $$0, cmu $$1) {
      return new cqa(cra.c, $$0, $$1, 3);
   }

   public static cqa d(int $$0, cmu $$1) {
      return new cqa(cra.d, $$0, $$1, 4);
   }

   public static cqa e(int $$0, cmu $$1) {
      return new cqa(cra.e, $$0, $$1, 5);
   }

   public static cqa f(int $$0, cmu $$1) {
      return new cqa(cra.f, $$0, $$1, 6);
   }

   public static cqa a(int $$0, cmu $$1, bqj $$2) {
      return new cqa(cra.c, $$0, $$1, $$2, 3);
   }

   public static cqa b(int $$0, cmu $$1, bqj $$2) {
      return new cqa(cra.f, $$0, $$1, $$2, 6);
   }

   public cqa(cra<?> $$0, int $$1, cmu $$2, bqj $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cro($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cro($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cro($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean b(cmv $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuo b(cmv $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cuo.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cmv $$0) {
      super.a($$0);
      this.l.c($$0);
   }

   public bqj l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
