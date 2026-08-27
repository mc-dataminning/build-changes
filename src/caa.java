import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class caa {
   public static final int a = 8;
   public static final int b = 4;
   private static final bge c = asp.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bge j = bge.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bkb<?> a(bkb<bzz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkb<bzz> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new blx(45, 90), new bmb()));
   }

   private static void c(bkb<bzz> $$0) {
      $$0.a(
         cda.b,
         10,
         ImmutableList.of(
            bkr.a(bsc.av, 200),
            new bkm(bip.W, 0.6F),
            bmv.a(bsc.av, 1.0F, 8, true),
            bnd.a(caa::d),
            boe.a(bzz::q, bmv.b(bsc.ap, 0.4F, 8, false)),
            bmr.a(8.0F, bge.a(30, 60)),
            bkp.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bkb<bzz> $$0) {
      $$0.a(
         cda.k,
         10,
         ImmutableList.of(
            bkr.a(bsc.av, 200), new bkm(bip.W, 0.6F), bmw.a(1.0F), boe.a(bzz::q, bly.a(40)), boe.a(big::i_, bly.a(15)), bng.a(), ble.a(caa::i, bsc.o)
         ),
         bsc.o
      );
   }

   private static void e(bkb<bzz> $$0) {
      $$0.a(cda.n, 10, ImmutableList.of(bmv.b(bsc.z, 1.3F, 15, false), a(), bmr.a(8.0F, bge.a(30, 60)), ble.a(caa::e, bsc.z)), bsc.z);
   }

   private static bmo<bzz> a() {
      return new bmo<>(ImmutableList.of(Pair.of(bmj.a(0.4F), 2), Pair.of(bmy.a(0.4F, 3), 2), Pair.of(new blc(30, 60), 1)));
   }

   protected static void a(bzz $$0) {
      bkb<bzz> $$1 = $$0.dM();
      cda $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cda.k, cda.n, cda.b));
      cda $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsc.o));
   }

   protected static void a(bzz $$0, bjb $$1) {
      if (!$$0.i_()) {
         if ($$1.ag() == bip.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(bzz $$0, bjb $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(bzz $$0, bjb $$1) {
      bkb<bzz> $$3 = $$0.dM();
      bjb $$2 = bku.a($$0, $$3.c(bsc.z), $$1);
      $$2 = bku.a($$0, $$3.c(bsc.o), $$2);
      e($$0, $$2);
   }

   private static void e(bzz $$0, bjb $$1) {
      $$0.dM().b(bsc.o);
      $$0.dM().b(bsc.m);
      $$0.dM().a(bsc.z, $$1, (long)c.a($$0.dK().z));
   }

   private static Optional<? extends bjb> d(bzz $$0) {
      return !c($$0) && !i($$0) ? $$0.dM().c(bsc.l) : Optional.empty();
   }

   static boolean a(bzz $$0, gw $$1) {
      Optional<gw> $$2 = $$0.dM().c(bsc.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(bzz $$0) {
      return $$0.q() && !f($$0);
   }

   private static boolean f(bzz $$0) {
      if ($$0.i_()) {
         return false;
      } else {
         int $$1 = $$0.dM().c(bsc.ar).orElse(0);
         int $$2 = $$0.dM().c(bsc.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(bzz $$0, bjb $$1) {
      bkb<bzz> $$2 = $$0.dM();
      $$2.b(bsc.aw);
      $$2.b(bsc.r);
      if ($$0.i_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(bzz $$0, bjb $$1) {
      if (!$$0.dM().c(cda.n) || $$1.ag() != bip.aw) {
         if ($$1.ag() != bip.W) {
            if (!bku.a($$0, $$1, 4.0)) {
               if (btg.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(bzz $$0, bjb $$1) {
      bkb<bzz> $$2 = $$0.dM();
      $$2.b(bsc.E);
      $$2.b(bsc.r);
      $$2.a(bsc.o, $$1, 200L);
   }

   private static void h(bzz $$0, bjb $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(bzz $$0, bjb $$1) {
      if (!c($$0)) {
         Optional<bjb> $$2 = $$0.dM().c(bsc.o);
         bjb $$3 = bku.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<aoy> b(bzz $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static aoy a(bzz $$0, cda $$1) {
      if ($$1 == cda.n || $$0.t()) {
         return aoz.kS;
      } else if ($$1 == cda.k) {
         return aoz.kN;
      } else {
         return h($$0) ? aoz.kS : aoz.kM;
      }
   }

   private static List<bzz> g(bzz $$0) {
      return $$0.dM().c(bsc.ao).orElse(ImmutableList.of());
   }

   private static boolean h(bzz $$0) {
      return $$0.dM().a(bsc.av);
   }

   private static boolean i(bzz $$0) {
      return $$0.dM().a(bsc.r);
   }

   protected static boolean c(bzz $$0) {
      return $$0.dM().a(bsc.aw);
   }
}
