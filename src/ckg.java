public class ckg extends ckb {
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
   private final bln u;
   private final ckl v;
   private final clw w;

   public ckg(int $$0, chg $$1) {
      this($$0, $$1, new bmd(5), new clv(2));
   }

   public ckg(int $$0, chg $$1, bln $$2, ckl $$3) {
      super(cli.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new ckg.c($$2, 0, 56, 51));
      this.a(new ckg.c($$2, 1, 79, 58));
      this.a(new ckg.c($$2, 2, 102, 51));
      this.w = this.a(new ckg.b($$2, 3, 79, 17));
      this.a(new ckg.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new clw($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new clw($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(chh $$0) {
      return this.u.a($$0);
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         coz $$4 = $$3.g();
         $$2 = $$4.q();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (ckg.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return coz.h;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return coz.h;
               }
            } else if (ckg.c.b($$2) && $$2.M() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return coz.h;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return coz.h;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return coz.h;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return coz.h;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return coz.h;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.e(coz.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return coz.h;
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

   static class a extends clw {
      public a(bln $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(coz $$0) {
         return b($$0);
      }

      public static boolean b(coz $$0) {
         return $$0.a(cpc.sn);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends clw {
      public b(bln $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(coz $$0) {
         return cqw.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends clw {
      public c(bln $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(coz $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(chh $$0, coz $$1) {
         ij<cqv> $$2 = cqx.d($$1);
         if ($$0 instanceof aow) {
            am.l.a((aow)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(coz $$0) {
         return $$0.a(cpc.sj) || $$0.a(cpc.vk) || $$0.a(cpc.vn) || $$0.a(cpc.sk);
      }
   }
}
