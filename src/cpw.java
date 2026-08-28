import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cpw {
   public static final int a = 8;
   public static final int b = 4;
   private static final btr c = baq.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final btr j = btr.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static byj<?> a(byj<cpv> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ctg.a));
      $$0.b(ctg.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<cpv> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cag(45, 90), new cak()));
   }

   private static void c(byj<cpv> $$0) {
      $$0.a(
         ctg.b,
         10,
         ImmutableList.of(
            byz.a(cgl.ax, 200),
            new byu(bwr.aj, 0.6F, 2),
            cbe.a(cgl.ax, 1.0F, 8, true),
            cbm.a(cpw::a),
            ccn.a(cpv::x, cbe.b(cgl.ar, 0.4F, 8, false)),
            cba.a(8.0F, btr.a(30, 60)),
            byx.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(byj<cpv> $$0) {
      $$0.a(
         ctg.k,
         10,
         ImmutableList.of(
            byz.a(cgl.ax, 200), new byu(bwr.aj, 0.6F, 2), cbf.a(1.0F), ccn.a(cpv::x, cah.a(40)), ccn.a(bvy::n_, cah.a(15)), cbp.a(), bzm.a(cpw::h, cgl.p)
         ),
         cgl.p
      );
   }

   private static void e(byj<cpv> $$0) {
      $$0.a(ctg.n, 10, ImmutableList.of(cbe.b(cgl.A, 1.3F, 15, false), a(), cba.a(8.0F, btr.a(30, 60)), bzm.a(cpw::d, cgl.A)), cgl.A);
   }

   private static cax<cpv> a() {
      return new cax<>(ImmutableList.of(Pair.of(cas.a(0.4F), 2), Pair.of(cbh.a(0.4F, 3), 2), Pair.of(new bzk(30, 60), 1)));
   }

   protected static void a(cpv $$0) {
      byj<cpv> $$1 = $$0.eb();
      ctg $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctg.k, ctg.n, ctg.b));
      ctg $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgl.p));
   }

   protected static void a(cpv $$0, bxj $$1) {
      if (!$$0.n_()) {
         if ($$1.an() == bwr.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cpv $$0, bxj $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cpv $$0, bxj $$1) {
      byj<cpv> $$3 = $$0.eb();
      bxj $$2 = bzc.a($$0, $$3.c(cgl.A), $$1);
      $$2 = bzc.a($$0, $$3.c(cgl.p), $$2);
      d($$0, $$2);
   }

   private static void d(cpv $$0, bxj $$1) {
      $$0.eb().b(cgl.p);
      $$0.eb().b(cgl.n);
      $$0.eb().a(cgl.A, $$1, (long)c.a($$0.dU().A));
   }

   private static Optional<? extends bxj> a(arq $$0, cpv $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cgl.l) : Optional.empty();
   }

   static boolean a(cpv $$0, iv $$1) {
      Optional<iv> $$2 = $$0.eb().c(cgl.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cpv $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cpv $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cgl.at).orElse(0);
         int $$2 = $$0.eb().c(cgl.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(arq $$0, cpv $$1, bxj $$2) {
      byj<cpv> $$3 = $$1.eb();
      $$3.b(cgl.ay);
      $$3.b(cgl.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(arq $$0, cpv $$1, bxj $$2) {
      if (!$$1.eb().c(ctg.n) || $$2.an() != bwr.aR) {
         if ($$2.an() != bwr.aj) {
            if (!bzc.a($$1, $$2, 4.0)) {
               if (chr.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cpv $$0, bxj $$1) {
      byj<cpv> $$2 = $$0.eb();
      $$2.b(cgl.F);
      $$2.b(cgl.s);
      $$2.a(cgl.p, $$1, 200L);
   }

   private static void f(cpv $$0, bxj $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cpv $$0, bxj $$1) {
      if (!c($$0)) {
         Optional<bxj> $$2 = $$0.eb().c(cgl.p);
         bxj $$3 = bzc.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awm> b(cpv $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cpv $$0, ctg $$1) {
      if ($$1 == ctg.n || $$0.gt()) {
         return awn.mW;
      } else if ($$1 == ctg.k) {
         return awn.mR;
      } else {
         return g($$0) ? awn.mW : awn.mQ;
      }
   }

   private static List<cpv> f(cpv $$0) {
      return $$0.eb().c(cgl.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cpv $$0) {
      return $$0.eb().a(cgl.ax);
   }

   private static boolean h(cpv $$0) {
      return $$0.eb().a(cgl.s);
   }

   protected static boolean c(cpv $$0) {
      return $$0.eb().a(cgl.ay);
   }
}
