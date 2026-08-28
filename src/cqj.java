import com.mojang.datafixers.util.Pair;
import java.util.Map;

public class cqj extends cqv<cxy, cxz> {
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
   private static final Map<bsn, akk> E = Map.of(bsn.c, B, bsn.d, A, bsn.e, z, bsn.f, y);
   private static final bsn[] F = new bsn[]{bsn.f, bsn.e, bsn.d, bsn.c};
   private final cpy G = new crk(this, 2, 2);
   private final cqy H = new cqy();
   public final boolean D;
   private final cmk I;

   public cqj(cmj $$0, boolean $$1, final cmk $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new cqz($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new crd(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         bsn $$6 = F[$$5];
         akk $$7 = E.get($$6);
         this.a(new cpk($$0, $$2, $$6, 39 - $$5, 8, 8 + $$5 * 18, $$7));
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crd($$0, $$9 + ($$8 + 1) * 9, 8 + $$9 * 18, 84 + $$8 * 18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crd($$0, $$10, 8 + $$10 * 18, 142));
      }

      this.a(new crd($$0, 40, 77, 62) {
         @Override
         public void a(cuc $$0, cuc $$1) {
            $$2.a(bsn.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<akk, akk> b() {
            return Pair.of(cqj.x, cqj.C);
         }
      });
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cmo $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(cyk<cxz> $$0) {
      return $$0.b().a(this.G.aA_(), this.I.dQ());
   }

   @Override
   public void a(bpz $$0) {
      cpz.a(this, this.I.dQ(), this.I, this.G, this.H, null);
   }

   @Override
   public void a(cmk $$0) {
      super.a($$0);
      this.H.a();
      if (!$$0.dQ().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean b(cmk $$0) {
      return true;
   }

   @Override
   public cuc b(cmk $$0, int $$1) {
      cuc $$2 = cuc.l;
      crd $$3 = this.i.get($$1);
      if ($$3.h()) {
         cuc $$4 = $$3.g();
         $$2 = $$4.s();
         bsn $$5 = btd.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cuc.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cuc.l;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cuc.l;
            }
         } else if ($$5.a() == bsn.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cuc.l;
            }
         } else if ($$5 == bsn.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cuc.l;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cuc.l;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cuc.l;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cuc.l;
         }

         if ($$4.e()) {
            $$3.a(cuc.l, $$2);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuc.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuc $$0, crd $$1) {
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

   public cpy r() {
      return this.G;
   }

   @Override
   public cqw t() {
      return cqw.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
