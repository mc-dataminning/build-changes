public class chz extends chu {
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
   private final bjo u;
   private final cie v;
   private final cjp w;

   public chz(int $$0, cfa $$1) {
      this($$0, $$1, new bkd(5), new cjo(2));
   }

   public chz(int $$0, cfa $$1, bjo $$2, cie $$3) {
      super(cjb.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new chz.c($$2, 0, 56, 51));
      this.a(new chz.c($$2, 1, 79, 58));
      this.a(new chz.c($$2, 2, 102, 51));
      this.w = this.a(new chz.b($$2, 3, 79, 17));
      this.a(new chz.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cjp($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cjp($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return this.u.a($$0);
   }

   @Override
   public cmr a(cfb $$0, int $$1) {
      cmr $$2 = cmr.f;
      cjp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmr $$4 = $$3.g();
         $$2 = $$4.p();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (chz.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cmr.f;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cmr.f;
               }
            } else if (chz.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cmr.f;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cmr.f;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cmr.f;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cmr.f;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cmr.f;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.e(cmr.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmr.f;
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

   static class a extends cjp {
      public a(bjo $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmr $$0) {
         return b($$0);
      }

      public static boolean b(cmr $$0) {
         return $$0.a(cmu.sl);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cjp {
      public b(bjo $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmr $$0) {
         return coq.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cjp {
      public c(bjo $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cmr $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cfb $$0, cmr $$1) {
         cop $$2 = cor.d($$1);
         if ($$0 instanceof ana) {
            am.l.a((ana)$$0, $$2.c());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cmr $$0) {
         return $$0.a(cmu.sh) || $$0.a(cmu.vh) || $$0.a(cmu.vk) || $$0.a(cmu.si);
      }
   }
}
