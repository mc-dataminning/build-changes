public abstract class cef extends cfo<bgj> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bgj u;
   private final ceo v;
   protected final cpm p;
   private final cme<? extends clk> w;
   private final cfp x;

   protected cef(cfj<?> $$0, cme<? extends clk> $$1, cfp $$2, int $$3, cbm $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bgx(3), new cfv(4));
   }

   protected cef(cfj<?> $$0, cme<? extends clk> $$1, cfp $$2, int $$3, cbm $$4, bgj $$5, ceo $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.m.dK();
      this.a(new cfw($$5, 0, 56, 17));
      this.a(new cex(this, $$5, 1, 56, 53));
      this.a(new cez($$4.m, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cfw($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cfw($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cbr $$0) {
      if (this.u instanceof cfz) {
         ((cfz)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).e(ciy.b);
      this.b(2).e(ciy.b);
   }

   @Override
   public boolean a(cmb<? super bgj> $$0) {
      return $$0.a(this.u, this.p);
   }

   @Override
   public int m() {
      return 2;
   }

   @Override
   public int n() {
      return 1;
   }

   @Override
   public int o() {
      return 1;
   }

   @Override
   public int p() {
      return 3;
   }

   @Override
   public boolean a(cbn $$0) {
      return this.u.a($$0);
   }

   @Override
   public ciy a(cbn $$0, int $$1) {
      ciy $$2 = ciy.b;
      cfw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciy $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return ciy.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return ciy.b;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return ciy.b;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return ciy.b;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return ciy.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return ciy.b;
         }

         if ($$4.b()) {
            $$3.d(ciy.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciy.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(ciy $$0) {
      return this.p.q().a(this.w, new bgx($$0), this.p).isPresent();
   }

   protected boolean d(ciy $$0) {
      return dcb.b($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? arp.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return arp.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public cfp t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
