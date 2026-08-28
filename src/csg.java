import java.util.Optional;

public class csg extends crz {
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
   private final bsd w;
   private final csl x;
   private final ctw y;

   public csg(int $$0, cot $$1) {
      this($$0, $$1, new bsr(5), new ctv(2));
   }

   public csg(int $$0, cot $$1, bsd $$2, csl $$3) {
      super(cti.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      cyk $$4 = $$1.k.dV().K();
      this.a(new csg.c($$2, 0, 56, 51));
      this.a(new csg.c($$2, 1, 79, 58));
      this.a(new csg.c($$2, 2, 102, 51));
      this.y = this.a(new csg.b($$4, $$2, 3, 79, 17));
      this.a(new csg.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cou $$0) {
      return this.w.a($$0);
   }

   @Override
   public cwm b(cou $$0, int $$1) {
      cwm $$2 = cwm.k;
      ctw $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwm $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (csg.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cwm.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cwm.k;
               }
            } else if (csg.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cwm.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cwm.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cwm.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cwm.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cwm.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cwm.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cwm.k;
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

   static class a extends ctw {
      public a(bsd $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwm $$0) {
         return b($$0);
      }

      public static boolean b(cwm $$0) {
         return $$0.a(axl.Y);
      }
   }

   static class b extends ctw {
      private final cyk a;

      public b(cyk $$0, bsd $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cwm $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends ctw {
      public c(bsd $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cwm $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cou $$0, cwm $$1) {
         Optional<jq<cyj>> $$2 = $$1.a(ku.Q, cyl.a).e();
         if ($$2.isPresent() && $$0 instanceof arq $$3) {
            ao.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cwm $$0) {
         return $$0.a(cwq.sC) || $$0.a(cwq.vG) || $$0.a(cwq.vJ) || $$0.a(cwq.sB);
      }
   }
}
