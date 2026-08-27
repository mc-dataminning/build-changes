import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cec {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final double f = 12.0;
   private static final float g = 0.6F;
   private static final int h = 2;
   private static final int i = 100;
   private static final int j = 5;

   protected static bnl<?> a(ceb $$0, bnl<ceb> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cgu.a));
      $$1.b(cgu.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ceb $$0) {
      ig $$1 = ig.a($$0.dM().ae(), $$0.dm());
      $$0.dO().a(bvn.b, $$1);
   }

   private static void b(ceb $$0, bnl<ceb> $$1) {
      $$1.a(cgu.a, 0, ImmutableList.of(new bpi(45, 90), new bpm(), bpa.a(), bqs.a()));
   }

   private static void c(ceb $$0, bnl<ceb> $$1) {
      $$1.a(cgu.b, 10, ImmutableList.of(bqo.a(cec::a), a(), b(), bqe.a(blz.bv, 4)));
   }

   private static void d(ceb $$0, bnl<ceb> $$1) {
      $$1.a(cgu.k, 10, ImmutableList.of(bqr.a($$1x -> !a((cdx)$$0, $$1x)), bqh.a(1.0F), bpj.a(20)), bvn.o);
   }

   private static bpz<ceb> a() {
      return new bpz<>(
         ImmutableList.of(
            Pair.of(bqb.a(blz.bv, 8.0F), 1),
            Pair.of(bqb.a(blz.ax, 8.0F), 1),
            Pair.of(bqb.a(blz.ay, 8.0F), 1),
            Pair.of(bqb.a(8.0F), 1),
            Pair.of(new bom(30, 60), 1)
         )
      );
   }

   private static bpz<ceb> b() {
      return new bpz<>(
         ImmutableList.of(
            Pair.of(bpu.a(0.6F), 2),
            Pair.of(boz.a(blz.ax, 8, bvn.q, 0.6F, 2), 2),
            Pair.of(boz.a(blz.ay, 8, bvn.q, 0.6F, 2), 2),
            Pair.of(bqu.a(bvn.b, 0.6F, 2, 100), 2),
            Pair.of(bqt.a(bvn.b, 0.6F, 5), 2),
            Pair.of(new bom(30, 60), 1)
         )
      );
   }

   protected static void b(ceb $$0) {
      bnl<ceb> $$1 = $$0.dO();
      cgu $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cgu.k, cgu.b));
      cgu $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bvn.o));
   }

   private static boolean a(cdx $$0, bml $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bml> a(cdx $$0) {
      Optional<bml> $$1 = boe.a($$0, bvn.aa);
      if ($$1.isPresent() && bws.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bml> $$2 = a($$0, bvn.l);
         return $$2.isPresent() ? $$2 : $$0.dO().c(bvn.L);
      }
   }

   private static Optional<? extends bml> a(cdx $$0, bvn<? extends bml> $$1) {
      return $$0.dO().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(ceb $$0, bml $$1) {
      if (!($$1 instanceof cdx)) {
         cdz.a($$0, $$1);
      }
   }

   protected static void b(ceb $$0, bml $$1) {
      $$0.dO().b(bvn.E);
      $$0.dO().a(bvn.aa, $$1.cw(), 600L);
   }

   protected static void c(ceb $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ceb $$0) {
      $$0.dO().g().ifPresent($$1 -> {
         if ($$1 == cgu.k) {
            $$0.gl();
         }
      });
   }
}
