import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ccg {
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

   protected static bly<?> a(ccf $$0, bly<ccf> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cex.a));
      $$1.b(cex.b);
      $$1.f();
      return $$1;
   }

   protected static void a(ccf $$0) {
      ia $$1 = ia.a($$0.dL().ac(), $$0.dl());
      $$0.dN().a(btz.b, $$1);
   }

   private static void b(ccf $$0, bly<ccf> $$1) {
      $$1.a(cex.a, 0, ImmutableList.of(new bnu(45, 90), new bny(), bnn.a(), bpe.a()));
   }

   private static void c(ccf $$0, bly<ccf> $$1) {
      $$1.a(cex.b, 10, ImmutableList.of(bpa.a(ccg::a), a(), b(), boq.a(bkm.bt, 4)));
   }

   private static void d(ccf $$0, bly<ccf> $$1) {
      $$1.a(cex.k, 10, ImmutableList.of(bpd.a($$1x -> !a((ccb)$$0, $$1x)), bot.a(1.0F), bnv.a(20)), btz.o);
   }

   private static bol<ccf> a() {
      return new bol<>(
         ImmutableList.of(
            Pair.of(bon.a(bkm.bt, 8.0F), 1),
            Pair.of(bon.a(bkm.aw, 8.0F), 1),
            Pair.of(bon.a(bkm.ax, 8.0F), 1),
            Pair.of(bon.a(8.0F), 1),
            Pair.of(new bmz(30, 60), 1)
         )
      );
   }

   private static bol<ccf> b() {
      return new bol<>(
         ImmutableList.of(
            Pair.of(bog.a(0.6F), 2),
            Pair.of(bnm.a(bkm.aw, 8, btz.q, 0.6F, 2), 2),
            Pair.of(bnm.a(bkm.ax, 8, btz.q, 0.6F, 2), 2),
            Pair.of(bpg.a(btz.b, 0.6F, 2, 100), 2),
            Pair.of(bpf.a(btz.b, 0.6F, 5), 2),
            Pair.of(new bmz(30, 60), 1)
         )
      );
   }

   protected static void b(ccf $$0) {
      bly<ccf> $$1 = $$0.dN();
      cex $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cex.k, cex.b));
      cex $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(btz.o));
   }

   private static boolean a(ccb $$0, bky $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bky> a(ccb $$0) {
      Optional<bky> $$1 = bmr.a($$0, btz.aa);
      if ($$1.isPresent() && bvd.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bky> $$2 = a($$0, btz.l);
         return $$2.isPresent() ? $$2 : $$0.dN().c(btz.L);
      }
   }

   private static Optional<? extends bky> a(ccb $$0, btz<? extends bky> $$1) {
      return $$0.dN().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(ccf $$0, bky $$1) {
      if (!($$1 instanceof ccb)) {
         ccd.a($$0, $$1);
      }
   }

   protected static void b(ccf $$0, bky $$1) {
      $$0.dN().b(btz.E);
      $$0.dN().a(btz.aa, $$1.cv(), 600L);
   }

   protected static void c(ccf $$0) {
      if ((double)$$0.dL().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(ccf $$0) {
      $$0.dN().g().ifPresent($$1 -> {
         if ($$1 == cex.k) {
            $$0.gl();
         }
      });
   }
}
