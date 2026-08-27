import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class ckh {
   public static final int a = 8;
   public static final int b = 4;
   private static final bpf c = azc.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bpf j = bpf.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static btq<?> a(btq<ckg> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<ckg> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bvn(45, 90), new bvr()));
   }

   private static void c(btq<ckg> $$0) {
      $$0.a(
         cnl.b,
         10,
         ImmutableList.of(
            bug.a(cbs.aw, 200),
            new bub(bsa.Z, 0.6F, 2),
            bwl.a(cbs.aw, 1.0F, 8, true),
            bwt.a(ckh::d),
            bxu.a(ckg::u, bwl.b(cbs.aq, 0.4F, 8, false)),
            bwh.a(8.0F, bpf.a(30, 60)),
            bue.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(btq<ckg> $$0) {
      $$0.a(
         cnl.k,
         10,
         ImmutableList.of(
            bug.a(cbs.aw, 200), new bub(bsa.Z, 0.6F, 2), bwm.a(1.0F), bxu.a(ckg::u, bvo.a(40)), bxu.a(bro::p_, bvo.a(15)), bww.a(), but.a(ckh::i, cbs.o)
         ),
         cbs.o
      );
   }

   private static void e(btq<ckg> $$0) {
      $$0.a(cnl.n, 10, ImmutableList.of(bwl.b(cbs.z, 1.3F, 15, false), a(), bwh.a(8.0F, bpf.a(30, 60)), but.a(ckh::e, cbs.z)), cbs.z);
   }

   private static bwe<ckg> a() {
      return new bwe<>(ImmutableList.of(Pair.of(bvz.a(0.4F), 2), Pair.of(bwo.a(0.4F, 3), 2), Pair.of(new bur(30, 60), 1)));
   }

   protected static void a(ckg $$0) {
      btq<ckg> $$1 = $$0.dS();
      cnl $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cnl.k, cnl.n, cnl.b));
      cnl $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(cbs.o));
   }

   protected static void a(ckg $$0, bso $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == bsa.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(ckg $$0, bso $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(ckg $$0, bso $$1) {
      btq<ckg> $$3 = $$0.dS();
      bso $$2 = buj.a($$0, $$3.c(cbs.z), $$1);
      $$2 = buj.a($$0, $$3.c(cbs.o), $$2);
      e($$0, $$2);
   }

   private static void e(ckg $$0, bso $$1) {
      $$0.dS().b(cbs.o);
      $$0.dS().b(cbs.m);
      $$0.dS().a(cbs.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends bso> d(ckg $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(cbs.l) : Optional.empty();
   }

   static boolean a(ckg $$0, io $$1) {
      Optional<io> $$2 = $$0.dS().c(cbs.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(ckg $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(ckg $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(cbs.as).orElse(0);
         int $$2 = $$0.dS().c(cbs.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(ckg $$0, bso $$1) {
      btq<ckg> $$2 = $$0.dS();
      $$2.b(cbs.ax);
      $$2.b(cbs.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(ckg $$0, bso $$1) {
      if (!$$0.dS().c(cnl.n) || $$1.ak() != bsa.aA) {
         if ($$1.ak() != bsa.Z) {
            if (!buj.a($$0, $$1, 4.0)) {
               if (ccy.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(ckg $$0, bso $$1) {
      btq<ckg> $$2 = $$0.dS();
      $$2.b(cbs.E);
      $$2.b(cbs.r);
      $$2.a(cbs.o, $$1, 200L);
   }

   private static void h(ckg $$0, bso $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(ckg $$0, bso $$1) {
      if (!c($$0)) {
         Optional<bso> $$2 = $$0.dS().c(cbs.o);
         bso $$3 = buj.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avg> b(ckg $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avg a(ckg $$0, cnl $$1) {
      if ($$1 == cnl.n || $$0.y()) {
         return avh.mu;
      } else if ($$1 == cnl.k) {
         return avh.mp;
      } else {
         return h($$0) ? avh.mu : avh.mo;
      }
   }

   private static List<ckg> g(ckg $$0) {
      return $$0.dS().c(cbs.ap).orElse(ImmutableList.of());
   }

   private static boolean h(ckg $$0) {
      return $$0.dS().a(cbs.aw);
   }

   private static boolean i(ckg $$0) {
      return $$0.dS().a(cbs.r);
   }

   protected static boolean c(ckg $$0) {
      return $$0.dS().a(cbs.ax);
   }
}
