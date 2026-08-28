public class cwk extends cwb {
   private final buv m;
   private final int n;

   private cwk(cxk<?> $$0, int $$1, csh $$2, int $$3) {
      this($$0, $$1, $$2, new bvj(9 * $$3), $$3);
   }

   public static cwk a(int $$0, csh $$1) {
      return new cwk(cxk.a, $$0, $$1, 1);
   }

   public static cwk b(int $$0, csh $$1) {
      return new cwk(cxk.b, $$0, $$1, 2);
   }

   public static cwk c(int $$0, csh $$1) {
      return new cwk(cxk.c, $$0, $$1, 3);
   }

   public static cwk d(int $$0, csh $$1) {
      return new cwk(cxk.d, $$0, $$1, 4);
   }

   public static cwk e(int $$0, csh $$1) {
      return new cwk(cxk.e, $$0, $$1, 5);
   }

   public static cwk f(int $$0, csh $$1) {
      return new cwk(cxk.f, $$0, $$1, 6);
   }

   public static cwk a(int $$0, csh $$1, buv $$2) {
      return new cwk(cxk.c, $$0, $$1, $$2, 3);
   }

   public static cwk b(int $$0, csh $$1, buv $$2) {
      return new cwk(cxk.f, $$0, $$1, $$2, 6);
   }

   public cwk(cxk<?> $$0, int $$1, csh $$2, buv $$3, int $$4) {
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

   private void d(buv $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cxz($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(csi $$0) {
      return this.m.a($$0);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return dak.l;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
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
      this.m.c($$0);
   }

   public buv l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
