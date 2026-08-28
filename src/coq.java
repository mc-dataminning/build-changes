import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class coq {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bxi<?> a(cop $$0, bxi<cop> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cro.a));
      $$1.b(cro.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cop $$0) {
      jp $$1 = jp.a($$0.dW().ah(), $$0.dw());
      $$0.ec().a(cfk.b, $$1);
   }

   private static void b(cop $$0, bxi<cop> $$1) {
      $$1.a(cro.a, 0, ImmutableList.of(new bzf(45, 90), new bzj(), byx.a(), cap.a()));
   }

   private static void c(cop $$0, bxi<cop> $$1) {
      $$1.a(cro.b, 10, ImmutableList.of(cal.a(coq::a), a(), b(), cab.a(bvr.bS, 4)));
   }

   private static void d(cop $$0, bxi<cop> $$1) {
      $$1.a(cro.k, 10, ImmutableList.of(cao.a(($$1x, $$2) -> !a($$1x, (cok)$$0, $$2)), cae.a(1.0F), bzg.a(20)), cfk.o);
   }

   private static bzw<cop> a() {
      return new bzw<>(
         ImmutableList.of(
            Pair.of(bzy.a(bvr.bS, 8.0F), 1),
            Pair.of(bzy.a(bvr.aS, 8.0F), 1),
            Pair.of(bzy.a(bvr.aT, 8.0F), 1),
            Pair.of(bzy.a(8.0F), 1),
            Pair.of(new byj(30, 60), 1)
         )
      );
   }

   private static bzw<cop> b() {
      return new bzw<>(
         ImmutableList.of(
            Pair.of(bzr.a(0.6F), 2),
            Pair.of(byw.a(bvr.aS, 8, cfk.q, 0.6F, 2), 2),
            Pair.of(byw.a(bvr.aT, 8, cfk.q, 0.6F, 2), 2),
            Pair.of(car.a(cfk.b, 0.6F, 2, 100), 2),
            Pair.of(caq.a(cfk.b, 0.6F, 5), 2),
            Pair.of(new byj(30, 60), 1)
         )
      );
   }

   protected static void b(cop $$0) {
      bxi<cop> $$1 = $$0.ec();
      cro $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cro.k, cro.b));
      cro $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cfk.o));
   }

   private static boolean a(ash $$0, cok $$1, bwg $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bwg> a(ash $$0, cok $$1) {
      Optional<bwg> $$2 = byb.a($$1, cfk.ab);
      if ($$2.isPresent() && cgq.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bwg> $$3 = $$1.ec().c(cfk.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cfk.M);
      }
   }

   protected static void a(ash $$0, cop $$1, bwg $$2) {
      if (!($$2 instanceof cok)) {
         com.a($$0, $$1, $$2);
      }
   }

   protected static void a(cop $$0, bwg $$1) {
      $$0.ec().b(cfk.E);
      $$0.ec().a(cfk.ab, $$1.cG(), 600L);
   }

   protected static void c(cop $$0) {
      if ((double)$$0.dW().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cop $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == cro.k) {
            $$0.gu();
         }
      });
   }
}
