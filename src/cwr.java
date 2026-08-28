public class cwr extends cvq {
   public static final int m = 5;
   private final buk n;

   public cwr(int $$0, crw $$1) {
      this($$0, $$1, new buy(5));
   }

   public cwr(int $$0, crw $$1, buk $$2) {
      super(cwz.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.h);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cxn($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(crx $$0) {
      return this.n.a($$0);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return czy.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
