public class crf extends cpw {
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
   private final dax v;
   private final cre w;
   private int x;
   private boolean y;
   private boolean z;

   public crf(int $$0, cmy $$1) {
      this($$0, $$1, new cmj($$1.l));
   }

   public crf(int $$0, cmy $$1, dax $$2) {
      super(crd.t, $$0);
      this.v = $$2;
      this.w = new cre($$2);
      this.a(new crr(this.w, 0, 136, 37));
      this.a(new crr(this.w, 1, 162, 37));
      this.a(new crg($$1.l, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new crr($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new crr($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bqp $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(cmz $$0) {
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
   public boolean a(cur $$0, crr $$1) {
      return false;
   }

   @Override
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cur.l;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cur.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cur.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.e(cur.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cur.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gy()) {
         bsw $$0 = (bsw)this.v;
         $$0.dP().a($$0.du(), $$0.dw(), $$0.dA(), this.v.gu(), awb.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(cmz $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gy()) {
         if (!$$0.bD() || $$0 instanceof arg && ((arg)$$0).v()) {
            cur $$1 = this.w.b(0);
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
         cur $$1 = this.w.a(0);
         if (!$$1.e()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cur $$2 = this.w.a(1);
         if (!$$2.e()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).e() && this.w.a(1).e()) {
            day $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, daw $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cur $$3 = this.i.get($$2).g();
         if (!$$3.e() && $$1.a($$3)) {
            cur $$4 = this.w.a($$0);
            if ($$4.e() || cur.c($$3, $$4)) {
               int $$5 = $$3.j();
               int $$6 = Math.min($$5 - $$4.I(), $$3.I());
               cur $$7 = $$3.c($$4.I() + $$6);
               $$3.h($$6);
               this.w.a($$0, $$7);
               if ($$7.I() >= $$5) {
                  break;
               }
            }
         }
      }
   }

   public void a(daz $$0) {
      this.v.a($$0);
   }

   public daz p() {
      return this.v.gs();
   }

   public boolean q() {
      return this.y;
   }
}
