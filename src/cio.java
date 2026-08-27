public class cio extends cij {
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
   private final bjv u;
   private final cit v;
   private final cke w;

   public cio(int $$0, cfp $$1) {
      this($$0, $$1, new bkl(5), new ckd(2));
   }

   public cio(int $$0, cfp $$1, bjv $$2, cit $$3) {
      super(cjq.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cio.c($$2, 0, 56, 51));
      this.a(new cio.c($$2, 1, 79, 58));
      this.a(new cio.c($$2, 2, 102, 51));
      this.w = this.a(new cio.b($$2, 3, 79, 17));
      this.a(new cio.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cke($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cke($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return this.u.a($$0);
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cio.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cng.f;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cng.f;
               }
            } else if (cio.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return cng.f;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cng.f;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cng.f;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cng.f;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cng.f;
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

   static class a extends cke {
      public a(bjv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cng $$0) {
         return b($$0);
      }

      public static boolean b(cng $$0) {
         return $$0.a(cnj.sn);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cke {
      public b(bjv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cng $$0) {
         return cpf.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cke {
      public c(bjv $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cng $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cfq $$0, cng $$1) {
         ih<cpe> $$2 = cpg.d($$1);
         if ($$0 instanceof anf) {
            am.l.a((anf)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(cng $$0) {
         return $$0.a(cnj.sj) || $$0.a(cnj.vk) || $$0.a(cnj.vn) || $$0.a(cnj.sk);
      }
   }
}
