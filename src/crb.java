import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class crb {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static bzf<?> a(cra $$0, bzf<cra> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(cuc.a));
      $$1.b(cuc.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cra $$0) {
      jf $$1 = jf.a($$0.dV().aj(), $$0.dv());
      $$0.ec().a(chh.b, $$1);
   }

   private static void b(cra $$0, bzf<cra> $$1) {
      $$1.a(cuc.a, 0, ImmutableList.of(new cbc(45, 90), new cbg(), cau.a(), ccm.a()));
   }

   private static void c(cra $$0, bzf<cra> $$1) {
      $$1.a(cuc.b, 10, ImmutableList.of(cci.a(crb::a), a(), b(), cby.a(bxn.bT, 4)));
   }

   private static void d(cra $$0, bzf<cra> $$1) {
      $$1.a(cuc.k, 10, ImmutableList.of(ccl.a(($$1x, $$2) -> !a($$1x, (cqw)$$0, $$2)), ccb.a(1.0F), cbd.a(20)), chh.p);
   }

   private static cbt<cra> a() {
      return new cbt<>(
         ImmutableList.of(
            Pair.of(cbv.a(bxn.bT, 8.0F), 1),
            Pair.of(cbv.a(bxn.aS, 8.0F), 1),
            Pair.of(cbv.a(bxn.aT, 8.0F), 1),
            Pair.of(cbv.a(8.0F), 1),
            Pair.of(new cag(30, 60), 1)
         )
      );
   }

   private static cbt<cra> b() {
      return new cbt<>(
         ImmutableList.of(
            Pair.of(cbo.a(0.6F), 2),
            Pair.of(cat.a(bxn.aS, 8, chh.r, 0.6F, 2), 2),
            Pair.of(cat.a(bxn.aT, 8, chh.r, 0.6F, 2), 2),
            Pair.of(cco.a(chh.b, 0.6F, 2, 100), 2),
            Pair.of(ccn.a(chh.b, 0.6F, 5), 2),
            Pair.of(new cag(30, 60), 1)
         )
      );
   }

   protected static void b(cra $$0) {
      bzf<cra> $$1 = $$0.ec();
      cuc $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cuc.k, cuc.b));
      cuc $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(chh.p));
   }

   private static boolean a(asb $$0, cqw $$1, byf $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends byf> a(asb $$0, cqw $$1) {
      Optional<byf> $$2 = bzy.a($$1, chh.ac);
      if ($$2.isPresent() && cin.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends byf> $$3 = $$1.ec().c(chh.l);
         return $$3.isPresent() ? $$3 : $$1.ec().c(chh.N);
      }
   }

   protected static void a(asb $$0, cra $$1, byf $$2) {
      if (!($$2 instanceof cqw)) {
         cqy.a($$0, $$1, $$2);
      }
   }

   protected static void a(cra $$0, byf $$1) {
      $$0.ec().b(chh.F);
      $$0.ec().a(chh.ac, $$1.cG(), 600L);
   }

   protected static void c(cra $$0) {
      if ((double)$$0.dV().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cra $$0) {
      $$0.ec().g().ifPresent($$1 -> {
         if ($$1 == cuc.k) {
            $$0.gy();
         }
      });
   }
}
