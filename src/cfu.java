public class cfu extends cfp {
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
   private final bhu u;
   private final cfz v;
   private final chh w;

   public cfu(int $$0, ccw $$1) {
      this($$0, $$1, new bii(5), new chg(2));
   }

   public cfu(int $$0, ccw $$1, bhu $$2, cfz $$3) {
      super(cgu.k, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new cfu.c($$2, 0, 56, 51));
      this.a(new cfu.c($$2, 1, 79, 58));
      this.a(new cfu.c($$2, 2, 102, 51));
      this.w = this.a(new cfu.b($$2, 3, 79, 17));
      this.a(new cfu.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new chh($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new chh($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return this.u.a($$0);
   }

   @Override
   public ckj a(ccx $$0, int $$1) {
      ckj $$2 = ckj.b;
      chh $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ckj $$4 = $$3.e();
         $$2 = $$4.p();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cfu.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return ckj.b;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return ckj.b;
               }
            } else if (cfu.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return ckj.b;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return ckj.b;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return ckj.b;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return ckj.b;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return ckj.b;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.b()) {
            $$3.d(ckj.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ckj.b;
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

   static class a extends chh {
      public a(bhu $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ckj $$0) {
         return b($$0);
      }

      public static boolean b(ckj $$0) {
         return $$0.a(ckm.rz);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends chh {
      public b(bhu $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ckj $$0) {
         return cmh.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends chh {
      public c(bhu $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ckj $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(ccx $$0, ckj $$1) {
         cmg $$2 = cmi.d($$1);
         if ($$0 instanceof alr) {
            al.k.a((alr)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(ckj $$0) {
         return $$0.a(ckm.rv) || $$0.a(ckm.uu) || $$0.a(ckm.ux) || $$0.a(ckm.rw);
      }
   }
}
