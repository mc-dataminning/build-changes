import com.mojang.datafixers.util.Pair;

public class cpw extends cqi<cpl> {
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
   public static final akn x = new akn("textures/atlas/blocks.png");
   public static final akn y = new akn("item/empty_armor_slot_helmet");
   public static final akn z = new akn("item/empty_armor_slot_chestplate");
   public static final akn A = new akn("item/empty_armor_slot_leggings");
   public static final akn B = new akn("item/empty_armor_slot_boots");
   public static final akn C = new akn("item/empty_armor_slot_shield");
   static final akn[] E = new akn[]{B, A, z, y};
   private static final bsd[] F = new bsd[]{bsd.f, bsd.e, bsd.d, bsd.c};
   private final cpl G = new cqx(this, 2, 2);
   private final cql H = new cql();
   public final boolean D;
   private final cly I;

   public cpw(clx $$0, boolean $$1, final cly $$2) {
      super(null, 0);
      this.D = $$1;
      this.I = $$2;
      this.a(new cqm($$0.l, this.G, this.H, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new cqq(this.G, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bsd $$6 = F[$$5];
         this.a(new cqq($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void a(ctq $$0, ctq $$1) {
               cpw.a($$2, $$6, $$0, $$1);
               super.a($$0, $$1);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(ctq $$0) {
               return $$6 == bss.h($$0);
            }

            @Override
            public boolean a(cly $$0) {
               ctq $$1 = this.g();
               return !$$1.e() && !$$0.f() && czc.f($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<akn, akn> c() {
               return Pair.of(cpw.x, cpw.E[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new cqq($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new cqq($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new cqq($$0, 40, 77, 62) {
         @Override
         public void a(ctq $$0, ctq $$1) {
            cpw.a($$2, bsd.b, $$0, $$1);
            super.a($$0, $$1);
         }

         @Override
         public Pair<akn, akn> c() {
            return Pair.of(cpw.x, cpw.C);
         }
      });
   }

   static void a(cly $$0, bsd $$1, ctq $$2, ctq $$3) {
      $$0.a($$1, $$3, $$2);
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(cmc $$0) {
      this.G.a($$0);
   }

   @Override
   public void l() {
      this.H.a();
      this.G.a();
   }

   @Override
   public boolean a(cxy<? extends cxw<cpl>> $$0) {
      return $$0.b().a(this.G, this.I.dP());
   }

   @Override
   public void a(bpp $$0) {
      cpm.a(this, this.I.dP(), this.I, this.G, this.H);
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.H.a();
      if (!$$0.dP().B) {
         this.a($$0, this.G);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         bsd $$5 = bss.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return ctq.i;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return ctq.i;
            }
         } else if ($$5.a() == bsd.a.b && !this.i.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return ctq.i;
            }
         } else if ($$5 == bsd.b && !this.i.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return ctq.i;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return ctq.i;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return ctq.i;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.a(ctq.i, $$2);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ctq $$0, cqq $$1) {
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

   public cpl q() {
      return this.G;
   }

   @Override
   public cqj t() {
      return cqj.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
