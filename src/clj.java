import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class clj {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqg c = azz.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqg j = bqg.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bus<?> a(bus<cli> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<cli> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new bwp(45, 90), new bwt()));
   }

   private static void c(bus<cli> $$0) {
      $$0.a(
         coo.b,
         10,
         ImmutableList.of(
            bvi.a(ccu.aw, 200),
            new bvd(btb.Z, 0.6F, 2),
            bxn.a(ccu.aw, 1.0F, 8, true),
            bxv.a(clj::d),
            byw.a(cli::u, bxn.b(ccu.aq, 0.4F, 8, false)),
            bxj.a(8.0F, bqg.a(30, 60)),
            bvg.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bus<cli> $$0) {
      $$0.a(
         coo.k,
         10,
         ImmutableList.of(
            bvi.a(ccu.aw, 200), new bvd(btb.Z, 0.6F, 2), bxo.a(1.0F), byw.a(cli::u, bwq.a(40)), byw.a(bsp::p_, bwq.a(15)), bxy.a(), bvv.a(clj::i, ccu.o)
         ),
         ccu.o
      );
   }

   private static void e(bus<cli> $$0) {
      $$0.a(coo.n, 10, ImmutableList.of(bxn.b(ccu.z, 1.3F, 15, false), a(), bxj.a(8.0F, bqg.a(30, 60)), bvv.a(clj::e, ccu.z)), ccu.z);
   }

   private static bxg<cli> a() {
      return new bxg<>(ImmutableList.of(Pair.of(bxb.a(0.4F), 2), Pair.of(bxq.a(0.4F, 3), 2), Pair.of(new bvt(30, 60), 1)));
   }

   protected static void a(cli $$0) {
      bus<cli> $$1 = $$0.dS();
      coo $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coo.k, coo.n, coo.b));
      coo $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccu.o));
   }

   protected static void a(cli $$0, btq $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == btb.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cli $$0, btq $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cli $$0, btq $$1) {
      bus<cli> $$3 = $$0.dS();
      btq $$2 = bvl.a($$0, $$3.c(ccu.z), $$1);
      $$2 = bvl.a($$0, $$3.c(ccu.o), $$2);
      e($$0, $$2);
   }

   private static void e(cli $$0, btq $$1) {
      $$0.dS().b(ccu.o);
      $$0.dS().b(ccu.m);
      $$0.dS().a(ccu.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends btq> d(cli $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(ccu.l) : Optional.empty();
   }

   static boolean a(cli $$0, iz $$1) {
      Optional<iz> $$2 = $$0.dS().c(ccu.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cli $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(cli $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(ccu.as).orElse(0);
         int $$2 = $$0.dS().c(ccu.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cli $$0, btq $$1) {
      bus<cli> $$2 = $$0.dS();
      $$2.b(ccu.ax);
      $$2.b(ccu.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cli $$0, btq $$1) {
      if (!$$0.dS().c(coo.n) || $$1.ak() != btb.aA) {
         if ($$1.ak() != btb.Z) {
            if (!bvl.a($$0, $$1, 4.0)) {
               if (cea.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cli $$0, btq $$1) {
      bus<cli> $$2 = $$0.dS();
      $$2.b(ccu.E);
      $$2.b(ccu.r);
      $$2.a(ccu.o, $$1, 200L);
   }

   private static void h(cli $$0, btq $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cli $$0, btq $$1) {
      if (!c($$0)) {
         Optional<btq> $$2 = $$0.dS().c(ccu.o);
         btq $$3 = bvl.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avz> b(cli $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(cli $$0, coo $$1) {
      if ($$1 == coo.n || $$0.y()) {
         return awa.mu;
      } else if ($$1 == coo.k) {
         return awa.mp;
      } else {
         return h($$0) ? awa.mu : awa.mo;
      }
   }

   private static List<cli> g(cli $$0) {
      return $$0.dS().c(ccu.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cli $$0) {
      return $$0.dS().a(ccu.aw);
   }

   private static boolean i(cli $$0) {
      return $$0.dS().a(ccu.r);
   }

   protected static boolean c(cli $$0) {
      return $$0.dS().a(ccu.ax);
   }
}
