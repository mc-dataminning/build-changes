public class cxb extends cvq {
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
   private final dis x;
   private final cxa y;
   private int z;
   private boolean A;
   private boolean B;

   public cxb(int $$0, crw $$1) {
      this($$0, $$1, new crg($$1.h));
   }

   public cxb(int $$0, crw $$1, dis $$2) {
      super(cwz.t, $$0);
      this.x = $$2;
      this.y = new cxa($$2);
      this.a(new cxn(this.y, 0, 136, 37));
      this.a(new cxn(this.y, 1, 162, 37));
      this.a(new cxc($$1.h, $$2, this.y, 2, 220, 37));
      this.c($$1, 108, 84);
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public void a(buk $$0) {
      this.y.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.y.c($$0);
   }

   @Override
   public boolean b(crx $$0) {
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
   public boolean a(czy $$0, cxn $$1) {
      return false;
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return czy.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return czy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return czy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.x.gB()) {
         bwt $$0 = (bwt)this.x;
         $$0.dV().a($$0.dA(), $$0.dC(), $$0.dG(), this.x.gx(), awq.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(crx $$0) {
      super.a($$0);
      this.x.a(null);
      if (!this.x.gB()) {
         if (!$$0.bJ() || $$0 instanceof art && ((art)$$0).u()) {
            czy $$1 = this.y.b(0);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }

            $$1 = this.y.b(1);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof art) {
            $$0.gj().h(this.y.b(0));
            $$0.gj().h(this.y.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         czy $$1 = this.y.a(0);
         if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.y.a(0, $$1);
         }

         czy $$2 = this.y.a(1);
         if (!$$2.f()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.y.a(1, $$2);
         }

         if (this.y.a(0).f() && this.y.a(1).f()) {
            dit $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dir $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         czy $$3 = this.k.get($$2).g();
         if (!$$3.f() && $$1.a($$3)) {
            czy $$4 = this.y.a($$0);
            if ($$4.f() || czy.c($$3, $$4)) {
               int $$5 = $$3.k();
               int $$6 = Math.min($$5 - $$4.M(), $$3.M());
               czy $$7 = $$3.c($$4.M() + $$6);
               $$3.h($$6);
               this.y.a($$0, $$7);
               if ($$7.M() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(diu $$0) {
      this.x.a($$0);
   }

   public diu p() {
      return this.x.gv();
   }

   public boolean q() {
      return this.A;
   }
}
