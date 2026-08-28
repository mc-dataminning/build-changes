public class cqr extends cph {
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
   private final dbc v;
   private final cqq w;
   private int x;
   private boolean y;
   private boolean z;

   public cqr(int $$0, cmj $$1) {
      this($$0, $$1, new clu($$1.l));
   }

   public cqr(int $$0, cmj $$1, dbc $$2) {
      super(cqp.t, $$0);
      this.v = $$2;
      this.w = new cqq($$2);
      this.a(new crd(this.w, 0, 136, 37));
      this.a(new crd(this.w, 1, 162, 37));
      this.a(new cqs($$1.l, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crd($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crd($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bpz $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean b(cmk $$0) {
      return this.v.go() == $$0;
   }

   public int l() {
      return this.v.u();
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
   public boolean a(cuc $$0, crd $$1) {
      return false;
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cuc.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gw()) {
         bsg $$0 = (bsg)this.v;
         $$0.dQ().a($$0.dv(), $$0.dx(), $$0.dB(), this.v.gs(), avi.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.v.f(null);
      if (!this.v.gw()) {
         if (!$$0.bE() || $$0 instanceof aqn && ((aqn)$$0).v()) {
            cuc $$1 = this.w.b(0);
            if (!$$1.e()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.e()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof aqn) {
            $$0.fZ().g(this.w.b(0));
            $$0.fZ().g(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cuc $$1 = this.w.a(0);
         if (!$$1.e()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cuc $$2 = this.w.a(1);
         if (!$$2.e()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).e() && this.w.a(1).e()) {
            dbd $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dbb $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cuc $$3 = this.i.get($$2).g();
         if (!$$3.e() && $$1.a($$3)) {
            cuc $$4 = this.w.a($$0);
            if ($$4.e() || cuc.c($$3, $$4)) {
               int $$5 = $$3.j();
               int $$6 = Math.min($$5 - $$4.H(), $$3.H());
               cuc $$7 = $$3.c($$4.H() + $$6);
               $$3.h($$6);
               this.w.a($$0, $$7);
               if ($$7.H() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(dbe $$0) {
      this.v.a($$0);
   }

   public dbe p() {
      return this.v.gq();
   }

   public boolean q() {
      return this.y;
   }
}
