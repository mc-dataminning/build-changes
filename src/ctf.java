import java.util.List;
import java.util.Map;

public class ctf extends csd {
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
   private static final Map<but, akv> J = Map.of(but.c, E, but.d, D, but.e, C, but.f, B);
   private static final but[] K = new but[]{but.f, but.e, but.d, but.c};
   public final boolean G;
   private final cox L;

   public ctf(cow $$0, boolean $$1, final cox $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         but $$4 = K[$$3];
         akv $$5 = J.get($$4);
         this.a(new csg($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new ctz($$0, 40, 77, 62) {
         @Override
         public void a(cwp $$0, cwp $$1) {
            $$2.a(but.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public akv b() {
            return ctf.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bsd $$0) {
      if (this.L.dV() instanceof ard $$1) {
         csv.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(cox $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dV().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cox $$0) {
      return true;
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3.h()) {
         cwp $$4 = $$3.g();
         $$2 = $$4.v();
         but $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cwp.j;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cwp.j;
            }
         } else if ($$5.a() == but.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cwp.j;
            }
         } else if ($$5 == but.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cwp.j;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cwp.j;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cwp.j;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.a(cwp.j, $$2);
         } else {
            $$3.c();
         }

         if ($$4.M() == $$2.M()) {
            return cwp.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cwp $$0, ctz $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public ctz m() {
      return this.k.get(0);
   }

   @Override
   public List<ctz> n() {
      return this.k.subList(1, 5);
   }

   public csu r() {
      return this.m;
   }

   @Override
   public cts am_() {
      return cts.a;
   }

   @Override
   protected cox q() {
      return this.L;
   }
}
