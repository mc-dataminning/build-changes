public class cmz extends clq {
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
   private final cvy v;
   private final cmy w;
   private int x;
   private boolean y;
   private boolean z;

   public cmz(int $$0, cit $$1) {
      this($$0, $$1, new cie($$1.m));
   }

   public cmz(int $$0, cit $$1, cvy $$2) {
      super(cmx.t, $$0);
      this.v = $$2;
      this.w = new cmy($$2);
      this.a(new cnl(this.w, 0, 136, 37));
      this.a(new cnl(this.w, 1, 162, 37));
      this.a(new cna($$1.m, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnl($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnl($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bmw $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(ciu $$0) {
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
   public boolean a(cqm $$0, cnl $$1) {
      return false;
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cqm.h;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cqm.h;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cqm.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gv()) {
         box $$0 = (box)this.v;
         $$0.dM().a($$0.dr(), $$0.dt(), $$0.dx(), this.v.gr(), atz.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gv()) {
         if (!$$0.bA() || $$0 instanceof apg && ((apg)$$0).v()) {
            cqm $$1 = this.w.b(0);
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
         cqm $$1 = this.w.a(0);
         if (!$$1.b()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cqm $$2 = this.w.a(1);
         if (!$$2.b()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).b() && this.w.a(1).b()) {
            cvz $$3 = this.p().get($$0);
            boolean $$4 = $$3.l();
            cqm $$5 = $$3.b();
            this.a(0, $$5, $$4);
            cqm $$6 = $$3.c();
            this.a(1, $$6, $$4);
         }
      }
   }

   private void a(int $$0, cqm $$1, boolean $$2) {
      if (!$$1.b()) {
         for (int $$3 = 3; $$3 < 39; $$3++) {
            cqm $$4 = this.i.get($$3).g();
            if (!$$4.b() && cvz.a($$1, $$4, $$2)) {
               cqm $$5 = this.w.a($$0);
               int $$6 = $$5.b() ? 0 : $$5.M();
               int $$7 = Math.min($$1.g() - $$6, $$4.M());
               cqm $$8 = $$4.q();
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

   public void a(cwa $$0) {
      this.v.a($$0);
   }

   public cwa p() {
      return this.v.gp();
   }

   public boolean q() {
      return this.y;
   }
}
