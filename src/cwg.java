public class cwg extends cuv {
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
   private final dhx x;
   private final cwf y;
   private int z;
   private boolean A;
   private boolean B;

   public cwg(int $$0, crb $$1) {
      this($$0, $$1, new cql($$1.h));
   }

   public cwg(int $$0, crb $$1, dhx $$2) {
      super(cwe.t, $$0);
      this.x = $$2;
      this.y = new cwf($$2);
      this.a(new cws(this.y, 0, 136, 37));
      this.a(new cws(this.y, 1, 162, 37));
      this.a(new cwh($$1.h, $$2, this.y, 2, 220, 37));
      this.c($$1, 108, 84);
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public void a(btw $$0) {
      this.y.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.y.c($$0);
   }

   @Override
   public boolean b(crc $$0) {
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
   public boolean a(czd $$0, cws $$1) {
      return false;
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return czd.k;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return czd.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return czd.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czd.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.x.gy()) {
         bwf $$0 = (bwf)this.x;
         $$0.dV().a($$0.dA(), $$0.dC(), $$0.dG(), this.x.gu(), awo.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(crc $$0) {
      super.a($$0);
      this.x.a(null);
      if (!this.x.gy()) {
         if (!$$0.bK() || $$0 instanceof arr && ((arr)$$0).u()) {
            czd $$1 = this.y.b(0);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }

            $$1 = this.y.b(1);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof arr) {
            $$0.gj().h(this.y.b(0));
            $$0.gj().h(this.y.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         czd $$1 = this.y.a(0);
         if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.y.a(0, $$1);
         }

         czd $$2 = this.y.a(1);
         if (!$$2.f()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.y.a(1, $$2);
         }

         if (this.y.a(0).f() && this.y.a(1).f()) {
            dhy $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dhw $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         czd $$3 = this.k.get($$2).g();
         if (!$$3.f() && $$1.a($$3)) {
            czd $$4 = this.y.a($$0);
            if ($$4.f() || czd.c($$3, $$4)) {
               int $$5 = $$3.k();
               int $$6 = Math.min($$5 - $$4.M(), $$3.M());
               czd $$7 = $$3.c($$4.M() + $$6);
               $$3.h($$6);
               this.y.a($$0, $$7);
               if ($$7.M() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(dhz $$0) {
      this.x.a($$0);
   }

   public dhz p() {
      return this.x.gs();
   }

   public boolean q() {
      return this.A;
   }
}
