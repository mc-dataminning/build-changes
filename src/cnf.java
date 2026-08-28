import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cnf {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bwc<?> a(cne $$0, bwc<cne> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cqe.a));
      $$1.b(cqe.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cne $$0) {
      jp $$1 = jp.a($$0.dX().ag(), $$0.dx());
      $$0.ed().a(cee.b, $$1);
   }

   private static void b(cne $$0, bwc<cne> $$1) {
      $$1.a(cqe.a, 0, ImmutableList.of(new bxz(45, 90), new byd(), bxr.a(), bzj.a()));
   }

   private static void c(cne $$0, bwc<cne> $$1) {
      $$1.a(cqe.b, 10, ImmutableList.of(bzf.a(cnf::a), a(), b(), byv.a(bul.by, 4)));
   }

   private static void d(cne $$0, bwc<cne> $$1) {
      $$1.a(cqe.k, 10, ImmutableList.of(bzi.a($$1x -> !a((cna)$$0, $$1x)), byy.a(1.0F), bya.a(20)), cee.o);
   }

   private static byq<cne> a() {
      return new byq<>(
         ImmutableList.of(
            Pair.of(bys.a(bul.by, 8.0F), 1),
            Pair.of(bys.a(bul.aA, 8.0F), 1),
            Pair.of(bys.a(bul.aB, 8.0F), 1),
            Pair.of(bys.a(8.0F), 1),
            Pair.of(new bxd(30, 60), 1)
         )
      );
   }

   private static byq<cne> b() {
      return new byq<>(
         ImmutableList.of(
            Pair.of(byl.a(0.6F), 2),
            Pair.of(bxq.a(bul.aA, 8, cee.q, 0.6F, 2), 2),
            Pair.of(bxq.a(bul.aB, 8, cee.q, 0.6F, 2), 2),
            Pair.of(bzl.a(cee.b, 0.6F, 2, 100), 2),
            Pair.of(bzk.a(cee.b, 0.6F, 5), 2),
            Pair.of(new bxd(30, 60), 1)
         )
      );
   }

   protected static void b(cne $$0) {
      bwc<cne> $$1 = $$0.ed();
      cqe $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cqe.k, cqe.b));
      cqe $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(cee.o));
   }

   private static boolean a(cna $$0, bva $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bva> a(cna $$0) {
      Optional<bva> $$1 = bwv.a($$0, cee.ab);
      if ($$1.isPresent() && cfk.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bva> $$2 = $$0.ed().c(cee.l);
         return $$2.isPresent() ? $$2 : $$0.ed().c(cee.M);
      }
   }

   protected static void a(cne $$0, bva $$1) {
      if (!($$1 instanceof cna)) {
         cnc.a($$0, $$1);
      }
   }

   protected static void b(cne $$0, bva $$1) {
      $$0.ed().b(cee.E);
      $$0.ed().a(cee.ab, $$1.cH(), 600L);
   }

   protected static void c(cne $$0) {
      if ((double)$$0.dX().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cne $$0) {
      $$0.ed().g().ifPresent($$1 -> {
         if ($$1 == cqe.k) {
            $$0.gB();
         }
      });
   }
}
