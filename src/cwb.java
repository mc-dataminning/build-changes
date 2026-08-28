public class cwb extends cuq {
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
   private final dhs x;
   private final cwa y;
   private int z;
   private boolean A;
   private boolean B;

   public cwb(int $$0, cqx $$1) {
      this($$0, $$1, new cqh($$1.k));
   }

   public cwb(int $$0, cqx $$1, dhs $$2) {
      super(cvz.t, $$0);
      this.x = $$2;
      this.y = new cwa($$2);
      this.a(new cwn(this.y, 0, 136, 37));
      this.a(new cwn(this.y, 1, 162, 37));
      this.a(new cwc($$1.k, $$2, this.y, 2, 220, 37));
      this.c($$1, 108, 84);
   }

   public void a(boolean $$0) {
      this.A = $$0;
   }

   @Override
   public void a(btu $$0) {
      this.y.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.y.c($$0);
   }

   @Override
   public boolean b(cqy $$0) {
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
   public boolean a(cyy $$0, cwn $$1) {
      return false;
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         $$2 = $$4.v();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cyy.k;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cyy.k;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cyy.k;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.x.gx()) {
         bwd $$0 = (bwd)this.x;
         $$0.dV().a($$0.dA(), $$0.dC(), $$0.dG(), this.x.gt(), awo.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void a(cqy $$0) {
      super.a($$0);
      this.x.a(null);
      if (!this.x.gx()) {
         if (!$$0.bK() || $$0 instanceof arr && ((arr)$$0).u()) {
            cyy $$1 = this.y.b(0);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }

            $$1 = this.y.b(1);
            if (!$$1.f()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof arr) {
            $$0.gi().g(this.y.b(0));
            $$0.gi().g(this.y.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cyy $$1 = this.y.a(0);
         if (!$$1.f()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.y.a(0, $$1);
         }

         cyy $$2 = this.y.a(1);
         if (!$$2.f()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.y.a(1, $$2);
         }

         if (this.y.a(0).f() && this.y.a(1).f()) {
            dht $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dhr $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cyy $$3 = this.k.get($$2).g();
         if (!$$3.f() && $$1.a($$3)) {
            cyy $$4 = this.y.a($$0);
            if ($$4.f() || cyy.c($$3, $$4)) {
               int $$5 = $$3.k();
               int $$6 = Math.min($$5 - $$4.M(), $$3.M());
               cyy $$7 = $$3.c($$4.M() + $$6);
               $$3.h($$6);
               this.y.a($$0, $$7);
               if ($$7.M() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(dhu $$0) {
      this.x.a($$0);
   }

   public dhu p() {
      return this.x.gr();
   }

   public boolean q() {
      return this.A;
   }
}
