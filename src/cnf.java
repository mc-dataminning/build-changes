import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cnf {
   public static final int a = 8;
   public static final int b = 4;
   private static final bru c = bab.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bru j = bru.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bwi<?> a(bwi<cne> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<cne> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new byf(45, 90), new byj()));
   }

   private static void c(bwi<cne> $$0) {
      $$0.a(
         cqn.b,
         10,
         ImmutableList.of(
            bwy.a(cek.aw, 200),
            new bwt(bur.aj, 0.6F, 2),
            bzd.a(cek.aw, 1.0F, 8, true),
            bzl.a(cnf::a),
            cam.a(cne::t, bzd.b(cek.aq, 0.4F, 8, false)),
            byz.a(8.0F, bru.a(30, 60)),
            bww.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bwi<cne> $$0) {
      $$0.a(
         cqn.k,
         10,
         ImmutableList.of(
            bwy.a(cek.aw, 200), new bwt(bur.aj, 0.6F, 2), bze.a(1.0F), cam.a(cne::t, byg.a(40)), cam.a(bub::e_, byg.a(15)), bzo.a(), bxl.a(cnf::h, cek.o)
         ),
         cek.o
      );
   }

   private static void e(bwi<cne> $$0) {
      $$0.a(cqn.n, 10, ImmutableList.of(bzd.b(cek.z, 1.3F, 15, false), a(), byz.a(8.0F, bru.a(30, 60)), bxl.a(cnf::d, cek.z)), cek.z);
   }

   private static byw<cne> a() {
      return new byw<>(ImmutableList.of(Pair.of(byr.a(0.4F), 2), Pair.of(bzg.a(0.4F, 3), 2), Pair.of(new bxj(30, 60), 1)));
   }

   protected static void a(cne $$0) {
      bwi<cne> $$1 = $$0.eb();
      cqn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqn.k, cqn.n, cqn.b));
      cqn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cek.o));
   }

   protected static void a(cne $$0, bvg $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == bur.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cne $$0, bvg $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cne $$0, bvg $$1) {
      bwi<cne> $$3 = $$0.eb();
      bvg $$2 = bxb.a($$0, $$3.c(cek.z), $$1);
      $$2 = bxb.a($$0, $$3.c(cek.o), $$2);
      d($$0, $$2);
   }

   private static void d(cne $$0, bvg $$1) {
      $$0.eb().b(cek.o);
      $$0.eb().b(cek.m);
      $$0.eb().a(cek.z, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bvg> a(ard $$0, cne $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cek.l) : Optional.empty();
   }

   static boolean a(cne $$0, ji $$1) {
      Optional<ji> $$2 = $$0.eb().c(cek.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cne $$0) {
      return $$0.t() && !e($$0);
   }

   private static boolean e(cne $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cek.as).orElse(0);
         int $$2 = $$0.eb().c(cek.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(ard $$0, cne $$1, bvg $$2) {
      bwi<cne> $$3 = $$1.eb();
      $$3.b(cek.ax);
      $$3.b(cek.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(ard $$0, cne $$1, bvg $$2) {
      if (!$$1.eb().c(cqn.n) || $$2.aq() != bur.aR) {
         if ($$2.aq() != bur.aj) {
            if (!bxb.a($$1, $$2, 4.0)) {
               if (cfq.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cne $$0, bvg $$1) {
      bwi<cne> $$2 = $$0.eb();
      $$2.b(cek.E);
      $$2.b(cek.r);
      $$2.a(cek.o, $$1, 200L);
   }

   private static void f(cne $$0, bvg $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cne $$0, bvg $$1) {
      if (!c($$0)) {
         Optional<bvg> $$2 = $$0.eb().c(cek.o);
         bvg $$3 = bxb.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<avz> b(cne $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cne $$0, cqn $$1) {
      if ($$1 == cqn.n || $$0.gs()) {
         return awa.mS;
      } else if ($$1 == cqn.k) {
         return awa.mN;
      } else {
         return g($$0) ? awa.mS : awa.mM;
      }
   }

   private static List<cne> f(cne $$0) {
      return $$0.eb().c(cek.ap).orElse(ImmutableList.of());
   }

   private static boolean g(cne $$0) {
      return $$0.eb().a(cek.aw);
   }

   private static boolean h(cne $$0) {
      return $$0.eb().a(cek.r);
   }

   protected static boolean c(cne $$0) {
      return $$0.eb().a(cek.ax);
   }
}
