public class cqc extends cot {
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
   private final czu v;
   private final cqb w;
   private int x;
   private boolean y;
   private boolean z;

   public cqc(int $$0, clv $$1) {
      this($$0, $$1, new clg($$1.l));
   }

   public cqc(int $$0, clv $$1, czu $$2) {
      super(cqa.t, $$0);
      this.v = $$2;
      this.w = new cqb($$2);
      this.a(new cqo(this.w, 0, 136, 37));
      this.a(new cqo(this.w, 1, 162, 37));
      this.a(new cqd($$1.l, $$2, this.w, 2, 220, 37));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cqo($$1, $$4 + $$3 * 9 + 9, 108 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cqo($$1, $$5, 108 + $$5 * 18, 142));
      }
   }

   public void a(boolean $$0) {
      this.y = $$0;
   }

   @Override
   public void a(bpn $$0) {
      this.w.f();
      super.a($$0);
   }

   public void e(int $$0) {
      this.w.c($$0);
   }

   @Override
   public boolean a(clw $$0) {
      return this.v.gp() == $$0;
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
   public boolean a(cto $$0, cqo $$1) {
      return false;
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
            this.r();
         } else if ($$1 != 0 && $$1 != 1) {
            if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cto.i;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cto.i;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.e(cto.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   private void r() {
      if (!this.v.gx()) {
         bru $$0 = (bru)this.v;
         $$0.dP().a($$0.du(), $$0.dw(), $$0.dA(), this.v.gt(), avi.g, 1.0F, 1.0F, false);
      }
   }

   @Override
   public void b(clw $$0) {
      super.b($$0);
      this.v.f(null);
      if (!this.v.gx()) {
         if (!$$0.bD() || $$0 instanceof aqn && ((aqn)$$0).v()) {
            cto $$1 = this.w.b(0);
            if (!$$1.e()) {
               $$0.a($$1, false);
            }

            $$1 = this.w.b(1);
            if (!$$1.e()) {
               $$0.a($$1, false);
            }
         } else if ($$0 instanceof aqn) {
            $$0.gc().g(this.w.b(0));
            $$0.gc().g(this.w.b(1));
         }
      }
   }

   public void h(int $$0) {
      if ($$0 >= 0 && this.p().size() > $$0) {
         cto $$1 = this.w.a(0);
         if (!$$1.e()) {
            if (!this.a($$1, 3, 39, true)) {
               return;
            }

            this.w.a(0, $$1);
         }

         cto $$2 = this.w.a(1);
         if (!$$2.e()) {
            if (!this.a($$2, 3, 39, true)) {
               return;
            }

            this.w.a(1, $$2);
         }

         if (this.w.a(0).e() && this.w.a(1).e()) {
            czv $$3 = this.p().get($$0);
            this.a(0, $$3.d());
            $$3.e().ifPresent($$0x -> this.a(1, $$0x));
         }
      }
   }

   private void a(int $$0, czt $$1) {
      for (int $$2 = 3; $$2 < 39; $$2++) {
         cto $$3 = this.i.get($$2).g();
         if (!$$3.e() && $$1.a($$3)) {
            cto $$4 = this.w.a($$0);
            int $$5 = $$4.e() ? 0 : $$4.I();
            int $$6 = Math.min($$1.d().j() - $$5, $$3.I());
            cto $$7 = $$3.s();
            int $$8 = $$5 + $$6;
            $$3.h($$6);
            $$7.e($$8);
            this.w.a($$0, $$7);
            if ($$8 >= $$1.d().j()) {
               break;
            }
         }
      }
   }

   public void a(czw $$0) {
      this.v.a($$0);
   }

   public czw p() {
      return this.v.gr();
   }

   public boolean q() {
      return this.y;
   }
}
