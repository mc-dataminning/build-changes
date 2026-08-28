import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cno {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwi<?> a(cnn $$0, bwi<cnn> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cqn.a));
      $$1.b(cqn.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cnn $$0) {
      jq $$1 = jq.a($$0.dV().ai(), $$0.dv());
      $$0.eb().a(cek.b, $$1);
   }

   private static void b(cnn $$0, bwi<cnn> $$1) {
      $$1.a(cqn.a, 0, ImmutableList.of(new byf(45, 90), new byj(), bxx.a(), bzp.a()));
   }

   private static void c(cnn $$0, bwi<cnn> $$1) {
      $$1.a(cqn.b, 10, ImmutableList.of(bzl.a(cno::a), a(), b(), bzb.a(bur.bR, 4)));
   }

   private static void d(cnn $$0, bwi<cnn> $$1) {
      $$1.a(cqn.k, 10, ImmutableList.of(bzo.a(($$1x, $$2) -> !a($$1x, (cnj)$$0, $$2)), bze.a(1.0F), byg.a(20)), cek.o);
   }

   private static byw<cnn> a() {
      return new byw<>(
         ImmutableList.of(
            Pair.of(byy.a(bur.bR, 8.0F), 1),
            Pair.of(byy.a(bur.aR, 8.0F), 1),
            Pair.of(byy.a(bur.aS, 8.0F), 1),
            Pair.of(byy.a(8.0F), 1),
            Pair.of(new bxj(30, 60), 1)
         )
      );
   }

   private static byw<cnn> b() {
      return new byw<>(
         ImmutableList.of(
            Pair.of(byr.a(0.6F), 2),
            Pair.of(bxw.a(bur.aR, 8, cek.q, 0.6F, 2), 2),
            Pair.of(bxw.a(bur.aS, 8, cek.q, 0.6F, 2), 2),
            Pair.of(bzr.a(cek.b, 0.6F, 2, 100), 2),
            Pair.of(bzq.a(cek.b, 0.6F, 5), 2),
            Pair.of(new bxj(30, 60), 1)
         )
      );
   }

   protected static void b(cnn $$0) {
      bwi<cnn> $$1 = $$0.eb();
      cqn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqn.k, cqn.b));
      cqn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cek.o));
   }

   private static boolean a(ard $$0, cnj $$1, bvg $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvg> a(ard $$0, cnj $$1) {
      Optional<bvg> $$2 = bxb.a($$1, cek.ab);
      if ($$2.isPresent() && cfq.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvg> $$3 = $$1.eb().c(cek.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cek.M);
      }
   }

   protected static void a(ard $$0, cnn $$1, bvg $$2) {
      if (!($$2 instanceof cnj)) {
         cnl.a($$0, $$1, $$2);
      }
   }

   protected static void a(cnn $$0, bvg $$1) {
      $$0.eb().b(cek.E);
      $$0.eb().a(cek.ab, $$1.cG(), 600L);
   }

   protected static void c(cnn $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cnn $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == cqn.k) {
            $$0.gy();
         }
      });
   }
}
