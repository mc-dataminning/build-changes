public class cel extends cee {
   private static final int k = 9;
   private final bgj l;
   private final int m;

   private cel(cfj<?> $$0, int $$1, cbm $$2, int $$3) {
      this($$0, $$1, $$2, new bgx(9 * $$3), $$3);
   }

   public static cel a(int $$0, cbm $$1) {
      return new cel(cfj.a, $$0, $$1, 1);
   }

   public static cel b(int $$0, cbm $$1) {
      return new cel(cfj.b, $$0, $$1, 2);
   }

   public static cel c(int $$0, cbm $$1) {
      return new cel(cfj.c, $$0, $$1, 3);
   }

   public static cel d(int $$0, cbm $$1) {
      return new cel(cfj.d, $$0, $$1, 4);
   }

   public static cel e(int $$0, cbm $$1) {
      return new cel(cfj.e, $$0, $$1, 5);
   }

   public static cel f(int $$0, cbm $$1) {
      return new cel(cfj.f, $$0, $$1, 6);
   }

   public static cel a(int $$0, cbm $$1, bgj $$2) {
      return new cel(cfj.c, $$0, $$1, $$2, 3);
   }

   public static cel b(int $$0, cbm $$1, bgj $$2) {
      return new cel(cfj.f, $$0, $$1, $$2, 6);
   }

   public cel(cfj<?> $$0, int $$1, cbm $$2, bgj $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cfw($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cfw($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cfw($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return this.l.a($$0);
   }

   @Override
   public ciy a(cbn $$0, int $$1) {
      ciy $$2 = ciy.b;
      cfw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciy $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return ciy.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return ciy.b;
         }

         if ($$4.b()) {
            $$3.d(ciy.b);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void b(cbn $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bgj l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
