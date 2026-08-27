public class cgt extends cgm {
   private static final int k = 9;
   private final biq l;
   private final int m;

   private cgt(cht<?> $$0, int $$1, cdt $$2, int $$3) {
      this($$0, $$1, $$2, new bje(9 * $$3), $$3);
   }

   public static cgt a(int $$0, cdt $$1) {
      return new cgt(cht.a, $$0, $$1, 1);
   }

   public static cgt b(int $$0, cdt $$1) {
      return new cgt(cht.b, $$0, $$1, 2);
   }

   public static cgt c(int $$0, cdt $$1) {
      return new cgt(cht.c, $$0, $$1, 3);
   }

   public static cgt d(int $$0, cdt $$1) {
      return new cgt(cht.d, $$0, $$1, 4);
   }

   public static cgt e(int $$0, cdt $$1) {
      return new cgt(cht.e, $$0, $$1, 5);
   }

   public static cgt f(int $$0, cdt $$1) {
      return new cgt(cht.f, $$0, $$1, 6);
   }

   public static cgt a(int $$0, cdt $$1, biq $$2) {
      return new cgt(cht.c, $$0, $$1, $$2, 3);
   }

   public static cgt b(int $$0, cdt $$1, biq $$2) {
      return new cgt(cht.f, $$0, $$1, $$2, 6);
   }

   public cgt(cht<?> $$0, int $$1, cdt $$2, biq $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cih($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cih($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cih($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return this.l.a($$0);
   }

   @Override
   public clj a(cdu $$0, int $$1) {
      clj $$2 = clj.b;
      cih $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clj $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return clj.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return clj.b;
         }

         if ($$4.b()) {
            $$3.e(clj.b);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cdu $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public biq l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
