public class csb extends cqq {
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
   private final dco x;
   private final csa y;
   private int z;
   private boolean A;
   private boolean B;

   public csb(int $$0, cno $$1) {
      this($$0, $$1, new cmz($$1.k));
   }

   public csb(int $$0, cno $$1, dco $$2) {
      super(crz.t, $$0);
      this.x = $$2;
      this.y = new csa($$2);
      this.a(new csn(this.y, 0, 136, 37));
      this.a(new csn(this.y, 1, 162, 37));
      this.a(new csc($$1.k, $$2, this.y, 2, 220, 37));
      this.c($$1, 108, 84);
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public void a(brd $$0) {
      this.y.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.y.c($$0);
   }

   @Override
   public boolean b(cnp $$0) {
      return this.x.go() == $$0;
   }

   public int l() {
      return this.x.t();
   }

   public int m() {
      return this.y.h();
   }

   public void f(int $$0) {
      this.x.t($$0);
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
   public boolean a(cvl $$0, csn $$1) {
      return false;
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cvl.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.x.gw()) {
         btj $$0 = (btj)this.x;
         $$0.dS().a($$0.dx(), $$0.dz(), $$0.dD(), this.x.gs(), awe.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.x.a(null);
      if (!this.x.gw()) {
         if (!$$0.bI() || $$0 instanceof arh && ((arh)$$0).x()) {
            cvl $$1 = this.y.b(0);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }

            $$1 = this.y.b(1);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof arh) {
            $$0.gc().g(this.y.b(0));
            $$0.gc().g(this.y.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cvl $$1 = this.y.a(0);
         if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.y.a(0, $$1);
         }

         cvl $$2 = this.y.a(1);
         if (!$$2.f()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.y.a(1, $$2);
         }

         if (this.y.a(0).f() && this.y.a(1).f()) {
            dcp $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dcn $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cvl $$3 = this.k.get($$2).g();
         if (!$$3.f() && $$1.a($$3)) {
            cvl $$4 = this.y.a($$0);
            if ($$4.f() || cvl.c($$3, $$4)) {
               int $$5 = $$3.k();
               int $$6 = Math.min($$5 - $$4.J(), $$3.J());
               cvl $$7 = $$3.c($$4.J() + $$6);
               $$3.h($$6);
               this.y.a($$0, $$7);
               if ($$7.J() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(dcq $$0) {
      this.x.a($$0);
   }

   public dcq p() {
      return this.x.gq();
   }

   public boolean q() {
      return this.A;
   }
}
