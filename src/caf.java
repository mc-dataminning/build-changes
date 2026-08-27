import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class caf {
   public static final int a = 8;
   public static final int b = 4;
   private static final bgj c = asu.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bgj j = bgj.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bkg<?> a(bkg<cae> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkg<cae> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bmc(45, 90), new bmg()));
   }

   private static void c(bkg<cae> $$0) {
      $$0.a(
         cdf.b,
         10,
         ImmutableList.of(
            bkw.a(bsh.av, 200),
            new bkr(biu.W, 0.6F),
            bna.a(bsh.av, 1.0F, 8, true),
            bni.a(caf::d),
            boj.a(cae::t, bna.b(bsh.ap, 0.4F, 8, false)),
            bmw.a(8.0F, bgj.a(30, 60)),
            bku.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bkg<cae> $$0) {
      $$0.a(
         cdf.k,
         10,
         ImmutableList.of(
            bkw.a(bsh.av, 200), new bkr(biu.W, 0.6F), bnb.a(1.0F), boj.a(cae::t, bmd.a(40)), boj.a(bil::m_, bmd.a(15)), bnl.a(), blj.a(caf::i, bsh.o)
         ),
         bsh.o
      );
   }

   private static void e(bkg<cae> $$0) {
      $$0.a(cdf.n, 10, ImmutableList.of(bna.b(bsh.z, 1.3F, 15, false), a(), bmw.a(8.0F, bgj.a(30, 60)), blj.a(caf::e, bsh.z)), bsh.z);
   }

   private static bmt<cae> a() {
      return new bmt<>(ImmutableList.of(Pair.of(bmo.a(0.4F), 2), Pair.of(bnd.a(0.4F, 3), 2), Pair.of(new blh(30, 60), 1)));
   }

   protected static void a(cae $$0) {
      bkg<cae> $$1 = $$0.dN();
      cdf $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdf.k, cdf.n, cdf.b));
      cdf $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsh.o));
   }

   protected static void a(cae $$0, bjg $$1) {
      if (!$$0.m_()) {
         if ($$1.ag() == biu.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cae $$0, bjg $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cae $$0, bjg $$1) {
      bkg<cae> $$3 = $$0.dN();
      bjg $$2 = bkz.a($$0, $$3.c(bsh.z), $$1);
      $$2 = bkz.a($$0, $$3.c(bsh.o), $$2);
      e($$0, $$2);
   }

   private static void e(cae $$0, bjg $$1) {
      $$0.dN().b(bsh.o);
      $$0.dN().b(bsh.m);
      $$0.dN().a(bsh.z, $$1, (long)c.a($$0.dL().z));
   }

   private static Optional<? extends bjg> d(cae $$0) {
      return !c($$0) && !i($$0) ? $$0.dN().c(bsh.l) : Optional.empty();
   }

   static boolean a(cae $$0, gw $$1) {
      Optional<gw> $$2 = $$0.dN().c(bsh.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cae $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cae $$0) {
      if ($$0.m_()) {
         return false;
      } else {
         int $$1 = $$0.dN().c(bsh.ar).orElse(0);
         int $$2 = $$0.dN().c(bsh.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cae $$0, bjg $$1) {
      bkg<cae> $$2 = $$0.dN();
      $$2.b(bsh.aw);
      $$2.b(bsh.r);
      if ($$0.m_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cae $$0, bjg $$1) {
      if (!$$0.dN().c(cdf.n) || $$1.ag() != biu.aw) {
         if ($$1.ag() != biu.W) {
            if (!bkz.a($$0, $$1, 4.0)) {
               if (btl.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cae $$0, bjg $$1) {
      bkg<cae> $$2 = $$0.dN();
      $$2.b(bsh.E);
      $$2.b(bsh.r);
      $$2.a(bsh.o, $$1, 200L);
   }

   private static void h(cae $$0, bjg $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cae $$0, bjg $$1) {
      if (!c($$0)) {
         Optional<bjg> $$2 = $$0.dN().c(bsh.o);
         bjg $$3 = bkz.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<apd> b(cae $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static apd a(cae $$0, cdf $$1) {
      if ($$1 == cdf.n || $$0.y()) {
         return ape.kS;
      } else if ($$1 == cdf.k) {
         return ape.kN;
      } else {
         return h($$0) ? ape.kS : ape.kM;
      }
   }

   private static List<cae> g(cae $$0) {
      return $$0.dN().c(bsh.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cae $$0) {
      return $$0.dN().a(bsh.av);
   }

   private static boolean i(cae $$0) {
      return $$0.dN().a(bsh.r);
   }

   protected static boolean c(cae $$0) {
      return $$0.dN().a(bsh.aw);
   }
}
