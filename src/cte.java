import java.util.Optional;

public class cte extends csx {
   private static final int m = 0;
   private static final int n = 2;
   private static final int o = 3;
   private static final int p = 4;
   private static final int q = 5;
   private static final int r = 2;
   private static final int s = 5;
   private static final int t = 32;
   private static final int u = 32;
   private static final int v = 41;
   private final bsx w;
   private final ctj x;
   private final cuu y;

   public cte(int $$0, cpr $$1) {
      this($$0, $$1, new btl(5), new cut(2));
   }

   public cte(int $$0, cpr $$1, bsx $$2, ctj $$3) {
      super(cug.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      czi $$4 = $$1.k.dV().K();
      this.a(new cte.c($$2, 0, 56, 51));
      this.a(new cte.c($$2, 1, 79, 58));
      this.a(new cte.c($$2, 2, 102, 51));
      this.y = this.a(new cte.b($$4, $$2, 3, 79, 17));
      this.a(new cte.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cps $$0) {
      return this.w.a($$0);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cte.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cxk.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cxk.k;
               }
            } else if (cte.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cxk.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cxk.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cxk.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cxk.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxk.k;
         }

         $$3.a($$0, $$2);
      }

      return $$2;
   }

   public int l() {
      return this.x.a(1);
   }

   public int m() {
      return this.x.a(0);
   }

   static class a extends cuu {
      public a(bsx $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxk $$0) {
         return b($$0);
      }

      public static boolean b(cxk $$0) {
         return $$0.a(ayd.Z);
      }
   }

   static class b extends cuu {
      private final czi a;

      public b(czi $$0, bsx $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cxk $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cuu {
      public c(bsx $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxk $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cps $$0, cxk $$1) {
         Optional<jq<czh>> $$2 = $$1.a(ku.Q, czj.a).e();
         if ($$2.isPresent() && $$0 instanceof asi $$3) {
            ao.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cxk $$0) {
         return $$0.a(cxo.sZ) || $$0.a(cxo.we) || $$0.a(cxo.wh) || $$0.a(cxo.sY);
      }
   }
}
