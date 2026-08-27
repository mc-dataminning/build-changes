public class cey extends cer {
   private static final int k = 9;
   private final bgx l;
   private final int m;

   private cey(cfw<?> $$0, int $$1, cbz $$2, int $$3) {
      this($$0, $$1, $$2, new bhl(9 * $$3), $$3);
   }

   public static cey a(int $$0, cbz $$1) {
      return new cey(cfw.a, $$0, $$1, 1);
   }

   public static cey b(int $$0, cbz $$1) {
      return new cey(cfw.b, $$0, $$1, 2);
   }

   public static cey c(int $$0, cbz $$1) {
      return new cey(cfw.c, $$0, $$1, 3);
   }

   public static cey d(int $$0, cbz $$1) {
      return new cey(cfw.d, $$0, $$1, 4);
   }

   public static cey e(int $$0, cbz $$1) {
      return new cey(cfw.e, $$0, $$1, 5);
   }

   public static cey f(int $$0, cbz $$1) {
      return new cey(cfw.f, $$0, $$1, 6);
   }

   public static cey a(int $$0, cbz $$1, bgx $$2) {
      return new cey(cfw.c, $$0, $$1, $$2, 3);
   }

   public static cey b(int $$0, cbz $$1, bgx $$2) {
      return new cey(cfw.f, $$0, $$1, $$2, 6);
   }

   public cey(cfw<?> $$0, int $$1, cbz $$2, bgx $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cgj($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cgj($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cgj($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cca $$0) {
      return this.l.a($$0);
   }

   @Override
   public cjl a(cca $$0, int $$1) {
      cjl $$2 = cjl.b;
      cgj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjl $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cjl.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cjl.b;
         }

         if ($$4.b()) {
            $$3.d(cjl.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cca $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bgx l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
