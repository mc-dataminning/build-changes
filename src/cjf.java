import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cjf {
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

   protected static bsf<?> a(cje $$0, bsf<cje> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cma.a));
      $$1.b(cma.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cje $$0) {
      iu $$1 = iu.a($$0.dN().ae(), $$0.dn());
      $$0.dQ().a(cah.b, $$1);
   }

   private static void b(cje $$0, bsf<cje> $$1) {
      $$1.a(cma.a, 0, ImmutableList.of(new buc(45, 90), new bug(), btu.a(), bvm.a()));
   }

   private static void c(cje $$0, bsf<cje> $$1) {
      $$1.a(cma.b, 10, ImmutableList.of(bvi.a(cjf::a), a(), b(), buy.a(bqr.bx, 4)));
   }

   private static void d(cje $$0, bsf<cje> $$1) {
      $$1.a(cma.k, 10, ImmutableList.of(bvl.a($$1x -> !a((cja)$$0, $$1x)), bvb.a(1.0F), bud.a(20)), cah.o);
   }

   private static but<cje> a() {
      return new but<>(
         ImmutableList.of(
            Pair.of(buv.a(bqr.bx, 8.0F), 1),
            Pair.of(buv.a(bqr.az, 8.0F), 1),
            Pair.of(buv.a(bqr.aA, 8.0F), 1),
            Pair.of(buv.a(8.0F), 1),
            Pair.of(new btg(30, 60), 1)
         )
      );
   }

   private static but<cje> b() {
      return new but<>(
         ImmutableList.of(
            Pair.of(buo.a(0.6F), 2),
            Pair.of(btt.a(bqr.az, 8, cah.q, 0.6F, 2), 2),
            Pair.of(btt.a(bqr.aA, 8, cah.q, 0.6F, 2), 2),
            Pair.of(bvo.a(cah.b, 0.6F, 2, 100), 2),
            Pair.of(bvn.a(cah.b, 0.6F, 5), 2),
            Pair.of(new btg(30, 60), 1)
         )
      );
   }

   protected static void b(cje $$0) {
      bsf<cje> $$1 = $$0.dQ();
      cma $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cma.k, cma.b));
      cma $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cah.o));
   }

   private static boolean a(cja $$0, bre $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bre> a(cja $$0) {
      Optional<bre> $$1 = bsy.a($$0, cah.ab);
      if ($$1.isPresent() && cbn.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bre> $$2 = a($$0, cah.l);
         return $$2.isPresent() ? $$2 : $$0.dQ().c(cah.M);
      }
   }

   private static Optional<? extends bre> a(cja $$0, cah<? extends bre> $$1) {
      return $$0.dQ().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cje $$0, bre $$1) {
      if (!($$1 instanceof cja)) {
         cjc.a($$0, $$1);
      }
   }

   protected static void b(cje $$0, bre $$1) {
      $$0.dQ().b(cah.E);
      $$0.dQ().a(cah.ab, $$1.cx(), 600L);
   }

   protected static void c(cje $$0) {
      if ((double)$$0.dN().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cje $$0) {
      $$0.dQ().g().ifPresent($$1 -> {
         if ($$1 == cma.k) {
            $$0.gw();
         }
      });
   }
}
