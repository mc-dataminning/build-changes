public class cbm extends cbf {
   private static final int k = 9;
   private final bdq l;
   private final int m;

   private cbm(cck<?> $$0, int $$1, byn $$2, int $$3) {
      this($$0, $$1, $$2, new bee(9 * $$3), $$3);
   }

   public static cbm a(int $$0, byn $$1) {
      return new cbm(cck.a, $$0, $$1, 1);
   }

   public static cbm b(int $$0, byn $$1) {
      return new cbm(cck.b, $$0, $$1, 2);
   }

   public static cbm c(int $$0, byn $$1) {
      return new cbm(cck.c, $$0, $$1, 3);
   }

   public static cbm d(int $$0, byn $$1) {
      return new cbm(cck.d, $$0, $$1, 4);
   }

   public static cbm e(int $$0, byn $$1) {
      return new cbm(cck.e, $$0, $$1, 5);
   }

   public static cbm f(int $$0, byn $$1) {
      return new cbm(cck.f, $$0, $$1, 6);
   }

   public static cbm a(int $$0, byn $$1, bdq $$2) {
      return new cbm(cck.c, $$0, $$1, $$2, 3);
   }

   public static cbm b(int $$0, byn $$1, bdq $$2) {
      return new cbm(cck.f, $$0, $$1, $$2, 6);
   }

   public cbm(cck<?> $$0, int $$1, byn $$2, bdq $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new ccx($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new ccx($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new ccx($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(byo $$0) {
      return this.l.a($$0);
   }

   @Override
   public cfz a(byo $$0, int $$1) {
      cfz $$2 = cfz.b;
      ccx $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cfz $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cfz.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cfz.b;
         }

         if ($$4.b()) {
            $$3.d(cfz.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(byo $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bdq l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
