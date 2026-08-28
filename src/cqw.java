import com.mojang.datafixers.util.Pair;
import java.util.Map;

public class cqw extends cri<cyp, cyq> {
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
   public static final akr x = akr.b("textures/atlas/blocks.png");
   public static final akr y = akr.b("item/empty_armor_slot_helmet");
   public static final akr z = akr.b("item/empty_armor_slot_chestplate");
   public static final akr A = akr.b("item/empty_armor_slot_leggings");
   public static final akr B = akr.b("item/empty_armor_slot_boots");
   public static final akr C = akr.b("item/empty_armor_slot_shield");
   private static final Map<bsy, akr> E = Map.of(bsy.c, B, bsy.d, A, bsy.e, z, bsy.f, y);
   private static final bsy[] F = new bsy[]{bsy.f, bsy.e, bsy.d, bsy.c};
   private final cql G = new crx(this, 2, 2);
   private final crl H = new crl();
   public final boolean D;
   private final cmx I;

   public cqw(cmw $$0, boolean $$1, final cmx $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new crm($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new crq(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         bsy $$6 = F[$$5];
         akr $$7 = E.get($$6);
         this.a(new cpx($$0, $$2, $$6, 39 - $$5, 8, 8 + $$5 * 18, $$7));
      }

      for (int $$8 = 0; $$8 < 3; $$8++) {
         for (int $$9 = 0; $$9 < 9; $$9++) {
            this.a(new crq($$0, $$9 + ($$8 + 1) * 9, 8 + $$9 * 18, 84 + $$8 * 18));
         }
      }

      for (int $$10 = 0; $$10 < 9; $$10++) {
         this.a(new crq($$0, $$10, 8 + $$10 * 18, 142));
      }

      this.a(new crq($$0, 40, 77, 62) {
         @Override
         public void a(cuq $$0, cuq $$1) {
            $$2.a(bsy.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public Pair<akr, akr> b() {
            return Pair.of(cqw.x, cqw.C);
         }
      });
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cnb $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(czb<cyq> $$0) {
      return $$0.b().a(this.G.aE_(), this.I.dO());
   }

   @Override
   public void a(bqk $$0) {
      cqm.a(this, this.I.dO(), this.I, this.G, this.H, null);
   }

   @Override
   public void a(cmx $$0) {
      super.a($$0);
      this.H.a();
      if (!$$0.dO().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean b(cmx $$0) {
      return true;
   }

   @Override
   public cuq b(cmx $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         bsy $$5 = $$0.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cuq.l;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cuq.l;
            }
         } else if ($$5.a() == bsy.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cuq.l;
            }
         } else if ($$5 == bsy.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cuq.l;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cuq.l;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cuq.l;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.a(cuq.l, $$2);
         } else {
            $$3.c();
         }

         if ($$4.H() == $$2.H()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuq $$0, crq $$1) {
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

   public cql r() {
      return this.G;
   }

   @Override
   public crj t() {
      return crj.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
