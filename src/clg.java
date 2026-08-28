import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class clg {
   public static final int a = 8;
   public static final int b = 4;
   private static final bqb c = azo.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bqb j = bqb.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static buo<?> a(buo<clf> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<clf> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwl(45, 90), new bwp()));
   }

   private static void c(buo<clf> $$0) {
      $$0.a(
         cok.b,
         10,
         ImmutableList.of(
            bve.a(ccq.aw, 200),
            new buz(bsw.Z, 0.6F, 2),
            bxj.a(ccq.aw, 1.0F, 8, true),
            bxr.a(clg::d),
            bys.a(clf::t, bxj.b(ccq.aq, 0.4F, 8, false)),
            bxf.a(8.0F, bqb.a(30, 60)),
            bvc.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(buo<clf> $$0) {
      $$0.a(
         cok.k,
         10,
         ImmutableList.of(
            bve.a(ccq.aw, 200), new buz(bsw.Z, 0.6F, 2), bxk.a(1.0F), bys.a(clf::t, bwm.a(40)), bys.a(bsk::o_, bwm.a(15)), bxu.a(), bvr.a(clg::i, ccq.o)
         ),
         ccq.o
      );
   }

   private static void e(buo<clf> $$0) {
      $$0.a(cok.n, 10, ImmutableList.of(bxj.b(ccq.z, 1.3F, 15, false), a(), bxf.a(8.0F, bqb.a(30, 60)), bvr.a(clg::e, ccq.z)), ccq.z);
   }

   private static bxc<clf> a() {
      return new bxc<>(ImmutableList.of(Pair.of(bwx.a(0.4F), 2), Pair.of(bxm.a(0.4F, 3), 2), Pair.of(new bvp(30, 60), 1)));
   }

   protected static void a(clf $$0) {
      buo<clf> $$1 = $$0.dU();
      cok $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cok.k, cok.n, cok.b));
      cok $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(ccq.o));
   }

   protected static void a(clf $$0, btl $$1) {
      if (!$$0.o_()) {
         if ($$1.am() == bsw.aA && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(clf $$0, btl $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(clf $$0, btl $$1) {
      buo<clf> $$3 = $$0.dU();
      btl $$2 = bvh.a($$0, $$3.c(ccq.z), $$1);
      $$2 = bvh.a($$0, $$3.c(ccq.o), $$2);
      e($$0, $$2);
   }

   private static void e(clf $$0, btl $$1) {
      $$0.dU().b(ccq.o);
      $$0.dU().b(ccq.m);
      $$0.dU().a(ccq.z, $$1, (long)c.a($$0.dQ().z));
   }

   private static Optional<? extends btl> d(clf $$0) {
      return !c($$0) && !i($$0) ? $$0.dU().c(ccq.l) : Optional.empty();
   }

   static boolean a(clf $$0, jd $$1) {
      Optional<jd> $$2 = $$0.dU().c(ccq.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(clf $$0) {
      return $$0.t() && !f($$0);
   }

   private static boolean f(clf $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dU().c(ccq.as).orElse(0);
         int $$2 = $$0.dU().c(ccq.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(clf $$0, btl $$1) {
      buo<clf> $$2 = $$0.dU();
      $$2.b(ccq.ax);
      $$2.b(ccq.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(clf $$0, btl $$1) {
      if (!$$0.dU().c(cok.n) || $$1.am() != bsw.aA) {
         if ($$1.am() != bsw.Z) {
            if (!bvh.a($$0, $$1, 4.0)) {
               if (cdw.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(clf $$0, btl $$1) {
      buo<clf> $$2 = $$0.dU();
      $$2.b(ccq.E);
      $$2.b(ccq.r);
      $$2.a(ccq.o, $$1, 200L);
   }

   private static void h(clf $$0, btl $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(clf $$0, btl $$1) {
      if (!c($$0)) {
         Optional<btl> $$2 = $$0.dU().c(ccq.o);
         btl $$3 = bvh.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<avn> b(clf $$0) {
      return $$0.dU().g().map($$1 -> a($$0, $$1));
   }

   private static avn a(clf $$0, cok $$1) {
      if ($$1 == cok.n || $$0.x()) {
         return avo.mu;
      } else if ($$1 == cok.k) {
         return avo.mp;
      } else {
         return h($$0) ? avo.mu : avo.mo;
      }
   }

   private static List<clf> g(clf $$0) {
      return $$0.dU().c(ccq.ap).orElse(ImmutableList.of());
   }

   private static boolean h(clf $$0) {
      return $$0.dU().a(ccq.aw);
   }

   private static boolean i(clf $$0) {
      return $$0.dU().a(ccq.r);
   }

   protected static boolean c(clf $$0) {
      return $$0.dU().a(ccq.ax);
   }
}
