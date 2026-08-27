public class clb extends cku {
   private static final int k = 9;
   private final bme l;
   private final int m;

   private clb(cmb<?> $$0, int $$1, chz $$2, int $$3) {
      this($$0, $$1, $$2, new bmu(9 * $$3), $$3);
   }

   public static clb a(int $$0, chz $$1) {
      return new clb(cmb.a, $$0, $$1, 1);
   }

   public static clb b(int $$0, chz $$1) {
      return new clb(cmb.b, $$0, $$1, 2);
   }

   public static clb c(int $$0, chz $$1) {
      return new clb(cmb.c, $$0, $$1, 3);
   }

   public static clb d(int $$0, chz $$1) {
      return new clb(cmb.d, $$0, $$1, 4);
   }

   public static clb e(int $$0, chz $$1) {
      return new clb(cmb.e, $$0, $$1, 5);
   }

   public static clb f(int $$0, chz $$1) {
      return new clb(cmb.f, $$0, $$1, 6);
   }

   public static clb a(int $$0, chz $$1, bme $$2) {
      return new clb(cmb.c, $$0, $$1, $$2, 3);
   }

   public static clb b(int $$0, chz $$1, bme $$2) {
      return new clb(cmb.f, $$0, $$1, $$2, 6);
   }

   public clb(cmb<?> $$0, int $$1, chz $$2, bme $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cmp($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cmp($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cmp($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cia $$0) {
      return this.l.a($$0);
   }

   @Override
   public cpq a(cia $$0, int $$1) {
      cpq $$2 = cpq.h;
      cmp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpq $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cpq.h;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cpq.h;
         }

         if ($$4.b()) {
            $$3.e(cpq.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cia $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bme l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
