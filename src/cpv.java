import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cpv {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bye<?> a(cpu $$0, bye<cpu> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(csw.a));
      $$1.b(csw.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cpu $$0) {
      jd $$1 = jd.a($$0.dV().aj(), $$0.dv());
      $$0.ec().a(cgg.b, $$1);
   }

   private static void b(cpu $$0, bye<cpu> $$1) {
      $$1.a(csw.a, 0, ImmutableList.of(new cab(45, 90), new caf(), bzt.a(), cbl.a()));
   }

   private static void c(cpu $$0, bye<cpu> $$1) {
      $$1.a(csw.b, 10, ImmutableList.of(cbh.a(cpv::a), a(), b(), cax.a(bwo.bS, 4)));
   }

   private static void d(cpu $$0, bye<cpu> $$1) {
      $$1.a(csw.k, 10, ImmutableList.of(cbk.a(($$1x, $$2) -> !a($$1x, (cpq)$$0, $$2)), cba.a(1.0F), cac.a(20)), cgg.p);
   }

   private static cas<cpu> a() {
      return new cas<>(
         ImmutableList.of(
            Pair.of(cau.a(bwo.bS, 8.0F), 1),
            Pair.of(cau.a(bwo.aR, 8.0F), 1),
            Pair.of(cau.a(bwo.aS, 8.0F), 1),
            Pair.of(cau.a(8.0F), 1),
            Pair.of(new bzf(30, 60), 1)
         )
      );
   }

   private static cas<cpu> b() {
      return new cas<>(
         ImmutableList.of(
            Pair.of(can.a(0.6F), 2),
            Pair.of(bzs.a(bwo.aR, 8, cgg.r, 0.6F, 2), 2),
            Pair.of(bzs.a(bwo.aS, 8, cgg.r, 0.6F, 2), 2),
            Pair.of(cbn.a(cgg.b, 0.6F, 2, 100), 2),
            Pair.of(cbm.a(cgg.b, 0.6F, 5), 2),
            Pair.of(new bzf(30, 60), 1)
         )
      );
   }

   protected static void b(cpu $$0) {
      bye<cpu> $$1 = $$0.ec();
      csw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(csw.k, csw.b));
      csw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cgg.p));
   }

   private static boolean a(arq $$0, cpq $$1, bxe $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bxe> a(arq $$0, cpq $$1) {
      Optional<bxe> $$2 = byx.a($$1, cgg.ac);
      if ($$2.isPresent() && chm.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bxe> $$3 = $$1.ec().c(cgg.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cgg.N);
      }
   }

   protected static void a(arq $$0, cpu $$1, bxe $$2) {
      if (!($$2 instanceof cpq)) {
         cps.a($$0, $$1, $$2);
      }
   }

   protected static void a(cpu $$0, bxe $$1) {
      $$0.ec().b(cgg.F);
      $$0.ec().a(cgg.ac, $$1.cG(), 600L);
   }

   protected static void c(cpu $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cpu $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == csw.k) {
            $$0.gv();
         }
      });
   }
}
