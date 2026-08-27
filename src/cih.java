public class cih extends cia {
   private static final int k = 9;
   private final bjt l;
   private final int m;

   private cih(cjh<?> $$0, int $$1, cfg $$2, int $$3) {
      this($$0, $$1, $$2, new bki(9 * $$3), $$3);
   }

   public static cih a(int $$0, cfg $$1) {
      return new cih(cjh.a, $$0, $$1, 1);
   }

   public static cih b(int $$0, cfg $$1) {
      return new cih(cjh.b, $$0, $$1, 2);
   }

   public static cih c(int $$0, cfg $$1) {
      return new cih(cjh.c, $$0, $$1, 3);
   }

   public static cih d(int $$0, cfg $$1) {
      return new cih(cjh.d, $$0, $$1, 4);
   }

   public static cih e(int $$0, cfg $$1) {
      return new cih(cjh.e, $$0, $$1, 5);
   }

   public static cih f(int $$0, cfg $$1) {
      return new cih(cjh.f, $$0, $$1, 6);
   }

   public static cih a(int $$0, cfg $$1, bjt $$2) {
      return new cih(cjh.c, $$0, $$1, $$2, 3);
   }

   public static cih b(int $$0, cfg $$1, bjt $$2) {
      return new cih(cjh.f, $$0, $$1, $$2, 6);
   }

   public cih(cjh<?> $$0, int $$1, cfg $$2, bjt $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cjv($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cjv($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cjv($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return this.l.a($$0);
   }

   @Override
   public cmx a(cfh $$0, int $$1) {
      cmx $$2 = cmx.f;
      cjv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmx $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cmx.f;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cmx.f;
         }

         if ($$4.b()) {
            $$3.e(cmx.f);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cfh $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bjt l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
