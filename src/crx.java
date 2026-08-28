public class crx extends cro {
   private final brw m;
   private final int n;

   private crx(csx<?> $$0, int $$1, col $$2, int $$3) {
      this($$0, $$1, $$2, new bsk(9 * $$3), $$3);
   }

   public static crx a(int $$0, col $$1) {
      return new crx(csx.a, $$0, $$1, 1);
   }

   public static crx b(int $$0, col $$1) {
      return new crx(csx.b, $$0, $$1, 2);
   }

   public static crx c(int $$0, col $$1) {
      return new crx(csx.c, $$0, $$1, 3);
   }

   public static crx d(int $$0, col $$1) {
      return new crx(csx.d, $$0, $$1, 4);
   }

   public static crx e(int $$0, col $$1) {
      return new crx(csx.e, $$0, $$1, 5);
   }

   public static crx f(int $$0, col $$1) {
      return new crx(csx.f, $$0, $$1, 6);
   }

   public static crx a(int $$0, col $$1, brw $$2) {
      return new crx(csx.c, $$0, $$1, $$2, 3);
   }

   public static crx b(int $$0, col $$1, brw $$2) {
      return new crx(csx.f, $$0, $$1, $$2, 6);
   }

   public crx(csx<?> $$0, int $$1, col $$2, brw $$3, int $$4) {
      super($$0, $$1);
      a($$3, $$4 * 9);
      this.m = $$3;
      this.n = $$4;
      $$3.d_($$2.k);
      int $$5 = 18;
      this.d($$3, 8, 18);
      int $$6 = 18 + this.n * 18 + 13;
      this.c($$2, 8, $$6);
   }

   private void d(brw $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ctl($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(com $$0) {
      return this.m.a($$0);
   }

   @Override
   public cwb b(com $$0, int $$1) {
      cwb $$2 = cwb.k;
      ctl $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwb $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cwb.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cwb.k;
         }

         if ($$4.f()) {
            $$3.e(cwb.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(com $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public brw l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
