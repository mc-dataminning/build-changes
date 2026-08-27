import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cin {
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

   protected static brp<?> a(cim $$0, brp<cim> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cli.a));
      $$1.b(cli.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cim $$0) {
      ik $$1 = ik.a($$0.dM().ae(), $$0.dm());
      $$0.dP().a(bzr.b, $$1);
   }

   private static void b(cim $$0, brp<cim> $$1) {
      $$1.a(cli.a, 0, ImmutableList.of(new btm(45, 90), new btq(), bte.a(), buw.a()));
   }

   private static void c(cim $$0, brp<cim> $$1) {
      $$1.a(cli.b, 10, ImmutableList.of(bus.a(cin::a), a(), b(), bui.a(bqb.bx, 4)));
   }

   private static void d(cim $$0, brp<cim> $$1) {
      $$1.a(cli.k, 10, ImmutableList.of(buv.a($$1x -> !a((cii)$$0, $$1x)), bul.a(1.0F), btn.a(20)), bzr.o);
   }

   private static bud<cim> a() {
      return new bud<>(
         ImmutableList.of(
            Pair.of(buf.a(bqb.bx, 8.0F), 1),
            Pair.of(buf.a(bqb.az, 8.0F), 1),
            Pair.of(buf.a(bqb.aA, 8.0F), 1),
            Pair.of(buf.a(8.0F), 1),
            Pair.of(new bsq(30, 60), 1)
         )
      );
   }

   private static bud<cim> b() {
      return new bud<>(
         ImmutableList.of(
            Pair.of(bty.a(0.6F), 2),
            Pair.of(btd.a(bqb.az, 8, bzr.q, 0.6F, 2), 2),
            Pair.of(btd.a(bqb.aA, 8, bzr.q, 0.6F, 2), 2),
            Pair.of(buy.a(bzr.b, 0.6F, 2, 100), 2),
            Pair.of(bux.a(bzr.b, 0.6F, 5), 2),
            Pair.of(new bsq(30, 60), 1)
         )
      );
   }

   protected static void b(cim $$0) {
      brp<cim> $$1 = $$0.dP();
      cli $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cli.k, cli.b));
      cli $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bzr.o));
   }

   private static boolean a(cii $$0, bqo $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bqo> a(cii $$0) {
      Optional<bqo> $$1 = bsi.a($$0, bzr.ab);
      if ($$1.isPresent() && cax.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bqo> $$2 = a($$0, bzr.l);
         return $$2.isPresent() ? $$2 : $$0.dP().c(bzr.M);
      }
   }

   private static Optional<? extends bqo> a(cii $$0, bzr<? extends bqo> $$1) {
      return $$0.dP().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cim $$0, bqo $$1) {
      if (!($$1 instanceof cii)) {
         cik.a($$0, $$1);
      }
   }

   protected static void b(cim $$0, bqo $$1) {
      $$0.dP().b(bzr.E);
      $$0.dP().a(bzr.ab, $$1.cw(), 600L);
   }

   protected static void c(cim $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cim $$0) {
      $$0.dP().g().ifPresent($$1 -> {
         if ($$1 == cli.k) {
            $$0.gu();
         }
      });
   }
}
