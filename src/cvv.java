public class cvv extends cuk {
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
   private final dhm x;
   private final cvu y;
   private int z;
   private boolean A;
   private boolean B;

   public cvv(int $$0, cqr $$1) {
      this($$0, $$1, new cqb($$1.k));
   }

   public cvv(int $$0, cqr $$1, dhm $$2) {
      super(cvt.t, $$0);
      this.x = $$2;
      this.y = new cvu($$2);
      this.a(new cwh(this.y, 0, 136, 37));
      this.a(new cwh(this.y, 1, 162, 37));
      this.a(new cvw($$1.k, $$2, this.y, 2, 220, 37));
      this.c($$1, 108, 84);
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public void a(btr $$0) {
      this.y.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.y.c($$0);
   }

   @Override
   public boolean b(cqs $$0) {
      return this.x.e($$0);
   }

   public int l() {
      return this.x.t();
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
   public boolean a(cys $$0, cwh $$1) {
      return false;
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cys.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cys.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.x.gx()) {
         bwa $$0 = (bwa)this.x;
         $$0.dV().a($$0.dA(), $$0.dC(), $$0.dG(), this.x.gt(), awm.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(cqs $$0) {
      super.a($$0);
      this.x.a(null);
      if (!this.x.gx()) {
         if (!$$0.bK() || $$0 instanceof arp && ((arp)$$0).u()) {
            cys $$1 = this.y.b(0);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }

            $$1 = this.y.b(1);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof arp) {
            $$0.gi().g(this.y.b(0));
            $$0.gi().g(this.y.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cys $$1 = this.y.a(0);
         if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.y.a(0, $$1);
         }

         cys $$2 = this.y.a(1);
         if (!$$2.f()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.y.a(1, $$2);
         }

         if (this.y.a(0).f() && this.y.a(1).f()) {
            dhn $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dhl $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cys $$3 = this.k.get($$2).g();
         if (!$$3.f() && $$1.a($$3)) {
            cys $$4 = this.y.a($$0);
            if ($$4.f() || cys.c($$3, $$4)) {
               int $$5 = $$3.k();
               int $$6 = Math.min($$5 - $$4.M(), $$3.M());
               cys $$7 = $$3.c($$4.M() + $$6);
               $$3.h($$6);
               this.y.a($$0, $$7);
               if ($$7.M() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(dho $$0) {
      this.x.a($$0);
   }

   public dho p() {
      return this.x.gr();
   }

   public boolean q() {
      return this.A;
   }
}
