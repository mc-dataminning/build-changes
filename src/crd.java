public class crd extends cpu {
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
   private final dav v;
   private final crc w;
   private int x;
   private boolean y;
   private boolean z;

   public crd(int $$0, cmw $$1) {
      this($$0, $$1, new cmh($$1.l));
   }

   public crd(int $$0, cmw $$1, dav $$2) {
      super(crb.t, $$0);
      this.v = $$2;
      this.w = new crc($$2);
      this.a(new crp(this.w, 0, 136, 37));
      this.a(new crp(this.w, 1, 162, 37));
      this.a(new cre($$1.l, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crp($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crp($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bqn $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(cmx $$0) {
      return this.v.gq() == $$0;
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
   public boolean a(cup $$0, crp $$1) {
      return false;
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cup.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cup.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gy()) {
         bsu $$0 = (bsu)this.v;
         $$0.dP().a($$0.du(), $$0.dw(), $$0.dA(), this.v.gu(), awb.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gy()) {
         if (!$$0.bD() || $$0 instanceof arg && ((arg)$$0).v()) {
            cup $$1 = this.w.b(0);
            if (!$$1.e()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.e()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof arg) {
            $$0.gc().g(this.w.b(0));
            $$0.gc().g(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cup $$1 = this.w.a(0);
         if (!$$1.e()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cup $$2 = this.w.a(1);
         if (!$$2.e()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).e() && this.w.a(1).e()) {
            daw $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, dau $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cup $$3 = this.i.get($$2).g();
         if (!$$3.e() && $$1.a($$3)) {
            cup $$4 = this.w.a($$0);
            if ($$4.e() || cup.c($$3, $$4)) {
               int $$5 = $$3.j();
               int $$6 = Math.min($$5 - $$4.I(), $$3.I());
               cup $$7 = $$3.c($$4.I() + $$6);
               $$3.h($$6);
               this.w.a($$0, $$7);
               if ($$7.I() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(dax $$0) {
      this.v.a($$0);
   }

   public dax p() {
      return this.v.gs();
   }

   public boolean q() {
      return this.y;
   }
}
