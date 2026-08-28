import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cnp {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwi<?> a(cno $$0, bwi<cno> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cqo.a));
      $$1.b(cqo.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cno $$0) {
      jq $$1 = jq.a($$0.dW().ai(), $$0.dw());
      $$0.ec().a(cek.b, $$1);
   }

   private static void b(cno $$0, bwi<cno> $$1) {
      $$1.a(cqo.a, 0, ImmutableList.of(new byf(45, 90), new byj(), bxx.a(), bzp.a()));
   }

   private static void c(cno $$0, bwi<cno> $$1) {
      $$1.a(cqo.b, 10, ImmutableList.of(bzl.a(cnp::a), a(), b(), bzb.a(bur.bS, 4)));
   }

   private static void d(cno $$0, bwi<cno> $$1) {
      $$1.a(cqo.k, 10, ImmutableList.of(bzo.a(($$1x, $$2) -> !a($$1x, (cnk)$$0, $$2)), bze.a(1.0F), byg.a(20)), cek.o);
   }

   private static byw<cno> a() {
      return new byw<>(
         ImmutableList.of(
            Pair.of(byy.a(bur.bS, 8.0F), 1),
            Pair.of(byy.a(bur.aS, 8.0F), 1),
            Pair.of(byy.a(bur.aT, 8.0F), 1),
            Pair.of(byy.a(8.0F), 1),
            Pair.of(new bxj(30, 60), 1)
         )
      );
   }

   private static byw<cno> b() {
      return new byw<>(
         ImmutableList.of(
            Pair.of(byr.a(0.6F), 2),
            Pair.of(bxw.a(bur.aS, 8, cek.q, 0.6F, 2), 2),
            Pair.of(bxw.a(bur.aT, 8, cek.q, 0.6F, 2), 2),
            Pair.of(bzr.a(cek.b, 0.6F, 2, 100), 2),
            Pair.of(bzq.a(cek.b, 0.6F, 5), 2),
            Pair.of(new bxj(30, 60), 1)
         )
      );
   }

   protected static void b(cno $$0) {
      bwi<cno> $$1 = $$0.ec();
      cqo $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqo.k, cqo.b));
      cqo $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cek.o));
   }

   private static boolean a(arc $$0, cnk $$1, bvg $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bvg> a(arc $$0, cnk $$1) {
      Optional<bvg> $$2 = bxb.a($$1, cek.ab);
      if ($$2.isPresent() && cfq.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bvg> $$3 = $$1.ec().c(cek.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(cek.M);
      }
   }

   protected static void a(arc $$0, cno $$1, bvg $$2) {
      if (!($$2 instanceof cnk)) {
         cnm.a($$0, $$1, $$2);
      }
   }

   protected static void a(cno $$0, bvg $$1) {
      $$0.ec().b(cek.E);
      $$0.ec().a(cek.ab, $$1.cG(), 600L);
   }

   protected static void c(cno $$0) {
      if ((double)$$0.dW().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cno $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == cqo.k) {
            $$0.gv();
         }
      });
   }
}
