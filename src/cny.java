public class cny extends cmp {
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
   private final cxu v;
   private final cnx w;
   private int x;
   private boolean y;
   private boolean z;

   public cny(int $$0, cjs $$1) {
      this($$0, $$1, new cjd($$1.m));
   }

   public cny(int $$0, cjs $$1, cxu $$2) {
      super(cnw.t, $$0);
      this.v = $$2;
      this.w = new cnx($$2);
      this.a(new cok(this.w, 0, 136, 37));
      this.a(new cok(this.w, 1, 162, 37));
      this.a(new cnz($$1.m, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cok($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cok($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bnt $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(cjt $$0) {
      return this.v.gn() == $$0;
   }

   public int l() {
      return this.v.u();
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
   public boolean a(crj $$0, cok $$1) {
      return false;
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return crj.i;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return crj.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gv()) {
         bpv $$0 = (bpv)this.v;
         $$0.dM().a($$0.dr(), $$0.dt(), $$0.dx(), this.v.gr(), aun.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gv()) {
         if (!$$0.bA() || $$0 instanceof apt && ((apt)$$0).v()) {
            crj $$1 = this.w.b(0);
            if (!$$1.d()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.d()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof apt) {
            $$0.fZ().f(this.w.b(0));
            $$0.fZ().f(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         crj $$1 = this.w.a(0);
         if (!$$1.d()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         crj $$2 = this.w.a(1);
         if (!$$2.d()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).d() && this.w.a(1).d()) {
            cxv $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, cxt $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         crj $$3 = this.i.get($$2).g();
         if (!$$3.d() && $$1.a($$3)) {
            crj $$4 = this.w.a($$0);
            int $$5 = $$4.d() ? 0 : $$4.G();
            int $$6 = Math.min($$1.d().i() - $$5, $$3.G());
            crj $$7 = $$3.r();
            int $$8 = $$5 + $$6;
            $$3.g($$6);
            $$7.e($$8);
            this.w.a($$0, $$7);
            if ($$8 >= $$1.d().i()) {
               break;
            }
         }
      }
   }

   public void a(cxw $$0) {
      this.v.a($$0);
   }

   public cxw p() {
      return this.v.gp();
   }

   public boolean q() {
      return this.y;
   }
}
