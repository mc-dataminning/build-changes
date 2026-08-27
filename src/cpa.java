public class cpa extends cot {
   private static final int k = 9;
   private final bpn l;
   private final int m;

   private cpa(cqa<?> $$0, int $$1, clv $$2, int $$3) {
      this($$0, $$1, $$2, new bqd(9 * $$3), $$3);
   }

   public static cpa a(int $$0, clv $$1) {
      return new cpa(cqa.a, $$0, $$1, 1);
   }

   public static cpa b(int $$0, clv $$1) {
      return new cpa(cqa.b, $$0, $$1, 2);
   }

   public static cpa c(int $$0, clv $$1) {
      return new cpa(cqa.c, $$0, $$1, 3);
   }

   public static cpa d(int $$0, clv $$1) {
      return new cpa(cqa.d, $$0, $$1, 4);
   }

   public static cpa e(int $$0, clv $$1) {
      return new cpa(cqa.e, $$0, $$1, 5);
   }

   public static cpa f(int $$0, clv $$1) {
      return new cpa(cqa.f, $$0, $$1, 6);
   }

   public static cpa a(int $$0, clv $$1, bpn $$2) {
      return new cpa(cqa.c, $$0, $$1, $$2, 3);
   }

   public static cpa b(int $$0, clv $$1, bpn $$2) {
      return new cpa(cqa.f, $$0, $$1, $$2, 6);
   }

   public cpa(cqa<?> $$0, int $$1, clv $$2, bpn $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cqo($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cqo($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cqo($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(clw $$0) {
      return this.l.a($$0);
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cto.i;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(clw $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bpn l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
