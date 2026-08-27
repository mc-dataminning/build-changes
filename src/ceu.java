public class ceu extends cen {
   private static final int k = 9;
   private final bgt l;
   private final int m;

   private ceu(cfs<?> $$0, int $$1, cbv $$2, int $$3) {
      this($$0, $$1, $$2, new bhh(9 * $$3), $$3);
   }

   public static ceu a(int $$0, cbv $$1) {
      return new ceu(cfs.a, $$0, $$1, 1);
   }

   public static ceu b(int $$0, cbv $$1) {
      return new ceu(cfs.b, $$0, $$1, 2);
   }

   public static ceu c(int $$0, cbv $$1) {
      return new ceu(cfs.c, $$0, $$1, 3);
   }

   public static ceu d(int $$0, cbv $$1) {
      return new ceu(cfs.d, $$0, $$1, 4);
   }

   public static ceu e(int $$0, cbv $$1) {
      return new ceu(cfs.e, $$0, $$1, 5);
   }

   public static ceu f(int $$0, cbv $$1) {
      return new ceu(cfs.f, $$0, $$1, 6);
   }

   public static ceu a(int $$0, cbv $$1, bgt $$2) {
      return new ceu(cfs.c, $$0, $$1, $$2, 3);
   }

   public static ceu b(int $$0, cbv $$1, bgt $$2) {
      return new ceu(cfs.f, $$0, $$1, $$2, 6);
   }

   public ceu(cfs<?> $$0, int $$1, cbv $$2, bgt $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cgf($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cgf($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cgf($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return this.l.a($$0);
   }

   @Override
   public cjh a(cbw $$0, int $$1) {
      cjh $$2 = cjh.b;
      cgf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjh $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cjh.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cjh.b;
         }

         if ($$4.b()) {
            $$3.d(cjh.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cbw $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bgt l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
