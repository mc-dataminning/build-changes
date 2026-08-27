public class ceh extends cec {
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
   private final bgh u;
   private final cem v;
   private final cfu w;

   public ceh(int $$0, cbk $$1) {
      this($$0, $$1, new bgv(5), new cft(2));
   }

   public ceh(int $$0, cbk $$1, bgh $$2, cem $$3) {
      super(cfh.k, $$0);
      a($$2, 5);
      a($$3, 2);
      this.u = $$2;
      this.v = $$3;
      this.a(new ceh.c($$2, 0, 56, 51));
      this.a(new ceh.c($$2, 1, 79, 58));
      this.a(new ceh.c($$2, 2, 102, 51));
      this.w = this.a(new ceh.b($$2, 3, 79, 17));
      this.a(new ceh.a($$2, 4, 17, 17));
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cfu($$1, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cfu($$1, $$6, 8 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return this.u.a($$0);
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         $$2 = $$4.p();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (ceh.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.w.a($$4) && !this.a($$4, 3, 4, false)) {
                  return ciw.b;
               }
            } else if (this.w.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return ciw.b;
               }
            } else if (ceh.c.b($$2) && $$2.L() == 1) {
               if (!this.a($$4, 0, 3, false)) {
                  return ciw.b;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return ciw.b;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return ciw.b;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return ciw.b;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return ciw.b;
            }

            $$3.a($$4, $$2);
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciw.b;
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

   static class a extends cfu {
      public a(bgh $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciw $$0) {
         return b($$0);
      }

      public static boolean b(ciw $$0) {
         return $$0.a(ciz.rz);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class b extends cfu {
      public b(bgh $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciw $$0) {
         return cku.a($$0);
      }

      @Override
      public int a() {
         return 64;
      }
   }

   static class c extends cfu {
      public c(bgh $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(ciw $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cbl $$0, ciw $$1) {
         ckt $$2 = ckv.d($$1);
         if ($$0 instanceof akj) {
            ai.k.a((akj)$$0, $$2);
         }

         super.a($$0, $$1);
      }

      public static boolean b(ciw $$0) {
         return $$0.a(ciz.rv) || $$0.a(ciz.uu) || $$0.a(ciz.ux) || $$0.a(ciz.rw);
      }
   }
}
