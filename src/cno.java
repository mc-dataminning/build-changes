public class cno extends cnh {
   private static final int k = 9;
   private final boj l;
   private final int m;

   private cno(cop<?> $$0, int $$1, ckk $$2, int $$3) {
      this($$0, $$1, $$2, new boz(9 * $$3), $$3);
   }

   public static cno a(int $$0, ckk $$1) {
      return new cno(cop.a, $$0, $$1, 1);
   }

   public static cno b(int $$0, ckk $$1) {
      return new cno(cop.b, $$0, $$1, 2);
   }

   public static cno c(int $$0, ckk $$1) {
      return new cno(cop.c, $$0, $$1, 3);
   }

   public static cno d(int $$0, ckk $$1) {
      return new cno(cop.d, $$0, $$1, 4);
   }

   public static cno e(int $$0, ckk $$1) {
      return new cno(cop.e, $$0, $$1, 5);
   }

   public static cno f(int $$0, ckk $$1) {
      return new cno(cop.f, $$0, $$1, 6);
   }

   public static cno a(int $$0, ckk $$1, boj $$2) {
      return new cno(cop.c, $$0, $$1, $$2, 3);
   }

   public static cno b(int $$0, ckk $$1, boj $$2) {
      return new cno(cop.f, $$0, $$1, $$2, 6);
   }

   public cno(cop<?> $$0, int $$1, ckk $$2, boj $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.m);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cpd($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cpd($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cpd($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(ckl $$0) {
      return this.l.a($$0);
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return csd.i;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return csd.i;
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public boj l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
