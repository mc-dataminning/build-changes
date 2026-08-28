import java.util.Optional;

public class cta extends cst {
   static final alp m = alp.b("container/slot/brewing_fuel");
   static final alp n = alp.b("container/slot/potion");
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
   private final bst y;
   private final ctf z;
   private final cuq A;

   public cta(int $$0, cpn $$1) {
      this($$0, $$1, new bth(5), new cup(2));
   }

   public cta(int $$0, cpn $$1, bst $$2, ctf $$3) {
      super(cuc.l, $$0);
      a($$2, 5);
      a($$3, 2);
      this.y = $$2;
      this.z = $$3;
      cze $$4 = $$1.k.dW().L();
      this.a(new cta.c($$2, 0, 56, 51));
      this.a(new cta.c($$2, 1, 79, 58));
      this.a(new cta.c($$2, 2, 102, 51));
      this.A = this.a(new cta.b($$4, $$2, 3, 79, 17));
      this.a(new cta.a($$2, 4, 17, 17));
      this.a($$3);
      this.c($$1, 8, 84);
   }

   @Override
   public boolean b(cpo $$0) {
      return this.y.a($$0);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         if (($$1 < 0 || $$1 > 2) && $$1 != 3 && $$1 != 4) {
            if (cta.a.b($$2)) {
               if (this.a($$4, 4, 5, false) || this.A.a($$4) && !this.a($$4, 3, 4, false)) {
                  return cxg.j;
               }
            } else if (this.A.a($$4)) {
               if (!this.a($$4, 3, 4, false)) {
                  return cxg.j;
               }
            } else if (cta.c.b($$2)) {
               if (!this.a($$4, 0, 3, false)) {
                  return cxg.j;
               }
            } else if ($$1 >= 5 && $$1 < 32) {
               if (!this.a($$4, 32, 41, false)) {
                  return cxg.j;
               }
            } else if ($$1 >= 32 && $$1 < 41) {
               if (!this.a($$4, 5, 32, false)) {
                  return cxg.j;
               }
            } else if (!this.a($$4, 5, 41, false)) {
               return cxg.j;
            }
         } else {
            if (!this.a($$4, 5, 41, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
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

   static class a extends cuq {
      public a(bst $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxg $$0) {
         return b($$0);
      }

      public static boolean b(cxg $$0) {
         return $$0.a(axt.Z);
      }

      @Override
      public alp b() {
         return cta.m;
      }
   }

   static class b extends cuq {
      private final cze a;

      public b(cze $$0, bst $$1, int $$2, int $$3, int $$4) {
         super($$1, $$2, $$3, $$4);
         this.a = $$0;
      }

      @Override
      public boolean a(cxg $$0) {
         return this.a.a($$0);
      }
   }

   static class c extends cuq {
      public c(bst $$0, int $$1, int $$2, int $$3) {
         super($$0, $$1, $$2, $$3);
      }

      @Override
      public boolean a(cxg $$0) {
         return b($$0);
      }

      @Override
      public int a() {
         return 1;
      }

      @Override
      public void a(cpo $$0, cxg $$1) {
         Optional<jq<czd>> $$2 = $$1.a(ku.Q, czf.a).e();
         if ($$2.isPresent() && $$0 instanceof ary $$3) {
            ao.l.a($$3, $$2.get());
         }

         super.a($$0, $$1);
      }

      public static boolean b(cxg $$0) {
         return $$0.a(cxk.ti) || $$0.a(cxk.wo) || $$0.a(cxk.wr) || $$0.a(cxk.th);
      }

      @Override
      public alp b() {
         return cta.n;
      }
   }
}
