import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cne {
   public static final int a = 8;
   public static final int b = 4;
   private static final brt c = baa.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final brt j = brt.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bwh<?> a(bwh<cnd> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwh<cnd> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bye(45, 90), new byi()));
   }

   private static void c(bwh<cnd> $$0) {
      $$0.a(
         cqm.b,
         10,
         ImmutableList.of(
            bwx.a(cej.aw, 200),
            new bws(buq.aj, 0.6F, 2),
            bzc.a(cej.aw, 1.0F, 8, true),
            bzk.a(cne::a),
            cal.a(cnd::t, bzc.b(cej.aq, 0.4F, 8, false)),
            byy.a(8.0F, brt.a(30, 60)),
            bwv.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bwh<cnd> $$0) {
      $$0.a(
         cqm.k,
         10,
         ImmutableList.of(
            bwx.a(cej.aw, 200), new bws(buq.aj, 0.6F, 2), bzd.a(1.0F), cal.a(cnd::t, byf.a(40)), cal.a(bua::e_, byf.a(15)), bzn.a(), bxk.a(cne::h, cej.o)
         ),
         cej.o
      );
   }

   private static void e(bwh<cnd> $$0) {
      $$0.a(cqm.n, 10, ImmutableList.of(bzc.b(cej.z, 1.3F, 15, false), a(), byy.a(8.0F, brt.a(30, 60)), bxk.a(cne::d, cej.z)), cej.z);
   }

   private static byv<cnd> a() {
      return new byv<>(ImmutableList.of(Pair.of(byq.a(0.4F), 2), Pair.of(bzf.a(0.4F, 3), 2), Pair.of(new bxi(30, 60), 1)));
   }

   protected static void a(cnd $$0) {
      bwh<cnd> $$1 = $$0.ec();
      cqm $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqm.k, cqm.n, cqm.b));
      cqm $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cej.o));
   }

   protected static void a(cnd $$0, bvf $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == buq.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cnd $$0, bvf $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cnd $$0, bvf $$1) {
      bwh<cnd> $$3 = $$0.ec();
      bvf $$2 = bxa.a($$0, $$3.c(cej.z), $$1);
      $$2 = bxa.a($$0, $$3.c(cej.o), $$2);
      d($$0, $$2);
   }

   private static void d(cnd $$0, bvf $$1) {
      $$0.ec().b(cej.o);
      $$0.ec().b(cej.m);
      $$0.ec().a(cej.z, $$1, (long)c.a($$0.dW().A));
   }

   private static Optional<? extends bvf> a(arc $$0, cnd $$1) {
      return !c($$1) && !h($$1) ? $$1.ec().c(cej.l) : Optional.empty();
   }

   static boolean a(cnd $$0, ji $$1) {
      Optional<ji> $$2 = $$0.ec().c(cej.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cnd $$0) {
      return $$0.t() && !e($$0);
   }

   private static boolean e(cnd $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.ec().c(cej.as).orElse(0);
         int $$2 = $$0.ec().c(cej.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(arc $$0, cnd $$1, bvf $$2) {
      bwh<cnd> $$3 = $$1.ec();
      $$3.b(cej.ax);
      $$3.b(cej.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(arc $$0, cnd $$1, bvf $$2) {
      if (!$$1.ec().c(cqm.n) || $$2.aq() != buq.aR) {
         if ($$2.aq() != buq.aj) {
            if (!bxa.a($$1, $$2, 4.0)) {
               if (cfp.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cnd $$0, bvf $$1) {
      bwh<cnd> $$2 = $$0.ec();
      $$2.b(cej.E);
      $$2.b(cej.r);
      $$2.a(cej.o, $$1, 200L);
   }

   private static void f(cnd $$0, bvf $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cnd $$0, bvf $$1) {
      if (!c($$0)) {
         Optional<bvf> $$2 = $$0.ec().c(cej.o);
         bvf $$3 = bxa.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<avy> b(cnd $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static avy a(cnd $$0, cqm $$1) {
      if ($$1 == cqm.n || $$0.gp()) {
         return avz.mS;
      } else if ($$1 == cqm.k) {
         return avz.mN;
      } else {
         return g($$0) ? avz.mS : avz.mM;
      }
   }

   private static List<cnd> f(cnd $$0) {
      return $$0.ec().c(cej.ap).orElse(ImmutableList.of());
   }

   private static boolean g(cnd $$0) {
      return $$0.ec().a(cej.aw);
   }

   private static boolean h(cnd $$0) {
      return $$0.ec().a(cej.r);
   }

   protected static boolean c(cnd $$0) {
      return $$0.ec().a(cej.ax);
   }
}
