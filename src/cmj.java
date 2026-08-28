import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cmj {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bvg<?> a(cmi $$0, bvg<cmi> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cpg.a));
      $$1.b(cpg.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cmi $$0) {
      jm $$1 = jm.a($$0.dS().ag(), $$0.ds());
      $$0.dX().a(cdi.b, $$1);
   }

   private static void b(cmi $$0, bvg<cmi> $$1) {
      $$1.a(cpg.a, 0, ImmutableList.of(new bxd(45, 90), new bxh(), bwv.a(), byn.a()));
   }

   private static void c(cmi $$0, bvg<cmi> $$1) {
      $$1.a(cpg.b, 10, ImmutableList.of(byj.a(cmj::a), a(), b(), bxz.a(btq.by, 4)));
   }

   private static void d(cmi $$0, bvg<cmi> $$1) {
      $$1.a(cpg.k, 10, ImmutableList.of(bym.a($$1x -> !a((cme)$$0, $$1x)), byc.a(1.0F), bxe.a(20)), cdi.o);
   }

   private static bxu<cmi> a() {
      return new bxu<>(
         ImmutableList.of(
            Pair.of(bxw.a(btq.by, 8.0F), 1),
            Pair.of(bxw.a(btq.aA, 8.0F), 1),
            Pair.of(bxw.a(btq.aB, 8.0F), 1),
            Pair.of(bxw.a(8.0F), 1),
            Pair.of(new bwh(30, 60), 1)
         )
      );
   }

   private static bxu<cmi> b() {
      return new bxu<>(
         ImmutableList.of(
            Pair.of(bxp.a(0.6F), 2),
            Pair.of(bwu.a(btq.aA, 8, cdi.q, 0.6F, 2), 2),
            Pair.of(bwu.a(btq.aB, 8, cdi.q, 0.6F, 2), 2),
            Pair.of(byp.a(cdi.b, 0.6F, 2, 100), 2),
            Pair.of(byo.a(cdi.b, 0.6F, 5), 2),
            Pair.of(new bwh(30, 60), 1)
         )
      );
   }

   protected static void b(cmi $$0) {
      bvg<cmi> $$1 = $$0.dX();
      cpg $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpg.k, cpg.b));
      cpg $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cdi.o));
   }

   private static boolean a(cme $$0, buf $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends buf> a(cme $$0) {
      Optional<buf> $$1 = bvz.a($$0, cdi.ab);
      if ($$1.isPresent() && ceo.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends buf> $$2 = $$0.dX().c(cdi.l);
         return $$2.isPresent() ? $$2 : $$0.dX().c(cdi.M);
      }
   }

   protected static void a(cmi $$0, buf $$1) {
      if (!($$1 instanceof cme)) {
         cmg.a($$0, $$1);
      }
   }

   protected static void b(cmi $$0, buf $$1) {
      $$0.dX().b(cdi.E);
      $$0.dX().a(cdi.ab, $$1.cD(), 600L);
   }

   protected static void c(cmi $$0) {
      if ((double)$$0.dS().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cmi $$0) {
      $$0.dX().g().ifPresent($$1 -> {
         if ($$1 == cpg.k) {
            $$0.gv();
         }
      });
   }
}
