public class ceq extends cel {
   private static final int k = 0;
   private static final int l = 2;
   private static final int m = 3;
   private static final int n = 4;
   private static final int o = 5;
   private static final int p = 2;
   private static final int q = 5;
   private static final int r = 32;
   private static final int s = 32;
   private static final int t = 41;
   private final bgr u;
   private final cev v;
   private final cgd w;

   public ceq(int $$0, cbt $$1) {
      this($$0, $$1, new bhf(5), new cgc(2));
   }

   public ceq(int $$0, cbt $$1, bgr $$2, cev $$3) {
      super(cfq.k, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new ceq.c($$2, 0, 56, 51));
      this.a(new ceq.c($$2, 1, 79, 58));
      this.a(new ceq.c($$2, 2, 102, 51));
      this.w = this.a(new ceq.b($$2, 3, 79, 17));
      this.a(new ceq.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cgd($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cgd($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return this.u.a($$0);
   }

   @Override
   public cjf a(cbu $$0, int $$1) {
      cjf $$2 = cjf.b;
      cgd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjf $$4 = $$3.e();
         $$2 = $$4.p();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (ceq.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cjf.b;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cjf.b;
               }
            } else if (ceq.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cjf.b;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cjf.b;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cjf.b;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cjf.b;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cjf.b;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.d(cjf.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjf.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.v.a(1);
   }

   public int m() {
      return this.v.a(0);
   }

   static class a extends cgd {
      public a(bgr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjf $$0) {
         return b($$0);
      }

      public static boolean b(cjf $$0) {
         return $$0.a(cji.rz);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cgd {
      public b(bgr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjf $$0) {
         return cld.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cgd {
      public c(bgr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjf $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cbu $$0, cjf $$1) {
         clc $$2 = cle.d($$1);
         if ($$0 instanceof akr) {
            al.k.a((akr)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(cjf $$0) {
         return $$0.a(cji.rv) || $$0.a(cji.uu) || $$0.a(cji.ux) || $$0.a(cji.rw);
      }
   }
}
