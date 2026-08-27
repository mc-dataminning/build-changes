public class cgy extends cgr {
   private static final int k = 9;
   private final biu l;
   private final int m;

   private cgy(chy<?> $$0, int $$1, cdy $$2, int $$3) {
      this($$0, $$1, $$2, new bjj(9 * $$3), $$3);
   }

   public static cgy a(int $$0, cdy $$1) {
      return new cgy(chy.a, $$0, $$1, 1);
   }

   public static cgy b(int $$0, cdy $$1) {
      return new cgy(chy.b, $$0, $$1, 2);
   }

   public static cgy c(int $$0, cdy $$1) {
      return new cgy(chy.c, $$0, $$1, 3);
   }

   public static cgy d(int $$0, cdy $$1) {
      return new cgy(chy.d, $$0, $$1, 4);
   }

   public static cgy e(int $$0, cdy $$1) {
      return new cgy(chy.e, $$0, $$1, 5);
   }

   public static cgy f(int $$0, cdy $$1) {
      return new cgy(chy.f, $$0, $$1, 6);
   }

   public static cgy a(int $$0, cdy $$1, biu $$2) {
      return new cgy(chy.c, $$0, $$1, $$2, 3);
   }

   public static cgy b(int $$0, cdy $$1, biu $$2) {
      return new cgy(chy.f, $$0, $$1, $$2, 6);
   }

   public cgy(chy<?> $$0, int $$1, cdy $$2, biu $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cim($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cim($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cim($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return this.l.a($$0);
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return clo.b;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.e(clo.b);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public biu l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
