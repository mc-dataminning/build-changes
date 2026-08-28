import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cop {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bxh<?> a(coo $$0, bxh<coo> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(crn.a));
      $$1.b(crn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(coo $$0) {
      jp $$1 = jp.a($$0.dW().ah(), $$0.dw());
      $$0.ec().a(cfj.b, $$1);
   }

   private static void b(coo $$0, bxh<coo> $$1) {
      $$1.a(crn.a, 0, ImmutableList.of(new bze(45, 90), new bzi(), byw.a(), cao.a()));
   }

   private static void c(coo $$0, bxh<coo> $$1) {
      $$1.a(crn.b, 10, ImmutableList.of(cak.a(cop::a), a(), b(), caa.a(bvq.bS, 4)));
   }

   private static void d(coo $$0, bxh<coo> $$1) {
      $$1.a(crn.k, 10, ImmutableList.of(can.a(($$1x, $$2) -> !a($$1x, (coj)$$0, $$2)), cad.a(1.0F), bzf.a(20)), cfj.o);
   }

   private static bzv<coo> a() {
      return new bzv<>(
         ImmutableList.of(
            Pair.of(bzx.a(bvq.bS, 8.0F), 1),
            Pair.of(bzx.a(bvq.aS, 8.0F), 1),
            Pair.of(bzx.a(bvq.aT, 8.0F), 1),
            Pair.of(bzx.a(8.0F), 1),
            Pair.of(new byi(30, 60), 1)
         )
      );
   }

   private static bzv<coo> b() {
      return new bzv<>(
         ImmutableList.of(
            Pair.of(bzq.a(0.6F), 2),
            Pair.of(byv.a(bvq.aS, 8, cfj.q, 0.6F, 2), 2),
            Pair.of(byv.a(bvq.aT, 8, cfj.q, 0.6F, 2), 2),
            Pair.of(caq.a(cfj.b, 0.6F, 2, 100), 2),
            Pair.of(cap.a(cfj.b, 0.6F, 5), 2),
            Pair.of(new byi(30, 60), 1)
         )
      );
   }

   protected static void b(coo $$0) {
      bxh<coo> $$1 = $$0.ec();
      crn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crn.k, crn.b));
      crn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cfj.o));
   }

   private static boolean a(ash $$0, coj $$1, bwf $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bwf> a(ash $$0, coj $$1) {
      Optional<bwf> $$2 = bya.a($$1, cfj.ab);
      if ($$2.isPresent() && cgp.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bwf> $$3 = $$1.ec().c(cfj.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cfj.M);
      }
   }

   protected static void a(ash $$0, coo $$1, bwf $$2) {
      if (!($$2 instanceof coj)) {
         col.a($$0, $$1, $$2);
      }
   }

   protected static void a(coo $$0, bwf $$1) {
      $$0.ec().b(cfj.E);
      $$0.ec().a(cfj.ab, $$1.cG(), 600L);
   }

   protected static void c(coo $$0) {
      if ((double)$$0.dW().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(coo $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == crn.k) {
            $$0.gu();
         }
      });
   }
}
