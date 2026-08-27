import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ckj {
   public static final int a = 8;
   public static final int b = 4;
   private static final bpl c = azl.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bpl j = bpl.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static btp<?> a(btp<cki> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cki> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bvm(45, 90), new bvq()));
   }

   private static void c(btp<cki> $$0) {
      $$0.a(
         cnq.b,
         10,
         ImmutableList.of(
            buf.a(cbr.aw, 200),
            new bua(bsb.ab, 0.6F, 2),
            bwk.a(cbr.aw, 1.0F, 8, true),
            bws.a(ckj::d),
            bxt.a(cki::t, bwk.b(cbr.aq, 0.4F, 8, false)),
            bwg.a(8.0F, bpl.a(30, 60)),
            bud.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(btp<cki> $$0) {
      $$0.a(
         cnq.k,
         10,
         ImmutableList.of(
            buf.a(cbr.aw, 200), new bua(bsb.ab, 0.6F, 2), bwl.a(1.0F), bxt.a(cki::t, bvn.a(40)), bxt.a(brp::o_, bvn.a(15)), bwv.a(), bus.a(ckj::i, cbr.o)
         ),
         cbr.o
      );
   }

   private static void e(btp<cki> $$0) {
      $$0.a(cnq.n, 10, ImmutableList.of(bwk.b(cbr.z, 1.3F, 15, false), a(), bwg.a(8.0F, bpl.a(30, 60)), bus.a(ckj::e, cbr.z)), cbr.z);
   }

   private static bwd<cki> a() {
      return new bwd<>(ImmutableList.of(Pair.of(bvy.a(0.4F), 2), Pair.of(bwn.a(0.4F, 3), 2), Pair.of(new buq(30, 60), 1)));
   }

   protected static void a(cki $$0) {
      btp<cki> $$1 = $$0.dZ();
      cnq $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnq.k, cnq.n, cnq.b));
      cnq $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cbr.o));
   }

   protected static void a(cki $$0, bso $$1) {
      if (!$$0.o_()) {
         if ($$1.ak() == bsb.aB && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cki $$0, bso $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cki $$0, bso $$1) {
      btp<cki> $$3 = $$0.dZ();
      bso $$2 = bui.a($$0, $$3.c(cbr.z), $$1);
      $$2 = bui.a($$0, $$3.c(cbr.o), $$2);
      e($$0, $$2);
   }

   private static void e(cki $$0, bso $$1) {
      $$0.dZ().b(cbr.o);
      $$0.dZ().b(cbr.m);
      $$0.dZ().a(cbr.z, $$1, (long)c.a($$0.dU().A));
   }

   private static Optional<? extends bso> d(cki $$0) {
      return !c($$0) && !i($$0) ? $$0.dZ().c(cbr.l) : Optional.empty();
   }

   static boolean a(cki $$0, ir $$1) {
      Optional<ir> $$2 = $$0.dZ().c(cbr.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cki $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(cki $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dZ().c(cbr.as).orElse(0);
         int $$2 = $$0.dZ().c(cbr.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cki $$0, bso $$1) {
      btp<cki> $$2 = $$0.dZ();
      $$2.b(cbr.ax);
      $$2.b(cbr.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cki $$0, bso $$1) {
      if (!$$0.dZ().c(cnq.n) || $$1.ak() != bsb.aB) {
         if ($$1.ak() != bsb.ab) {
            if (!bui.a($$0, $$1, 4.0)) {
               if (ccx.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cki $$0, bso $$1) {
      btp<cki> $$2 = $$0.dZ();
      $$2.b(cbr.E);
      $$2.b(cbr.r);
      $$2.a(cbr.o, $$1, 200L);
   }

   private static void h(cki $$0, bso $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cki $$0, bso $$1) {
      if (!c($$0)) {
         Optional<bso> $$2 = $$0.dZ().c(cbr.o);
         bso $$3 = bui.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avn> b(cki $$0) {
      return $$0.dZ().g().map($$1 -> a($$0, $$1));
   }

   private static avn a(cki $$0, cnq $$1) {
      if ($$1 == cnq.n || $$0.x()) {
         return avo.mK;
      } else if ($$1 == cnq.k) {
         return avo.mF;
      } else {
         return h($$0) ? avo.mK : avo.mE;
      }
   }

   private static List<cki> g(cki $$0) {
      return $$0.dZ().c(cbr.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cki $$0) {
      return $$0.dZ().a(cbr.aw);
   }

   private static boolean i(cki $$0) {
      return $$0.dZ().a(cbr.r);
   }

   protected static boolean c(cki $$0) {
      return $$0.dZ().a(cbr.ax);
   }
}
