public class cts extends ctc implements ctq {
   protected static final int m = 9;
   private static final int n = 9;
   private static final int o = 36;
   private static final int p = 36;
   private static final int q = 45;
   private final cuu r = new cuu();
   private final cto s;
   private final cpx t;
   private final ctu u;

   public cts(int $$0, cpw $$1) {
      super(cul.h, $$0);
      this.t = $$1.k;
      this.s = new cuy(10);
      this.u = new cvg(this, 3, 3);
      this.a($$1);
   }

   public cts(int $$0, cpw $$1, ctu $$2, cto $$3) {
      super(cul.h, $$0);
      this.t = $$1.k;
      this.s = $$3;
      this.u = $$2;
      a($$2, 9);
      $$2.c_($$1.k);
      this.a($$1);
      this.a(this);
   }

   private void a(cpw $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new ctt(this.u, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      this.c($$0, 8, 84);
      this.a(new cup(this.r, 0, 134, 35));
      this.a(this.s);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      ctt $$2 = (ctt)this.b($$0);
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
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cxp.j;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.f(cxp.j);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean b(cpx $$0) {
      return this.u.a($$0);
   }

   private void n() {
      if (this.t instanceof asi $$0) {
         ash $$1 = $$0.y();
         dbs $$2 = this.u.aC_();
         cxp $$3 = dmg.a($$1, $$2).map($$2x -> ((dbt)$$2x.b()).a($$2, $$1.K_())).orElse(cxp.j);
         this.r.a(0, $$3);
      }
   }

   public btc m() {
      return this.u;
   }

   @Override
   public void a(ctc $$0, int $$1, cxp $$2) {
      this.n();
   }

   @Override
   public void a(ctc $$0, int $$1, int $$2) {
   }
}
