public class ctk extends ctb {
   private final btb m;
   private final int n;

   private ctk(cuk<?> $$0, int $$1, cpv $$2, int $$3) {
      this($$0, $$1, $$2, new btp(9 * $$3), $$3);
   }

   public static ctk a(int $$0, cpv $$1) {
      return new ctk(cuk.a, $$0, $$1, 1);
   }

   public static ctk b(int $$0, cpv $$1) {
      return new ctk(cuk.b, $$0, $$1, 2);
   }

   public static ctk c(int $$0, cpv $$1) {
      return new ctk(cuk.c, $$0, $$1, 3);
   }

   public static ctk d(int $$0, cpv $$1) {
      return new ctk(cuk.d, $$0, $$1, 4);
   }

   public static ctk e(int $$0, cpv $$1) {
      return new ctk(cuk.e, $$0, $$1, 5);
   }

   public static ctk f(int $$0, cpv $$1) {
      return new ctk(cuk.f, $$0, $$1, 6);
   }

   public static ctk a(int $$0, cpv $$1, btb $$2) {
      return new ctk(cuk.c, $$0, $$1, $$2, 3);
   }

   public static ctk b(int $$0, cpv $$1, btb $$2) {
      return new ctk(cuk.f, $$0, $$1, $$2, 6);
   }

   public ctk(cuk<?> $$0, int $$1, cpv $$2, btb $$3, int $$4) {
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

   private void d(btb $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cuy($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cpw $$0) {
      return this.m.a($$0);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.k;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cxo.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cxo.k;
         }

         if ($$4.f()) {
            $$3.e(cxo.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpw $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public btb l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
