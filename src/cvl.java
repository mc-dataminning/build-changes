public class cvl extends cvc {
   private final btz m;
   private final int n;

   private cvl(cwl<?> $$0, int $$1, cri $$2, int $$3) {
      this($$0, $$1, $$2, new bun(9 * $$3), $$3);
   }

   public static cvl a(int $$0, cri $$1) {
      return new cvl(cwl.a, $$0, $$1, 1);
   }

   public static cvl b(int $$0, cri $$1) {
      return new cvl(cwl.b, $$0, $$1, 2);
   }

   public static cvl c(int $$0, cri $$1) {
      return new cvl(cwl.c, $$0, $$1, 3);
   }

   public static cvl d(int $$0, cri $$1) {
      return new cvl(cwl.d, $$0, $$1, 4);
   }

   public static cvl e(int $$0, cri $$1) {
      return new cvl(cwl.e, $$0, $$1, 5);
   }

   public static cvl f(int $$0, cri $$1) {
      return new cvl(cwl.f, $$0, $$1, 6);
   }

   public static cvl a(int $$0, cri $$1, btz $$2) {
      return new cvl(cwl.c, $$0, $$1, $$2, 3);
   }

   public static cvl b(int $$0, cri $$1, btz $$2) {
      return new cvl(cwl.f, $$0, $$1, $$2, 6);
   }

   public cvl(cwl<?> $$0, int $$1, cri $$2, btz $$3, int $$4) {
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

   private void d(btz $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cwz($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(crj $$0) {
      return this.m.a($$0);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return czk.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
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
      this.m.c($$0);
   }

   public btz l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
