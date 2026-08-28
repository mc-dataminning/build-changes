public class cvw extends cuv {
   public static final int m = 5;
   private final btw n;

   public cvw(int $$0, crb $$1) {
      this($$0, $$1, new buk(5));
   }

   public cvw(int $$0, crb $$1, btw $$2) {
      super(cwe.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.h);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cws($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(crc $$0) {
      return this.n.a($$0);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return czd.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
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
      this.n.c($$0);
   }
}
