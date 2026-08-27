public class clo extends ckf {
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
   private final cuo v;
   private final cln w;
   private int x;
   private boolean y;
   private boolean z;

   public clo(int $$0, chk $$1) {
      this($$0, $$1, new cgv($$1.m));
   }

   public clo(int $$0, chk $$1, cuo $$2) {
      super(clm.t, $$0);
      this.v = $$2;
      this.w = new cln($$2);
      this.a(new cma(this.w, 0, 136, 37));
      this.a(new cma(this.w, 1, 162, 37));
      this.a(new clp($$1.m, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cma($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cma($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(blp $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(chl $$0) {
      return this.v.gg() == $$0;
   }

   public int l() {
      return this.v.w();
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
   public boolean a(cpd $$0, cma $$1) {
      return false;
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cpd.h;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cpd.h;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cpd.h;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cpd.h;
         }

         if ($$4.b()) {
            $$3.e(cpd.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpd.h;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.go()) {
         bnq $$0 = (bnq)this.v;
         $$0.dM().a($$0.dr(), $$0.dt(), $$0.dx(), this.v.gk(), atm.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(chl $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.go()) {
         if (!$$0.bx() || $$0 instanceof aox && ((aox)$$0).v()) {
            cpd $$1 = this.w.b(0);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof aox) {
            $$0.fT().f(this.w.b(0));
            $$0.fT().f(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cpd $$1 = this.w.a(0);
         if (!$$1.b()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cpd $$2 = this.w.a(1);
         if (!$$2.b()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).b() && this.w.a(1).b()) {
            cup $$3 = this.p().get($$0);
            boolean $$4 = $$3.l();
            cpd $$5 = $$3.b();
            this.a(0, $$5, $$4);
            cpd $$6 = $$3.c();
            this.a(1, $$6, $$4);
         }
      }
   }

   private void a(int $$0, cpd $$1, boolean $$2) {
      if (!$$1.b()) {
         for (int $$3 = 3; $$3 < 39; $$3++) {
            cpd $$4 = this.i.get($$3).g();
            if (!$$4.b() && cup.a($$1, $$4, $$2)) {
               cpd $$5 = this.w.a($$0);
               int $$6 = $$5.b() ? 0 : $$5.M();
               int $$7 = Math.min($$1.g() - $$6, $$4.M());
               cpd $$8 = $$4.q();
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

   public void a(cuq $$0) {
      this.v.a($$0);
   }

   public cuq p() {
      return this.v.gi();
   }

   public boolean q() {
      return this.y;
   }
}
