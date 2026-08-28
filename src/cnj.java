import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cnj {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwg<?> a(cni $$0, bwg<cni> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cqi.a));
      $$1.b(cqi.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cni $$0) {
      jp $$1 = jp.a($$0.dY().ag(), $$0.dy());
      $$0.ee().a(cei.b, $$1);
   }

   private static void b(cni $$0, bwg<cni> $$1) {
      $$1.a(cqi.a, 0, ImmutableList.of(new byd(45, 90), new byh(), bxv.a(), bzn.a()));
   }

   private static void c(cni $$0, bwg<cni> $$1) {
      $$1.a(cqi.b, 10, ImmutableList.of(bzj.a(cnj::a), a(), b(), byz.a(bup.by, 4)));
   }

   private static void d(cni $$0, bwg<cni> $$1) {
      $$1.a(cqi.k, 10, ImmutableList.of(bzm.a($$1x -> !a((cne)$$0, $$1x)), bzc.a(1.0F), bye.a(20)), cei.o);
   }

   private static byu<cni> a() {
      return new byu<>(
         ImmutableList.of(
            Pair.of(byw.a(bup.by, 8.0F), 1),
            Pair.of(byw.a(bup.aA, 8.0F), 1),
            Pair.of(byw.a(bup.aB, 8.0F), 1),
            Pair.of(byw.a(8.0F), 1),
            Pair.of(new bxh(30, 60), 1)
         )
      );
   }

   private static byu<cni> b() {
      return new byu<>(
         ImmutableList.of(
            Pair.of(byp.a(0.6F), 2),
            Pair.of(bxu.a(bup.aA, 8, cei.q, 0.6F, 2), 2),
            Pair.of(bxu.a(bup.aB, 8, cei.q, 0.6F, 2), 2),
            Pair.of(bzp.a(cei.b, 0.6F, 2, 100), 2),
            Pair.of(bzo.a(cei.b, 0.6F, 5), 2),
            Pair.of(new bxh(30, 60), 1)
         )
      );
   }

   protected static void b(cni $$0) {
      bwg<cni> $$1 = $$0.ee();
      cqi $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqi.k, cqi.b));
      cqi $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cei.o));
   }

   private static boolean a(cne $$0, bve $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bve> a(cne $$0) {
      Optional<bve> $$1 = bwz.a($$0, cei.ab);
      if ($$1.isPresent() && cfo.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bve> $$2 = $$0.ee().c(cei.l);
         return $$2.isPresent() ? $$2 : $$0.ee().c(cei.M);
      }
   }

   protected static void a(cni $$0, bve $$1) {
      if (!($$1 instanceof cne)) {
         cng.a($$0, $$1);
      }
   }

   protected static void b(cni $$0, bve $$1) {
      $$0.ee().b(cei.E);
      $$0.ee().a(cei.ab, $$1.cI(), 600L);
   }

   protected static void c(cni $$0) {
      if ((double)$$0.dY().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cni $$0) {
      $$0.ee().g().ifPresent($$1 -> {
         if ($$1 == cqi.k) {
            $$0.gC();
         }
      });
   }
}
