public class csb extends crs {
   private final bsa m;
   private final int n;

   private csb(ctb<?> $$0, int $$1, coq $$2, int $$3) {
      this($$0, $$1, $$2, new bso(9 * $$3), $$3);
   }

   public static csb a(int $$0, coq $$1) {
      return new csb(ctb.a, $$0, $$1, 1);
   }

   public static csb b(int $$0, coq $$1) {
      return new csb(ctb.b, $$0, $$1, 2);
   }

   public static csb c(int $$0, coq $$1) {
      return new csb(ctb.c, $$0, $$1, 3);
   }

   public static csb d(int $$0, coq $$1) {
      return new csb(ctb.d, $$0, $$1, 4);
   }

   public static csb e(int $$0, coq $$1) {
      return new csb(ctb.e, $$0, $$1, 5);
   }

   public static csb f(int $$0, coq $$1) {
      return new csb(ctb.f, $$0, $$1, 6);
   }

   public static csb a(int $$0, coq $$1, bsa $$2) {
      return new csb(ctb.c, $$0, $$1, $$2, 3);
   }

   public static csb b(int $$0, coq $$1, bsa $$2) {
      return new csb(ctb.f, $$0, $$1, $$2, 6);
   }

   public csb(ctb<?> $$0, int $$1, coq $$2, bsa $$3, int $$4) {
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

   private void d(bsa $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ctp($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cor $$0) {
      return this.m.a($$0);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cwf.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cor $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bsa l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
