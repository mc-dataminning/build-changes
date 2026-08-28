import java.util.Optional;

public class cti extends ctb {
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
   private final btb w;
   private final ctn x;
   private final cuy y;

   public cti(int $$0, cpv $$1) {
      this($$0, $$1, new btp(5), new cux(2));
   }

   public cti(int $$0, cpv $$1, btb $$2, ctn $$3) {
      super(cuk.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.w = $$2;
      this.x = $$3;
      czm $$4 = $$1.k.dV().K();
      this.a(new cti.c($$2, 0, 56, 51));
      this.a(new cti.c($$2, 1, 79, 58));
      this.a(new cti.c($$2, 2, 102, 51));
      this.y = this.a(new cti.b($$4, $$2, 3, 79, 17));
      this.a(new cti.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpw $$0) {
      return this.w.a($$0);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.k;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cti.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.y.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cxo.k;
               }
            } else if (this.y.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cxo.k;
               }
            } else if (cti.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cxo.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cxo.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cxo.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cxo.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cxo.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cxo.k);
         } else {
            $$3.c();
         }

         if ($$4.L() == $$2.L()) {
            return cxo.k;
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

   static class a extends cuy {
      public a(btb $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxo $$0) {
         return b($$0);
      }

      public static boolean b(cxo $$0) {
         return $$0.a(ayd.Z);
      }
   }

   static class b extends cuy {
      private final czm a;

      public b(czm $$0, btb $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cxo $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cuy {
      public c(btb $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxo $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cpw $$0, cxo $$1) {
         Optional<jq<czl>> $$2 = $$1.a(ku.Q, czn.a).e();
         if ($$2.isPresent() && $$0 instanceof asi $$3) {
            ao.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cxo $$0) {
         return $$0.a(cxs.sZ) || $$0.a(cxs.we) || $$0.a(cxs.wh) || $$0.a(cxs.sY);
      }
   }
}
