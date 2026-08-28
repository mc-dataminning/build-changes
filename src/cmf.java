import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cmf {
   public static final int a = 8;
   public static final int b = 4;
   private static final bra c = bae.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bra j = bra.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bvl<?> a(bvl<cme> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<cme> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new bxi(45, 90), new bxm()));
   }

   private static void c(bvl<cme> $$0) {
      $$0.a(
         cpm.b,
         10,
         ImmutableList.of(
            bwb.a(cdn.aw, 200),
            new bvw(btv.Z, 0.6F, 2),
            byg.a(cdn.aw, 1.0F, 8, true),
            byo.a(cmf::d),
            bzp.a(cme::t, byg.b(cdn.aq, 0.4F, 8, false)),
            byc.a(8.0F, bra.a(30, 60)),
            bvz.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bvl<cme> $$0) {
      $$0.a(
         cpm.k,
         10,
         ImmutableList.of(
            bwb.a(cdn.aw, 200), new bvw(btv.Z, 0.6F, 2), byh.a(1.0F), bzp.a(cme::t, bxj.a(40)), bzp.a(bth::o_, bxj.a(15)), byr.a(), bwo.a(cmf::i, cdn.o)
         ),
         cdn.o
      );
   }

   private static void e(bvl<cme> $$0) {
      $$0.a(cpm.n, 10, ImmutableList.of(byg.b(cdn.z, 1.3F, 15, false), a(), byc.a(8.0F, bra.a(30, 60)), bwo.a(cmf::e, cdn.z)), cdn.z);
   }

   private static bxz<cme> a() {
      return new bxz<>(ImmutableList.of(Pair.of(bxu.a(0.4F), 2), Pair.of(byj.a(0.4F, 3), 2), Pair.of(new bwm(30, 60), 1)));
   }

   protected static void a(cme $$0) {
      bvl<cme> $$1 = $$0.dX();
      cpm $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpm.k, cpm.n, cpm.b));
      cpm $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cdn.o));
   }

   protected static void a(cme $$0, buk $$1) {
      if (!$$0.o_()) {
         if ($$1.ao() == btv.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cme $$0, buk $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cme $$0, buk $$1) {
      bvl<cme> $$3 = $$0.dX();
      buk $$2 = bwe.a($$0, $$3.c(cdn.z), $$1);
      $$2 = bwe.a($$0, $$3.c(cdn.o), $$2);
      e($$0, $$2);
   }

   private static void e(cme $$0, buk $$1) {
      $$0.dX().b(cdn.o);
      $$0.dX().b(cdn.m);
      $$0.dX().a(cdn.z, $$1, (long)c.a($$0.dS().z));
   }

   private static Optional<? extends buk> d(cme $$0) {
      return !c($$0) && !i($$0) ? $$0.dX().c(cdn.l) : Optional.empty();
   }

   static boolean a(cme $$0, je $$1) {
      Optional<je> $$2 = $$0.dX().c(cdn.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cme $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cme $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dX().c(cdn.as).orElse(0);
         int $$2 = $$0.dX().c(cdn.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cme $$0, buk $$1) {
      bvl<cme> $$2 = $$0.dX();
      $$2.b(cdn.ax);
      $$2.b(cdn.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cme $$0, buk $$1) {
      if (!$$0.dX().c(cpm.n) || $$1.ao() != btv.aA) {
         if ($$1.ao() != btv.Z) {
            if (!bwe.a($$0, $$1, 4.0)) {
               if (cet.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cme $$0, buk $$1) {
      bvl<cme> $$2 = $$0.dX();
      $$2.b(cdn.E);
      $$2.b(cdn.r);
      $$2.a(cdn.o, $$1, 200L);
   }

   private static void h(cme $$0, buk $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cme $$0, buk $$1) {
      if (!c($$0)) {
         Optional<buk> $$2 = $$0.dX().c(cdn.o);
         buk $$3 = bwe.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<awd> b(cme $$0) {
      return $$0.dX().g().map($$1 -> a($$0, $$1));
   }

   private static awd a(cme $$0, cpm $$1) {
      if ($$1 == cpm.n || $$0.y()) {
         return awe.mv;
      } else if ($$1 == cpm.k) {
         return awe.mq;
      } else {
         return h($$0) ? awe.mv : awe.mp;
      }
   }

   private static List<cme> g(cme $$0) {
      return $$0.dX().c(cdn.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cme $$0) {
      return $$0.dX().a(cdn.aw);
   }

   private static boolean i(cme $$0) {
      return $$0.dX().a(cdn.r);
   }

   protected static boolean c(cme $$0) {
      return $$0.dX().a(cdn.ax);
   }
}
