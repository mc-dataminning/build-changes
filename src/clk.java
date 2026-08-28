import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class clk {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqh c = azz.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqh j = bqh.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static but<?> a(but<clj> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   private static void b(but<clj> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bwq(45, 90), new bwu()));
   }

   private static void c(but<clj> $$0) {
      $$0.a(
         cop.b,
         10,
         ImmutableList.of(
            bvj.a(ccv.aw, 200),
            new bve(btc.Z, 0.6F, 2),
            bxo.a(ccv.aw, 1.0F, 8, true),
            bxw.a(clk::d),
            byx.a(clj::u, bxo.b(ccv.aq, 0.4F, 8, false)),
            bxk.a(8.0F, bqh.a(30, 60)),
            bvh.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(but<clj> $$0) {
      $$0.a(
         cop.k,
         10,
         ImmutableList.of(
            bvj.a(ccv.aw, 200), new bve(btc.Z, 0.6F, 2), bxp.a(1.0F), byx.a(clj::u, bwr.a(40)), byx.a(bsq::p_, bwr.a(15)), bxz.a(), bvw.a(clk::i, ccv.o)
         ),
         ccv.o
      );
   }

   private static void e(but<clj> $$0) {
      $$0.a(cop.n, 10, ImmutableList.of(bxo.b(ccv.z, 1.3F, 15, false), a(), bxk.a(8.0F, bqh.a(30, 60)), bvw.a(clk::e, ccv.z)), ccv.z);
   }

   private static bxh<clj> a() {
      return new bxh<>(ImmutableList.of(Pair.of(bxc.a(0.4F), 2), Pair.of(bxr.a(0.4F, 3), 2), Pair.of(new bvu(30, 60), 1)));
   }

   protected static void a(clj $$0) {
      but<clj> $$1 = $$0.dS();
      cop $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cop.k, cop.n, cop.b));
      cop $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccv.o));
   }

   protected static void a(clj $$0, btr $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == btc.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clj $$0, btr $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clj $$0, btr $$1) {
      but<clj> $$3 = $$0.dS();
      btr $$2 = bvm.a($$0, $$3.c(ccv.z), $$1);
      $$2 = bvm.a($$0, $$3.c(ccv.o), $$2);
      e($$0, $$2);
   }

   private static void e(clj $$0, btr $$1) {
      $$0.dS().b(ccv.o);
      $$0.dS().b(ccv.m);
      $$0.dS().a(ccv.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends btr> d(clj $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(ccv.l) : Optional.empty();
   }

   static boolean a(clj $$0, iz $$1) {
      Optional<iz> $$2 = $$0.dS().c(ccv.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clj $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(clj $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(ccv.as).orElse(0);
         int $$2 = $$0.dS().c(ccv.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clj $$0, btr $$1) {
      but<clj> $$2 = $$0.dS();
      $$2.b(ccv.ax);
      $$2.b(ccv.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clj $$0, btr $$1) {
      if (!$$0.dS().c(cop.n) || $$1.ak() != btc.aA) {
         if ($$1.ak() != btc.Z) {
            if (!bvm.a($$0, $$1, 4.0)) {
               if (ceb.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clj $$0, btr $$1) {
      but<clj> $$2 = $$0.dS();
      $$2.b(ccv.E);
      $$2.b(ccv.r);
      $$2.a(ccv.o, $$1, 200L);
   }

   private static void h(clj $$0, btr $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clj $$0, btr $$1) {
      if (!c($$0)) {
         Optional<btr> $$2 = $$0.dS().c(ccv.o);
         btr $$3 = bvm.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avz> b(clj $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(clj $$0, cop $$1) {
      if ($$1 == cop.n || $$0.y()) {
         return awa.mu;
      } else if ($$1 == cop.k) {
         return awa.mp;
      } else {
         return h($$0) ? awa.mu : awa.mo;
      }
   }

   private static List<clj> g(clj $$0) {
      return $$0.dS().c(ccv.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clj $$0) {
      return $$0.dS().a(ccv.aw);
   }

   private static boolean i(clj $$0) {
      return $$0.dS().a(ccv.r);
   }

   protected static boolean c(clj $$0) {
      return $$0.dS().a(ccv.ax);
   }
}
