import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqs {
   public static final int a = 8;
   public static final int b = 4;
   private static final bun c = bbd.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bun j = bun.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bzf<?> a(bzf<cqr> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<cqr> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new cbc(45, 90), new cbg()));
   }

   private static void c(bzf<cqr> $$0) {
      $$0.a(
         cuc.b,
         10,
         ImmutableList.of(
            bzv.a(chh.ax, 200),
            new bzq(bxn.ak, 0.6F, 2),
            cca.a(chh.ax, 1.0F, 8, true),
            cci.a(cqs::a),
            cdj.a(cqr::x, cca.b(chh.ar, 0.4F, 8, false)),
            cbw.a(8.0F, bun.a(30, 60)),
            bzt.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bzf<cqr> $$0) {
      $$0.a(
         cuc.k,
         10,
         ImmutableList.of(
            bzv.a(chh.ax, 200), new bzq(bxn.ak, 0.6F, 2), ccb.a(1.0F), cdj.a(cqr::x, cbd.a(40)), cdj.a(bwu::n_, cbd.a(15)), ccl.a(), cai.a(cqs::h, chh.p)
         ),
         chh.p
      );
   }

   private static void e(bzf<cqr> $$0) {
      $$0.a(cuc.n, 10, ImmutableList.of(cca.b(chh.A, 1.3F, 15, false), a(), cbw.a(8.0F, bun.a(30, 60)), cai.a(cqs::d, chh.A)), chh.A);
   }

   private static cbt<cqr> a() {
      return new cbt<>(ImmutableList.of(Pair.of(cbo.a(0.4F), 2), Pair.of(ccd.a(0.4F, 3), 2), Pair.of(new cag(30, 60), 1)));
   }

   protected static void a(cqr $$0) {
      bzf<cqr> $$1 = $$0.ec();
      cuc $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cuc.k, cuc.n, cuc.b));
      cuc $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(chh.p));
   }

   protected static void a(cqr $$0, byf $$1) {
      if (!$$0.n_()) {
         if ($$1.an() == bxn.aS && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cqr $$0, byf $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cqr $$0, byf $$1) {
      bzf<cqr> $$3 = $$0.ec();
      byf $$2 = bzy.a($$0, $$3.c(chh.A), $$1);
      $$2 = bzy.a($$0, $$3.c(chh.p), $$2);
      d($$0, $$2);
   }

   private static void d(cqr $$0, byf $$1) {
      $$0.ec().b(chh.p);
      $$0.ec().b(chh.n);
      $$0.ec().a(chh.A, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends byf> a(asb $$0, cqr $$1) {
      return !c($$1) && !h($$1) ? $$1.ec().c(chh.l) : Optional.empty();
   }

   static boolean a(cqr $$0, iw $$1) {
      Optional<iw> $$2 = $$0.ec().c(chh.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cqr $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cqr $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.ec().c(chh.at).orElse(0);
         int $$2 = $$0.ec().c(chh.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(asb $$0, cqr $$1, byf $$2) {
      bzf<cqr> $$3 = $$1.ec();
      $$3.b(chh.ay);
      $$3.b(chh.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(asb $$0, cqr $$1, byf $$2) {
      if (!$$1.ec().c(cuc.n) || $$2.an() != bxn.aS) {
         if ($$2.an() != bxn.ak) {
            if (!bzy.a($$1, $$2, 4.0)) {
               if (cin.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cqr $$0, byf $$1) {
      bzf<cqr> $$2 = $$0.ec();
      $$2.b(chh.F);
      $$2.b(chh.s);
      $$2.a(chh.p, $$1, 200L);
   }

   private static void f(cqr $$0, byf $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cqr $$0, byf $$1) {
      if (!c($$0)) {
         Optional<byf> $$2 = $$0.ec().c(chh.p);
         byf $$3 = bzy.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awx> b(cqr $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awx a(cqr $$0, cuc $$1) {
      if ($$1 == cuc.n || $$0.gu()) {
         return awy.mW;
      } else if ($$1 == cuc.k) {
         return awy.mR;
      } else {
         return g($$0) ? awy.mW : awy.mQ;
      }
   }

   private static List<cqr> f(cqr $$0) {
      return $$0.ec().c(chh.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cqr $$0) {
      return $$0.ec().a(chh.ax);
   }

   private static boolean h(cqr $$0) {
      return $$0.ec().a(chh.s);
   }

   protected static boolean c(cqr $$0) {
      return $$0.ec().a(chh.ay);
   }
}
