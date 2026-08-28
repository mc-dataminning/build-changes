public class csm extends csd {
   private final bse m;
   private final int n;

   private csm(ctm<?> $$0, int $$1, cox $$2, int $$3) {
      this($$0, $$1, $$2, new bss(9 * $$3), $$3);
   }

   public static csm a(int $$0, cox $$1) {
      return new csm(ctm.a, $$0, $$1, 1);
   }

   public static csm b(int $$0, cox $$1) {
      return new csm(ctm.b, $$0, $$1, 2);
   }

   public static csm c(int $$0, cox $$1) {
      return new csm(ctm.c, $$0, $$1, 3);
   }

   public static csm d(int $$0, cox $$1) {
      return new csm(ctm.d, $$0, $$1, 4);
   }

   public static csm e(int $$0, cox $$1) {
      return new csm(ctm.e, $$0, $$1, 5);
   }

   public static csm f(int $$0, cox $$1) {
      return new csm(ctm.f, $$0, $$1, 6);
   }

   public static csm a(int $$0, cox $$1, bse $$2) {
      return new csm(ctm.c, $$0, $$1, $$2, 3);
   }

   public static csm b(int $$0, cox $$1, bse $$2) {
      return new csm(ctm.f, $$0, $$1, $$2, 6);
   }

   public csm(ctm<?> $$0, int $$1, cox $$2, bse $$3, int $$4) {
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

   private void d(bse $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cua($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(coy $$0) {
      return this.m.a($$0);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bse l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
