public abstract class cpi extends cqv<cyy, cxq> {
   public static final int k = 0;
   public static final int l = 1;
   public static final int m = 2;
   public static final int n = 3;
   public static final int o = 4;
   private static final int q = 3;
   private static final int r = 30;
   private static final int s = 30;
   private static final int t = 39;
   private final bpz u;
   private final cps v;
   protected final dcf p;
   private final cyo<? extends cxq> w;
   private final cqw x;

   protected cpi(cqp<?> $$0, cyo<? extends cxq> $$1, cqw $$2, int $$3, cmj $$4) {
      this($$0, $$1, $$2, $$3, $$4, new bqp(3), new crc(4));
   }

   protected cpi(cqp<?> $$0, cyo<? extends cxq> $$1, cqw $$2, int $$3, cmj $$4, bpz $$5, cps $$6) {
      super($$0, $$3);
      this.w = $$1;
      this.x = $$2;
      a($$5, 3);
      a($$6, 4);
      this.u = $$5;
      this.v = $$6;
      this.p = $$4.l.dQ();
      this.a(new crd($$5, 0, 56, 17));
      this.a(new cqd(this, $$5, 1, 56, 53));
      this.a(new cqf($$4.l, $$5, 2, 116, 35));

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crd($$4, $$8 + $$7 * 9 + 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crd($$4, $$9, 8 + $$9 * 18, 142));
      }

      this.a($$6);
   }

   @Override
   public void a(cmo $$0) {
      if (this.u instanceof cri) {
         ((cri)this.u).a($$0);
      }
   }

   @Override
   public void l() {
      this.b(0).f(cuc.l);
      this.b(2).f(cuc.l);
   }

   @Override
   public boolean a(cyk<cxq> $$0) {
      return $$0.b().a(new cyy(this.u.a(0)), this.p);
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
   public boolean b(cmk $$0) {
      return this.u.a($$0);
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 2) {
            if (!this.a($$4, 3, 39, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 != 1 && $$1 != 0) {
            if (this.c($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuc.l;
               }
            } else if (this.d($$4)) {
               if (!this.a($$4, 1, 2, false)) {
                  return cuc.l;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cuc.l;
               }
            } else if ($$1 >= 30 && $$1 < 39 && !this.a($$4, 3, 30, false)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 3, 39, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.e(cuc.l);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   protected boolean c(cuc $$0) {
      return this.p.r().a(this.w, new cyy($$0), this.p).isPresent();
   }

   protected boolean d(cuc $$0) {
      return dpd.c($$0);
   }

   public float q() {
      int $$0 = this.v.a(2);
      int $$1 = this.v.a(3);
      return $$1 != 0 && $$0 != 0 ? ayg.a((float)$$0 / (float)$$1, 0.0F, 1.0F) : 0.0F;
   }

   public float r() {
      int $$0 = this.v.a(1);
      if ($$0 == 0) {
         $$0 = 200;
      }

      return ayg.a((float)this.v.a(0) / (float)$$0, 0.0F, 1.0F);
   }

   public boolean s() {
      return this.v.a(0) > 0;
   }

   @Override
   public cqw t() {
      return this.x;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != 1;
   }
}
