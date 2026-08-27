public class cew extends cer {
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
   private final bgx u;
   private final cfb v;
   private final cgj w;

   public cew(int $$0, cbz $$1) {
      this($$0, $$1, new bhl(5), new cgi(2));
   }

   public cew(int $$0, cbz $$1, bgx $$2, cfb $$3) {
      super(cfw.k, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cew.c($$2, 0, 56, 51));
      this.a(new cew.c($$2, 1, 79, 58));
      this.a(new cew.c($$2, 2, 102, 51));
      this.w = this.a(new cew.b($$2, 3, 79, 17));
      this.a(new cew.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cgj($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cgj($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cca $$0) {
      return this.u.a($$0);
   }

   @Override
   public cjl a(cca $$0, int $$1) {
      cjl $$2 = cjl.b;
      cgj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         cjl $$4 = $$3.e();
         $$2 = $$4.p();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cew.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cjl.b;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cjl.b;
               }
            } else if (cew.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cjl.b;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cjl.b;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cjl.b;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cjl.b;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cjl.b;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.d(cjl.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cjl.b;
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

   static class a extends cgj {
      public a(bgx $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjl $$0) {
         return b($$0);
      }

      public static boolean b(cjl $$0) {
         return $$0.a(cjo.rz);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cgj {
      public b(bgx $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjl $$0) {
         return clj.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cgj {
      public c(bgx $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cjl $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cca $$0, cjl $$1) {
         cli $$2 = clk.d($$1);
         if ($$0 instanceof aku) {
            al.k.a((aku)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(cjl $$0) {
         return $$0.a(cjo.rv) || $$0.a(cjo.uu) || $$0.a(cjo.ux) || $$0.a(cjo.rw);
      }
   }
}
