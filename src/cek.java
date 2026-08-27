import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cek {
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

   protected static bno<?> a(cej $$0, bno<cej> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(chc.a));
      $$1.b(chc.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cej $$0) {
      ig $$1 = ig.a($$0.dL().ae(), $$0.dl());
      $$0.dN().a(bvq.b, $$1);
   }

   private static void b(cej $$0, bno<cej> $$1) {
      $$1.a(chc.a, 0, ImmutableList.of(new bpl(45, 90), new bpp(), bpd.a(), bqv.a()));
   }

   private static void c(cej $$0, bno<cej> $$1) {
      $$1.a(chc.b, 10, ImmutableList.of(bqr.a(cek::a), a(), b(), bqh.a(bmc.bw, 4)));
   }

   private static void d(cej $$0, bno<cej> $$1) {
      $$1.a(chc.k, 10, ImmutableList.of(bqu.a($$1x -> !a((cef)$$0, $$1x)), bqk.a(1.0F), bpm.a(20)), bvq.o);
   }

   private static bqc<cej> a() {
      return new bqc<>(
         ImmutableList.of(
            Pair.of(bqe.a(bmc.bw, 8.0F), 1),
            Pair.of(bqe.a(bmc.ay, 8.0F), 1),
            Pair.of(bqe.a(bmc.az, 8.0F), 1),
            Pair.of(bqe.a(8.0F), 1),
            Pair.of(new bop(30, 60), 1)
         )
      );
   }

   private static bqc<cej> b() {
      return new bqc<>(
         ImmutableList.of(
            Pair.of(bpx.a(0.6F), 2),
            Pair.of(bpc.a(bmc.ay, 8, bvq.q, 0.6F, 2), 2),
            Pair.of(bpc.a(bmc.az, 8, bvq.q, 0.6F, 2), 2),
            Pair.of(bqx.a(bvq.b, 0.6F, 2, 100), 2),
            Pair.of(bqw.a(bvq.b, 0.6F, 5), 2),
            Pair.of(new bop(30, 60), 1)
         )
      );
   }

   protected static void b(cej $$0) {
      bno<cej> $$1 = $$0.dN();
      chc $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(chc.k, chc.b));
      chc $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bvq.o));
   }

   private static boolean a(cef $$0, bmo $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bmo> a(cef $$0) {
      Optional<bmo> $$1 = boh.a($$0, bvq.ab);
      if ($$1.isPresent() && bww.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bmo> $$2 = a($$0, bvq.l);
         return $$2.isPresent() ? $$2 : $$0.dN().c(bvq.M);
      }
   }

   private static Optional<? extends bmo> a(cef $$0, bvq<? extends bmo> $$1) {
      return $$0.dN().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cej $$0, bmo $$1) {
      if (!($$1 instanceof cef)) {
         ceh.a($$0, $$1);
      }
   }

   protected static void b(cej $$0, bmo $$1) {
      $$0.dN().b(bvq.E);
      $$0.dN().a(bvq.ab, $$1.cw(), 600L);
   }

   protected static void c(cej $$0) {
      if ((double)$$0.dL().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cej $$0) {
      $$0.dN().g().ifPresent($$1 -> {
         if ($$1 == chc.k) {
            $$0.gm();
         }
      });
   }
}
