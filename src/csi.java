public class csi extends crz {
   private final bsd m;
   private final int n;

   private csi(cti<?> $$0, int $$1, cot $$2, int $$3) {
      this($$0, $$1, $$2, new bsr(9 * $$3), $$3);
   }

   public static csi a(int $$0, cot $$1) {
      return new csi(cti.a, $$0, $$1, 1);
   }

   public static csi b(int $$0, cot $$1) {
      return new csi(cti.b, $$0, $$1, 2);
   }

   public static csi c(int $$0, cot $$1) {
      return new csi(cti.c, $$0, $$1, 3);
   }

   public static csi d(int $$0, cot $$1) {
      return new csi(cti.d, $$0, $$1, 4);
   }

   public static csi e(int $$0, cot $$1) {
      return new csi(cti.e, $$0, $$1, 5);
   }

   public static csi f(int $$0, cot $$1) {
      return new csi(cti.f, $$0, $$1, 6);
   }

   public static csi a(int $$0, cot $$1, bsd $$2) {
      return new csi(cti.c, $$0, $$1, $$2, 3);
   }

   public static csi b(int $$0, cot $$1, bsd $$2) {
      return new csi(cti.f, $$0, $$1, $$2, 6);
   }

   public csi(cti<?> $$0, int $$1, cot $$2, bsd $$3, int $$4) {
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

   private void d(bsd $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ctw($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cou $$0) {
      return this.m.a($$0);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cwm.k;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cwm.k;
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cou $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public bsd l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
