public class cpn extends cpg {
   private static final int k = 9;
   private final bpt l;
   private final int m;

   private cpn(cqo<?> $$0, int $$1, clx $$2, int $$3) {
      this($$0, $$1, $$2, new bqj(9 * $$3), $$3);
   }

   public static cpn a(int $$0, clx $$1) {
      return new cpn(cqo.a, $$0, $$1, 1);
   }

   public static cpn b(int $$0, clx $$1) {
      return new cpn(cqo.b, $$0, $$1, 2);
   }

   public static cpn c(int $$0, clx $$1) {
      return new cpn(cqo.c, $$0, $$1, 3);
   }

   public static cpn d(int $$0, clx $$1) {
      return new cpn(cqo.d, $$0, $$1, 4);
   }

   public static cpn e(int $$0, clx $$1) {
      return new cpn(cqo.e, $$0, $$1, 5);
   }

   public static cpn f(int $$0, clx $$1) {
      return new cpn(cqo.f, $$0, $$1, 6);
   }

   public static cpn a(int $$0, clx $$1, bpt $$2) {
      return new cpn(cqo.c, $$0, $$1, $$2, 3);
   }

   public static cpn b(int $$0, clx $$1, bpt $$2) {
      return new cpn(cqo.f, $$0, $$1, $$2, 6);
   }

   public cpn(cqo<?> $$0, int $$1, clx $$2, bpt $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.l = $$3;
      this.m = $$4;
      $$3.d_($$2.l);
      int $$5 = (this.m - 4) * 18;

      for (int $$6 = 0; $$6 < this.m; $$6++) {
         for (int $$7 = 0; $$7 < 9; $$7++) {
            this.a(new cre($$3, $$7 + $$6 * 9, 8 + $$7 * 18, 18 + $$6 * 18));
         }
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cre($$2, $$9 + $$8 * 9 + 9, 8 + $$9 * 18, 103 + $$8 * 18 + $$5));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cre($$2, $$10, 8 + $$10 * 18, 161 + $$5));
      }
   }

   @Override
   public boolean a(cly $$0) {
      return this.l.a($$0);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < this.m * 9) {
            if (!this.a($$4, this.m * 9, this.i.size(), true)) {
               return cuh.i;
            }
         } else if (!this.a($$4, 0, this.m * 9, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }
      }

      return $$2;
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.l.c($$0);
   }

   public bpt l() {
      return this.l;
   }

   public int m() {
      return this.m;
   }
}
