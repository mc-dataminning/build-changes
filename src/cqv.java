import com.mojang.datafixers.util.Pair;

public class cqv extends crh<cqk> {
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
   public static final alf x = new alf("textures/atlas/blocks.png");
   public static final alf y = new alf("item/empty_armor_slot_helmet");
   public static final alf z = new alf("item/empty_armor_slot_chestplate");
   public static final alf A = new alf("item/empty_armor_slot_leggings");
   public static final alf B = new alf("item/empty_armor_slot_boots");
   public static final alf C = new alf("item/empty_armor_slot_shield");
   static final alf[] E = new alf[]{B, A, z, y};
   private static final btb[] F = new btb[]{btb.f, btb.e, btb.d, btb.c};
   private final cqk G = new crw(this, 2, 2);
   private final crk H = new crk();
   public final boolean D;
   private final cmx I;

   public cqv(cmw $$0, boolean $$1, final cmx $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new crl($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new crp(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final btb $$6 = F[$$5];
         this.a(new crp($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cup $$0, cup $$1) {
               cqv.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cup $$0) {
               return $$6 == btr.h($$0);
            }

            @Override
            public boolean a(cmx $$0) {
               cup $$1 = this.g();
               return !$$1.e() && !$$0.f() && dab.f($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<alf, alf> c() {
               return Pair.of(cqv.x, cqv.E[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new crp($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new crp($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new crp($$0, 40, 77, 62) {
         @Override
         public void a(cup $$0, cup $$1) {
            cqv.a($$2, btb.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<alf, alf> c() {
            return Pair.of(cqv.x, cqv.C);
         }
      });
   }

   static void a(cmx $$0, btb $$1, cup $$2, cup $$3) {
      $$0.a($$1, $$3, $$2);
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
   public boolean a(cyx<? extends cyv<cqk>> $$0) {
      return $$0.b().a(this.G, this.I.dP());
   }

   @Override
   public void a(bqn $$0) {
      cql.a(this, this.I.dP(), this.I, this.G, this.H);
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.H.a();
      if (!$$0.dP().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean a(cmx $$0) {
      return true;
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         btb $$5 = btr.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cup.l;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cup.l;
            }
         } else if ($$5.a() == btb.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cup.l;
            }
         } else if ($$5 == btb.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cup.l;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cup.l;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cup.l;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.a(cup.l, $$2);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cup $$0, crp $$1) {
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

   public cqk q() {
      return this.G;
   }

   @Override
   public cri t() {
      return cri.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
