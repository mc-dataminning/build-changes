import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class csc extends cra {
   public static final int o = 0;
   public static final int p = 0;
   private static final int I = 2;
   private static final int J = 2;
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
   public static final ale B = ale.b("textures/atlas/blocks.png");
   public static final ale C = ale.b("item/empty_armor_slot_helmet");
   public static final ale D = ale.b("item/empty_armor_slot_chestplate");
   public static final ale E = ale.b("item/empty_armor_slot_leggings");
   public static final ale F = ale.b("item/empty_armor_slot_boots");
   public static final ale G = ale.b("item/empty_armor_slot_shield");
   private static final Map<btz, ale> K = Map.of(btz.c, F, btz.d, E, btz.e, D, btz.f, C);
   private static final btz[] L = new btz[]{btz.f, btz.e, btz.d, btz.c};
   public final boolean H;
   private final cnx M;

   public csc(cnw $$0, boolean $$1, final cnx $$2) {
      super(null, 0, 2, 2);
      this.H = $$1;
      this.M = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         btz $$4 = L[$$3];
         ale $$5 = K.get($$4);
         this.a(new crd($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new csw($$0, 40, 77, 62) {
         @Override
         public void a(cvs $$0, cvs $$1) {
            $$2.a(btz.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<ale, ale> b() {
            return Pair.of(csc.B, csc.G);
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(brl $$0) {
      crs.a(this, this.M.dS(), this.M, this.m, this.n, null);
   }

   @Override
   public void a(cnx $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dS().B) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cnx $$0) {
      return true;
   }

   @Override
   public cvs b(cnx $$0, int $$1) {
      cvs $$2 = cvs.k;
      csw $$3 = this.k.get($$1);
      if ($$3.h()) {
         cvs $$4 = $$3.g();
         $$2 = $$4.u();
         btz $$5 = $$0.g($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cvs.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cvs.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cvs.k;
            }
         } else if ($$5.a() == btz.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cvs.k;
            }
         } else if ($$5 == btz.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cvs.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cvs.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cvs.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cvs.k;
         }

         if ($$4.f()) {
            $$3.a(cvs.k, $$2);
         } else {
            $$3.c();
         }

         if ($$4.K() == $$2.K()) {
            return cvs.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cvs $$0, csw $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public csw m() {
      return this.k.get(0);
   }

   @Override
   public List<csw> n() {
      return this.k.subList(1, 5);
   }

   public crr r() {
      return this.m;
   }

   @Override
   public csp an_() {
      return csp.a;
   }

   @Override
   protected cnx q() {
      return this.M;
   }
}
