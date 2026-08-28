import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ckv {
   public static final int a = 8;
   public static final int b = 4;
   private static final bpr c = azh.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bpr j = bpr.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bud<?> a(bud<cku> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bud<cku> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bwa(45, 90), new bwe()));
   }

   private static void c(bud<cku> $$0) {
      $$0.a(
         cnz.b,
         10,
         ImmutableList.of(
            but.a(ccf.aw, 200),
            new buo(bsm.Z, 0.6F, 2),
            bwy.a(ccf.aw, 1.0F, 8, true),
            bxg.a(ckv::d),
            byh.a(cku::u, bwy.b(ccf.aq, 0.4F, 8, false)),
            bwu.a(8.0F, bpr.a(30, 60)),
            bur.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bud<cku> $$0) {
      $$0.a(
         cnz.k,
         10,
         ImmutableList.of(
            but.a(ccf.aw, 200), new buo(bsm.Z, 0.6F, 2), bwz.a(1.0F), byh.a(cku::u, bwb.a(40)), byh.a(bsa::p_, bwb.a(15)), bxj.a(), bvg.a(ckv::i, ccf.o)
         ),
         ccf.o
      );
   }

   private static void e(bud<cku> $$0) {
      $$0.a(cnz.n, 10, ImmutableList.of(bwy.b(ccf.z, 1.3F, 15, false), a(), bwu.a(8.0F, bpr.a(30, 60)), bvg.a(ckv::e, ccf.z)), ccf.z);
   }

   private static bwr<cku> a() {
      return new bwr<>(ImmutableList.of(Pair.of(bwm.a(0.4F), 2), Pair.of(bxb.a(0.4F, 3), 2), Pair.of(new bve(30, 60), 1)));
   }

   protected static void a(cku $$0) {
      bud<cku> $$1 = $$0.dU();
      cnz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnz.k, cnz.n, cnz.b));
      cnz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccf.o));
   }

   protected static void a(cku $$0, btb $$1) {
      if (!$$0.p_()) {
         if ($$1.al() == bsm.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cku $$0, btb $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cku $$0, btb $$1) {
      bud<cku> $$3 = $$0.dU();
      btb $$2 = buw.a($$0, $$3.c(ccf.z), $$1);
      $$2 = buw.a($$0, $$3.c(ccf.o), $$2);
      e($$0, $$2);
   }

   private static void e(cku $$0, btb $$1) {
      $$0.dU().b(ccf.o);
      $$0.dU().b(ccf.m);
      $$0.dU().a(ccf.z, $$1, (long)c.a($$0.dQ().z));
   }

   private static Optional<? extends btb> d(cku $$0) {
      return !c($$0) && !i($$0) ? $$0.dU().c(ccf.l) : Optional.empty();
   }

   static boolean a(cku $$0, ja $$1) {
      Optional<ja> $$2 = $$0.dU().c(ccf.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cku $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(cku $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dU().c(ccf.as).orElse(0);
         int $$2 = $$0.dU().c(ccf.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cku $$0, btb $$1) {
      bud<cku> $$2 = $$0.dU();
      $$2.b(ccf.ax);
      $$2.b(ccf.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cku $$0, btb $$1) {
      if (!$$0.dU().c(cnz.n) || $$1.al() != bsm.aA) {
         if ($$1.al() != bsm.Z) {
            if (!buw.a($$0, $$1, 4.0)) {
               if (cdl.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cku $$0, btb $$1) {
      bud<cku> $$2 = $$0.dU();
      $$2.b(ccf.E);
      $$2.b(ccf.r);
      $$2.a(ccf.o, $$1, 200L);
   }

   private static void h(cku $$0, btb $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cku $$0, btb $$1) {
      if (!c($$0)) {
         Optional<btb> $$2 = $$0.dU().c(ccf.o);
         btb $$3 = buw.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avg> b(cku $$0) {
      return $$0.dU().g().map($$1 -> a($$0, $$1));
   }

   private static avg a(cku $$0, cnz $$1) {
      if ($$1 == cnz.n || $$0.y()) {
         return avh.mu;
      } else if ($$1 == cnz.k) {
         return avh.mp;
      } else {
         return h($$0) ? avh.mu : avh.mo;
      }
   }

   private static List<cku> g(cku $$0) {
      return $$0.dU().c(ccf.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cku $$0) {
      return $$0.dU().a(ccf.aw);
   }

   private static boolean i(cku $$0) {
      return $$0.dU().a(ccf.r);
   }

   protected static boolean c(cku $$0) {
      return $$0.dU().a(ccf.ax);
   }
}
