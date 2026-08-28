public class csk extends csb {
   private final bsc m;
   private final int n;

   private csk(ctk<?> $$0, int $$1, cov $$2, int $$3) {
      this($$0, $$1, $$2, new bsq(9 * $$3), $$3);
   }

   public static csk a(int $$0, cov $$1) {
      return new csk(ctk.a, $$0, $$1, 1);
   }

   public static csk b(int $$0, cov $$1) {
      return new csk(ctk.b, $$0, $$1, 2);
   }

   public static csk c(int $$0, cov $$1) {
      return new csk(ctk.c, $$0, $$1, 3);
   }

   public static csk d(int $$0, cov $$1) {
      return new csk(ctk.d, $$0, $$1, 4);
   }

   public static csk e(int $$0, cov $$1) {
      return new csk(ctk.e, $$0, $$1, 5);
   }

   public static csk f(int $$0, cov $$1) {
      return new csk(ctk.f, $$0, $$1, 6);
   }

   public static csk a(int $$0, cov $$1, bsc $$2) {
      return new csk(ctk.c, $$0, $$1, $$2, 3);
   }

   public static csk b(int $$0, cov $$1, bsc $$2) {
      return new csk(ctk.f, $$0, $$1, $$2, 6);
   }

   public csk(ctk<?> $$0, int $$1, cov $$2, bsc $$3, int $$4) {
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

   private void d(bsc $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cty($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cow $$0) {
      return this.m.a($$0);
   }

   @Override
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cwo.j;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cwo.j;
         }

         if ($$4.f()) {
            $$3.e(cwo.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cow $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bsc l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
