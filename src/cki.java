public class cki extends ckb {
   private static final int k = 9;
   private final bln l;
   private final int m;

   private cki(cli<?> $$0, int $$1, chg $$2, int $$3) {
      this($$0, $$1, $$2, new bmd(9 * $$3), $$3);
   }

   public static cki a(int $$0, chg $$1) {
      return new cki(cli.a, $$0, $$1, 1);
   }

   public static cki b(int $$0, chg $$1) {
      return new cki(cli.b, $$0, $$1, 2);
   }

   public static cki c(int $$0, chg $$1) {
      return new cki(cli.c, $$0, $$1, 3);
   }

   public static cki d(int $$0, chg $$1) {
      return new cki(cli.d, $$0, $$1, 4);
   }

   public static cki e(int $$0, chg $$1) {
      return new cki(cli.e, $$0, $$1, 5);
   }

   public static cki f(int $$0, chg $$1) {
      return new cki(cli.f, $$0, $$1, 6);
   }

   public static cki a(int $$0, chg $$1, bln $$2) {
      return new cki(cli.c, $$0, $$1, $$2, 3);
   }

   public static cki b(int $$0, chg $$1, bln $$2) {
      return new cki(cli.f, $$0, $$1, $$2, 6);
   }

   public cki(cli<?> $$0, int $$1, chg $$2, bln $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new clw($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new clw($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new clw($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(chh $$0) {
      return this.l.a($$0);
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         coz $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return coz.h;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return coz.h;
         }

         if ($$4.b()) {
            $$3.e(coz.h);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(chh $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bln l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
