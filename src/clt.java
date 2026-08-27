public class clt extends clo {
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
   private final bmv u;
   private final cly v;
   private final cnj w;

   public clt(int $$0, cir $$1) {
      this($$0, $$1, new bnl(5), new cni(2));
   }

   public clt(int $$0, cir $$1, bmv $$2, cly $$3) {
      super(cmv.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new clt.c($$2, 0, 56, 51));
      this.a(new clt.c($$2, 1, 79, 58));
      this.a(new clt.c($$2, 2, 102, 51));
      this.w = this.a(new clt.b($$2, 3, 79, 17));
      this.a(new clt.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cnj($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cnj($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cis $$0) {
      return this.u.a($$0);
   }

   @Override
   public cqk a(cis $$0, int $$1) {
      cqk $$2 = cqk.h;
      cnj $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqk $$4 = $$3.g();
         $$2 = $$4.q();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (clt.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cqk.h;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cqk.h;
               }
            } else if (clt.c.b($$2) && $$2.M() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cqk.h;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cqk.h;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cqk.h;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cqk.h;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cqk.h;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.e(cqk.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqk.h;
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

   static class a extends cnj {
      public a(bmv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cqk $$0) {
         return b($$0);
      }

      public static boolean b(cqk $$0) {
         return $$0.a(cqn.sn);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cnj {
      public b(bmv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cqk $$0) {
         return csi.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cnj {
      public c(bmv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cqk $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cis $$0, cqk $$1) {
         il<csh> $$2 = csj.d($$1);
         if ($$0 instanceof apg) {
            am.l.a((apg)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(cqk $$0) {
         return $$0.a(cqn.sj) || $$0.a(cqn.vl) || $$0.a(cqn.vo) || $$0.a(cqn.sk);
      }
   }
}
