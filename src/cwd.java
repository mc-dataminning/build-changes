public class cwd extends cvc {
   public static final int m = 5;
   private final btz n;

   public cwd(int $$0, cri $$1) {
      this($$0, $$1, new bun(5));
   }

   public cwd(int $$0, cri $$1, btz $$2) {
      super(cwl.q, $$0);
      this.n = $$2;
      a($$2, 5);
      $$2.c_($$1.h);

      for (int $$3 = 0; $$3 < 5; $$3++) {
         this.a(new cwz($$2, $$3, 44 + $$3 * 18, 20));
      }

      this.c($$1, 8, 51);
   }

   @Override
   public boolean b(crj $$0) {
      return this.n.a($$0);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return czk.k;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return czk.k;
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
