import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cog {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwz<?> a(cof $$0, bwz<cof> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(crf.a));
      $$1.b(crf.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cof $$0) {
      jp $$1 = jp.a($$0.dW().ai(), $$0.dw());
      $$0.ec().a(cfb.b, $$1);
   }

   private static void b(cof $$0, bwz<cof> $$1) {
      $$1.a(crf.a, 0, ImmutableList.of(new byw(45, 90), new bza(), byo.a(), cag.a()));
   }

   private static void c(cof $$0, bwz<cof> $$1) {
      $$1.a(crf.b, 10, ImmutableList.of(cac.a(cog::a), a(), b(), bzs.a(bvi.bS, 4)));
   }

   private static void d(cof $$0, bwz<cof> $$1) {
      $$1.a(crf.k, 10, ImmutableList.of(caf.a(($$1x, $$2) -> !a($$1x, (cob)$$0, $$2)), bzv.a(1.0F), byx.a(20)), cfb.o);
   }

   private static bzn<cof> a() {
      return new bzn<>(
         ImmutableList.of(
            Pair.of(bzp.a(bvi.bS, 8.0F), 1),
            Pair.of(bzp.a(bvi.aS, 8.0F), 1),
            Pair.of(bzp.a(bvi.aT, 8.0F), 1),
            Pair.of(bzp.a(8.0F), 1),
            Pair.of(new bya(30, 60), 1)
         )
      );
   }

   private static bzn<cof> b() {
      return new bzn<>(
         ImmutableList.of(
            Pair.of(bzi.a(0.6F), 2),
            Pair.of(byn.a(bvi.aS, 8, cfb.q, 0.6F, 2), 2),
            Pair.of(byn.a(bvi.aT, 8, cfb.q, 0.6F, 2), 2),
            Pair.of(cai.a(cfb.b, 0.6F, 2, 100), 2),
            Pair.of(cah.a(cfb.b, 0.6F, 5), 2),
            Pair.of(new bya(30, 60), 1)
         )
      );
   }

   protected static void b(cof $$0) {
      bwz<cof> $$1 = $$0.ec();
      crf $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crf.k, crf.b));
      crf $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cfb.o));
   }

   private static boolean a(arx $$0, cob $$1, bvx $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvx> a(arx $$0, cob $$1) {
      Optional<bvx> $$2 = bxs.a($$1, cfb.ab);
      if ($$2.isPresent() && cgh.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvx> $$3 = $$1.ec().c(cfb.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cfb.M);
      }
   }

   protected static void a(arx $$0, cof $$1, bvx $$2) {
      if (!($$2 instanceof cob)) {
         cod.a($$0, $$1, $$2);
      }
   }

   protected static void a(cof $$0, bvx $$1) {
      $$0.ec().b(cfb.E);
      $$0.ec().a(cfb.ab, $$1.cG(), 600L);
   }

   protected static void c(cof $$0) {
      if ((double)$$0.dW().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cof $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == crf.k) {
            $$0.gu();
         }
      });
   }
}
