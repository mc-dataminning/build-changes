public abstract class cpw extends cri<bqo> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bqo u;
   private final cqf v;
   protected final dbz p;
   private final czb<? extends cyf> w;
   private final crj x;

   protected cpw(crc<?> $$0, czb<? extends cyf> $$1, crj $$2, int $$3, cmx $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bre(3), new crp(4));
   }

   protected cpw(crc<?> $$0, czb<? extends cyf> $$1, crj $$2, int $$3, cmx $$4, bqo $$5, cqf $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.l.dP();
      this.a(new crq($$5, 0, 56, 17));
      this.a(new cqq(this, $$5, 1, 56, 53));
      this.a(new cqs($$4.l, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crq($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crq($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cnc $$0) {
      if (this.u instanceof crv) {
         ((crv)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cuq.l);
      this.b(2).f(cuq.l);
   }

   @Override
   public boolean a(cyy<? extends cyw<bqo>> $$0) {
      return $$0.b().a(this.u, this.p);
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
   public boolean a(cmy $$0) {
      return this.u.a($$0);
   }

   @Override
   public cuq a(cmy $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuq.l;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cuq.l;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cuq.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cuq.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cuq $$0) {
      return this.p.r().a(this.w, new bre($$0), this.p).isPresent();
   }

   protected boolean d(cuq $$0) {
      return dow.c($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? ayz.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayz.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public crj t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
