import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cnq {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwk<?> a(cnp $$0, bwk<cnp> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cqp.a));
      $$1.b(cqp.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnp $$0) {
      jq $$1 = jq.a($$0.dV().ai(), $$0.dv());
      $$0.eb().a(cem.b, $$1);
   }

   private static void b(cnp $$0, bwk<cnp> $$1) {
      $$1.a(cqp.a, 0, ImmutableList.of(new byh(45, 90), new byl(), bxz.a(), bzr.a()));
   }

   private static void c(cnp $$0, bwk<cnp> $$1) {
      $$1.a(cqp.b, 10, ImmutableList.of(bzn.a(cnq::a), a(), b(), bzd.a(but.bR, 4)));
   }

   private static void d(cnp $$0, bwk<cnp> $$1) {
      $$1.a(cqp.k, 10, ImmutableList.of(bzq.a(($$1x, $$2) -> !a($$1x, (cnl)$$0, $$2)), bzg.a(1.0F), byi.a(20)), cem.o);
   }

   private static byy<cnp> a() {
      return new byy<>(
         ImmutableList.of(
            Pair.of(bza.a(but.bR, 8.0F), 1),
            Pair.of(bza.a(but.aR, 8.0F), 1),
            Pair.of(bza.a(but.aS, 8.0F), 1),
            Pair.of(bza.a(8.0F), 1),
            Pair.of(new bxl(30, 60), 1)
         )
      );
   }

   private static byy<cnp> b() {
      return new byy<>(
         ImmutableList.of(
            Pair.of(byt.a(0.6F), 2),
            Pair.of(bxy.a(but.aR, 8, cem.q, 0.6F, 2), 2),
            Pair.of(bxy.a(but.aS, 8, cem.q, 0.6F, 2), 2),
            Pair.of(bzt.a(cem.b, 0.6F, 2, 100), 2),
            Pair.of(bzs.a(cem.b, 0.6F, 5), 2),
            Pair.of(new bxl(30, 60), 1)
         )
      );
   }

   protected static void b(cnp $$0) {
      bwk<cnp> $$1 = $$0.eb();
      cqp $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqp.k, cqp.b));
      cqp $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cem.o));
   }

   private static boolean a(ard $$0, cnl $$1, bvi $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvi> a(ard $$0, cnl $$1) {
      Optional<bvi> $$2 = bxd.a($$1, cem.ab);
      if ($$2.isPresent() && cfs.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvi> $$3 = $$1.eb().c(cem.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cem.M);
      }
   }

   protected static void a(ard $$0, cnp $$1, bvi $$2) {
      if (!($$2 instanceof cnl)) {
         cnn.a($$0, $$1, $$2);
      }
   }

   protected static void a(cnp $$0, bvi $$1) {
      $$0.eb().b(cem.E);
      $$0.eb().a(cem.ab, $$1.cG(), 600L);
   }

   protected static void c(cnp $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cnp $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == cqp.k) {
            $$0.gy();
         }
      });
   }
}
