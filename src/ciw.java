import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ciw {
   public static final int a = 8;
   public static final int b = 4;
   private static final bob c = ayv.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bob j = bob.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bsf<?> a(bsf<civ> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<civ> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new buc(45, 90), new bug()));
   }

   private static void c(bsf<civ> $$0) {
      $$0.a(
         cma.b,
         10,
         ImmutableList.of(
            bsv.a(cah.aw, 200),
            new bsq(bqr.Z, 0.6F, 2),
            bva.a(cah.aw, 1.0F, 8, true),
            bvi.a(ciw::d),
            bwj.a(civ::u, bva.b(cah.aq, 0.4F, 8, false)),
            buw.a(8.0F, bob.a(30, 60)),
            bst.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bsf<civ> $$0) {
      $$0.a(
         cma.k,
         10,
         ImmutableList.of(
            bsv.a(cah.aw, 200), new bsq(bqr.Z, 0.6F, 2), bvb.a(1.0F), bwj.a(civ::u, bud.a(40)), bwj.a(bqf::p_, bud.a(15)), bvl.a(), bti.a(ciw::i, cah.o)
         ),
         cah.o
      );
   }

   private static void e(bsf<civ> $$0) {
      $$0.a(cma.n, 10, ImmutableList.of(bva.b(cah.z, 1.3F, 15, false), a(), buw.a(8.0F, bob.a(30, 60)), bti.a(ciw::e, cah.z)), cah.z);
   }

   private static but<civ> a() {
      return new but<>(ImmutableList.of(Pair.of(buo.a(0.4F), 2), Pair.of(bvd.a(0.4F, 3), 2), Pair.of(new btg(30, 60), 1)));
   }

   protected static void a(civ $$0) {
      bsf<civ> $$1 = $$0.dQ();
      cma $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cma.k, cma.n, cma.b));
      cma $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cah.o));
   }

   protected static void a(civ $$0, bre $$1) {
      if (!$$0.p_()) {
         if ($$1.ai() == bqr.az && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(civ $$0, bre $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(civ $$0, bre $$1) {
      bsf<civ> $$3 = $$0.dQ();
      bre $$2 = bsy.a($$0, $$3.c(cah.z), $$1);
      $$2 = bsy.a($$0, $$3.c(cah.o), $$2);
      e($$0, $$2);
   }

   private static void e(civ $$0, bre $$1) {
      $$0.dQ().b(cah.o);
      $$0.dQ().b(cah.m);
      $$0.dQ().a(cah.z, $$1, (long)c.a($$0.dN().z));
   }

   private static Optional<? extends bre> d(civ $$0) {
      return !c($$0) && !i($$0) ? $$0.dQ().c(cah.l) : Optional.empty();
   }

   static boolean a(civ $$0, im $$1) {
      Optional<im> $$2 = $$0.dQ().c(cah.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(civ $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(civ $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dQ().c(cah.as).orElse(0);
         int $$2 = $$0.dQ().c(cah.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(civ $$0, bre $$1) {
      bsf<civ> $$2 = $$0.dQ();
      $$2.b(cah.ax);
      $$2.b(cah.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(civ $$0, bre $$1) {
      if (!$$0.dQ().c(cma.n) || $$1.ai() != bqr.az) {
         if ($$1.ai() != bqr.Z) {
            if (!bsy.a($$0, $$1, 4.0)) {
               if (cbn.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(civ $$0, bre $$1) {
      bsf<civ> $$2 = $$0.dQ();
      $$2.b(cah.E);
      $$2.b(cah.r);
      $$2.a(cah.o, $$1, 200L);
   }

   private static void h(civ $$0, bre $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(civ $$0, bre $$1) {
      if (!c($$0)) {
         Optional<bre> $$2 = $$0.dQ().c(cah.o);
         bre $$3 = bsy.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<auy> b(civ $$0) {
      return $$0.dQ().g().map($$1 -> a($$0, $$1));
   }

   private static auy a(civ $$0, cma $$1) {
      if ($$1 == cma.n || $$0.y()) {
         return auz.mk;
      } else if ($$1 == cma.k) {
         return auz.mf;
      } else {
         return h($$0) ? auz.mk : auz.me;
      }
   }

   private static List<civ> g(civ $$0) {
      return $$0.dQ().c(cah.ap).orElse(ImmutableList.of());
   }

   private static boolean h(civ $$0) {
      return $$0.dQ().a(cah.aw);
   }

   private static boolean i(civ $$0) {
      return $$0.dQ().a(cah.r);
   }

   protected static boolean c(civ $$0) {
      return $$0.dQ().a(cah.ax);
   }
}
