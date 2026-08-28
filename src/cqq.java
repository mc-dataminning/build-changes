import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cqq {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static byu<?> a(cqp $$0, byu<cqp> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ctr.a));
      $$1.b(ctr.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cqp $$0) {
      je $$1 = je.a($$0.dV().aj(), $$0.dv());
      $$0.ec().a(cgw.b, $$1);
   }

   private static void b(cqp $$0, byu<cqp> $$1) {
      $$1.a(ctr.a, 0, ImmutableList.of(new car(45, 90), new cav(), caj.a(), ccb.a()));
   }

   private static void c(cqp $$0, byu<cqp> $$1) {
      $$1.a(ctr.b, 10, ImmutableList.of(cbx.a(cqq::a), a(), b(), cbn.a(bxc.bT, 4)));
   }

   private static void d(cqp $$0, byu<cqp> $$1) {
      $$1.a(ctr.k, 10, ImmutableList.of(cca.a(($$1x, $$2) -> !a($$1x, (cql)$$0, $$2)), cbq.a(1.0F), cas.a(20)), cgw.p);
   }

   private static cbi<cqp> a() {
      return new cbi<>(
         ImmutableList.of(
            Pair.of(cbk.a(bxc.bT, 8.0F), 1),
            Pair.of(cbk.a(bxc.aS, 8.0F), 1),
            Pair.of(cbk.a(bxc.aT, 8.0F), 1),
            Pair.of(cbk.a(8.0F), 1),
            Pair.of(new bzv(30, 60), 1)
         )
      );
   }

   private static cbi<cqp> b() {
      return new cbi<>(
         ImmutableList.of(
            Pair.of(cbd.a(0.6F), 2),
            Pair.of(cai.a(bxc.aS, 8, cgw.r, 0.6F, 2), 2),
            Pair.of(cai.a(bxc.aT, 8, cgw.r, 0.6F, 2), 2),
            Pair.of(ccd.a(cgw.b, 0.6F, 2, 100), 2),
            Pair.of(ccc.a(cgw.b, 0.6F, 5), 2),
            Pair.of(new bzv(30, 60), 1)
         )
      );
   }

   protected static void b(cqp $$0) {
      byu<cqp> $$1 = $$0.ec();
      ctr $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctr.k, ctr.b));
      ctr $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cgw.p));
   }

   private static boolean a(ars $$0, cql $$1, bxu $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bxu> a(ars $$0, cql $$1) {
      Optional<bxu> $$2 = bzn.a($$1, cgw.ac);
      if ($$2.isPresent() && cic.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bxu> $$3 = $$1.ec().c(cgw.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cgw.N);
      }
   }

   protected static void a(ars $$0, cqp $$1, bxu $$2) {
      if (!($$2 instanceof cql)) {
         cqn.a($$0, $$1, $$2);
      }
   }

   protected static void a(cqp $$0, bxu $$1) {
      $$0.ec().b(cgw.F);
      $$0.ec().a(cgw.ac, $$1.cG(), 600L);
   }

   protected static void c(cqp $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cqp $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == ctr.k) {
            $$0.gy();
         }
      });
   }
}
