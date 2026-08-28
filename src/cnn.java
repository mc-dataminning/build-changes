import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cnn {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwh<?> a(cnm $$0, bwh<cnm> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cqm.a));
      $$1.b(cqm.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnm $$0) {
      jq $$1 = jq.a($$0.dW().ai(), $$0.dw());
      $$0.ec().a(cej.b, $$1);
   }

   private static void b(cnm $$0, bwh<cnm> $$1) {
      $$1.a(cqm.a, 0, ImmutableList.of(new bye(45, 90), new byi(), bxw.a(), bzo.a()));
   }

   private static void c(cnm $$0, bwh<cnm> $$1) {
      $$1.a(cqm.b, 10, ImmutableList.of(bzk.a(cnn::a), a(), b(), bza.a(buq.bR, 4)));
   }

   private static void d(cnm $$0, bwh<cnm> $$1) {
      $$1.a(cqm.k, 10, ImmutableList.of(bzn.a(($$1x, $$2) -> !a($$1x, (cni)$$0, $$2)), bzd.a(1.0F), byf.a(20)), cej.o);
   }

   private static byv<cnm> a() {
      return new byv<>(
         ImmutableList.of(
            Pair.of(byx.a(buq.bR, 8.0F), 1),
            Pair.of(byx.a(buq.aR, 8.0F), 1),
            Pair.of(byx.a(buq.aS, 8.0F), 1),
            Pair.of(byx.a(8.0F), 1),
            Pair.of(new bxi(30, 60), 1)
         )
      );
   }

   private static byv<cnm> b() {
      return new byv<>(
         ImmutableList.of(
            Pair.of(byq.a(0.6F), 2),
            Pair.of(bxv.a(buq.aR, 8, cej.q, 0.6F, 2), 2),
            Pair.of(bxv.a(buq.aS, 8, cej.q, 0.6F, 2), 2),
            Pair.of(bzq.a(cej.b, 0.6F, 2, 100), 2),
            Pair.of(bzp.a(cej.b, 0.6F, 5), 2),
            Pair.of(new bxi(30, 60), 1)
         )
      );
   }

   protected static void b(cnm $$0) {
      bwh<cnm> $$1 = $$0.ec();
      cqm $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqm.k, cqm.b));
      cqm $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cej.o));
   }

   private static boolean a(arc $$0, cni $$1, bvf $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvf> a(arc $$0, cni $$1) {
      Optional<bvf> $$2 = bxa.a($$1, cej.ab);
      if ($$2.isPresent() && cfp.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvf> $$3 = $$1.ec().c(cej.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cej.M);
      }
   }

   protected static void a(arc $$0, cnm $$1, bvf $$2) {
      if (!($$2 instanceof cni)) {
         cnk.a($$0, $$1, $$2);
      }
   }

   protected static void a(cnm $$0, bvf $$1) {
      $$0.ec().b(cej.E);
      $$0.ec().a(cej.ab, $$1.cG(), 600L);
   }

   protected static void c(cnm $$0) {
      if ((double)$$0.dW().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cnm $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == cqm.k) {
            $$0.gv();
         }
      });
   }
}
