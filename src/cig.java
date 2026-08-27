public class cig extends cib {
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
   private final bju u;
   private final cil v;
   private final cjw w;

   public cig(int $$0, cfh $$1) {
      this($$0, $$1, new bkj(5), new cjv(2));
   }

   public cig(int $$0, cfh $$1, bju $$2, cil $$3) {
      super(cji.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cig.c($$2, 0, 56, 51));
      this.a(new cig.c($$2, 1, 79, 58));
      this.a(new cig.c($$2, 2, 102, 51));
      this.w = this.a(new cig.b($$2, 3, 79, 17));
      this.a(new cig.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cjw($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cjw($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return this.u.a($$0);
   }

   @Override
   public cmy a(cfi $$0, int $$1) {
      cmy $$2 = cmy.f;
      cjw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmy $$4 = $$3.g();
         $$2 = $$4.p();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cig.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cmy.f;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cmy.f;
               }
            } else if (cig.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cmy.f;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cmy.f;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cmy.f;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cmy.f;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cmy.f;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.e(cmy.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmy.f;
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

   static class a extends cjw {
      public a(bju $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmy $$0) {
         return b($$0);
      }

      public static boolean b(cmy $$0) {
         return $$0.a(cnb.sl);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cjw {
      public b(bju $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmy $$0) {
         return cox.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cjw {
      public c(bju $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmy $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cfi $$0, cmy $$1) {
         cow $$2 = coy.d($$1);
         if ($$0 instanceof ane) {
            am.l.a((ane)$$0, $$2.c());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cmy $$0) {
         return $$0.a(cnb.sh) || $$0.a(cnb.vh) || $$0.a(cnb.vk) || $$0.a(cnb.si);
      }
   }
}
