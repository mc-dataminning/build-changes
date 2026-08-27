public class cjs extends cij {
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
   private final csu v;
   private final cjr w;
   private int x;
   private boolean y;
   private boolean z;

   public cjs(int $$0, cfp $$1) {
      this($$0, $$1, new cfa($$1.m));
   }

   public cjs(int $$0, cfp $$1, csu $$2) {
      super(cjq.t, $$0);
      this.v = $$2;
      this.w = new cjr($$2);
      this.a(new cke(this.w, 0, 136, 37));
      this.a(new cke(this.w, 1, 162, 37));
      this.a(new cjt($$1.m, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cke($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cke($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bjv $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(cfq $$0) {
      return this.v.gf() == $$0;
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
   public boolean a(cng $$0, cke $$1) {
      return false;
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cng.f;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cng.f;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gn()) {
         blw $$0 = (blw)this.v;
         $$0.dL().a($$0.dq(), $$0.ds(), $$0.dw(), this.v.gj(), aru.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gn()) {
         if (!$$0.bx() || $$0 instanceof anf && ((anf)$$0).v()) {
            cng $$1 = this.w.b(0);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.b()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof anf) {
            $$0.fS().f(this.w.b(0));
            $$0.fS().f(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cng $$1 = this.w.a(0);
         if (!$$1.b()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cng $$2 = this.w.a(1);
         if (!$$2.b()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).b() && this.w.a(1).b()) {
            cng $$3 = this.p().get($$0).b();
            this.c(0, $$3);
            cng $$4 = this.p().get($$0).c();
            this.c(1, $$4);
         }
      }
   }

   private void c(int $$0, cng $$1) {
      if (!$$1.b()) {
         for (int $$2 = 3; $$2 < 39; $$2++) {
            cng $$3 = this.i.get($$2).g();
            if (!$$3.b() && cng.c($$1, $$3)) {
               cng $$4 = this.w.a($$0);
               int $$5 = $$4.b() ? 0 : $$4.L();
               int $$6 = Math.min($$1.g() - $$5, $$3.L());
               cng $$7 = $$3.p();
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

   public void a(csw $$0) {
      this.v.a($$0);
   }

   public csw p() {
      return this.v.gh();
   }

   public boolean q() {
      return this.y;
   }
}
