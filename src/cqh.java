import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqh {
   public static final int a = 8;
   public static final int b = 4;
   private static final buc c = bas.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final buc j = buc.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static byu<?> a(byu<cqg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<cqg> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new car(45, 90), new cav()));
   }

   private static void c(byu<cqg> $$0) {
      $$0.a(
         ctr.b,
         10,
         ImmutableList.of(
            bzk.a(cgw.ax, 200),
            new bzf(bxc.ak, 0.6F, 2),
            cbp.a(cgw.ax, 1.0F, 8, true),
            cbx.a(cqh::a),
            ccy.a(cqg::x, cbp.b(cgw.ar, 0.4F, 8, false)),
            cbl.a(8.0F, buc.a(30, 60)),
            bzi.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(byu<cqg> $$0) {
      $$0.a(
         ctr.k,
         10,
         ImmutableList.of(
            bzk.a(cgw.ax, 200), new bzf(bxc.ak, 0.6F, 2), cbq.a(1.0F), ccy.a(cqg::x, cas.a(40)), ccy.a(bwj::n_, cas.a(15)), cca.a(), bzx.a(cqh::h, cgw.p)
         ),
         cgw.p
      );
   }

   private static void e(byu<cqg> $$0) {
      $$0.a(ctr.n, 10, ImmutableList.of(cbp.b(cgw.A, 1.3F, 15, false), a(), cbl.a(8.0F, buc.a(30, 60)), bzx.a(cqh::d, cgw.A)), cgw.A);
   }

   private static cbi<cqg> a() {
      return new cbi<>(ImmutableList.of(Pair.of(cbd.a(0.4F), 2), Pair.of(cbs.a(0.4F, 3), 2), Pair.of(new bzv(30, 60), 1)));
   }

   protected static void a(cqg $$0) {
      byu<cqg> $$1 = $$0.ec();
      ctr $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctr.k, ctr.n, ctr.b));
      ctr $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgw.p));
   }

   protected static void a(cqg $$0, bxu $$1) {
      if (!$$0.n_()) {
         if ($$1.an() == bxc.aS && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cqg $$0, bxu $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cqg $$0, bxu $$1) {
      byu<cqg> $$3 = $$0.ec();
      bxu $$2 = bzn.a($$0, $$3.c(cgw.A), $$1);
      $$2 = bzn.a($$0, $$3.c(cgw.p), $$2);
      d($$0, $$2);
   }

   private static void d(cqg $$0, bxu $$1) {
      $$0.ec().b(cgw.p);
      $$0.ec().b(cgw.n);
      $$0.ec().a(cgw.A, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bxu> a(ars $$0, cqg $$1) {
      return !c($$1) && !h($$1) ? $$1.ec().c(cgw.l) : Optional.empty();
   }

   static boolean a(cqg $$0, iv $$1) {
      Optional<iv> $$2 = $$0.ec().c(cgw.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cqg $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cqg $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.ec().c(cgw.at).orElse(0);
         int $$2 = $$0.ec().c(cgw.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(ars $$0, cqg $$1, bxu $$2) {
      byu<cqg> $$3 = $$1.ec();
      $$3.b(cgw.ay);
      $$3.b(cgw.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(ars $$0, cqg $$1, bxu $$2) {
      if (!$$1.ec().c(ctr.n) || $$2.an() != bxc.aS) {
         if ($$2.an() != bxc.ak) {
            if (!bzn.a($$1, $$2, 4.0)) {
               if (cic.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cqg $$0, bxu $$1) {
      byu<cqg> $$2 = $$0.ec();
      $$2.b(cgw.F);
      $$2.b(cgw.s);
      $$2.a(cgw.p, $$1, 200L);
   }

   private static void f(cqg $$0, bxu $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cqg $$0, bxu $$1) {
      if (!c($$0)) {
         Optional<bxu> $$2 = $$0.ec().c(cgw.p);
         bxu $$3 = bzn.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awo> b(cqg $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awo a(cqg $$0, ctr $$1) {
      if ($$1 == ctr.n || $$0.gu()) {
         return awp.mW;
      } else if ($$1 == ctr.k) {
         return awp.mR;
      } else {
         return g($$0) ? awp.mW : awp.mQ;
      }
   }

   private static List<cqg> f(cqg $$0) {
      return $$0.ec().c(cgw.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cqg $$0) {
      return $$0.ec().a(cgw.ax);
   }

   private static boolean h(cqg $$0) {
      return $$0.ec().a(cgw.s);
   }

   protected static boolean c(cqg $$0) {
      return $$0.ec().a(cgw.ay);
   }
}
