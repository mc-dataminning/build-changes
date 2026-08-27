public class cmx extends clo {
   protected static final int k = 0;
   protected static final int l = 1;
   protected static final int m = 2;
   private static final int n = 3;
   private static final int o = 30;
   private static final int p = 30;
   private static final int q = 39;
   private static final int r = 136;
   private static final int s = 162;
   private static final int t = 220;
   private static final int u = 37;
   private final cvw v;
   private final cmw w;
   private int x;
   private boolean y;
   private boolean z;

   public cmx(int $$0, cir $$1) {
      this($$0, $$1, new cic($$1.m));
   }

   public cmx(int $$0, cir $$1, cvw $$2) {
      super(cmv.t, $$0);
      this.v = $$2;
      this.w = new cmw($$2);
      this.a(new cnj(this.w, 0, 136, 37));
      this.a(new cnj(this.w, 1, 162, 37));
      this.a(new cmy($$1.m, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnj($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnj($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bmv $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(cis $$0) {
      return this.v.gn() == $$0;
   }

   public int l() {
      return this.v.s();
   }

   public int m() {
      return this.w.h();
   }

   public void f(int $$0) {
      this.v.u($$0);
   }

   public int n() {
      return this.x;
   }

   public void g(int $$0) {
      this.x = $$0;
   }

   public void b(boolean $$0) {
      this.z = $$0;
   }

   public boolean o() {
      return this.z;
   }

   @Override
   public boolean a(cqk $$0, cnj $$1) {
      return false;
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cqk.h;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cqk.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cqk.h;
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqk.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gv()) {
         bow $$0 = (bow)this.v;
         $$0.dM().a($$0.dr(), $$0.dt(), $$0.dx(), this.v.gr(), atz.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(cis $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gv()) {
         if (!$$0.bA() || $$0 instanceof apg && ((apg)$$0).v()) {
            cqk $$1 = this.w.b(0);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof apg) {
            $$0.fZ().f(this.w.b(0));
            $$0.fZ().f(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cqk $$1 = this.w.a(0);
         if (!$$1.b()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cqk $$2 = this.w.a(1);
         if (!$$2.b()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).b() && this.w.a(1).b()) {
            cvx $$3 = this.p().get($$0);
            boolean $$4 = $$3.l();
            cqk $$5 = $$3.b();
            this.a(0, $$5, $$4);
            cqk $$6 = $$3.c();
            this.a(1, $$6, $$4);
         }
      }
   }

   private void a(int $$0, cqk $$1, boolean $$2) {
      if (!$$1.b()) {
         for (int $$3 = 3; $$3 < 39; $$3++) {
            cqk $$4 = this.i.get($$3).g();
            if (!$$4.b() && cvx.a($$1, $$4, $$2)) {
               cqk $$5 = this.w.a($$0);
               int $$6 = $$5.b() ? 0 : $$5.M();
               int $$7 = Math.min($$1.g() - $$6, $$4.M());
               cqk $$8 = $$4.q();
               int $$9 = $$6 + $$7;
               $$4.h($$7);
               $$8.f($$9);
               this.w.a($$0, $$8);
               if ($$9 >= $$1.g()) {
                  break;
               }
            }
         }
      }
   }

   public void a(cvy $$0) {
      this.v.a($$0);
   }

   public cvy p() {
      return this.v.gp();
   }

   public boolean q() {
      return this.y;
   }
}
