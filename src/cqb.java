public class cqb extends cpg {
   public static final int k = 59;
   public static final int l = 79;
   public static final int m = 38;
   private static final int o = 6;
   private static final int p = 3;
   private static final int q = 30;
   private static final int r = 30;
   private static final int s = 39;
   public static final int n = 160;
   private final bpt t;
   private final cpq u;
   private final cre v;

   public cqb(int $$0, clx $$1) {
      this($$0, $$1, new bqj(3), new crd(6));
   }

   public cqb(int $$0, clx $$1, bpt $$2, cpq $$3) {
      super(cqo.p, $$0);
      a($$2, 3);
      a($$3, 6);
      this.t = $$2;
      this.u = $$3;
      this.v = this.a(new cqb.a($$2, 0, 239, 17));
      this.a(new cqe($$1.l, $$2, 1, 239, 59));
      this.a(new cre($$2, 2, 180, 38) {
         @Override
         public int a() {
            return 1;
         }
      });
      this.a($$3);

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cre($$1, $$5 + $$4 * 9 + 9, 168 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cre($$1, $$6, 168 + $$6 * 18, 142));
      }
   }

   @Override
   public boolean a(cly $$0) {
      return this.t.a($$0);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 != 0 && $$1 != 1 && $$1 != 2) {
            if (this.v.a($$4)) {
               if (!this.a($$4, 0, 1, false)) {
                  return cuh.i;
               }
            } else if ($$4.a(cuk.qM)) {
               if (!this.a($$4, 2, 3, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 3 && $$1 < 30) {
               if (!this.a($$4, 30, 39, false)) {
                  return cuh.i;
               }
            } else if ($$1 >= 30 && $$1 < 39) {
               if (!this.a($$4, 3, 30, false)) {
                  return cuh.i;
               }
            } else if (!this.a($$4, 3, 39, false)) {
               return cuh.i;
            }
         } else {
            if (!this.a($$4, 3, 39, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   public int l() {
      return this.u.a(0);
   }

   public char m() {
      return (char)this.u.a(1);
   }

   public char n() {
      return (char)this.u.a(2);
   }

   public char o() {
      return (char)this.u.a(3);
   }

   public int p() {
      return this.u.a(4);
   }

   public boolean q() {
      return this.u.a(5) > 0;
   }

   class a extends cre {
      public a(bpt $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cuh $$0) {
         return dqy.a($$0, cqb.this.m(), cqb.this.n());
      }

      @Override
      public int a() {
         return 64;
      }
   }
}
