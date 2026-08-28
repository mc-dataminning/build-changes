import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cpb {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bxr<?> a(cpa $$0, bxr<cpa> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(crz.a));
      $$1.b(crz.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cpa $$0) {
      jr $$1 = jr.a($$0.dV().aj(), $$0.dv());
      $$0.eb().a(cft.b, $$1);
   }

   private static void b(cpa $$0, bxr<cpa> $$1) {
      $$1.a(crz.a, 0, ImmutableList.of(new bzo(45, 90), new bzs(), bzg.a(), cay.a()));
   }

   private static void c(cpa $$0, bxr<cpa> $$1) {
      $$1.a(crz.b, 10, ImmutableList.of(cau.a(cpb::a), a(), b(), cak.a(bwb.bR, 4)));
   }

   private static void d(cpa $$0, bxr<cpa> $$1) {
      $$1.a(crz.k, 10, ImmutableList.of(cax.a(($$1x, $$2) -> !a($$1x, (cow)$$0, $$2)), can.a(1.0F), bzp.a(20)), cft.p);
   }

   private static caf<cpa> a() {
      return new caf<>(
         ImmutableList.of(
            Pair.of(cah.a(bwb.bR, 8.0F), 1),
            Pair.of(cah.a(bwb.aR, 8.0F), 1),
            Pair.of(cah.a(bwb.aS, 8.0F), 1),
            Pair.of(cah.a(8.0F), 1),
            Pair.of(new bys(30, 60), 1)
         )
      );
   }

   private static caf<cpa> b() {
      return new caf<>(
         ImmutableList.of(
            Pair.of(caa.a(0.6F), 2),
            Pair.of(bzf.a(bwb.aR, 8, cft.r, 0.6F, 2), 2),
            Pair.of(bzf.a(bwb.aS, 8, cft.r, 0.6F, 2), 2),
            Pair.of(cba.a(cft.b, 0.6F, 2, 100), 2),
            Pair.of(caz.a(cft.b, 0.6F, 5), 2),
            Pair.of(new bys(30, 60), 1)
         )
      );
   }

   protected static void b(cpa $$0) {
      bxr<cpa> $$1 = $$0.eb();
      crz $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(crz.k, crz.b));
      crz $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cft.p));
   }

   private static boolean a(arn $$0, cow $$1, bwr $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bwr> a(arn $$0, cow $$1) {
      Optional<bwr> $$2 = byk.a($$1, cft.ac);
      if ($$2.isPresent() && cgz.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bwr> $$3 = $$1.eb().c(cft.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cft.N);
      }
   }

   protected static void a(arn $$0, cpa $$1, bwr $$2) {
      if (!($$2 instanceof cow)) {
         coy.a($$0, $$1, $$2);
      }
   }

   protected static void a(cpa $$0, bwr $$1) {
      $$0.eb().b(cft.F);
      $$0.eb().a(cft.ac, $$1.cG(), 600L);
   }

   protected static void c(cpa $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cpa $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == crz.k) {
            $$0.gu();
         }
      });
   }
}
