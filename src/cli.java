import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cli {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqc c = azp.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqc j = bqc.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static buq<?> a(buq<clh> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<clh> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bwn(45, 90), new bwr()));
   }

   private static void c(buq<clh> $$0) {
      $$0.a(
         com.b,
         10,
         ImmutableList.of(
            bvg.a(ccs.aw, 200),
            new bvb(bsx.Z, 0.6F, 2),
            bxl.a(ccs.aw, 1.0F, 8, true),
            bxt.a(cli::d),
            byu.a(clh::t, bxl.b(ccs.aq, 0.4F, 8, false)),
            bxh.a(8.0F, bqc.a(30, 60)),
            bve.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(buq<clh> $$0) {
      $$0.a(
         com.k,
         10,
         ImmutableList.of(
            bvg.a(ccs.aw, 200), new bvb(bsx.Z, 0.6F, 2), bxm.a(1.0F), byu.a(clh::t, bwo.a(40)), byu.a(bsl::o_, bwo.a(15)), bxw.a(), bvt.a(cli::i, ccs.o)
         ),
         ccs.o
      );
   }

   private static void e(buq<clh> $$0) {
      $$0.a(com.n, 10, ImmutableList.of(bxl.b(ccs.z, 1.3F, 15, false), a(), bxh.a(8.0F, bqc.a(30, 60)), bvt.a(cli::e, ccs.z)), ccs.z);
   }

   private static bxe<clh> a() {
      return new bxe<>(ImmutableList.of(Pair.of(bwz.a(0.4F), 2), Pair.of(bxo.a(0.4F, 3), 2), Pair.of(new bvr(30, 60), 1)));
   }

   protected static void a(clh $$0) {
      buq<clh> $$1 = $$0.dU();
      com $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(com.k, com.n, com.b));
      com $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccs.o));
   }

   protected static void a(clh $$0, btn $$1) {
      if (!$$0.o_()) {
         if ($$1.am() == bsx.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clh $$0, btn $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clh $$0, btn $$1) {
      buq<clh> $$3 = $$0.dU();
      btn $$2 = bvj.a($$0, $$3.c(ccs.z), $$1);
      $$2 = bvj.a($$0, $$3.c(ccs.o), $$2);
      e($$0, $$2);
   }

   private static void e(clh $$0, btn $$1) {
      $$0.dU().b(ccs.o);
      $$0.dU().b(ccs.m);
      $$0.dU().a(ccs.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends btn> d(clh $$0) {
      return !c($$0) && !i($$0) ? $$0.dU().c(ccs.l) : Optional.empty();
   }

   static boolean a(clh $$0, jd $$1) {
      Optional<jd> $$2 = $$0.dU().c(ccs.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clh $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(clh $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dU().c(ccs.as).orElse(0);
         int $$2 = $$0.dU().c(ccs.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clh $$0, btn $$1) {
      buq<clh> $$2 = $$0.dU();
      $$2.b(ccs.ax);
      $$2.b(ccs.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clh $$0, btn $$1) {
      if (!$$0.dU().c(com.n) || $$1.am() != bsx.aA) {
         if ($$1.am() != bsx.Z) {
            if (!bvj.a($$0, $$1, 4.0)) {
               if (cdy.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clh $$0, btn $$1) {
      buq<clh> $$2 = $$0.dU();
      $$2.b(ccs.E);
      $$2.b(ccs.r);
      $$2.a(ccs.o, $$1, 200L);
   }

   private static void h(clh $$0, btn $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clh $$0, btn $$1) {
      if (!c($$0)) {
         Optional<btn> $$2 = $$0.dU().c(ccs.o);
         btn $$3 = bvj.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avo> b(clh $$0) {
      return $$0.dU().g().map($$1 -> a($$0, $$1));
   }

   private static avo a(clh $$0, com $$1) {
      if ($$1 == com.n || $$0.x()) {
         return avp.mu;
      } else if ($$1 == com.k) {
         return avp.mp;
      } else {
         return h($$0) ? avp.mu : avp.mo;
      }
   }

   private static List<clh> g(clh $$0) {
      return $$0.dU().c(ccs.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clh $$0) {
      return $$0.dU().a(ccs.aw);
   }

   private static boolean i(clh $$0) {
      return $$0.dU().a(ccs.r);
   }

   protected static boolean c(clh $$0) {
      return $$0.dU().a(ccs.ax);
   }
}
