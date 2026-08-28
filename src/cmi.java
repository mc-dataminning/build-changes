import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cmi {
   public static final int a = 8;
   public static final int b = 4;
   private static final brd c = bag.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final brd j = brd.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bvo<?> a(bvo<cmh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<cmh> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new bxl(45, 90), new bxp()));
   }

   private static void c(bvo<cmh> $$0) {
      $$0.a(
         cpp.b,
         10,
         ImmutableList.of(
            bwe.a(cdq.aw, 200),
            new bvz(bty.Z, 0.6F, 2),
            byj.a(cdq.aw, 1.0F, 8, true),
            byr.a(cmi::d),
            bzs.a(cmh::t, byj.b(cdq.aq, 0.4F, 8, false)),
            byf.a(8.0F, brd.a(30, 60)),
            bwc.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bvo<cmh> $$0) {
      $$0.a(
         cpp.k,
         10,
         ImmutableList.of(
            bwe.a(cdq.aw, 200), new bvz(bty.Z, 0.6F, 2), byk.a(1.0F), bzs.a(cmh::t, bxm.a(40)), bzs.a(btk::p_, bxm.a(15)), byu.a(), bwr.a(cmi::i, cdq.o)
         ),
         cdq.o
      );
   }

   private static void e(bvo<cmh> $$0) {
      $$0.a(cpp.n, 10, ImmutableList.of(byj.b(cdq.z, 1.3F, 15, false), a(), byf.a(8.0F, brd.a(30, 60)), bwr.a(cmi::e, cdq.z)), cdq.z);
   }

   private static byc<cmh> a() {
      return new byc<>(ImmutableList.of(Pair.of(bxx.a(0.4F), 2), Pair.of(bym.a(0.4F, 3), 2), Pair.of(new bwp(30, 60), 1)));
   }

   protected static void a(cmh $$0) {
      bvo<cmh> $$1 = $$0.dY();
      cpp $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpp.k, cpp.n, cpp.b));
      cpp $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cdq.o));
   }

   protected static void a(cmh $$0, bun $$1) {
      if (!$$0.p_()) {
         if ($$1.ao() == bty.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cmh $$0, bun $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cmh $$0, bun $$1) {
      bvo<cmh> $$3 = $$0.dY();
      bun $$2 = bwh.a($$0, $$3.c(cdq.z), $$1);
      $$2 = bwh.a($$0, $$3.c(cdq.o), $$2);
      e($$0, $$2);
   }

   private static void e(cmh $$0, bun $$1) {
      $$0.dY().b(cdq.o);
      $$0.dY().b(cdq.m);
      $$0.dY().a(cdq.z, $$1, (long)c.a($$0.dS().z));
   }

   private static Optional<? extends bun> d(cmh $$0) {
      return !c($$0) && !i($$0) ? $$0.dY().c(cdq.l) : Optional.empty();
   }

   static boolean a(cmh $$0, jf $$1) {
      Optional<jf> $$2 = $$0.dY().c(cdq.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cmh $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cmh $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dY().c(cdq.as).orElse(0);
         int $$2 = $$0.dY().c(cdq.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cmh $$0, bun $$1) {
      bvo<cmh> $$2 = $$0.dY();
      $$2.b(cdq.ax);
      $$2.b(cdq.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cmh $$0, bun $$1) {
      if (!$$0.dY().c(cpp.n) || $$1.ao() != bty.aA) {
         if ($$1.ao() != bty.Z) {
            if (!bwh.a($$0, $$1, 4.0)) {
               if (cew.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cmh $$0, bun $$1) {
      bvo<cmh> $$2 = $$0.dY();
      $$2.b(cdq.E);
      $$2.b(cdq.r);
      $$2.a(cdq.o, $$1, 200L);
   }

   private static void h(cmh $$0, bun $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cmh $$0, bun $$1) {
      if (!c($$0)) {
         Optional<bun> $$2 = $$0.dY().c(cdq.o);
         bun $$3 = bwh.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<awf> b(cmh $$0) {
      return $$0.dY().g().map($$1 -> a($$0, $$1));
   }

   private static awf a(cmh $$0, cpp $$1) {
      if ($$1 == cpp.n || $$0.y()) {
         return awg.mv;
      } else if ($$1 == cpp.k) {
         return awg.mq;
      } else {
         return h($$0) ? awg.mv : awg.mp;
      }
   }

   private static List<cmh> g(cmh $$0) {
      return $$0.dY().c(cdq.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cmh $$0) {
      return $$0.dY().a(cdq.aw);
   }

   private static boolean i(cmh $$0) {
      return $$0.dY().a(cdq.r);
   }

   protected static boolean c(cmh $$0) {
      return $$0.dY().a(cdq.ax);
   }
}
