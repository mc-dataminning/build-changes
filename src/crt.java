import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;

public class crt extends cqr {
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
   public static final alb B = alb.b("textures/atlas/blocks.png");
   public static final alb C = alb.b("item/empty_armor_slot_helmet");
   public static final alb D = alb.b("item/empty_armor_slot_chestplate");
   public static final alb E = alb.b("item/empty_armor_slot_leggings");
   public static final alb F = alb.b("item/empty_armor_slot_boots");
   public static final alb G = alb.b("item/empty_armor_slot_shield");
   private static final Map<btr, alb> K = Map.of(btr.c, F, btr.d, E, btr.e, D, btr.f, C);
   private static final btr[] L = new btr[]{btr.f, btr.e, btr.d, btr.c};
   public final boolean H;
   private final cnp M;

   public crt(cno $$0, boolean $$1, final cnp $$2) {
      super(null, 0, 2, 2);
      this.H = $$1;
      this.M = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         btr $$4 = L[$$3];
         alb $$5 = K.get($$4);
         this.a(new cqu($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new csn($$0, 40, 77, 62) {
         @Override
         public void a(cvl $$0, cvl $$1) {
            $$2.a(btr.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<alb, alb> b() {
            return Pair.of(crt.B, crt.G);
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(brd $$0) {
      crj.a(this, this.M.dS(), this.M, this.m, this.n, null);
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dS().B) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(cnp $$0) {
      return true;
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3.h()) {
         cvl $$4 = $$3.g();
         $$2 = $$4.u();
         btr $$5 = $$0.i($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cvl.k;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cvl.k;
            }
         } else if ($$5.a() == btr.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cvl.k;
            }
         } else if ($$5 == btr.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cvl.k;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cvl.k;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cvl.k;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.a(cvl.k, $$2);
         } else {
            $$3.c();
         }

         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cvl $$0, csn $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public csn m() {
      return this.k.get(0);
   }

   @Override
   public List<csn> n() {
      return this.k.subList(1, 5);
   }

   public cri r() {
      return this.m;
   }

   @Override
   public csg am_() {
      return csg.a;
   }

   @Override
   protected cnp q() {
      return this.M;
   }
}
