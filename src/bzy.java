import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class bzy {
   public static final int a = 8;
   public static final int b = 4;
   private static final bgb c = asm.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bgb j = bgb.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bjz<?> a(bjz<bzx> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjz<bzx> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new blv(45, 90), new blz()));
   }

   private static void c(bjz<bzx> $$0) {
      $$0.a(
         ccy.b,
         10,
         ImmutableList.of(
            bkp.a(bsa.av, 200),
            new bkk(bim.W, 0.6F),
            bmt.a(bsa.av, 1.0F, 8, true),
            bnb.a(bzy::d),
            boc.a(bzx::q, bmt.b(bsa.ap, 0.4F, 8, false)),
            bmp.a(8.0F, bgb.a(30, 60)),
            bkn.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bjz<bzx> $$0) {
      $$0.a(
         ccy.k,
         10,
         ImmutableList.of(
            bkp.a(bsa.av, 200), new bkk(bim.W, 0.6F), bmu.a(1.0F), boc.a(bzx::q, blw.a(40)), boc.a(bid::i_, blw.a(15)), bne.a(), blc.a(bzy::i, bsa.o)
         ),
         bsa.o
      );
   }

   private static void e(bjz<bzx> $$0) {
      $$0.a(ccy.n, 10, ImmutableList.of(bmt.b(bsa.z, 1.3F, 15, false), a(), bmp.a(8.0F, bgb.a(30, 60)), blc.a(bzy::e, bsa.z)), bsa.z);
   }

   private static bmm<bzx> a() {
      return new bmm<>(ImmutableList.of(Pair.of(bmh.a(0.4F), 2), Pair.of(bmw.a(0.4F, 3), 2), Pair.of(new bla(30, 60), 1)));
   }

   protected static void a(bzx $$0) {
      bjz<bzx> $$1 = $$0.dM();
      ccy $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccy.k, ccy.n, ccy.b));
      ccy $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsa.o));
   }

   protected static void a(bzx $$0, biy $$1) {
      if (!$$0.i_()) {
         if ($$1.ag() == bim.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(bzx $$0, biy $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(bzx $$0, biy $$1) {
      bjz<bzx> $$3 = $$0.dM();
      biy $$2 = bks.a($$0, $$3.c(bsa.z), $$1);
      $$2 = bks.a($$0, $$3.c(bsa.o), $$2);
      e($$0, $$2);
   }

   private static void e(bzx $$0, biy $$1) {
      $$0.dM().b(bsa.o);
      $$0.dM().b(bsa.m);
      $$0.dM().a(bsa.z, $$1, (long)c.a($$0.dK().z));
   }

   private static Optional<? extends biy> d(bzx $$0) {
      return !c($$0) && !i($$0) ? $$0.dM().c(bsa.l) : Optional.empty();
   }

   static boolean a(bzx $$0, gu $$1) {
      Optional<gu> $$2 = $$0.dM().c(bsa.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(bzx $$0) {
      return $$0.q() && !f($$0);
   }

   private static boolean f(bzx $$0) {
      if ($$0.i_()) {
         return false;
      } else {
         int $$1 = $$0.dM().c(bsa.ar).orElse(0);
         int $$2 = $$0.dM().c(bsa.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(bzx $$0, biy $$1) {
      bjz<bzx> $$2 = $$0.dM();
      $$2.b(bsa.aw);
      $$2.b(bsa.r);
      if ($$0.i_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(bzx $$0, biy $$1) {
      if (!$$0.dM().c(ccy.n) || $$1.ag() != bim.aw) {
         if ($$1.ag() != bim.W) {
            if (!bks.a($$0, $$1, 4.0)) {
               if (bte.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(bzx $$0, biy $$1) {
      bjz<bzx> $$2 = $$0.dM();
      $$2.b(bsa.E);
      $$2.b(bsa.r);
      $$2.a(bsa.o, $$1, 200L);
   }

   private static void h(bzx $$0, biy $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(bzx $$0, biy $$1) {
      if (!c($$0)) {
         Optional<biy> $$2 = $$0.dM().c(bsa.o);
         biy $$3 = bks.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aov> b(bzx $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static aov a(bzx $$0, ccy $$1) {
      if ($$1 == ccy.n || $$0.t()) {
         return aow.kS;
      } else if ($$1 == ccy.k) {
         return aow.kN;
      } else {
         return h($$0) ? aow.kS : aow.kM;
      }
   }

   private static List<bzx> g(bzx $$0) {
      return $$0.dM().c(bsa.ao).orElse(ImmutableList.of());
   }

   private static boolean h(bzx $$0) {
      return $$0.dM().a(bsa.av);
   }

   private static boolean i(bzx $$0) {
      return $$0.dM().a(bsa.r);
   }

   protected static boolean c(bzx $$0) {
      return $$0.dM().a(bsa.aw);
   }
}
