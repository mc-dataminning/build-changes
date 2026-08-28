public class cpp extends cph {
   private static final int k = 9;
   private final bpz l;
   private final int m;

   private cpp(cqp<?> $$0, int $$1, cmj $$2, int $$3) {
      this($$0, $$1, $$2, new bqp(9 * $$3), $$3);
   }

   public static cpp a(int $$0, cmj $$1) {
      return new cpp(cqp.a, $$0, $$1, 1);
   }

   public static cpp b(int $$0, cmj $$1) {
      return new cpp(cqp.b, $$0, $$1, 2);
   }

   public static cpp c(int $$0, cmj $$1) {
      return new cpp(cqp.c, $$0, $$1, 3);
   }

   public static cpp d(int $$0, cmj $$1) {
      return new cpp(cqp.d, $$0, $$1, 4);
   }

   public static cpp e(int $$0, cmj $$1) {
      return new cpp(cqp.e, $$0, $$1, 5);
   }

   public static cpp f(int $$0, cmj $$1) {
      return new cpp(cqp.f, $$0, $$1, 6);
   }

   public static cpp a(int $$0, cmj $$1, bpz $$2) {
      return new cpp(cqp.c, $$0, $$1, $$2, 3);
   }

   public static cpp b(int $$0, cmj $$1, bpz $$2) {
      return new cpp(cqp.f, $$0, $$1, $$2, 6);
   }

   public cpp(cqp<?> $$0, int $$1, cmj $$2, bpz $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new crd($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crd($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crd($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean b(cmk $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.l.c($$0);
   }

   public bpz l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
