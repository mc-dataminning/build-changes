import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cnd {
   public static final int a = 8;
   public static final int b = 4;
   private static final brv c = bao.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final brv j = brv.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bwj<?> a(bwj<cnc> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cql.a));
      $$0.b(cql.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<cnc> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new byg(45, 90), new byk()));
   }

   private static void c(bwj<cnc> $$0) {
      $$0.a(
         cql.b,
         10,
         ImmutableList.of(
            bwz.a(cel.aw, 200),
            new bwu(bus.ai, 0.6F, 2),
            bze.a(cel.aw, 1.0F, 8, true),
            bzm.a(cnd::a),
            can.a(cnc::q, bze.b(cel.aq, 0.4F, 8, false)),
            bza.a(8.0F, brv.a(30, 60)),
            bwx.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bwj<cnc> $$0) {
      $$0.a(
         cql.k,
         10,
         ImmutableList.of(
            bwz.a(cel.aw, 200), new bwu(bus.ai, 0.6F, 2), bzf.a(1.0F), can.a(cnc::q, byh.a(40)), can.a(buc::e_, byh.a(15)), bzp.a(), bxm.a(cnd::h, cel.o)
         ),
         cel.o
      );
   }

   private static void e(bwj<cnc> $$0) {
      $$0.a(cql.n, 10, ImmutableList.of(bze.b(cel.z, 1.3F, 15, false), a(), bza.a(8.0F, brv.a(30, 60)), bxm.a(cnd::d, cel.z)), cel.z);
   }

   private static byx<cnc> a() {
      return new byx<>(ImmutableList.of(Pair.of(bys.a(0.4F), 2), Pair.of(bzh.a(0.4F, 3), 2), Pair.of(new bxk(30, 60), 1)));
   }

   protected static void a(cnc $$0) {
      bwj<cnc> $$1 = $$0.eb();
      cql $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cql.k, cql.n, cql.b));
      cql $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cel.o));
   }

   protected static void a(cnc $$0, bvh $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == bus.aO && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cnc $$0, bvh $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cnc $$0, bvh $$1) {
      bwj<cnc> $$3 = $$0.eb();
      bvh $$2 = bxc.a($$0, $$3.c(cel.z), $$1);
      $$2 = bxc.a($$0, $$3.c(cel.o), $$2);
      d($$0, $$2);
   }

   private static void d(cnc $$0, bvh $$1) {
      $$0.eb().b(cel.o);
      $$0.eb().b(cel.m);
      $$0.eb().a(cel.z, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bvh> a(arp $$0, cnc $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cel.l) : Optional.empty();
   }

   static boolean a(cnc $$0, jh $$1) {
      Optional<jh> $$2 = $$0.eb().c(cel.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cnc $$0) {
      return $$0.q() && !e($$0);
   }

   private static boolean e(cnc $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cel.as).orElse(0);
         int $$2 = $$0.eb().c(cel.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(arp $$0, cnc $$1, bvh $$2) {
      bwj<cnc> $$3 = $$1.eb();
      $$3.b(cel.ax);
      $$3.b(cel.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(arp $$0, cnc $$1, bvh $$2) {
      if (!$$1.eb().c(cql.n) || $$2.aq() != bus.aO) {
         if ($$2.aq() != bus.ai) {
            if (!bxc.a($$1, $$2, 4.0)) {
               if (cfr.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cnc $$0, bvh $$1) {
      bwj<cnc> $$2 = $$0.eb();
      $$2.b(cel.E);
      $$2.b(cel.r);
      $$2.a(cel.o, $$1, 200L);
   }

   private static void f(cnc $$0, bvh $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cnc $$0, bvh $$1) {
      if (!c($$0)) {
         Optional<bvh> $$2 = $$0.eb().c(cel.o);
         bvh $$3 = bxc.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awm> b(cnc $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cnc $$0, cql $$1) {
      if ($$1 == cql.n || $$0.v()) {
         return awn.mt;
      } else if ($$1 == cql.k) {
         return awn.mo;
      } else {
         return g($$0) ? awn.mt : awn.mn;
      }
   }

   private static List<cnc> f(cnc $$0) {
      return $$0.eb().c(cel.ap).orElse(ImmutableList.of());
   }

   private static boolean g(cnc $$0) {
      return $$0.eb().a(cel.aw);
   }

   private static boolean h(cnc $$0) {
      return $$0.eb().a(cel.r);
   }

   protected static boolean c(cnc $$0) {
      return $$0.eb().a(cel.ax);
   }
}
