import java.util.List;
import java.util.Map;

public class cxe extends cwc {
   public static final int o = 0;
   public static final int p = 0;
   private static final int H = 2;
   private static final int I = 2;
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
   public static final alr B = alr.b("container/slot/helmet");
   public static final alr C = alr.b("container/slot/chestplate");
   public static final alr D = alr.b("container/slot/leggings");
   public static final alr E = alr.b("container/slot/boots");
   public static final alr F = alr.b("container/slot/shield");
   private static final Map<bxo, alr> J = Map.of(bxo.c, E, bxo.d, D, bxo.e, C, bxo.f, B);
   private static final bxo[] K = new bxo[]{bxo.f, bxo.e, bxo.d, bxo.c};
   public final boolean G;
   private final csi L;

   public cxe(csh $$0, boolean $$1, final csi $$2) {
      super(null, 0, 2, 2);
      this.G = $$1;
      this.L = $$2;
      this.a($$2, 154, 28);
      this.d(98, 18);

      for (int $$3 = 0; $$3 < 4; $$3++) {
         bxo $$4 = K[$$3];
         alr $$5 = J.get($$4);
         this.a(new cwf($$0, $$2, $$4, 39 - $$3, 8, 8 + $$3 * 18, $$5));
      }

      this.c($$0, 8, 84);
      this.a(new cxz($$0, 40, 77, 62) {
         @Override
         public void a(dak $$0, dak $$1) {
            $$2.a(bxo.b, $$1, $$0);
            super.a($$0, $$1);
         }

         @Override
         public alr c() {
            return cxe.F;
         }
      });
   }

   public static boolean e(int $$0) {
      return $$0 >= 36 && $$0 < 45 || $$0 == 45;
   }

   @Override
   public void a(buv $$0) {
      if (this.L.dV() instanceof asb $$1) {
         cwu.a(this, $$1, this.L, this.m, this.n, null);
      }
   }

   @Override
   public void a(csi $$0) {
      super.a($$0);
      this.n.a();
      if (!$$0.dV().C) {
         this.a($$0, this.m);
      }
   }

   @Override
   public boolean b(csi $$0) {
      return true;
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3.h()) {
         dak $$4 = $$3.g();
         $$2 = $$4.v();
         bxo $$5 = $$0.f($$2);
         if ($$1 == 0) {
            if (!this.a($$4, 9, 45, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 1 && $$1 < 5) {
            if (!this.a($$4, 9, 45, false)) {
               return dak.l;
            }
         } else if ($$1 >= 5 && $$1 < 9) {
            if (!this.a($$4, 9, 45, false)) {
               return dak.l;
            }
         } else if ($$5.a() == bxo.a.b && !this.k.get(8 - $$5.b()).h()) {
            int $$6 = 8 - $$5.b();
            if (!this.a($$4, $$6, $$6 + 1, false)) {
               return dak.l;
            }
         } else if ($$5 == bxo.b && !this.k.get(45).h()) {
            if (!this.a($$4, 45, 46, false)) {
               return dak.l;
            }
         } else if ($$1 >= 9 && $$1 < 36) {
            if (!this.a($$4, 36, 45, false)) {
               return dak.l;
            }
         } else if ($$1 >= 36 && $$1 < 45) {
            if (!this.a($$4, 9, 36, false)) {
               return dak.l;
            }
         } else if (!this.a($$4, 9, 45, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.a(dak.l, $$2);
         } else {
            $$3.d();
         }

         if ($$4.M() == $$2.M()) {
            return dak.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(dak $$0, cxz $$1) {
      return $$1.c != this.n && super.a($$0, $$1);
   }

   @Override
   public cxz m() {
      return this.k.get(0);
   }

   @Override
   public List<cxz> n() {
      return this.k.subList(1, 5);
   }

   public cwt r() {
      return this.m;
   }

   @Override
   public cxr ao_() {
      return cxr.a;
   }

   @Override
   protected csi q() {
      return this.L;
   }
}
