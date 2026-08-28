import com.mojang.datafixers.util.Pair;
import java.util.Map;

public class cqk extends cqw<cxz, cya> {
   public static final int k = 0;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 4;
   public static final int o = 5;
   public static final int p = 5;
   public static final int q = 4;
   public static final int r = 9;
   public static final int s = 9;
   public static final int t = 36;
   public static final int u = 36;
   public static final int v = 45;
   public static final int w = 45;
   public static final akk x = new akk("textures/atlas/blocks.png");
   public static final akk y = new akk("item/empty_armor_slot_helmet");
   public static final akk z = new akk("item/empty_armor_slot_chestplate");
   public static final akk A = new akk("item/empty_armor_slot_leggings");
   public static final akk B = new akk("item/empty_armor_slot_boots");
   public static final akk C = new akk("item/empty_armor_slot_shield");
   private static final Map<bso, akk> E = Map.of(bso.c, B, bso.d, A, bso.e, z, bso.f, y);
   private static final bso[] F = new bso[]{bso.f, bso.e, bso.d, bso.c};
   private final cpz G = new crl(this, 2, 2);
   private final cqz H = new cqz();
   public final boolean D;
   private final cml I;

   public cqk(cmk $$0, boolean $$1, final cml $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new cra($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cre(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         bso $$6 = F[$$5];
         akk $$7 = E.get($$6);
         this.a(new cpl($$0, $$2, $$6, 39 - $$5, 8, 8 + $$5 * 18, $$7));
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new cre($$0, $$9 + ($$8 + 1) * 9, 8 + $$9 * 18, 84 + $$8 * 18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new cre($$0, $$10, 8 + $$10 * 18, 142));
      }

      this.a(new cre($$0, 40, 77, 62) {
         @Override
         public void a(cud $$0, cud $$1) {
            $$2.a(bso.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<akk, akk> b() {
            return Pair.of(cqk.x, cqk.C);
         }
      });
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cmp $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(cyl<cya> $$0) {
      return $$0.b().a(this.G.aA_(), this.I.dR());
   }

   @Override
   public void a(bqa $$0) {
      cqa.a(this, this.I.dR(), this.I, this.G, this.H, null);
   }

   @Override
   public void a(cml $$0) {
      super.a($$0);
      this.H.a();
      if (!$$0.dR().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean b(cml $$0) {
      return true;
   }

   @Override
   public cud b(cml $$0, int $$1) {
      cud $$2 = cud.l;
      cre $$3 = this.i.get($$1);
      if ($$3.h()) {
         cud $$4 = $$3.g();
         $$2 = $$4.s();
         bso $$5 = $$0.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cud.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cud.l;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cud.l;
            }
         } else if ($$5.a() == bso.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cud.l;
            }
         } else if ($$5 == bso.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cud.l;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cud.l;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cud.l;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cud.l;
         }

         if ($$4.e()) {
            $$3.a(cud.l, $$2);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cud.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cud $$0, cre $$1) {
      return $$1.c != this.H && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.G.f();
   }

   @Override
   public int o() {
      return this.G.g();
   }

   @Override
   public int p() {
      return 5;
   }

   public cpz r() {
      return this.G;
   }

   @Override
   public cqx t() {
      return cqx.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
