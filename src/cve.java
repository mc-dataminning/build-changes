public class cve extends cuv {
   private final btw m;
   private final int n;

   private cve(cwe<?> $$0, int $$1, crb $$2, int $$3) {
      this($$0, $$1, $$2, new buk(9 * $$3), $$3);
   }

   public static cve a(int $$0, crb $$1) {
      return new cve(cwe.a, $$0, $$1, 1);
   }

   public static cve b(int $$0, crb $$1) {
      return new cve(cwe.b, $$0, $$1, 2);
   }

   public static cve c(int $$0, crb $$1) {
      return new cve(cwe.c, $$0, $$1, 3);
   }

   public static cve d(int $$0, crb $$1) {
      return new cve(cwe.d, $$0, $$1, 4);
   }

   public static cve e(int $$0, crb $$1) {
      return new cve(cwe.e, $$0, $$1, 5);
   }

   public static cve f(int $$0, crb $$1) {
      return new cve(cwe.f, $$0, $$1, 6);
   }

   public static cve a(int $$0, crb $$1, btw $$2) {
      return new cve(cwe.c, $$0, $$1, $$2, 3);
   }

   public static cve b(int $$0, crb $$1, btw $$2) {
      return new cve(cwe.f, $$0, $$1, $$2, 6);
   }

   public cve(cwe<?> $$0, int $$1, crb $$2, btw $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.m = $$3;
      this.n = $$4;
      $$3.c_($$2.h);
      int $$5 = 18;
      this.d($$3, 8, 18);
      int $$6 = 18 + this.n * 18 + 13;
      this.c($$2, 8, $$6);
   }

   private void d(btw $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cws($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(crc $$0) {
      return this.m.a($$0);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return czd.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public btw l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
