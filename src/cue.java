public class cue extends cst {
   protected static final int m = 0;
   protected static final int n = 1;
   protected static final int o = 2;
   private static final int p = 3;
   private static final int q = 30;
   private static final int r = 30;
   private static final int s = 39;
   private static final int t = 136;
   private static final int u = 162;
   private static final int v = 220;
   private static final int w = 37;
   private final dfv x;
   private final cud y;
   private int z;
   private boolean A;
   private boolean B;

   public cue(int $$0, cpn $$1) {
      this($$0, $$1, new cox($$1.k));
   }

   public cue(int $$0, cpn $$1, dfv $$2) {
      super(cuc.t, $$0);
      this.x = $$2;
      this.y = new cud($$2);
      this.a(new cuq(this.y, 0, 136, 37));
      this.a(new cuq(this.y, 1, 162, 37));
      this.a(new cuf($$1.k, $$2, this.y, 2, 220, 37));
      this.c($$1, 108, 84);
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public void a(bst $$0) {
      this.y.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.y.c($$0);
   }

   @Override
   public boolean b(cpo $$0) {
      return this.x.f($$0);
   }

   public int l() {
      return this.x.x();
   }

   public int m() {
      return this.y.h();
   }

   public void f(int $$0) {
      this.x.s($$0);
   }

   public int n() {
      return this.z;
   }

   public void g(int $$0) {
      this.z = $$0;
   }

   public void b(boolean $$0) {
      this.B = $$0;
   }

   public boolean o() {
      return this.B;
   }

   @Override
   public boolean a(cxg $$0, cuq $$1) {
      return false;
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cxg.j;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.x.gw()) {
         bvb $$0 = (bvb)this.x;
         $$0.dW().a($$0.dB(), $$0.dD(), $$0.dH(), this.x.gs(), aww.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.x.a(null);
      if (!this.x.gw()) {
         if (!$$0.bL() || $$0 instanceof ary && ((ary)$$0).u()) {
            cxg $$1 = this.y.b(0);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }

            $$1 = this.y.b(1);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof ary) {
            $$0.gi().g(this.y.b(0));
            $$0.gi().g(this.y.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cxg $$1 = this.y.a(0);
         if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.y.a(0, $$1);
         }

         cxg $$2 = this.y.a(1);
         if (!$$2.f()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.y.a(1, $$2);
         }

         if (this.y.a(0).f() && this.y.a(1).f()) {
            dfw $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dfu $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cxg $$3 = this.k.get($$2).g();
         if (!$$3.f() && $$1.a($$3)) {
            cxg $$4 = this.y.a($$0);
            if ($$4.f() || cxg.c($$3, $$4)) {
               int $$5 = $$3.k();
               int $$6 = Math.min($$5 - $$4.M(), $$3.M());
               cxg $$7 = $$3.c($$4.M() + $$6);
               $$3.h($$6);
               this.y.a($$0, $$7);
               if ($$7.M() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(dfx $$0) {
      this.x.a($$0);
   }

   public dfx p() {
      return this.x.gq();
   }

   public boolean q() {
      return this.A;
   }
}
