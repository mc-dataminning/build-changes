import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class clg {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqd c = azx.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqd j = bqd.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bup<?> a(bup<clf> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(bup<clf> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwm(45, 90), new bwq()));
   }

   private static void c(bup<clf> $$0) {
      $$0.a(
         cok.b,
         10,
         ImmutableList.of(
            bvf.a(ccr.aw, 200),
            new bva(bsy.Z, 0.6F, 2),
            bxk.a(ccr.aw, 1.0F, 8, true),
            bxs.a(clg::d),
            byt.a(clf::u, bxk.b(ccr.aq, 0.4F, 8, false)),
            bxg.a(8.0F, bqd.a(30, 60)),
            bvd.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bup<clf> $$0) {
      $$0.a(
         cok.k,
         10,
         ImmutableList.of(
            bvf.a(ccr.aw, 200), new bva(bsy.Z, 0.6F, 2), bxl.a(1.0F), byt.a(clf::u, bwn.a(40)), byt.a(bsm::p_, bwn.a(15)), bxv.a(), bvs.a(clg::i, ccr.o)
         ),
         ccr.o
      );
   }

   private static void e(bup<clf> $$0) {
      $$0.a(cok.n, 10, ImmutableList.of(bxk.b(ccr.z, 1.3F, 15, false), a(), bxg.a(8.0F, bqd.a(30, 60)), bvs.a(clg::e, ccr.z)), ccr.z);
   }

   private static bxd<clf> a() {
      return new bxd<>(ImmutableList.of(Pair.of(bwy.a(0.4F), 2), Pair.of(bxn.a(0.4F, 3), 2), Pair.of(new bvq(30, 60), 1)));
   }

   protected static void a(clf $$0) {
      bup<clf> $$1 = $$0.dS();
      cok $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cok.k, cok.n, cok.b));
      cok $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccr.o));
   }

   protected static void a(clf $$0, btn $$1) {
      if (!$$0.p_()) {
         if ($$1.ak() == bsy.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clf $$0, btn $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clf $$0, btn $$1) {
      bup<clf> $$3 = $$0.dS();
      btn $$2 = bvi.a($$0, $$3.c(ccr.z), $$1);
      $$2 = bvi.a($$0, $$3.c(ccr.o), $$2);
      e($$0, $$2);
   }

   private static void e(clf $$0, btn $$1) {
      $$0.dS().b(ccr.o);
      $$0.dS().b(ccr.m);
      $$0.dS().a(ccr.z, $$1, (long)c.a($$0.dP().z));
   }

   private static Optional<? extends btn> d(clf $$0) {
      return !c($$0) && !i($$0) ? $$0.dS().c(ccr.l) : Optional.empty();
   }

   static boolean a(clf $$0, iz $$1) {
      Optional<iz> $$2 = $$0.dS().c(ccr.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clf $$0) {
      return $$0.u() && !f($$0);
   }

   private static boolean f(clf $$0) {
      if ($$0.p_()) {
         return false;
      } else {
         int $$1 = $$0.dS().c(ccr.as).orElse(0);
         int $$2 = $$0.dS().c(ccr.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clf $$0, btn $$1) {
      bup<clf> $$2 = $$0.dS();
      $$2.b(ccr.ax);
      $$2.b(ccr.r);
      if ($$0.p_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clf $$0, btn $$1) {
      if (!$$0.dS().c(cok.n) || $$1.ak() != bsy.aA) {
         if ($$1.ak() != bsy.Z) {
            if (!bvi.a($$0, $$1, 4.0)) {
               if (cdx.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clf $$0, btn $$1) {
      bup<clf> $$2 = $$0.dS();
      $$2.b(ccr.E);
      $$2.b(ccr.r);
      $$2.a(ccr.o, $$1, 200L);
   }

   private static void h(clf $$0, btn $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clf $$0, btn $$1) {
      if (!c($$0)) {
         Optional<btn> $$2 = $$0.dS().c(ccr.o);
         btn $$3 = bvi.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avy> b(clf $$0) {
      return $$0.dS().g().map($$1 -> a($$0, $$1));
   }

   private static avy a(clf $$0, cok $$1) {
      if ($$1 == cok.n || $$0.y()) {
         return avz.mu;
      } else if ($$1 == cok.k) {
         return avz.mp;
      } else {
         return h($$0) ? avz.mu : avz.mo;
      }
   }

   private static List<clf> g(clf $$0) {
      return $$0.dS().c(ccr.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clf $$0) {
      return $$0.dS().a(ccr.aw);
   }

   private static boolean i(clf $$0) {
      return $$0.dS().a(ccr.r);
   }

   protected static boolean c(clf $$0) {
      return $$0.dS().a(ccr.ax);
   }
}
