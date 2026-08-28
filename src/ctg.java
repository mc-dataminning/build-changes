public class ctg extends csx {
   private final bsx m;
   private final int n;

   private ctg(cug<?> $$0, int $$1, cpr $$2, int $$3) {
      this($$0, $$1, $$2, new btl(9 * $$3), $$3);
   }

   public static ctg a(int $$0, cpr $$1) {
      return new ctg(cug.a, $$0, $$1, 1);
   }

   public static ctg b(int $$0, cpr $$1) {
      return new ctg(cug.b, $$0, $$1, 2);
   }

   public static ctg c(int $$0, cpr $$1) {
      return new ctg(cug.c, $$0, $$1, 3);
   }

   public static ctg d(int $$0, cpr $$1) {
      return new ctg(cug.d, $$0, $$1, 4);
   }

   public static ctg e(int $$0, cpr $$1) {
      return new ctg(cug.e, $$0, $$1, 5);
   }

   public static ctg f(int $$0, cpr $$1) {
      return new ctg(cug.f, $$0, $$1, 6);
   }

   public static ctg a(int $$0, cpr $$1, bsx $$2) {
      return new ctg(cug.c, $$0, $$1, $$2, 3);
   }

   public static ctg b(int $$0, cpr $$1, bsx $$2) {
      return new ctg(cug.f, $$0, $$1, $$2, 6);
   }

   public ctg(cug<?> $$0, int $$1, cpr $$2, bsx $$3, int $$4) {
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

   private void d(bsx $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cuu($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cps $$0) {
      return this.m.a($$0);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cxk.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cps $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bsx l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
