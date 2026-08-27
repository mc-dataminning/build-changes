public class cnd extends cmw {
   private static final int k = 9;
   private final bny l;
   private final int m;

   private cnd(cod<?> $$0, int $$1, cjz $$2, int $$3) {
      this($$0, $$1, $$2, new boo(9 * $$3), $$3);
   }

   public static cnd a(int $$0, cjz $$1) {
      return new cnd(cod.a, $$0, $$1, 1);
   }

   public static cnd b(int $$0, cjz $$1) {
      return new cnd(cod.b, $$0, $$1, 2);
   }

   public static cnd c(int $$0, cjz $$1) {
      return new cnd(cod.c, $$0, $$1, 3);
   }

   public static cnd d(int $$0, cjz $$1) {
      return new cnd(cod.d, $$0, $$1, 4);
   }

   public static cnd e(int $$0, cjz $$1) {
      return new cnd(cod.e, $$0, $$1, 5);
   }

   public static cnd f(int $$0, cjz $$1) {
      return new cnd(cod.f, $$0, $$1, 6);
   }

   public static cnd a(int $$0, cjz $$1, bny $$2) {
      return new cnd(cod.c, $$0, $$1, $$2, 3);
   }

   public static cnd b(int $$0, cjz $$1, bny $$2) {
      return new cnd(cod.f, $$0, $$1, $$2, 6);
   }

   public cnd(cod<?> $$0, int $$1, cjz $$2, bny $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cos($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cos($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cos($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cka $$0) {
      return this.l.a($$0);
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return crs.i;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bny l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
