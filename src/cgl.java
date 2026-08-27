public class cgl extends cge {
   private static final int k = 9;
   private final bij l;
   private final int m;

   private cgl(chl<?> $$0, int $$1, cdl $$2, int $$3) {
      this($$0, $$1, $$2, new bix(9 * $$3), $$3);
   }

   public static cgl a(int $$0, cdl $$1) {
      return new cgl(chl.a, $$0, $$1, 1);
   }

   public static cgl b(int $$0, cdl $$1) {
      return new cgl(chl.b, $$0, $$1, 2);
   }

   public static cgl c(int $$0, cdl $$1) {
      return new cgl(chl.c, $$0, $$1, 3);
   }

   public static cgl d(int $$0, cdl $$1) {
      return new cgl(chl.d, $$0, $$1, 4);
   }

   public static cgl e(int $$0, cdl $$1) {
      return new cgl(chl.e, $$0, $$1, 5);
   }

   public static cgl f(int $$0, cdl $$1) {
      return new cgl(chl.f, $$0, $$1, 6);
   }

   public static cgl a(int $$0, cdl $$1, bij $$2) {
      return new cgl(chl.c, $$0, $$1, $$2, 3);
   }

   public static cgl b(int $$0, cdl $$1, bij $$2) {
      return new cgl(chl.f, $$0, $$1, $$2, 6);
   }

   public cgl(chl<?> $$0, int $$1, cdl $$2, bij $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new chz($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new chz($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new chz($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return this.l.a($$0);
   }

   @Override
   public clb a(cdm $$0, int $$1) {
      clb $$2 = clb.b;
      chz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clb $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return clb.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return clb.b;
         }

         if ($$4.b()) {
            $$3.e(clb.b);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cdm $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bij l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
