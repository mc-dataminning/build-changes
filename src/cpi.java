import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cpi {
   public static final int a = 8;
   public static final int b = 4;
   private static final btm c = baq.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final btm j = btm.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static byc<?> a(byc<cph> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<cph> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new bzz(45, 90), new cad()));
   }

   private static void c(byc<cph> $$0) {
      $$0.a(
         csr.b,
         10,
         ImmutableList.of(
            bys.a(cge.ax, 200),
            new byn(bwm.aj, 0.6F, 2),
            cax.a(cge.ax, 1.0F, 8, true),
            cbf.a(cpi::a),
            ccg.a(cph::x, cax.b(cge.ar, 0.4F, 8, false)),
            cat.a(8.0F, btm.a(30, 60)),
            byq.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(byc<cph> $$0) {
      $$0.a(
         csr.k,
         10,
         ImmutableList.of(
            bys.a(cge.ax, 200), new byn(bwm.aj, 0.6F, 2), cay.a(1.0F), ccg.a(cph::x, caa.a(40)), ccg.a(bvt::n_, caa.a(15)), cbi.a(), bzf.a(cpi::h, cge.p)
         ),
         cge.p
      );
   }

   private static void e(byc<cph> $$0) {
      $$0.a(csr.n, 10, ImmutableList.of(cax.b(cge.A, 1.3F, 15, false), a(), cat.a(8.0F, btm.a(30, 60)), bzf.a(cpi::d, cge.A)), cge.A);
   }

   private static caq<cph> a() {
      return new caq<>(ImmutableList.of(Pair.of(cal.a(0.4F), 2), Pair.of(cba.a(0.4F, 3), 2), Pair.of(new bzd(30, 60), 1)));
   }

   protected static void a(cph $$0) {
      byc<cph> $$1 = $$0.eb();
      csr $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csr.k, csr.n, csr.b));
      csr $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cge.p));
   }

   protected static void a(cph $$0, bxc $$1) {
      if (!$$0.n_()) {
         if ($$1.aq() == bwm.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cph $$0, bxc $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cph $$0, bxc $$1) {
      byc<cph> $$3 = $$0.eb();
      bxc $$2 = byv.a($$0, $$3.c(cge.A), $$1);
      $$2 = byv.a($$0, $$3.c(cge.p), $$2);
      d($$0, $$2);
   }

   private static void d(cph $$0, bxc $$1) {
      $$0.eb().b(cge.p);
      $$0.eb().b(cge.n);
      $$0.eb().a(cge.A, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bxc> a(arq $$0, cph $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cge.l) : Optional.empty();
   }

   static boolean a(cph $$0, iu $$1) {
      Optional<iu> $$2 = $$0.eb().c(cge.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cph $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cph $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cge.at).orElse(0);
         int $$2 = $$0.eb().c(cge.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(arq $$0, cph $$1, bxc $$2) {
      byc<cph> $$3 = $$1.eb();
      $$3.b(cge.ay);
      $$3.b(cge.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(arq $$0, cph $$1, bxc $$2) {
      if (!$$1.eb().c(csr.n) || $$2.aq() != bwm.aR) {
         if ($$2.aq() != bwm.aj) {
            if (!byv.a($$1, $$2, 4.0)) {
               if (chk.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cph $$0, bxc $$1) {
      byc<cph> $$2 = $$0.eb();
      $$2.b(cge.F);
      $$2.b(cge.s);
      $$2.a(cge.p, $$1, 200L);
   }

   private static void f(cph $$0, bxc $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cph $$0, bxc $$1) {
      if (!c($$0)) {
         Optional<bxc> $$2 = $$0.eb().c(cge.p);
         bxc $$3 = byv.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awm> b(cph $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static awm a(cph $$0, csr $$1) {
      if ($$1 == csr.n || $$0.gq()) {
         return awn.mT;
      } else if ($$1 == csr.k) {
         return awn.mO;
      } else {
         return g($$0) ? awn.mT : awn.mN;
      }
   }

   private static List<cph> f(cph $$0) {
      return $$0.eb().c(cge.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cph $$0) {
      return $$0.eb().a(cge.ax);
   }

   private static boolean h(cph $$0) {
      return $$0.eb().a(cge.s);
   }

   protected static boolean c(cph $$0) {
      return $$0.eb().a(cge.ay);
   }
}
