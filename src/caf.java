import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class caf {
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

   protected static bjx<?> a(cae $$0, bjx<cae> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ccw.a));
      $$1.b(ccw.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cae $$0) {
      he $$1 = he.a($$0.dK().ac(), $$0.dk());
      $$0.dM().a(bry.b, $$1);
   }

   private static void b(cae $$0, bjx<cae> $$1) {
      $$1.a(ccw.a, 0, ImmutableList.of(new blt(45, 90), new blx(), blm.a(), bnd.a()));
   }

   private static void c(cae $$0, bjx<cae> $$1) {
      $$1.a(ccw.b, 10, ImmutableList.of(bmz.a(caf::a), a(), b(), bmp.a(bik.bt, 4)));
   }

   private static void d(cae $$0, bjx<cae> $$1) {
      $$1.a(ccw.k, 10, ImmutableList.of(bnc.a($$1x -> !a((caa)$$0, $$1x)), bms.a(1.0F), blu.a(20)), bry.o);
   }

   private static bmk<cae> a() {
      return new bmk<>(
         ImmutableList.of(
            Pair.of(bmm.a(bik.bt, 8.0F), 1),
            Pair.of(bmm.a(bik.aw, 8.0F), 1),
            Pair.of(bmm.a(bik.ax, 8.0F), 1),
            Pair.of(bmm.a(8.0F), 1),
            Pair.of(new bky(30, 60), 1)
         )
      );
   }

   private static bmk<cae> b() {
      return new bmk<>(
         ImmutableList.of(
            Pair.of(bmf.a(0.6F), 2),
            Pair.of(bll.a(bik.aw, 8, bry.q, 0.6F, 2), 2),
            Pair.of(bll.a(bik.ax, 8, bry.q, 0.6F, 2), 2),
            Pair.of(bnf.a(bry.b, 0.6F, 2, 100), 2),
            Pair.of(bne.a(bry.b, 0.6F, 5), 2),
            Pair.of(new bky(30, 60), 1)
         )
      );
   }

   protected static void b(cae $$0) {
      bjx<cae> $$1 = $$0.dM();
      ccw $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ccw.k, ccw.b));
      ccw $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bry.o));
   }

   private static boolean a(caa $$0, biw $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends biw> a(caa $$0) {
      Optional<biw> $$1 = bkq.a($$0, bry.aa);
      if ($$1.isPresent() && btc.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends biw> $$2 = a($$0, bry.l);
         return $$2.isPresent() ? $$2 : $$0.dM().c(bry.L);
      }
   }

   private static Optional<? extends biw> a(caa $$0, bry<? extends biw> $$1) {
      return $$0.dM().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cae $$0, biw $$1) {
      if (!($$1 instanceof caa)) {
         cac.a($$0, $$1);
      }
   }

   protected static void b(cae $$0, biw $$1) {
      $$0.dM().b(bry.E);
      $$0.dM().a(bry.aa, $$1.cv(), 600L);
   }

   protected static void c(cae $$0) {
      if ((double)$$0.dK().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cae $$0) {
      $$0.dM().g().ifPresent($$1 -> {
         if ($$1 == ccw.k) {
            $$0.gg();
         }
      });
   }
}
