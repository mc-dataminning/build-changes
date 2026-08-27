public class cjk extends cib {
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
   private final csm v;
   private final cjj w;
   private int x;
   private boolean y;
   private boolean z;

   public cjk(int $$0, cfh $$1) {
      this($$0, $$1, new ces($$1.m));
   }

   public cjk(int $$0, cfh $$1, csm $$2) {
      super(cji.t, $$0);
      this.v = $$2;
      this.w = new cjj($$2);
      this.a(new cjw(this.w, 0, 136, 37));
      this.a(new cjw(this.w, 1, 162, 37));
      this.a(new cjl($$1.m, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cjw($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cjw($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bju $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(cfi $$0) {
      return this.v.ge() == $$0;
   }

   public int l() {
      return this.v.w();
   }

   public int m() {
      return this.w.h();
   }

   public void f(int $$0) {
      this.v.t($$0);
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
   public boolean a(cmy $$0, cjw $$1) {
      return false;
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cmy.f;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cmy.f;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cmy.f;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cmy.f;
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmy.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gm()) {
         blv $$0 = (blv)this.v;
         $$0.dM().a($$0.dr(), $$0.dt(), $$0.dx(), this.v.gi(), art.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(cfi $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gm()) {
         if (!$$0.bx() || $$0 instanceof ane && ((ane)$$0).v()) {
            cmy $$1 = this.w.b(0);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof ane) {
            $$0.fS().f(this.w.b(0));
            $$0.fS().f(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cmy $$1 = this.w.a(0);
         if (!$$1.b()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cmy $$2 = this.w.a(1);
         if (!$$2.b()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).b() && this.w.a(1).b()) {
            cmy $$3 = this.p().get($$0).b();
            this.c(0, $$3);
            cmy $$4 = this.p().get($$0).c();
            this.c(1, $$4);
         }
      }
   }

   private void c(int $$0, cmy $$1) {
      if (!$$1.b()) {
         for (int $$2 = 3; $$2 < 39; $$2++) {
            cmy $$3 = this.i.get($$2).g();
            if (!$$3.b() && cmy.c($$1, $$3)) {
               cmy $$4 = this.w.a($$0);
               int $$5 = $$4.b() ? 0 : $$4.L();
               int $$6 = Math.min($$1.g() - $$5, $$3.L());
               cmy $$7 = $$3.p();
               int $$8 = $$5 + $$6;
               $$3.h($$6);
               $$7.f($$8);
               this.w.a($$0, $$7);
               if ($$8 >= $$1.g()) {
                  break;
               }
            }
         }
      }
   }

   public void a(cso $$0) {
      this.v.a($$0);
   }

   public cso p() {
      return this.v.gg();
   }

   public boolean q() {
      return this.y;
   }
}
