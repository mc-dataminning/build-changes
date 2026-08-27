public class ckk extends ckf {
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
   private final blp u;
   private final ckp v;
   private final cma w;

   public ckk(int $$0, chk $$1) {
      this($$0, $$1, new bmf(5), new clz(2));
   }

   public ckk(int $$0, chk $$1, blp $$2, ckp $$3) {
      super(clm.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new ckk.c($$2, 0, 56, 51));
      this.a(new ckk.c($$2, 1, 79, 58));
      this.a(new ckk.c($$2, 2, 102, 51));
      this.w = this.a(new ckk.b($$2, 3, 79, 17));
      this.a(new ckk.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cma($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cma($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(chl $$0) {
      return this.u.a($$0);
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         $$2 = $$4.q();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (ckk.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cpd.h;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cpd.h;
               }
            } else if (ckk.c.b($$2) && $$2.M() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cpd.h;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cpd.h;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cpd.h;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cpd.h;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cpd.h;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.e(cpd.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpd.h;
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

   static class a extends cma {
      public a(blp $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cpd $$0) {
         return b($$0);
      }

      public static boolean b(cpd $$0) {
         return $$0.a(cpg.sn);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cma {
      public b(blp $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cpd $$0) {
         return cra.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cma {
      public c(blp $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cpd $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(chl $$0, cpd $$1) {
         ij<cqz> $$2 = crb.d($$1);
         if ($$0 instanceof aox) {
            am.l.a((aox)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(cpd $$0) {
         return $$0.a(cpg.sj) || $$0.a(cpg.vk) || $$0.a(cpg.vn) || $$0.a(cpg.sk);
      }
   }
}
