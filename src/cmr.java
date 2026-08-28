import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cmr {
   public static final int a = 8;
   public static final int b = 4;
   private static final brj c = bak.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final brj j = brj.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bvx<?> a(bvx<cmq> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvx<cmq> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bxu(45, 90), new bxy()));
   }

   private static void c(bvx<cmq> $$0) {
      $$0.a(
         cpz.b,
         10,
         ImmutableList.of(
            bwn.a(cdz.aw, 200),
            new bwi(bug.Z, 0.6F, 2),
            bys.a(cdz.aw, 1.0F, 8, true),
            bza.a(cmr::d),
            cab.a(cmq::t, bys.b(cdz.aq, 0.4F, 8, false)),
            byo.a(8.0F, brj.a(30, 60)),
            bwl.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bvx<cmq> $$0) {
      $$0.a(
         cpz.k,
         10,
         ImmutableList.of(
            bwn.a(cdz.aw, 200), new bwi(bug.Z, 0.6F, 2), byt.a(1.0F), cab.a(cmq::t, bxv.a(40)), cab.a(btq::p_, bxv.a(15)), bzd.a(), bxa.a(cmr::i, cdz.o)
         ),
         cdz.o
      );
   }

   private static void e(bvx<cmq> $$0) {
      $$0.a(cpz.n, 10, ImmutableList.of(bys.b(cdz.z, 1.3F, 15, false), a(), byo.a(8.0F, brj.a(30, 60)), bxa.a(cmr::e, cdz.z)), cdz.z);
   }

   private static byl<cmq> a() {
      return new byl<>(ImmutableList.of(Pair.of(byg.a(0.4F), 2), Pair.of(byv.a(0.4F, 3), 2), Pair.of(new bwy(30, 60), 1)));
   }

   protected static void a(cmq $$0) {
      bvx<cmq> $$1 = $$0.ed();
      cpz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpz.k, cpz.n, cpz.b));
      cpz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cdz.o));
   }

   protected static void a(cmq $$0, buv $$1) {
      if (!$$0.p_()) {
         if ($$1.aq() == bug.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cmq $$0, buv $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cmq $$0, buv $$1) {
      bvx<cmq> $$3 = $$0.ed();
      buv $$2 = bwq.a($$0, $$3.c(cdz.z), $$1);
      $$2 = bwq.a($$0, $$3.c(cdz.o), $$2);
      e($$0, $$2);
   }

   private static void e(cmq $$0, buv $$1) {
      $$0.ed().b(cdz.o);
      $$0.ed().b(cdz.m);
      $$0.ed().a(cdz.z, $$1, (long)c.a($$0.dX().A));
   }

   private static Optional<? extends buv> d(cmq $$0) {
      return !c($$0) && !i($$0) ? $$0.ed().c(cdz.l) : Optional.empty();
   }

   static boolean a(cmq $$0, jg $$1) {
      Optional<jg> $$2 = $$0.ed().c(cdz.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cmq $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cmq $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.ed().c(cdz.as).orElse(0);
         int $$2 = $$0.ed().c(cdz.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cmq $$0, buv $$1) {
      bvx<cmq> $$2 = $$0.ed();
      $$2.b(cdz.ax);
      $$2.b(cdz.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cmq $$0, buv $$1) {
      if (!$$0.ed().c(cpz.n) || $$1.aq() != bug.aA) {
         if ($$1.aq() != bug.Z) {
            if (!bwq.a($$0, $$1, 4.0)) {
               if (cff.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cmq $$0, buv $$1) {
      bvx<cmq> $$2 = $$0.ed();
      $$2.b(cdz.E);
      $$2.b(cdz.r);
      $$2.a(cdz.o, $$1, 200L);
   }

   private static void h(cmq $$0, buv $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cmq $$0, buv $$1) {
      if (!c($$0)) {
         Optional<buv> $$2 = $$0.ed().c(cdz.o);
         buv $$3 = bwq.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<awj> b(cmq $$0) {
      return $$0.ed().g().map($$1 -> a($$0, $$1));
   }

   private static awj a(cmq $$0, cpz $$1) {
      if ($$1 == cpz.n || $$0.y()) {
         return awk.mt;
      } else if ($$1 == cpz.k) {
         return awk.mo;
      } else {
         return h($$0) ? awk.mt : awk.mn;
      }
   }

   private static List<cmq> g(cmq $$0) {
      return $$0.ed().c(cdz.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cmq $$0) {
      return $$0.ed().a(cdz.aw);
   }

   private static boolean i(cmq $$0) {
      return $$0.ed().a(cdz.r);
   }

   protected static boolean c(cmq $$0) {
      return $$0.ed().a(cdz.ax);
   }
}
