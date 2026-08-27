public class cej extends cee {
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
   private final ceo v;
   private final cfw w;

   public cej(int $$0, cbm $$1) {
      this($$0, $$1, new bgx(5), new cfv(2));
   }

   public cej(int $$0, cbm $$1, bgj $$2, ceo $$3) {
      super(cfj.k, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cej.c($$2, 0, 56, 51));
      this.a(new cej.c($$2, 1, 79, 58));
      this.a(new cej.c($$2, 2, 102, 51));
      this.w = this.a(new cej.b($$2, 3, 79, 17));
      this.a(new cej.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cfw($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cfw($$1, $$6, 8 + $$6 * 18, 142));
      }
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
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cej.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return ciy.b;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return ciy.b;
               }
            } else if (cej.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return ciy.b;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return ciy.b;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return ciy.b;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return ciy.b;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return ciy.b;
            }

            $$3.a($$4, $$2);
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

   public int l() {
      return this.v.a(1);
   }

   public int m() {
      return this.v.a(0);
   }

   static class a extends cfw {
      public a(bgj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciy $$0) {
         return b($$0);
      }

      public static boolean b(ciy $$0) {
         return $$0.a(cjb.rz);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cfw {
      public b(bgj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciy $$0) {
         return ckw.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cfw {
      public c(bgj $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciy $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cbn $$0, ciy $$1) {
         ckv $$2 = ckx.d($$1);
         if ($$0 instanceof akl) {
            ai.k.a((akl)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(ciy $$0) {
         return $$0.a(cjb.rv) || $$0.a(cjb.uu) || $$0.a(cjb.ux) || $$0.a(cjb.rw);
      }
   }
}
