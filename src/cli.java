import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cli {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqf c = azz.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqf j = bqf.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bur<?> a(bur<clh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<clh> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bwo(45, 90), new bws()));
   }

   private static void c(bur<clh> $$0) {
      $$0.a(
         com.b,
         10,
         ImmutableList.of(
            bvh.a(cct.aw, 200),
            new bvc(bta.Z, 0.6F, 2),
            bxm.a(cct.aw, 1.0F, 8, true),
            bxu.a(cli::d),
            byv.a(clh::u, bxm.b(cct.aq, 0.4F, 8, false)),
            bxi.a(8.0F, bqf.a(30, 60)),
            bvf.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bur<clh> $$0) {
      $$0.a(
         com.k,
         10,
         ImmutableList.of(
            bvh.a(cct.aw, 200), new bvc(bta.Z, 0.6F, 2), bxn.a(1.0F), byv.a(clh::u, bwp.a(40)), byv.a(bso::p_, bwp.a(15)), bxx.a(), bvu.a(cli::i, cct.o)
         ),
         cct.o
      );
   }

   private static void e(bur<clh> $$0) {
      $$0.a(com.n, 10, ImmutableList.of(bxm.b(cct.z, 1.3F, 15, false), a(), bxi.a(8.0F, bqf.a(30, 60)), bvu.a(cli::e, cct.z)), cct.z);
   }

   private static bxf<clh> a() {
      return new bxf<>(ImmutableList.of(Pair.of(bxa.a(0.4F), 2), Pair.of(bxp.a(0.4F, 3), 2), Pair.of(new bvs(30, 60), 1)));
   }

   protected static void a(clh $$0) {
      bur<clh> $$1 = $$0.dS();
      com $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(com.k, com.n, com.b));
      com $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cct.o));
   }

   protected static void a(clh $$0, btp $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == bta.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clh $$0, btp $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clh $$0, btp $$1) {
      bur<clh> $$3 = $$0.dS();
      btp $$2 = bvk.a($$0, $$3.c(cct.z), $$1);
      $$2 = bvk.a($$0, $$3.c(cct.o), $$2);
      e($$0, $$2);
   }

   private static void e(clh $$0, btp $$1) {
      $$0.dS().b(cct.o);
      $$0.dS().b(cct.m);
      $$0.dS().a(cct.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends btp> d(clh $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(cct.l) : Optional.empty();
   }

   static boolean a(clh $$0, iz $$1) {
      Optional<iz> $$2 = $$0.dS().c(cct.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clh $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(clh $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(cct.as).orElse(0);
         int $$2 = $$0.dS().c(cct.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clh $$0, btp $$1) {
      bur<clh> $$2 = $$0.dS();
      $$2.b(cct.ax);
      $$2.b(cct.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clh $$0, btp $$1) {
      if (!$$0.dS().c(com.n) || $$1.ak() != bta.aA) {
         if ($$1.ak() != bta.Z) {
            if (!bvk.a($$0, $$1, 4.0)) {
               if (cdz.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clh $$0, btp $$1) {
      bur<clh> $$2 = $$0.dS();
      $$2.b(cct.E);
      $$2.b(cct.r);
      $$2.a(cct.o, $$1, 200L);
   }

   private static void h(clh $$0, btp $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clh $$0, btp $$1) {
      if (!c($$0)) {
         Optional<btp> $$2 = $$0.dS().c(cct.o);
         btp $$3 = bvk.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avz> b(clh $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avz a(clh $$0, com $$1) {
      if ($$1 == com.n || $$0.y()) {
         return awa.mu;
      } else if ($$1 == com.k) {
         return awa.mp;
      } else {
         return h($$0) ? awa.mu : awa.mo;
      }
   }

   private static List<clh> g(clh $$0) {
      return $$0.dS().c(cct.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clh $$0) {
      return $$0.dS().a(cct.aw);
   }

   private static boolean i(clh $$0) {
      return $$0.dS().a(cct.r);
   }

   protected static boolean c(clh $$0) {
      return $$0.dS().a(cct.ax);
   }
}
