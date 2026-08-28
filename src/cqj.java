import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cqj {
   public static final int a = 8;
   public static final int b = 4;
   private static final bue c = bau.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bue j = bue.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static byw<?> a(byw<cqi> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<cqi> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cat(45, 90), new cax()));
   }

   private static void c(byw<cqi> $$0) {
      $$0.a(
         ctt.b,
         10,
         ImmutableList.of(
            bzm.a(cgy.ax, 200),
            new bzh(bxe.ak, 0.6F, 2),
            cbr.a(cgy.ax, 1.0F, 8, true),
            cbz.a(cqj::a),
            cda.a(cqi::x, cbr.b(cgy.ar, 0.4F, 8, false)),
            cbn.a(8.0F, bue.a(30, 60)),
            bzk.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(byw<cqi> $$0) {
      $$0.a(
         ctt.k,
         10,
         ImmutableList.of(
            bzm.a(cgy.ax, 200), new bzh(bxe.ak, 0.6F, 2), cbs.a(1.0F), cda.a(cqi::x, cau.a(40)), cda.a(bwl::n_, cau.a(15)), ccc.a(), bzz.a(cqj::h, cgy.p)
         ),
         cgy.p
      );
   }

   private static void e(byw<cqi> $$0) {
      $$0.a(ctt.n, 10, ImmutableList.of(cbr.b(cgy.A, 1.3F, 15, false), a(), cbn.a(8.0F, bue.a(30, 60)), bzz.a(cqj::d, cgy.A)), cgy.A);
   }

   private static cbk<cqi> a() {
      return new cbk<>(ImmutableList.of(Pair.of(cbf.a(0.4F), 2), Pair.of(cbu.a(0.4F, 3), 2), Pair.of(new bzx(30, 60), 1)));
   }

   protected static void a(cqi $$0) {
      byw<cqi> $$1 = $$0.ec();
      ctt $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctt.k, ctt.n, ctt.b));
      ctt $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cgy.p));
   }

   protected static void a(cqi $$0, bxw $$1) {
      if (!$$0.n_()) {
         if ($$1.an() == bxe.aS && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cqi $$0, bxw $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cqi $$0, bxw $$1) {
      byw<cqi> $$3 = $$0.ec();
      bxw $$2 = bzp.a($$0, $$3.c(cgy.A), $$1);
      $$2 = bzp.a($$0, $$3.c(cgy.p), $$2);
      d($$0, $$2);
   }

   private static void d(cqi $$0, bxw $$1) {
      $$0.ec().b(cgy.p);
      $$0.ec().b(cgy.n);
      $$0.ec().a(cgy.A, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bxw> a(aru $$0, cqi $$1) {
      return !c($$1) && !h($$1) ? $$1.ec().c(cgy.l) : Optional.empty();
   }

   static boolean a(cqi $$0, iw $$1) {
      Optional<iw> $$2 = $$0.ec().c(cgy.ax);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cqi $$0) {
      return $$0.x() && !e($$0);
   }

   private static boolean e(cqi $$0) {
      if ($$0.n_()) {
         return false;
      } else {
         int $$1 = $$0.ec().c(cgy.at).orElse(0);
         int $$2 = $$0.ec().c(cgy.au).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(aru $$0, cqi $$1, bxw $$2) {
      byw<cqi> $$3 = $$1.ec();
      $$3.b(cgy.ay);
      $$3.b(cgy.s);
      if ($$1.n_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(aru $$0, cqi $$1, bxw $$2) {
      if (!$$1.ec().c(ctt.n) || $$2.an() != bxe.aS) {
         if ($$2.an() != bxe.ak) {
            if (!bzp.a($$1, $$2, 4.0)) {
               if (cie.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cqi $$0, bxw $$1) {
      byw<cqi> $$2 = $$0.ec();
      $$2.b(cgy.F);
      $$2.b(cgy.s);
      $$2.a(cgy.p, $$1, 200L);
   }

   private static void f(cqi $$0, bxw $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cqi $$0, bxw $$1) {
      if (!c($$0)) {
         Optional<bxw> $$2 = $$0.ec().c(cgy.p);
         bxw $$3 = bzp.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<awq> b(cqi $$0) {
      return $$0.ec().g().map($$1 -> a($$0, $$1));
   }

   private static awq a(cqi $$0, ctt $$1) {
      if ($$1 == ctt.n || $$0.gu()) {
         return awr.mW;
      } else if ($$1 == ctt.k) {
         return awr.mR;
      } else {
         return g($$0) ? awr.mW : awr.mQ;
      }
   }

   private static List<cqi> f(cqi $$0) {
      return $$0.ec().c(cgy.aq).orElse(ImmutableList.of());
   }

   private static boolean g(cqi $$0) {
      return $$0.ec().a(cgy.ax);
   }

   private static boolean h(cqi $$0) {
      return $$0.ec().a(cgy.s);
   }

   protected static boolean c(cqi $$0) {
      return $$0.ec().a(cgy.ay);
   }
}
