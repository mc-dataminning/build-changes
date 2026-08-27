import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cjs {
   public static final int a = 8;
   public static final int b = 4;
   private static final box c = ayy.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final box j = box.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static btb<?> a(btb<cjr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cmw.a));
      $$0.b(cmw.b);
      $$0.f();
      return $$0;
   }

   private static void b(btb<cjr> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new buy(45, 90), new bvc()));
   }

   private static void c(btb<cjr> $$0) {
      $$0.a(
         cmw.b,
         10,
         ImmutableList.of(
            btr.a(cbd.aw, 200),
            new btm(brn.Z, 0.6F, 2),
            bvw.a(cbd.aw, 1.0F, 8, true),
            bwe.a(cjs::d),
            bxf.a(cjr::u, bvw.b(cbd.aq, 0.4F, 8, false)),
            bvs.a(8.0F, box.a(30, 60)),
            btp.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(btb<cjr> $$0) {
      $$0.a(
         cmw.k,
         10,
         ImmutableList.of(
            btr.a(cbd.aw, 200), new btm(brn.Z, 0.6F, 2), bvx.a(1.0F), bxf.a(cjr::u, buz.a(40)), bxf.a(brb::p_, buz.a(15)), bwh.a(), bue.a(cjs::i, cbd.o)
         ),
         cbd.o
      );
   }

   private static void e(btb<cjr> $$0) {
      $$0.a(cmw.n, 10, ImmutableList.of(bvw.b(cbd.z, 1.3F, 15, false), a(), bvs.a(8.0F, box.a(30, 60)), bue.a(cjs::e, cbd.z)), cbd.z);
   }

   private static bvp<cjr> a() {
      return new bvp<>(ImmutableList.of(Pair.of(bvk.a(0.4F), 2), Pair.of(bvz.a(0.4F, 3), 2), Pair.of(new buc(30, 60), 1)));
   }

   protected static void a(cjr $$0) {
      btb<cjr> $$1 = $$0.dQ();
      cmw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cmw.k, cmw.n, cmw.b));
      cmw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cbd.o));
   }

   protected static void a(cjr $$0, bsa $$1) {
      if (!$$0.p_()) {
         if ($$1.ai() == brn.az && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cjr $$0, bsa $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cjr $$0, bsa $$1) {
      btb<cjr> $$3 = $$0.dQ();
      bsa $$2 = btu.a($$0, $$3.c(cbd.z), $$1);
      $$2 = btu.a($$0, $$3.c(cbd.o), $$2);
      e($$0, $$2);
   }

   private static void e(cjr $$0, bsa $$1) {
      $$0.dQ().b(cbd.o);
      $$0.dQ().b(cbd.m);
      $$0.dQ().a(cbd.z, $$1, (long)c.a($$0.dN().z));
   }

   private static Optional<? extends bsa> d(cjr $$0) {
      return !c($$0) && !i($$0) ? $$0.dQ().c(cbd.l) : Optional.empty();
   }

   static boolean a(cjr $$0, in $$1) {
      Optional<in> $$2 = $$0.dQ().c(cbd.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cjr $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(cjr $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dQ().c(cbd.as).orElse(0);
         int $$2 = $$0.dQ().c(cbd.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cjr $$0, bsa $$1) {
      btb<cjr> $$2 = $$0.dQ();
      $$2.b(cbd.ax);
      $$2.b(cbd.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cjr $$0, bsa $$1) {
      if (!$$0.dQ().c(cmw.n) || $$1.ai() != brn.az) {
         if ($$1.ai() != brn.Z) {
            if (!btu.a($$0, $$1, 4.0)) {
               if (ccj.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cjr $$0, bsa $$1) {
      btb<cjr> $$2 = $$0.dQ();
      $$2.b(cbd.E);
      $$2.b(cbd.r);
      $$2.a(cbd.o, $$1, 200L);
   }

   private static void h(cjr $$0, bsa $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cjr $$0, bsa $$1) {
      if (!c($$0)) {
         Optional<bsa> $$2 = $$0.dQ().c(cbd.o);
         bsa $$3 = btu.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avb> b(cjr $$0) {
      return $$0.dQ().g().map($$1 -> a($$0, $$1));
   }

   private static avb a(cjr $$0, cmw $$1) {
      if ($$1 == cmw.n || $$0.y()) {
         return avc.mk;
      } else if ($$1 == cmw.k) {
         return avc.mf;
      } else {
         return h($$0) ? avc.mk : avc.me;
      }
   }

   private static List<cjr> g(cjr $$0) {
      return $$0.dQ().c(cbd.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cjr $$0) {
      return $$0.dQ().a(cbd.aw);
   }

   private static boolean i(cjr $$0) {
      return $$0.dQ().a(cbd.r);
   }

   protected static boolean c(cjr $$0) {
      return $$0.dQ().a(cbd.ax);
   }
}
