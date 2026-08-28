public class ctl extends ctc {
   private final btc m;
   private final int n;

   private ctl(cul<?> $$0, int $$1, cpw $$2, int $$3) {
      this($$0, $$1, $$2, new btq(9 * $$3), $$3);
   }

   public static ctl a(int $$0, cpw $$1) {
      return new ctl(cul.a, $$0, $$1, 1);
   }

   public static ctl b(int $$0, cpw $$1) {
      return new ctl(cul.b, $$0, $$1, 2);
   }

   public static ctl c(int $$0, cpw $$1) {
      return new ctl(cul.c, $$0, $$1, 3);
   }

   public static ctl d(int $$0, cpw $$1) {
      return new ctl(cul.d, $$0, $$1, 4);
   }

   public static ctl e(int $$0, cpw $$1) {
      return new ctl(cul.e, $$0, $$1, 5);
   }

   public static ctl f(int $$0, cpw $$1) {
      return new ctl(cul.f, $$0, $$1, 6);
   }

   public static ctl a(int $$0, cpw $$1, btc $$2) {
      return new ctl(cul.c, $$0, $$1, $$2, 3);
   }

   public static ctl b(int $$0, cpw $$1, btc $$2) {
      return new ctl(cul.f, $$0, $$1, $$2, 6);
   }

   public ctl(cul<?> $$0, int $$1, cpw $$2, btc $$3, int $$4) {
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

   private void d(btc $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.n; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cuz($$0, $$4 + $$3 * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   @Override
   public boolean b(cpx $$0) {
      return this.m.a($$0);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < this.n * 9) {
            if (!this.a($$4, this.n * 9, this.k.size(), true)) {
               return cxp.j;
            }
         } else if (!this.a($$4, 0, this.n * 9, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         } else {
            $$3.c();
         }
      }

      return $$2;
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.m.c($$0);
   }

   public btc l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }
}
