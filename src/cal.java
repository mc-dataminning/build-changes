import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cal {
   public static final int a = 8;
   public static final int b = 4;
   private static final bgp c = asz.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bgp j = bgp.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bkm<?> a(bkm<cak> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkm<cak> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bmi(45, 90), new bmm()));
   }

   private static void c(bkm<cak> $$0) {
      $$0.a(
         cdl.b,
         10,
         ImmutableList.of(
            blc.a(bsn.av, 200),
            new bkx(bja.W, 0.6F),
            bng.a(bsn.av, 1.0F, 8, true),
            bno.a(cal::d),
            bop.a(cak::t, bng.b(bsn.ap, 0.4F, 8, false)),
            bnc.a(8.0F, bgp.a(30, 60)),
            bla.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bkm<cak> $$0) {
      $$0.a(
         cdl.k,
         10,
         ImmutableList.of(
            blc.a(bsn.av, 200), new bkx(bja.W, 0.6F), bnh.a(1.0F), bop.a(cak::t, bmj.a(40)), bop.a(bir::m_, bmj.a(15)), bnr.a(), blp.a(cal::i, bsn.o)
         ),
         bsn.o
      );
   }

   private static void e(bkm<cak> $$0) {
      $$0.a(cdl.n, 10, ImmutableList.of(bng.b(bsn.z, 1.3F, 15, false), a(), bnc.a(8.0F, bgp.a(30, 60)), blp.a(cal::e, bsn.z)), bsn.z);
   }

   private static bmz<cak> a() {
      return new bmz<>(ImmutableList.of(Pair.of(bmu.a(0.4F), 2), Pair.of(bnj.a(0.4F, 3), 2), Pair.of(new bln(30, 60), 1)));
   }

   protected static void a(cak $$0) {
      bkm<cak> $$1 = $$0.dN();
      cdl $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cdl.k, cdl.n, cdl.b));
      cdl $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bsn.o));
   }

   protected static void a(cak $$0, bjm $$1) {
      if (!$$0.m_()) {
         if ($$1.ag() == bja.aw && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cak $$0, bjm $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cak $$0, bjm $$1) {
      bkm<cak> $$3 = $$0.dN();
      bjm $$2 = blf.a($$0, $$3.c(bsn.z), $$1);
      $$2 = blf.a($$0, $$3.c(bsn.o), $$2);
      e($$0, $$2);
   }

   private static void e(cak $$0, bjm $$1) {
      $$0.dN().b(bsn.o);
      $$0.dN().b(bsn.m);
      $$0.dN().a(bsn.z, $$1, (long)c.a($$0.dL().z));
   }

   private static Optional<? extends bjm> d(cak $$0) {
      return !c($$0) && !i($$0) ? $$0.dN().c(bsn.l) : Optional.empty();
   }

   static boolean a(cak $$0, gw $$1) {
      Optional<gw> $$2 = $$0.dN().c(bsn.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cak $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cak $$0) {
      if ($$0.m_()) {
         return false;
      } else {
         int $$1 = $$0.dN().c(bsn.ar).orElse(0);
         int $$2 = $$0.dN().c(bsn.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cak $$0, bjm $$1) {
      bkm<cak> $$2 = $$0.dN();
      $$2.b(bsn.aw);
      $$2.b(bsn.r);
      if ($$0.m_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cak $$0, bjm $$1) {
      if (!$$0.dN().c(cdl.n) || $$1.ag() != bja.aw) {
         if ($$1.ag() != bja.W) {
            if (!blf.a($$0, $$1, 4.0)) {
               if (btr.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cak $$0, bjm $$1) {
      bkm<cak> $$2 = $$0.dN();
      $$2.b(bsn.E);
      $$2.b(bsn.r);
      $$2.a(bsn.o, $$1, 200L);
   }

   private static void h(cak $$0, bjm $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cak $$0, bjm $$1) {
      if (!c($$0)) {
         Optional<bjm> $$2 = $$0.dN().c(bsn.o);
         bjm $$3 = blf.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<apf> b(cak $$0) {
      return $$0.dN().g().map($$1 -> a($$0, $$1));
   }

   private static apf a(cak $$0, cdl $$1) {
      if ($$1 == cdl.n || $$0.y()) {
         return apg.kS;
      } else if ($$1 == cdl.k) {
         return apg.kN;
      } else {
         return h($$0) ? apg.kS : apg.kM;
      }
   }

   private static List<cak> g(cak $$0) {
      return $$0.dN().c(bsn.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cak $$0) {
      return $$0.dN().a(bsn.av);
   }

   private static boolean i(cak $$0) {
      return $$0.dN().a(bsn.r);
   }

   protected static boolean c(cak $$0) {
      return $$0.dN().a(bsn.aw);
   }
}
