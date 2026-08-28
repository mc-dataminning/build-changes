public class ctc extends cst {
   private final bst m;
   private final int n;

   private ctc(cuc<?> $$0, int $$1, cpn $$2, int $$3) {
      this($$0, $$1, $$2, new bth(9 * $$3), $$3);
   }

   public static ctc a(int $$0, cpn $$1) {
      return new ctc(cuc.a, $$0, $$1, 1);
   }

   public static ctc b(int $$0, cpn $$1) {
      return new ctc(cuc.b, $$0, $$1, 2);
   }

   public static ctc c(int $$0, cpn $$1) {
      return new ctc(cuc.c, $$0, $$1, 3);
   }

   public static ctc d(int $$0, cpn $$1) {
      return new ctc(cuc.d, $$0, $$1, 4);
   }

   public static ctc e(int $$0, cpn $$1) {
      return new ctc(cuc.e, $$0, $$1, 5);
   }

   public static ctc f(int $$0, cpn $$1) {
      return new ctc(cuc.f, $$0, $$1, 6);
   }

   public static ctc a(int $$0, cpn $$1, bst $$2) {
      return new ctc(cuc.c, $$0, $$1, $$2, 3);
   }

   public static ctc b(int $$0, cpn $$1, bst $$2) {
      return new ctc(cuc.f, $$0, $$1, $$2, 6);
   }

   public ctc(cuc<?> $$0, int $$1, cpn $$2, bst $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.m = $$3;
      this.n = $$4;
      $$3.c_($$2.k);
      int $$5 = 18;
      this.d($$3, 8, 18);
      int $$6 = 18 + this.n * 18 + 13;
      this.c($$2, 8, $$6);
   }

   private void d(bst $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cuq($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cpo $$0) {
      return this.m.a($$0);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bst l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
