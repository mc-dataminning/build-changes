import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cdm {
   public static final int a = 8;
   public static final int b = 4;
   private static final bjg c = avj.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bjg j = bjg.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bnf<?> a(bnf<cdl> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<cdl> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bpc(45, 90), new bpg()));
   }

   private static void c(bnf<cdl> $$0) {
      $$0.a(
         cgn.b,
         10,
         ImmutableList.of(
            bnv.a(bvh.av, 200),
            new bnq(blt.X, 0.6F),
            bqa.a(bvh.av, 1.0F, 8, true),
            bqi.a(cdm::d),
            brj.a(cdl::w, bqa.b(bvh.ap, 0.4F, 8, false)),
            bpw.a(8.0F, bjg.a(30, 60)),
            bnt.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bnf<cdl> $$0) {
      $$0.a(
         cgn.k,
         10,
         ImmutableList.of(
            bnv.a(bvh.av, 200), new bnq(blt.X, 0.6F), bqb.a(1.0F), brj.a(cdl::w, bpd.a(40)), brj.a(blk::o_, bpd.a(15)), bql.a(), boi.a(cdm::i, bvh.o)
         ),
         bvh.o
      );
   }

   private static void e(bnf<cdl> $$0) {
      $$0.a(cgn.n, 10, ImmutableList.of(bqa.b(bvh.z, 1.3F, 15, false), a(), bpw.a(8.0F, bjg.a(30, 60)), boi.a(cdm::e, bvh.z)), bvh.z);
   }

   private static bpt<cdl> a() {
      return new bpt<>(ImmutableList.of(Pair.of(bpo.a(0.4F), 2), Pair.of(bqd.a(0.4F, 3), 2), Pair.of(new bog(30, 60), 1)));
   }

   protected static void a(cdl $$0) {
      bnf<cdl> $$1 = $$0.dO();
      cgn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgn.k, cgn.n, cgn.b));
      cgn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bvh.o));
   }

   protected static void a(cdl $$0, bmf $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == blt.ax && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cdl $$0, bmf $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cdl $$0, bmf $$1) {
      bnf<cdl> $$3 = $$0.dO();
      bmf $$2 = bny.a($$0, $$3.c(bvh.z), $$1);
      $$2 = bny.a($$0, $$3.c(bvh.o), $$2);
      e($$0, $$2);
   }

   private static void e(cdl $$0, bmf $$1) {
      $$0.dO().b(bvh.o);
      $$0.dO().b(bvh.m);
      $$0.dO().a(bvh.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bmf> d(cdl $$0) {
      return !c($$0) && !i($$0) ? $$0.dO().c(bvh.l) : Optional.empty();
   }

   static boolean a(cdl $$0, hx $$1) {
      Optional<hx> $$2 = $$0.dO().c(bvh.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cdl $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cdl $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dO().c(bvh.ar).orElse(0);
         int $$2 = $$0.dO().c(bvh.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cdl $$0, bmf $$1) {
      bnf<cdl> $$2 = $$0.dO();
      $$2.b(bvh.aw);
      $$2.b(bvh.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cdl $$0, bmf $$1) {
      if (!$$0.dO().c(cgn.n) || $$1.ai() != blt.ax) {
         if ($$1.ai() != blt.X) {
            if (!bny.a($$0, $$1, 4.0)) {
               if (bwm.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cdl $$0, bmf $$1) {
      bnf<cdl> $$2 = $$0.dO();
      $$2.b(bvh.E);
      $$2.b(bvh.r);
      $$2.a(bvh.o, $$1, 200L);
   }

   private static void h(cdl $$0, bmf $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cdl $$0, bmf $$1) {
      if (!c($$0)) {
         Optional<bmf> $$2 = $$0.dO().c(bvh.o);
         bmf $$3 = bny.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<arl> b(cdl $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static arl a(cdl $$0, cgn $$1) {
      if ($$1 == cgn.n || $$0.A()) {
         return arm.lG;
      } else if ($$1 == cgn.k) {
         return arm.lB;
      } else {
         return h($$0) ? arm.lG : arm.lA;
      }
   }

   private static List<cdl> g(cdl $$0) {
      return $$0.dO().c(bvh.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cdl $$0) {
      return $$0.dO().a(bvh.av);
   }

   private static boolean i(cdl $$0) {
      return $$0.dO().a(bvh.r);
   }

   protected static boolean c(cdl $$0) {
      return $$0.dO().a(bvh.aw);
   }
}
