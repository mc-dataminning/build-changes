public class cuo extends ctn {
   public static final int m = 5;
   private final btj n;

   public cuo(int $$0, cqh $$1) {
      this($$0, $$1, new btx(5));
   }

   public cuo(int $$0, cqh $$1, btj $$2) {
      super(cuw.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.k);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cvk($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(cqi $$0) {
      return this.n.a($$0);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return cxy.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
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
      this.n.c($$0);
   }
}
