public class cqd extends cpw {
   private static final int k = 9;
   private final bqp l;
   private final int m;

   private cqd(crd<?> $$0, int $$1, cmy $$2, int $$3) {
      this($$0, $$1, $$2, new brf(9 * $$3), $$3);
   }

   public static cqd a(int $$0, cmy $$1) {
      return new cqd(crd.a, $$0, $$1, 1);
   }

   public static cqd b(int $$0, cmy $$1) {
      return new cqd(crd.b, $$0, $$1, 2);
   }

   public static cqd c(int $$0, cmy $$1) {
      return new cqd(crd.c, $$0, $$1, 3);
   }

   public static cqd d(int $$0, cmy $$1) {
      return new cqd(crd.d, $$0, $$1, 4);
   }

   public static cqd e(int $$0, cmy $$1) {
      return new cqd(crd.e, $$0, $$1, 5);
   }

   public static cqd f(int $$0, cmy $$1) {
      return new cqd(crd.f, $$0, $$1, 6);
   }

   public static cqd a(int $$0, cmy $$1, bqp $$2) {
      return new cqd(crd.c, $$0, $$1, $$2, 3);
   }

   public static cqd b(int $$0, cmy $$1, bqp $$2) {
      return new cqd(crd.f, $$0, $$1, $$2, 6);
   }

   public cqd(crd<?> $$0, int $$1, cmy $$2, bqp $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new crr($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crr($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crr($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cmz $$0) {
      return this.l.a($$0);
   }

   @Override
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cur.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.e(cur.l);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cmz $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bqp l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
