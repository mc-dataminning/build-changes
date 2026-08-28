import java.util.List;
import java.util.Map;

public class ctg extends cse {
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
   public static final akv B = akv.b("container/slot/helmet");
   public static final akv C = akv.b("container/slot/chestplate");
   public static final akv D = akv.b("container/slot/leggings");
   public static final akv E = akv.b("container/slot/boots");
   public static final akv F = akv.b("container/slot/shield");
   private static final Map<buu, akv> J = Map.of(buu.c, E, buu.d, D, buu.e, C, buu.f, B);
   private static final buu[] K = new buu[]{buu.f, buu.e, buu.d, buu.c};
   public final boolean G;
   private final coy L;

   public ctg(cox $$0, boolean $$1, final coy $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         buu $$4 = K[$$3];
         akv $$5 = J.get($$4);
         this.a(new csh($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cua($$0, 40, 77, 62) {
         @Override
         public void a(cwq $$0, cwq $$1) {
            $$2.a(buu.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public akv b() {
            return ctg.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bse $$0) {
      if (this.L.dV() instanceof ard $$1) {
         csw.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(coy $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dV().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(coy $$0) {
      return true;
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3.h()) {
         cwq $$4 = $$3.g();
         $$2 = $$4.v();
         buu $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cwq.j;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cwq.j;
            }
         } else if ($$5.a() == buu.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cwq.j;
            }
         } else if ($$5 == buu.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cwq.j;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cwq.j;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cwq.j;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.a(cwq.j, $$2);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwq.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwq $$0, cua $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cua m() {
      return this.k.get(0);
   }

   @Override
   public List<cua> n() {
      return this.k.subList(1, 5);
   }

   public csv r() {
      return this.m;
   }

   @Override
   public ctt am_() {
      return ctt.a;
   }

   @Override
   protected coy q() {
      return this.L;
   }
}
