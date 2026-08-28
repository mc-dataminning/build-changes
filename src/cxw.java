public class cxw extends cwb {
   private static final int m = 27;
   private final buv n;

   public cxw(int $$0, csh $$1) {
      this($$0, $$1, new bvj(27));
   }

   public cxw(int $$0, csh $$1, buv $$2) {
      super(cxk.u, $$0);
      a($$2, 27);
      this.n = $$2;
      $$2.c_($$1.h);
      int $$3 = 3;
      int $$4 = 9;

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cxx($$2, $$6 + $$5 * 9, 8 + $$6 * 18, 18 + $$5 * 18));
         }
      }

      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(csi $$0) {
      return this.n.a($$0);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n.b()) {
            if (!this.a($$4, this.n.b(), this.k.size(), true)) {
               return dak.l;
            }
         } else if (!this.a($$4, 0, this.n.b(), false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         } else {
            $$3.d();
         }
      }

      return $$2;
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      this.n.c($$0);
   }
}
