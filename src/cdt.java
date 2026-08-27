import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cdt {
   public static final int a = 8;
   public static final int b = 4;
   private static final bjm c = avp.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final bjm j = bjm.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bnl<?> a(bnl<cds> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<cds> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bpi(45, 90), new bpm()));
   }

   private static void c(bnl<cds> $$0) {
      $$0.a(
         cgu.b,
         10,
         ImmutableList.of(
            bob.a(bvn.av, 200),
            new bnw(blz.X, 0.6F),
            bqg.a(bvn.av, 1.0F, 8, true),
            bqo.a(cdt::d),
            brp.a(cds::w, bqg.b(bvn.ap, 0.4F, 8, false)),
            bqc.a(8.0F, bjm.a(30, 60)),
            bnz.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bnl<cds> $$0) {
      $$0.a(
         cgu.k,
         10,
         ImmutableList.of(
            bob.a(bvn.av, 200), new bnw(blz.X, 0.6F), bqh.a(1.0F), brp.a(cds::w, bpj.a(40)), brp.a(blq::o_, bpj.a(15)), bqr.a(), boo.a(cdt::i, bvn.o)
         ),
         bvn.o
      );
   }

   private static void e(bnl<cds> $$0) {
      $$0.a(cgu.n, 10, ImmutableList.of(bqg.b(bvn.z, 1.3F, 15, false), a(), bqc.a(8.0F, bjm.a(30, 60)), boo.a(cdt::e, bvn.z)), bvn.z);
   }

   private static bpz<cds> a() {
      return new bpz<>(ImmutableList.of(Pair.of(bpu.a(0.4F), 2), Pair.of(bqj.a(0.4F, 3), 2), Pair.of(new bom(30, 60), 1)));
   }

   protected static void a(cds $$0) {
      bnl<cds> $$1 = $$0.dO();
      cgu $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgu.k, cgu.n, cgu.b));
      cgu $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bvn.o));
   }

   protected static void a(cds $$0, bml $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == blz.ax && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cds $$0, bml $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cds $$0, bml $$1) {
      bnl<cds> $$3 = $$0.dO();
      bml $$2 = boe.a($$0, $$3.c(bvn.z), $$1);
      $$2 = boe.a($$0, $$3.c(bvn.o), $$2);
      e($$0, $$2);
   }

   private static void e(cds $$0, bml $$1) {
      $$0.dO().b(bvn.o);
      $$0.dO().b(bvn.m);
      $$0.dO().a(bvn.z, $$1, (long)c.a($$0.dM().z));
   }

   private static Optional<? extends bml> d(cds $$0) {
      return !c($$0) && !i($$0) ? $$0.dO().c(bvn.l) : Optional.empty();
   }

   static boolean a(cds $$0, hx $$1) {
      Optional<hx> $$2 = $$0.dO().c(bvn.av);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cds $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cds $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dO().c(bvn.ar).orElse(0);
         int $$2 = $$0.dO().c(bvn.as).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cds $$0, bml $$1) {
      bnl<cds> $$2 = $$0.dO();
      $$2.b(bvn.aw);
      $$2.b(bvn.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cds $$0, bml $$1) {
      if (!$$0.dO().c(cgu.n) || $$1.ai() != blz.ax) {
         if ($$1.ai() != blz.X) {
            if (!boe.a($$0, $$1, 4.0)) {
               if (bws.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cds $$0, bml $$1) {
      bnl<cds> $$2 = $$0.dO();
      $$2.b(bvn.E);
      $$2.b(bvn.r);
      $$2.a(bvn.o, $$1, 200L);
   }

   private static void h(cds $$0, bml $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cds $$0, bml $$1) {
      if (!c($$0)) {
         Optional<bml> $$2 = $$0.dO().c(bvn.o);
         bml $$3 = boe.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<arr> b(cds $$0) {
      return $$0.dO().g().map($$1 -> a($$0, $$1));
   }

   private static arr a(cds $$0, cgu $$1) {
      if ($$1 == cgu.n || $$0.A()) {
         return ars.lG;
      } else if ($$1 == cgu.k) {
         return ars.lB;
      } else {
         return h($$0) ? ars.lG : ars.lA;
      }
   }

   private static List<cds> g(cds $$0) {
      return $$0.dO().c(bvn.ao).orElse(ImmutableList.of());
   }

   private static boolean h(cds $$0) {
      return $$0.dO().a(bvn.av);
   }

   private static boolean i(cds $$0) {
      return $$0.dO().a(bvn.r);
   }

   protected static boolean c(cds $$0) {
      return $$0.dO().a(bvn.aw);
   }
}
