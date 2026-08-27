import com.mojang.datafixers.util.Pair;

public class cce extends ccp<cbt> {
   public static final int k = 0;
   public static final int l = 0;
   public static final int m = 1;
   public static final int n = 5;
   public static final int o = 5;
   public static final int p = 9;
   public static final int q = 9;
   public static final int r = 36;
   public static final int s = 36;
   public static final int t = 45;
   public static final int u = 45;
   public static final acq v = new acq("textures/atlas/blocks.png");
   public static final acq w = new acq("item/empty_armor_slot_helmet");
   public static final acq x = new acq("item/empty_armor_slot_chestplate");
   public static final acq y = new acq("item/empty_armor_slot_leggings");
   public static final acq z = new acq("item/empty_armor_slot_boots");
   public static final acq A = new acq("item/empty_armor_slot_shield");
   static final acq[] C = new acq[]{z, y, x, w};
   private static final bfo[] D = new bfo[]{bfo.f, bfo.e, bfo.d, bfo.c};
   private final cbt E = new cdc(this, 2, 2);
   private final ccs F = new ccs();
   public final boolean B;
   private final byo G;

   public cce(byn $$0, boolean $$1, final byo $$2) {
      super(null, 0);
      this.B = $$1;
      this.G = $$2;
      this.a(new cct($$0.m, this.E, this.F, 0, 154, 28));

      for (int $$3 = 0; $$3 < 2; $$3++) {
         for (int $$4 = 0; $$4 < 2; $$4++) {
            this.a(new ccx(this.E, $$4 + $$3 * 2, 98 + $$4 * 18, 18 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 4; $$5++) {
         final bfo $$6 = D[$$5];
         this.a(new ccx($$0, 39 - $$5, 8, 8 + $$5 * 18) {
            @Override
            public void d(cfz $$0) {
               cce.a($$2, $$6, $$0, this.e());
               super.d($$0);
            }

            @Override
            public int a() {
               return 1;
            }

            @Override
            public boolean a(cfz $$0) {
               return $$6 == bgb.h($$0);
            }

            @Override
            public boolean a(byo $$0) {
               cfz $$1 = this.e();
               return !$$1.b() && !$$0.f() && cki.d($$1) ? false : super.a($$0);
            }

            @Override
            public Pair<acq, acq> c() {
               return Pair.of(cce.v, cce.C[$$6.b()]);
            }
         });
      }

      for (int $$7 = 0; $$7 < 3; $$7++) {
         for (int $$8 = 0; $$8 < 9; $$8++) {
            this.a(new ccx($$0, $$8 + ($$7 + 1) * 9, 8 + $$8 * 18, 84 + $$7 * 18));
         }
      }

      for (int $$9 = 0; $$9 < 9; $$9++) {
         this.a(new ccx($$0, $$9, 8 + $$9 * 18, 142));
      }

      this.a(new ccx($$0, 40, 77, 62) {
         @Override
         public void d(cfz $$0) {
            cce.a($$2, bfo.b, $$0, this.e());
            super.d($$0);
         }

         @Override
         public Pair<acq, acq> c() {
            return Pair.of(cce.v, cce.A);
         }
      });
   }

   static void a(byo $$0, bfo $$1, cfz $$2, cfz $$3) {
      cfa $$4 = cfa.c_($$2);
      if ($$4 != null) {
         $$0.a($$1, $$3, $$2);
      }
   }

   public static boolean f(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(bys $$0) {
      this.E.a($$0);
   }

   @Override
   public void l() {
      this.F.a();
      this.E.a();
   }

   @Override
   public boolean a(cjc<? super cbt> $$0) {
      return $$0.a(this.E, this.G.dI());
   }

   @Override
   public void a(bdq $$0) {
      cbu.a(this, this.G.dI(), this.G, this.E, this.F);
   }

   @Override
   public void b(byo $$0) {
      super.b($$0);
      this.F.a();
      if (!$$0.dI().B) {
         this.a($$0, this.E);
      }
   }

   @Override
   public boolean a(byo $$0) {
      return true;
   }

   @Override
   public cfz a(byo $$0, int $$1) {
      cfz $$2 = cfz.b;
      ccx $$3 = this.i.get($$1);
      if ($$3.f()) {
         cfz $$4 = $$3.e();
         $$2 = $$4.p();
         bfo $$5 = bgb.h($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return cfz.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return cfz.b;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return cfz.b;
            }
         } else if ($$5.a() == bfo.a.b && !this.i.get(8 - $$5.b()).f()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return cfz.b;
            }
         } else if ($$5 == bfo.b && !this.i.get(45).f()) {
            if (!this.a($$4, 45, 46, false)) {
               return cfz.b;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return cfz.b;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return cfz.b;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return cfz.b;
         }

         if ($$4.b()) {
            $$3.d(cfz.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return cfz.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cfz $$0, ccx $$1) {
      return $$1.d != this.F && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.E.f();
   }

   @Override
   public int o() {
      return this.E.g();
   }

   @Override
   public int p() {
      return 5;
   }

   public cbt q() {
      return this.E;
   }

   @Override
   public ccq t() {
      return ccq.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
