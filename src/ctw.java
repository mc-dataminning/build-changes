import java.util.List;
import java.util.Map;

public class ctw extends csu {
   public static final int o = 0;
   public static final int p = 0;
   private static final int H = 2;
   private static final int I = 2;
   public static final int q = 1;
   public static final int r = 4;
   public static final int s = 5;
   public static final int t = 5;
   public static final int u = 4;
   public static final int v = 9;
   public static final int w = 9;
   public static final int x = 36;
   public static final int y = 36;
   public static final int z = 45;
   public static final int A = 45;
   public static final alp B = alp.b("container/slot/helmet");
   public static final alp C = alp.b("container/slot/chestplate");
   public static final alp D = alp.b("container/slot/leggings");
   public static final alp E = alp.b("container/slot/boots");
   public static final alp F = alp.b("container/slot/shield");
   private static final Map<bvj, alp> J = Map.of(bvj.c, E, bvj.d, D, bvj.e, C, bvj.f, B);
   private static final bvj[] K = new bvj[]{bvj.f, bvj.e, bvj.d, bvj.c};
   public final boolean G;
   private final cpo L;

   public ctw(cpn $$0, boolean $$1, final cpo $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bvj $$4 = K[$$3];
         alp $$5 = J.get($$4);
         this.a(new csx($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cuq($$0, 40, 77, 62) {
         @Override
         public void a(cxg $$0, cxg $$1) {
            $$2.a(bvj.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public alp b() {
            return ctw.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bst $$0) {
      if (this.L.dW() instanceof arx $$1) {
         ctm.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(cpo $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dW().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cpo $$0) {
      return true;
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3.h()) {
         cxg $$4 = $$3.g();
         $$2 = $$4.v();
         bvj $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cxg.j;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cxg.j;
            }
         } else if ($$5.a() == bvj.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cxg.j;
            }
         } else if ($$5 == bvj.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cxg.j;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cxg.j;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cxg.j;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.a(cxg.j, $$2);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cxg.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cxg $$0, cuq $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cuq m() {
      return this.k.get(0);
   }

   @Override
   public List<cuq> n() {
      return this.k.subList(1, 5);
   }

   public ctl r() {
      return this.m;
   }

   @Override
   public cuj an_() {
      return cuj.a;
   }

   @Override
   protected cpo q() {
      return this.L;
   }
}
