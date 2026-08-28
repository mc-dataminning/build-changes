import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cmr {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bvo<?> a(cmq $$0, bvo<cmq> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cpp.a));
      $$1.b(cpp.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cmq $$0) {
      jn $$1 = jn.a($$0.dS().ag(), $$0.ds());
      $$0.dY().a(cdq.b, $$1);
   }

   private static void b(cmq $$0, bvo<cmq> $$1) {
      $$1.a(cpp.a, 0, ImmutableList.of(new bxl(45, 90), new bxp(), bxd.a(), byv.a()));
   }

   private static void c(cmq $$0, bvo<cmq> $$1) {
      $$1.a(cpp.b, 10, ImmutableList.of(byr.a(cmr::a), a(), b(), byh.a(bty.by, 4)));
   }

   private static void d(cmq $$0, bvo<cmq> $$1) {
      $$1.a(cpp.k, 10, ImmutableList.of(byu.a($$1x -> !a((cmm)$$0, $$1x)), byk.a(1.0F), bxm.a(20)), cdq.o);
   }

   private static byc<cmq> a() {
      return new byc<>(
         ImmutableList.of(
            Pair.of(bye.a(bty.by, 8.0F), 1),
            Pair.of(bye.a(bty.aA, 8.0F), 1),
            Pair.of(bye.a(bty.aB, 8.0F), 1),
            Pair.of(bye.a(8.0F), 1),
            Pair.of(new bwp(30, 60), 1)
         )
      );
   }

   private static byc<cmq> b() {
      return new byc<>(
         ImmutableList.of(
            Pair.of(bxx.a(0.6F), 2),
            Pair.of(bxc.a(bty.aA, 8, cdq.q, 0.6F, 2), 2),
            Pair.of(bxc.a(bty.aB, 8, cdq.q, 0.6F, 2), 2),
            Pair.of(byx.a(cdq.b, 0.6F, 2, 100), 2),
            Pair.of(byw.a(cdq.b, 0.6F, 5), 2),
            Pair.of(new bwp(30, 60), 1)
         )
      );
   }

   protected static void b(cmq $$0) {
      bvo<cmq> $$1 = $$0.dY();
      cpp $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cpp.k, cpp.b));
      cpp $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cdq.o));
   }

   private static boolean a(cmm $$0, bun $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bun> a(cmm $$0) {
      Optional<bun> $$1 = bwh.a($$0, cdq.ab);
      if ($$1.isPresent() && cew.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bun> $$2 = $$0.dY().c(cdq.l);
         return $$2.isPresent() ? $$2 : $$0.dY().c(cdq.M);
      }
   }

   protected static void a(cmq $$0, bun $$1) {
      if (!($$1 instanceof cmm)) {
         cmo.a($$0, $$1);
      }
   }

   protected static void b(cmq $$0, bun $$1) {
      $$0.dY().b(cdq.E);
      $$0.dY().a(cdq.ab, $$1.cD(), 600L);
   }

   protected static void c(cmq $$0) {
      if ((double)$$0.dS().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cmq $$0) {
      $$0.dY().g().ifPresent($$1 -> {
         if ($$1 == cpp.k) {
            $$0.gv();
         }
      });
   }
}
