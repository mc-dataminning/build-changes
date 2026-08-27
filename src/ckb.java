import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ckb {
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

   protected static btb<?> a(cka $$0, btb<cka> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cmw.a));
      $$1.b(cmw.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cka $$0) {
      iv $$1 = iv.a($$0.dN().ae(), $$0.dn());
      $$0.dQ().a(cbd.b, $$1);
   }

   private static void b(cka $$0, btb<cka> $$1) {
      $$1.a(cmw.a, 0, ImmutableList.of(new buy(45, 90), new bvc(), buq.a(), bwi.a()));
   }

   private static void c(cka $$0, btb<cka> $$1) {
      $$1.a(cmw.b, 10, ImmutableList.of(bwe.a(ckb::a), a(), b(), bvu.a(brn.bx, 4)));
   }

   private static void d(cka $$0, btb<cka> $$1) {
      $$1.a(cmw.k, 10, ImmutableList.of(bwh.a($$1x -> !a((cjw)$$0, $$1x)), bvx.a(1.0F), buz.a(20)), cbd.o);
   }

   private static bvp<cka> a() {
      return new bvp<>(
         ImmutableList.of(
            Pair.of(bvr.a(brn.bx, 8.0F), 1),
            Pair.of(bvr.a(brn.az, 8.0F), 1),
            Pair.of(bvr.a(brn.aA, 8.0F), 1),
            Pair.of(bvr.a(8.0F), 1),
            Pair.of(new buc(30, 60), 1)
         )
      );
   }

   private static bvp<cka> b() {
      return new bvp<>(
         ImmutableList.of(
            Pair.of(bvk.a(0.6F), 2),
            Pair.of(bup.a(brn.az, 8, cbd.q, 0.6F, 2), 2),
            Pair.of(bup.a(brn.aA, 8, cbd.q, 0.6F, 2), 2),
            Pair.of(bwk.a(cbd.b, 0.6F, 2, 100), 2),
            Pair.of(bwj.a(cbd.b, 0.6F, 5), 2),
            Pair.of(new buc(30, 60), 1)
         )
      );
   }

   protected static void b(cka $$0) {
      btb<cka> $$1 = $$0.dQ();
      cmw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cmw.k, cmw.b));
      cmw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cbd.o));
   }

   private static boolean a(cjw $$0, bsa $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bsa> a(cjw $$0) {
      Optional<bsa> $$1 = btu.a($$0, cbd.ab);
      if ($$1.isPresent() && ccj.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bsa> $$2 = a($$0, cbd.l);
         return $$2.isPresent() ? $$2 : $$0.dQ().c(cbd.M);
      }
   }

   private static Optional<? extends bsa> a(cjw $$0, cbd<? extends bsa> $$1) {
      return $$0.dQ().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cka $$0, bsa $$1) {
      if (!($$1 instanceof cjw)) {
         cjy.a($$0, $$1);
      }
   }

   protected static void b(cka $$0, bsa $$1) {
      $$0.dQ().b(cbd.E);
      $$0.dQ().a(cbd.ab, $$1.cx(), 600L);
   }

   protected static void c(cka $$0) {
      if ((double)$$0.dN().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cka $$0) {
      $$0.dQ().g().ifPresent($$1 -> {
         if ($$1 == cmw.k) {
            $$0.gw();
         }
      });
   }
}
