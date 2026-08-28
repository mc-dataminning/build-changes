import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cnh {
   public static final int a = 8;
   public static final int b = 4;
   private static final brw c = bab.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final brw j = brw.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bwk<?> a(bwk<cng> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<cng> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new byh(45, 90), new byl()));
   }

   private static void c(bwk<cng> $$0) {
      $$0.a(
         cqp.b,
         10,
         ImmutableList.of(
            bxa.a(cem.aw, 200),
            new bwv(but.aj, 0.6F, 2),
            bzf.a(cem.aw, 1.0F, 8, true),
            bzn.a(cnh::a),
            cao.a(cng::t, bzf.b(cem.aq, 0.4F, 8, false)),
            bzb.a(8.0F, brw.a(30, 60)),
            bwy.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bwk<cng> $$0) {
      $$0.a(
         cqp.k,
         10,
         ImmutableList.of(
            bxa.a(cem.aw, 200), new bwv(but.aj, 0.6F, 2), bzg.a(1.0F), cao.a(cng::t, byi.a(40)), cao.a(bud::e_, byi.a(15)), bzq.a(), bxn.a(cnh::h, cem.o)
         ),
         cem.o
      );
   }

   private static void e(bwk<cng> $$0) {
      $$0.a(cqp.n, 10, ImmutableList.of(bzf.b(cem.z, 1.3F, 15, false), a(), bzb.a(8.0F, brw.a(30, 60)), bxn.a(cnh::d, cem.z)), cem.z);
   }

   private static byy<cng> a() {
      return new byy<>(ImmutableList.of(Pair.of(byt.a(0.4F), 2), Pair.of(bzi.a(0.4F, 3), 2), Pair.of(new bxl(30, 60), 1)));
   }

   protected static void a(cng $$0) {
      bwk<cng> $$1 = $$0.eb();
      cqp $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqp.k, cqp.n, cqp.b));
      cqp $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.w($$1.a(cem.o));
   }

   protected static void a(cng $$0, bvi $$1) {
      if (!$$0.e_()) {
         if ($$1.aq() == but.aR && e($$0)) {
            d($$0, $$1);
            b($$0, $$1);
         } else {
            f($$0, $$1);
         }
      }
   }

   private static void b(cng $$0, bvi $$1) {
      f($$0).forEach($$1x -> c($$1x, $$1));
   }

   private static void c(cng $$0, bvi $$1) {
      bwk<cng> $$3 = $$0.eb();
      bvi $$2 = bxd.a($$0, $$3.c(cem.z), $$1);
      $$2 = bxd.a($$0, $$3.c(cem.o), $$2);
      d($$0, $$2);
   }

   private static void d(cng $$0, bvi $$1) {
      $$0.eb().b(cem.o);
      $$0.eb().b(cem.m);
      $$0.eb().a(cem.z, $$1, (long)c.a($$0.dV().A));
   }

   private static Optional<? extends bvi> a(ard $$0, cng $$1) {
      return !c($$1) && !h($$1) ? $$1.eb().c(cem.l) : Optional.empty();
   }

   static boolean a(cng $$0, ji $$1) {
      Optional<ji> $$2 = $$0.eb().c(cem.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean d(cng $$0) {
      return $$0.t() && !e($$0);
   }

   private static boolean e(cng $$0) {
      if ($$0.e_()) {
         return false;
      } else {
         int $$1 = $$0.eb().c(cem.as).orElse(0);
         int $$2 = $$0.eb().c(cem.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void a(ard $$0, cng $$1, bvi $$2) {
      bwk<cng> $$3 = $$1.eb();
      $$3.b(cem.ax);
      $$3.b(cem.r);
      if ($$1.e_()) {
         c($$1, $$2);
      } else {
         b($$0, $$1, $$2);
      }
   }

   private static void b(ard $$0, cng $$1, bvi $$2) {
      if (!$$1.eb().c(cqp.n) || $$2.aq() != but.aR) {
         if ($$2.aq() != but.aj) {
            if (!bxd.a($$1, $$2, 4.0)) {
               if (cfs.c($$0, $$1, $$2)) {
                  e($$1, $$2);
                  f($$1, $$2);
               }
            }
         }
      }
   }

   private static void e(cng $$0, bvi $$1) {
      bwk<cng> $$2 = $$0.eb();
      $$2.b(cem.E);
      $$2.b(cem.r);
      $$2.a(cem.o, $$1, 200L);
   }

   private static void f(cng $$0, bvi $$1) {
      f($$0).forEach($$1x -> g($$1x, $$1));
   }

   private static void g(cng $$0, bvi $$1) {
      if (!c($$0)) {
         Optional<bvi> $$2 = $$0.eb().c(cem.o);
         bvi $$3 = bxd.a($$0, $$2, $$1);
         e($$0, $$3);
      }
   }

   public static Optional<avz> b(cng $$0) {
      return $$0.eb().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cng $$0, cqp $$1) {
      if ($$1 == cqp.n || $$0.gs()) {
         return awa.mS;
      } else if ($$1 == cqp.k) {
         return awa.mN;
      } else {
         return g($$0) ? awa.mS : awa.mM;
      }
   }

   private static List<cng> f(cng $$0) {
      return $$0.eb().c(cem.ap).orElse(ImmutableList.of());
   }

   private static boolean g(cng $$0) {
      return $$0.eb().a(cem.aw);
   }

   private static boolean h(cng $$0) {
      return $$0.eb().a(cem.r);
   }

   protected static boolean c(cng $$0) {
      return $$0.eb().a(cem.ax);
   }
}
