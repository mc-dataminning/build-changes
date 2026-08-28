public class ctf extends csw {
   private final bsr m;
   private final int n;

   private ctf(cuf<?> $$0, int $$1, cpq $$2, int $$3) {
      this($$0, $$1, $$2, new btf(9 * $$3), $$3);
   }

   public static ctf a(int $$0, cpq $$1) {
      return new ctf(cuf.a, $$0, $$1, 1);
   }

   public static ctf b(int $$0, cpq $$1) {
      return new ctf(cuf.b, $$0, $$1, 2);
   }

   public static ctf c(int $$0, cpq $$1) {
      return new ctf(cuf.c, $$0, $$1, 3);
   }

   public static ctf d(int $$0, cpq $$1) {
      return new ctf(cuf.d, $$0, $$1, 4);
   }

   public static ctf e(int $$0, cpq $$1) {
      return new ctf(cuf.e, $$0, $$1, 5);
   }

   public static ctf f(int $$0, cpq $$1) {
      return new ctf(cuf.f, $$0, $$1, 6);
   }

   public static ctf a(int $$0, cpq $$1, bsr $$2) {
      return new ctf(cuf.c, $$0, $$1, $$2, 3);
   }

   public static ctf b(int $$0, cpq $$1, bsr $$2) {
      return new ctf(cuf.f, $$0, $$1, $$2, 6);
   }

   public ctf(cuf<?> $$0, int $$1, cpq $$2, bsr $$3, int $$4) {
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

   private void d(bsr $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cut($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cpr $$0) {
      return this.m.a($$0);
   }

   @Override
   public cxh b(cpr $$0, int $$1) {
      cxh $$2 = cxh.k;
      cut $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxh $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cxh.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cxh.k;
         }

         if ($$4.f()) {
            $$3.e(cxh.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpr $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bsr l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
