import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class crz extends cqx {
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
   public static final alc B = alc.b("textures/atlas/blocks.png");
   public static final alc C = alc.b("item/empty_armor_slot_helmet");
   public static final alc D = alc.b("item/empty_armor_slot_chestplate");
   public static final alc E = alc.b("item/empty_armor_slot_leggings");
   public static final alc F = alc.b("item/empty_armor_slot_boots");
   public static final alc G = alc.b("item/empty_armor_slot_shield");
   private static final Map<btw, alc> K = Map.of(btw.c, F, btw.d, E, btw.e, D, btw.f, C);
   private static final btw[] L = new btw[]{btw.f, btw.e, btw.d, btw.c};
   public final boolean H;
   private final cnu M;

   public crz(cnt $$0, boolean $$1, final cnu $$2) {
      super(null, 0, 2, 2);
      this.H = $$1;
      this.M = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         btw $$4 = L[$$3];
         alc $$5 = K.get($$4);
         this.a(new cra($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cst($$0, 40, 77, 62) {
         @Override
         public void a(cvp $$0, cvp $$1) {
            $$2.a(btw.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<alc, alc> b() {
            return Pair.of(crz.B, crz.G);
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bri $$0) {
      crp.a(this, this.M.dS(), this.M, this.m, this.n, null);
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dS().B) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cnu $$0) {
      return true;
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3.h()) {
         cvp $$4 = $$3.g();
         $$2 = $$4.u();
         btw $$5 = $$0.g($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cvp.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cvp.k;
            }
         } else if ($$5.a() == btw.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cvp.k;
            }
         } else if ($$5 == btw.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cvp.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cvp.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cvp.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.a(cvp.k, $$2);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cvp $$0, cst $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cst m() {
      return this.k.get(0);
   }

   @Override
   public List<cst> n() {
      return this.k.subList(1, 5);
   }

   public cro r() {
      return this.m;
   }

   @Override
   public csm am_() {
      return csm.a;
   }

   @Override
   protected cnu q() {
      return this.M;
   }
}
