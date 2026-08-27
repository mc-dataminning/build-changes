import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class bzw {
   public static final int a = 8;
   public static final int b = 4;
   private static final bfz c = ask.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bfz j = bfz.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bjx<?> a(bjx<bzv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjx<bzv> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new blt(45, 90), new blx()));
   }

   private static void c(bjx<bzv> $$0) {
      $$0.a(
         ccw.b,
         10,
         ImmutableList.of(
            bkn.a(bry.av, 200),
            new bki(bik.W, 0.6F),
            bmr.a(bry.av, 1.0F, 8, true),
            bmz.a(bzw::d),
            boa.a(bzv::q, bmr.b(bry.ap, 0.4F, 8, false)),
            bmn.a(8.0F, bfz.a(30, 60)),
            bkl.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bjx<bzv> $$0) {
      $$0.a(
         ccw.k,
         10,
         ImmutableList.of(
            bkn.a(bry.av, 200), new bki(bik.W, 0.6F), bms.a(1.0F), boa.a(bzv::q, blu.a(40)), boa.a(bib::i_, blu.a(15)), bnc.a(), bla.a(bzw::i, bry.o)
         ),
         bry.o
      );
   }

   private static void e(bjx<bzv> $$0) {
      $$0.a(ccw.n, 10, ImmutableList.of(bmr.b(bry.z, 1.3F, 15, false), a(), bmn.a(8.0F, bfz.a(30, 60)), bla.a(bzw::e, bry.z)), bry.z);
   }

   private static bmk<bzv> a() {
      return new bmk<>(ImmutableList.of(Pair.of(bmf.a(0.4F), 2), Pair.of(bmu.a(0.4F, 3), 2), Pair.of(new bky(30, 60), 1)));
   }

   protected static void a(bzv $$0) {
      bjx<bzv> $$1 = $$0.dM();
      ccw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccw.k, ccw.n, ccw.b));
      ccw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bry.o));
   }

   protected static void a(bzv $$0, biw $$1) {
      if (!$$0.i_()) {
         if ($$1.ag() == bik.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(bzv $$0, biw $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(bzv $$0, biw $$1) {
      bjx<bzv> $$3 = $$0.dM();
      biw $$2 = bkq.a($$0, $$3.c(bry.z), $$1);
      $$2 = bkq.a($$0, $$3.c(bry.o), $$2);
      e($$0, $$2);
   }

   private static void e(bzv $$0, biw $$1) {
      $$0.dM().b(bry.o);
      $$0.dM().b(bry.m);
      $$0.dM().a(bry.z, $$1, (long)c.a($$0.dK().z));
   }

   private static Optional<? extends biw> d(bzv $$0) {
      return !c($$0) && !i($$0) ? $$0.dM().c(bry.l) : Optional.empty();
   }

   static boolean a(bzv $$0, gv $$1) {
      Optional<gv> $$2 = $$0.dM().c(bry.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(bzv $$0) {
      return $$0.q() && !f($$0);
   }

   private static boolean f(bzv $$0) {
      if ($$0.i_()) {
         return false;
      } else {
         int $$1 = $$0.dM().c(bry.ar).orElse(0);
         int $$2 = $$0.dM().c(bry.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(bzv $$0, biw $$1) {
      bjx<bzv> $$2 = $$0.dM();
      $$2.b(bry.aw);
      $$2.b(bry.r);
      if ($$0.i_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(bzv $$0, biw $$1) {
      if (!$$0.dM().c(ccw.n) || $$1.ag() != bik.aw) {
         if ($$1.ag() != bik.W) {
            if (!bkq.a($$0, $$1, 4.0)) {
               if (btc.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(bzv $$0, biw $$1) {
      bjx<bzv> $$2 = $$0.dM();
      $$2.b(bry.E);
      $$2.b(bry.r);
      $$2.a(bry.o, $$1, 200L);
   }

   private static void h(bzv $$0, biw $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(bzv $$0, biw $$1) {
      if (!c($$0)) {
         Optional<biw> $$2 = $$0.dM().c(bry.o);
         biw $$3 = bkq.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aot> b(bzv $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static aot a(bzv $$0, ccw $$1) {
      if ($$1 == ccw.n || $$0.t()) {
         return aou.kS;
      } else if ($$1 == ccw.k) {
         return aou.kN;
      } else {
         return h($$0) ? aou.kS : aou.kM;
      }
   }

   private static List<bzv> g(bzv $$0) {
      return $$0.dM().c(bry.ao).orElse(ImmutableList.of());
   }

   private static boolean h(bzv $$0) {
      return $$0.dM().a(bry.av);
   }

   private static boolean i(bzv $$0) {
      return $$0.dM().a(bry.r);
   }

   protected static boolean c(bzv $$0) {
      return $$0.dM().a(bry.aw);
   }
}
