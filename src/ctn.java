public class ctn extends csx implements ctl {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cup r = new cup();
   private final ctj s;
   private final cps t;
   private final ctp u;

   public ctn(int $$0, cpr $$1) {
      super(cug.h, $$0);
      this.t = $$1.k;
      this.s = new cut(10);
      this.u = new cvb(this, 3, 3);
      this.a($$1);
   }

   public ctn(int $$0, cpr $$1, ctp $$2, ctj $$3) {
      super(cug.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cpr $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cto(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cuk(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cto $$2 = (cto)this.b($$0);
      this.s.a($$2.d, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.s.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.s.a(9) == 1;
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cxk.k;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.f(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cps $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof asi $$0) {
         ash $$1 = $$0.y();
         dbo $$2 = this.u.aC_();
         cxk $$3 = dly.a($$1, $$2).map($$2x -> ((dbp)$$2x.b()).a($$2, $$1.K_())).orElse(cxk.k);
         this.r.a(0, $$3);
      }
   }

   public bsx m() {
      return this.u;
   }

   @Override
   public void a(csx $$0, int $$1, cxk $$2) {
      this.n();
   }

   @Override
   public void a(csx $$0, int $$1, int $$2) {
   }
}
