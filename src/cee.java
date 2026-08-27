public abstract class cee extends cfn<bgj> {
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
   private final cen v;
   protected final cpl p;
   private final cmd<? extends clj> w;
   private final cfo x;

   protected cee(cfi<?> $$0, cmd<? extends clj> $$1, cfo $$2, int $$3, cbl $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bgx(3), new cfu(4));
   }

   protected cee(cfi<?> $$0, cmd<? extends clj> $$1, cfo $$2, int $$3, cbl $$4, bgj $$5, cen $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.m.dK();
      this.a(new cfv($$5, 0, 56, 17));
      this.a(new cew(this, $$5, 1, 56, 53));
      this.a(new cey($$4.m, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cfv($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cfv($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cbq $$0) {
      if (this.u instanceof cfy) {
         ((cfy)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).e(cix.b);
      this.b(2).e(cix.b);
   }

   @Override
   public boolean a(cma<? super bgj> $$0) {
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
   public boolean a(cbm $$0) {
      return this.u.a($$0);
   }

   @Override
   public cix a(cbm $$0, int $$1) {
      cix $$2 = cix.b;
      cfv $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cix $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cix.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cix.b;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cix.b;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cix.b;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cix.b;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cix.b;
         }

         if ($$4.b()) {
            $$3.d(cix.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cix.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cix $$0) {
      return this.p.q().a(this.w, new bgx($$0), this.p).isPresent();
   }

   protected boolean d(cix $$0) {
      return dca.b($$0);
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
   public cfo t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
