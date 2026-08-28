public class csu extends crj {
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
   private final ddr x;
   private final cst y;
   private int z;
   private boolean A;
   private boolean B;

   public csu(int $$0, cog $$1) {
      this($$0, $$1, new cnq($$1.k));
   }

   public csu(int $$0, cog $$1, ddr $$2) {
      super(css.t, $$0);
      this.x = $$2;
      this.y = new cst($$2);
      this.a(new ctg(this.y, 0, 136, 37));
      this.a(new ctg(this.y, 1, 162, 37));
      this.a(new csv($$1.k, $$2, this.y, 2, 220, 37));
      this.c($$1, 108, 84);
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public void a(brr $$0) {
      this.y.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.y.c($$0);
   }

   @Override
   public boolean b(coh $$0) {
      return this.x.gv() == $$0;
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
   public boolean a(cvx $$0, ctg $$1) {
      return false;
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cvx.k;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cvx.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cvx.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.x.gD()) {
         btz $$0 = (btz)this.x;
         $$0.dX().a($$0.dC(), $$0.dE(), $$0.dI(), this.x.gz(), awl.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.x.a(null);
      if (!this.x.gD()) {
         if (!$$0.bM() || $$0 instanceof arn && ((arn)$$0).x()) {
            cvx $$1 = this.y.b(0);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }

            $$1 = this.y.b(1);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof arn) {
            $$0.gk().g(this.y.b(0));
            $$0.gk().g(this.y.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cvx $$1 = this.y.a(0);
         if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.y.a(0, $$1);
         }

         cvx $$2 = this.y.a(1);
         if (!$$2.f()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.y.a(1, $$2);
         }

         if (this.y.a(0).f() && this.y.a(1).f()) {
            dds $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, ddq $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cvx $$3 = this.k.get($$2).g();
         if (!$$3.f() && $$1.a($$3)) {
            cvx $$4 = this.y.a($$0);
            if ($$4.f() || cvx.c($$3, $$4)) {
               int $$5 = $$3.k();
               int $$6 = Math.min($$5 - $$4.L(), $$3.L());
               cvx $$7 = $$3.c($$4.L() + $$6);
               $$3.h($$6);
               this.y.a($$0, $$7);
               if ($$7.L() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(ddt $$0) {
      this.x.a($$0);
   }

   public ddt p() {
      return this.x.gx();
   }

   public boolean q() {
      return this.A;
   }
}
