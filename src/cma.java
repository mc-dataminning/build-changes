import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cma {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqv c = bad.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqv j = bqv.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bvg<?> a(bvg<clz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<clz> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new bxd(45, 90), new bxh()));
   }

   private static void c(bvg<clz> $$0) {
      $$0.a(
         cpg.b,
         10,
         ImmutableList.of(
            bvw.a(cdi.aw, 200),
            new bvr(btq.Z, 0.6F, 2),
            byb.a(cdi.aw, 1.0F, 8, true),
            byj.a(cma::d),
            bzk.a(clz::t, byb.b(cdi.aq, 0.4F, 8, false)),
            bxx.a(8.0F, bqv.a(30, 60)),
            bvu.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bvg<clz> $$0) {
      $$0.a(
         cpg.k,
         10,
         ImmutableList.of(
            bvw.a(cdi.aw, 200), new bvr(btq.Z, 0.6F, 2), byc.a(1.0F), bzk.a(clz::t, bxe.a(40)), bzk.a(btc::o_, bxe.a(15)), bym.a(), bwj.a(cma::i, cdi.o)
         ),
         cdi.o
      );
   }

   private static void e(bvg<clz> $$0) {
      $$0.a(cpg.n, 10, ImmutableList.of(byb.b(cdi.z, 1.3F, 15, false), a(), bxx.a(8.0F, bqv.a(30, 60)), bwj.a(cma::e, cdi.z)), cdi.z);
   }

   private static bxu<clz> a() {
      return new bxu<>(ImmutableList.of(Pair.of(bxp.a(0.4F), 2), Pair.of(bye.a(0.4F, 3), 2), Pair.of(new bwh(30, 60), 1)));
   }

   protected static void a(clz $$0) {
      bvg<clz> $$1 = $$0.dX();
      cpg $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpg.k, cpg.n, cpg.b));
      cpg $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cdi.o));
   }

   protected static void a(clz $$0, buf $$1) {
      if (!$$0.o_()) {
         if ($$1.ao() == btq.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clz $$0, buf $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clz $$0, buf $$1) {
      bvg<clz> $$3 = $$0.dX();
      buf $$2 = bvz.a($$0, $$3.c(cdi.z), $$1);
      $$2 = bvz.a($$0, $$3.c(cdi.o), $$2);
      e($$0, $$2);
   }

   private static void e(clz $$0, buf $$1) {
      $$0.dX().b(cdi.o);
      $$0.dX().b(cdi.m);
      $$0.dX().a(cdi.z, $$1, (long)c.a($$0.dS().z));
   }

   private static Optional<? extends buf> d(clz $$0) {
      return !c($$0) && !i($$0) ? $$0.dX().c(cdi.l) : Optional.empty();
   }

   static boolean a(clz $$0, je $$1) {
      Optional<je> $$2 = $$0.dX().c(cdi.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clz $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(clz $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dX().c(cdi.as).orElse(0);
         int $$2 = $$0.dX().c(cdi.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clz $$0, buf $$1) {
      bvg<clz> $$2 = $$0.dX();
      $$2.b(cdi.ax);
      $$2.b(cdi.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clz $$0, buf $$1) {
      if (!$$0.dX().c(cpg.n) || $$1.ao() != btq.aA) {
         if ($$1.ao() != btq.Z) {
            if (!bvz.a($$0, $$1, 4.0)) {
               if (ceo.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clz $$0, buf $$1) {
      bvg<clz> $$2 = $$0.dX();
      $$2.b(cdi.E);
      $$2.b(cdi.r);
      $$2.a(cdi.o, $$1, 200L);
   }

   private static void h(clz $$0, buf $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clz $$0, buf $$1) {
      if (!c($$0)) {
         Optional<buf> $$2 = $$0.dX().c(cdi.o);
         buf $$3 = bvz.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<awc> b(clz $$0) {
      return $$0.dX().g().map($$1 -> a($$0, $$1));
   }

   private static awc a(clz $$0, cpg $$1) {
      if ($$1 == cpg.n || $$0.y()) {
         return awd.mv;
      } else if ($$1 == cpg.k) {
         return awd.mq;
      } else {
         return h($$0) ? awd.mv : awd.mp;
      }
   }

   private static List<clz> g(clz $$0) {
      return $$0.dX().c(cdi.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clz $$0) {
      return $$0.dX().a(cdi.aw);
   }

   private static boolean i(clz $$0) {
      return $$0.dX().a(cdi.r);
   }

   protected static boolean c(clz $$0) {
      return $$0.dX().a(cdi.ax);
   }
}
