import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class chm {
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

   protected static bqp<?> a(chl $$0, bqp<chl> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ckh.a));
      $$1.b(ckh.b);
      $$1.f();
      return $$1;
   }

   protected static void a(chl $$0) {
      ik $$1 = ik.a($$0.dM().ad(), $$0.dm());
      $$0.dP().a(byr.b, $$1);
   }

   private static void b(chl $$0, bqp<chl> $$1) {
      $$1.a(ckh.a, 0, ImmutableList.of(new bsm(45, 90), new bsq(), bse.a(), btw.a()));
   }

   private static void c(chl $$0, bqp<chl> $$1) {
      $$1.a(ckh.b, 10, ImmutableList.of(bts.a(chm::a), a(), b(), bti.a(bpc.bx, 4)));
   }

   private static void d(chl $$0, bqp<chl> $$1) {
      $$1.a(ckh.k, 10, ImmutableList.of(btv.a($$1x -> !a((chh)$$0, $$1x)), btl.a(1.0F), bsn.a(20)), byr.o);
   }

   private static btd<chl> a() {
      return new btd<>(
         ImmutableList.of(
            Pair.of(btf.a(bpc.bx, 8.0F), 1),
            Pair.of(btf.a(bpc.az, 8.0F), 1),
            Pair.of(btf.a(bpc.aA, 8.0F), 1),
            Pair.of(btf.a(8.0F), 1),
            Pair.of(new brq(30, 60), 1)
         )
      );
   }

   private static btd<chl> b() {
      return new btd<>(
         ImmutableList.of(
            Pair.of(bsy.a(0.6F), 2),
            Pair.of(bsd.a(bpc.az, 8, byr.q, 0.6F, 2), 2),
            Pair.of(bsd.a(bpc.aA, 8, byr.q, 0.6F, 2), 2),
            Pair.of(bty.a(byr.b, 0.6F, 2, 100), 2),
            Pair.of(btx.a(byr.b, 0.6F, 5), 2),
            Pair.of(new brq(30, 60), 1)
         )
      );
   }

   protected static void b(chl $$0) {
      bqp<chl> $$1 = $$0.dP();
      ckh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ckh.k, ckh.b));
      ckh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(byr.o));
   }

   private static boolean a(chh $$0, bpo $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bpo> a(chh $$0) {
      Optional<bpo> $$1 = bri.a($$0, byr.ab);
      if ($$1.isPresent() && bzx.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bpo> $$2 = a($$0, byr.l);
         return $$2.isPresent() ? $$2 : $$0.dP().c(byr.M);
      }
   }

   private static Optional<? extends bpo> a(chh $$0, byr<? extends bpo> $$1) {
      return $$0.dP().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(chl $$0, bpo $$1) {
      if (!($$1 instanceof chh)) {
         chj.a($$0, $$1);
      }
   }

   protected static void b(chl $$0, bpo $$1) {
      $$0.dP().b(byr.E);
      $$0.dP().a(byr.ab, $$1.cw(), 600L);
   }

   protected static void c(chl $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(chl $$0) {
      $$0.dP().g().ifPresent($$1 -> {
         if ($$1 == ckh.k) {
            $$0.gu();
         }
      });
   }
}
