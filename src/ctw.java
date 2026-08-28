public class ctw extends ctn {
   private final btj m;
   private final int n;

   private ctw(cuw<?> $$0, int $$1, cqh $$2, int $$3) {
      this($$0, $$1, $$2, new btx(9 * $$3), $$3);
   }

   public static ctw a(int $$0, cqh $$1) {
      return new ctw(cuw.a, $$0, $$1, 1);
   }

   public static ctw b(int $$0, cqh $$1) {
      return new ctw(cuw.b, $$0, $$1, 2);
   }

   public static ctw c(int $$0, cqh $$1) {
      return new ctw(cuw.c, $$0, $$1, 3);
   }

   public static ctw d(int $$0, cqh $$1) {
      return new ctw(cuw.d, $$0, $$1, 4);
   }

   public static ctw e(int $$0, cqh $$1) {
      return new ctw(cuw.e, $$0, $$1, 5);
   }

   public static ctw f(int $$0, cqh $$1) {
      return new ctw(cuw.f, $$0, $$1, 6);
   }

   public static ctw a(int $$0, cqh $$1, btj $$2) {
      return new ctw(cuw.c, $$0, $$1, $$2, 3);
   }

   public static ctw b(int $$0, cqh $$1, btj $$2) {
      return new ctw(cuw.f, $$0, $$1, $$2, 6);
   }

   public ctw(cuw<?> $$0, int $$1, cqh $$2, btj $$3, int $$4) {
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

   private void d(btj $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cvk($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cqi $$0) {
      return this.m.a($$0);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cxy.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(cqi $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public btj l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
