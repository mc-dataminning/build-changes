import com.mojang.datafixers.util.Pair;

public class cpu extends cqg<cpj> {
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
   public static final akm x = new akm("textures/atlas/blocks.png");
   public static final akm y = new akm("item/empty_armor_slot_helmet");
   public static final akm z = new akm("item/empty_armor_slot_chestplate");
   public static final akm A = new akm("item/empty_armor_slot_leggings");
   public static final akm B = new akm("item/empty_armor_slot_boots");
   public static final akm C = new akm("item/empty_armor_slot_shield");
   static final akm[] E = new akm[]{B, A, z, y};
   private static final bsb[] F = new bsb[]{bsb.f, bsb.e, bsb.d, bsb.c};
   private final cpj G = new cqv(this, 2, 2);
   private final cqj H = new cqj();
   public final boolean D;
   private final clw I;

   public cpu(clv $$0, boolean $$1, final clw $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new cqk($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cqo(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bsb $$6 = F[$$5];
         this.a(new cqo($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(cto $$0, cto $$1) {
               cpu.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cto $$0) {
               return $$6 == bsq.h($$0);
            }

            @Override
            public boolean a(clw $$0) {
               cto $$1 = this.g();
               return !$$1.e() && !$$0.f() && cza.f($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<akm, akm> c() {
               return Pair.of(cpu.x, cpu.E[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cqo($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cqo($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cqo($$0, 40, 77, 62) {
         @Override
         public void a(cto $$0, cto $$1) {
            cpu.a($$2, bsb.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<akm, akm> c() {
            return Pair.of(cpu.x, cpu.C);
         }
      });
   }

   static void a(clw $$0, bsb $$1, cto $$2, cto $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cma $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(cxw<? extends cxu<cpj>> $$0) {
      return $$0.b().a(this.G, this.I.dP());
   }

   @Override
   public void a(bpn $$0) {
      cpk.a(this, this.I.dP(), this.I, this.G, this.H);
   }

   @Override
   public void b(clw $$0) {
      super.b($$0);
      this.H.a();
      if (!$$0.dP().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean a(clw $$0) {
      return true;
   }

   @Override
   public cto a(clw $$0, int $$1) {
      cto $$2 = cto.i;
      cqo $$3 = this.i.get($$1);
      if ($$3.h()) {
         cto $$4 = $$3.g();
         $$2 = $$4.s();
         bsb $$5 = bsq.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cto.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cto.i;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cto.i;
            }
         } else if ($$5.a() == bsb.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cto.i;
            }
         } else if ($$5 == bsb.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return cto.i;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cto.i;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cto.i;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cto.i;
         }

         if ($$4.e()) {
            $$3.a(cto.i, $$2);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cto.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cto $$0, cqo $$1) {
      return $$1.d != this.H && super.a($$0, $$1);
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

   public cpj q() {
      return this.G;
   }

   @Override
   public cqh t() {
      return cqh.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
