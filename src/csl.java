public class csl extends csc {
   private final bsd m;
   private final int n;

   private csl(ctl<?> $$0, int $$1, cow $$2, int $$3) {
      this($$0, $$1, $$2, new bsr(9 * $$3), $$3);
   }

   public static csl a(int $$0, cow $$1) {
      return new csl(ctl.a, $$0, $$1, 1);
   }

   public static csl b(int $$0, cow $$1) {
      return new csl(ctl.b, $$0, $$1, 2);
   }

   public static csl c(int $$0, cow $$1) {
      return new csl(ctl.c, $$0, $$1, 3);
   }

   public static csl d(int $$0, cow $$1) {
      return new csl(ctl.d, $$0, $$1, 4);
   }

   public static csl e(int $$0, cow $$1) {
      return new csl(ctl.e, $$0, $$1, 5);
   }

   public static csl f(int $$0, cow $$1) {
      return new csl(ctl.f, $$0, $$1, 6);
   }

   public static csl a(int $$0, cow $$1, bsd $$2) {
      return new csl(ctl.c, $$0, $$1, $$2, 3);
   }

   public static csl b(int $$0, cow $$1, bsd $$2) {
      return new csl(ctl.f, $$0, $$1, $$2, 6);
   }

   public csl(ctl<?> $$0, int $$1, cow $$2, bsd $$3, int $$4) {
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
            this.a(new ctz($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cox $$0) {
      return this.m.a($$0);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cox $$0) {
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
