public class cen extends ceg {
   private static final int k = 9;
   private final bgm l;
   private final int m;

   private cen(cfl<?> $$0, int $$1, cbo $$2, int $$3) {
      this($$0, $$1, $$2, new bha(9 * $$3), $$3);
   }

   public static cen a(int $$0, cbo $$1) {
      return new cen(cfl.a, $$0, $$1, 1);
   }

   public static cen b(int $$0, cbo $$1) {
      return new cen(cfl.b, $$0, $$1, 2);
   }

   public static cen c(int $$0, cbo $$1) {
      return new cen(cfl.c, $$0, $$1, 3);
   }

   public static cen d(int $$0, cbo $$1) {
      return new cen(cfl.d, $$0, $$1, 4);
   }

   public static cen e(int $$0, cbo $$1) {
      return new cen(cfl.e, $$0, $$1, 5);
   }

   public static cen f(int $$0, cbo $$1) {
      return new cen(cfl.f, $$0, $$1, 6);
   }

   public static cen a(int $$0, cbo $$1, bgm $$2) {
      return new cen(cfl.c, $$0, $$1, $$2, 3);
   }

   public static cen b(int $$0, cbo $$1, bgm $$2) {
      return new cen(cfl.f, $$0, $$1, $$2, 6);
   }

   public cen(cfl<?> $$0, int $$1, cbo $$2, bgm $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cfy($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cfy($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cfy($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return this.l.a($$0);
   }

   @Override
   public cja a(cbp $$0, int $$1) {
      cja $$2 = cja.b;
      cfy $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cja $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cja.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cja.b;
         }

         if ($$4.b()) {
            $$3.d(cja.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cbp $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bgm l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
