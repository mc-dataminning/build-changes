import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cqs {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static byw<?> a(cqr $$0, byw<cqr> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ctt.a));
      $$1.b(ctt.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cqr $$0) {
      jf $$1 = jf.a($$0.dV().aj(), $$0.dv());
      $$0.ec().a(cgy.b, $$1);
   }

   private static void b(cqr $$0, byw<cqr> $$1) {
      $$1.a(ctt.a, 0, ImmutableList.of(new cat(45, 90), new cax(), cal.a(), ccd.a()));
   }

   private static void c(cqr $$0, byw<cqr> $$1) {
      $$1.a(ctt.b, 10, ImmutableList.of(cbz.a(cqs::a), a(), b(), cbp.a(bxe.bT, 4)));
   }

   private static void d(cqr $$0, byw<cqr> $$1) {
      $$1.a(ctt.k, 10, ImmutableList.of(ccc.a(($$1x, $$2) -> !a($$1x, (cqn)$$0, $$2)), cbs.a(1.0F), cau.a(20)), cgy.p);
   }

   private static cbk<cqr> a() {
      return new cbk<>(
         ImmutableList.of(
            Pair.of(cbm.a(bxe.bT, 8.0F), 1),
            Pair.of(cbm.a(bxe.aS, 8.0F), 1),
            Pair.of(cbm.a(bxe.aT, 8.0F), 1),
            Pair.of(cbm.a(8.0F), 1),
            Pair.of(new bzx(30, 60), 1)
         )
      );
   }

   private static cbk<cqr> b() {
      return new cbk<>(
         ImmutableList.of(
            Pair.of(cbf.a(0.6F), 2),
            Pair.of(cak.a(bxe.aS, 8, cgy.r, 0.6F, 2), 2),
            Pair.of(cak.a(bxe.aT, 8, cgy.r, 0.6F, 2), 2),
            Pair.of(ccf.a(cgy.b, 0.6F, 2, 100), 2),
            Pair.of(cce.a(cgy.b, 0.6F, 5), 2),
            Pair.of(new bzx(30, 60), 1)
         )
      );
   }

   protected static void b(cqr $$0) {
      byw<cqr> $$1 = $$0.ec();
      ctt $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctt.k, ctt.b));
      ctt $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cgy.p));
   }

   private static boolean a(aru $$0, cqn $$1, bxw $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bxw> a(aru $$0, cqn $$1) {
      Optional<bxw> $$2 = bzp.a($$1, cgy.ac);
      if ($$2.isPresent() && cie.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bxw> $$3 = $$1.ec().c(cgy.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cgy.N);
      }
   }

   protected static void a(aru $$0, cqr $$1, bxw $$2) {
      if (!($$2 instanceof cqn)) {
         cqp.a($$0, $$1, $$2);
      }
   }

   protected static void a(cqr $$0, bxw $$1) {
      $$0.ec().b(cgy.F);
      $$0.ec().a(cgy.ac, $$1.cG(), 600L);
   }

   protected static void c(cqr $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cqr $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == ctt.k) {
            $$0.gy();
         }
      });
   }
}
