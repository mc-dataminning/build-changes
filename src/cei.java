public class cei extends ced {
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
   private final bgj u;
   private final cen v;
   private final cfv w;

   public cei(int $$0, cbl $$1) {
      this($$0, $$1, new bgx(5), new cfu(2));
   }

   public cei(int $$0, cbl $$1, bgj $$2, cen $$3) {
      super(cfi.k, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cei.c($$2, 0, 56, 51));
      this.a(new cei.c($$2, 1, 79, 58));
      this.a(new cei.c($$2, 2, 102, 51));
      this.w = this.a(new cei.b($$2, 3, 79, 17));
      this.a(new cei.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cfv($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cfv($$1, $$6, 8 + $$6 * 18, 142));
      }
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
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cei.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cix.b;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cix.b;
               }
            } else if (cei.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cix.b;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cix.b;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cix.b;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cix.b;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cix.b;
            }

            $$3.b($$4, $$2);
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

   public int l() {
      return this.v.a(1);
   }

   public int m() {
      return this.v.a(0);
   }

   static class a extends cfv {
      public a(bgj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cix $$0) {
         return b($$0);
      }

      public static boolean b(cix $$0) {
         return $$0.a(cja.rz);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cfv {
      public b(bgj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cix $$0) {
         return ckv.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cfv {
      public c(bgj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cix $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cbm $$0, cix $$1) {
         cku $$2 = ckw.d($$1);
         if ($$0 instanceof akl) {
            ai.k.a((akl)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(cix $$0) {
         return $$0.a(cja.rv) || $$0.a(cja.uu) || $$0.a(cja.ux) || $$0.a(cja.rw);
      }
   }
}
