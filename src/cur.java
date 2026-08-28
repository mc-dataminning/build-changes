import java.util.Optional;

public class cur extends cuk {
   static final ale m = ale.b("container/slot/brewing_fuel");
   static final ale n = ale.b("container/slot/potion");
   private static final int o = 0;
   private static final int p = 2;
   private static final int q = 3;
   private static final int r = 4;
   private static final int s = 5;
   private static final int t = 2;
   private static final int u = 5;
   private static final int v = 32;
   private static final int w = 32;
   private static final int x = 41;
   private final btr y;
   private final cuw z;
   private final cwh A;

   public cur(int $$0, cqr $$1) {
      this($$0, $$1, new buf(5), new cwg(2));
   }

   public cur(int $$0, cqr $$1, btr $$2, cuw $$3) {
      super(cvt.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      dan $$4 = $$1.k.dV().L();
      this.a(new cur.c($$2, 0, 56, 51));
      this.a(new cur.c($$2, 1, 79, 58));
      this.a(new cur.c($$2, 2, 102, 51));
      this.A = this.a(new cur.b($$4, $$2, 3, 79, 17));
      this.a(new cur.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cqs $$0) {
      return this.y.a($$0);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cur.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cys.k;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cys.k;
               }
            } else if (cur.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cys.k;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cys.k;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cys.k;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cys.k;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return cys.k;
         }

         $$3.a($$0, $$2);
      }

      return $$2;
   }

   public int l() {
      return this.z.a(1);
   }

   public int m() {
      return this.z.a(0);
   }

   static class a extends cwh {
      public a(btr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cys $$0) {
         return b($$0);
      }

      public static boolean b(cys $$0) {
         return $$0.a(axi.X);
      }

      @Override
      public ale c() {
         return cur.m;
      }
   }

   static class b extends cwh {
      private final dan a;

      public b(dan $$0, btr $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cys $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cwh {
      public c(btr $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cys $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cqs $$0, cys $$1) {
         Optional<je<dam>> $$2 = $$1.a(kj.R, dao.a).e();
         if ($$2.isPresent() && $$0 instanceof arp $$3) {
            ap.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cys $$0) {
         return $$0.a(cyw.tm) || $$0.a(cyw.ws) || $$0.a(cyw.wv) || $$0.a(cyw.tl);
      }

      @Override
      public ale c() {
         return cur.n;
      }
   }
}
