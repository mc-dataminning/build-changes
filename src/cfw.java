public class cfw extends cfp {
   private static final int k = 9;
   private final bhu l;
   private final int m;

   private cfw(cgu<?> $$0, int $$1, ccw $$2, int $$3) {
      this($$0, $$1, $$2, new bii(9 * $$3), $$3);
   }

   public static cfw a(int $$0, ccw $$1) {
      return new cfw(cgu.a, $$0, $$1, 1);
   }

   public static cfw b(int $$0, ccw $$1) {
      return new cfw(cgu.b, $$0, $$1, 2);
   }

   public static cfw c(int $$0, ccw $$1) {
      return new cfw(cgu.c, $$0, $$1, 3);
   }

   public static cfw d(int $$0, ccw $$1) {
      return new cfw(cgu.d, $$0, $$1, 4);
   }

   public static cfw e(int $$0, ccw $$1) {
      return new cfw(cgu.e, $$0, $$1, 5);
   }

   public static cfw f(int $$0, ccw $$1) {
      return new cfw(cgu.f, $$0, $$1, 6);
   }

   public static cfw a(int $$0, ccw $$1, bhu $$2) {
      return new cfw(cgu.c, $$0, $$1, $$2, 3);
   }

   public static cfw b(int $$0, ccw $$1, bhu $$2) {
      return new cfw(cgu.f, $$0, $$1, $$2, 6);
   }

   public cfw(cgu<?> $$0, int $$1, ccw $$2, bhu $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new chh($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new chh($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new chh($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return this.l.a($$0);
   }

   @Override
   public ckj a(ccx $$0, int $$1) {
      ckj $$2 = ckj.b;
      chh $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ckj $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return ckj.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return ckj.b;
         }

         if ($$4.b()) {
            $$3.d(ckj.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(ccx $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bhu l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
