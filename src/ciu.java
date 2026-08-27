import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class ciu {
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

   protected static bru<?> a(cit $$0, bru<cit> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(clp.a));
      $$1.b(clp.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cit $$0) {
      im $$1 = im.a($$0.dM().ae(), $$0.dm());
      $$0.dP().a(bzw.b, $$1);
   }

   private static void b(cit $$0, bru<cit> $$1) {
      $$1.a(clp.a, 0, ImmutableList.of(new btr(45, 90), new btv(), btj.a(), bvb.a()));
   }

   private static void c(cit $$0, bru<cit> $$1) {
      $$1.a(clp.b, 10, ImmutableList.of(bux.a(ciu::a), a(), b(), bun.a(bqg.bx, 4)));
   }

   private static void d(cit $$0, bru<cit> $$1) {
      $$1.a(clp.k, 10, ImmutableList.of(bva.a($$1x -> !a((cip)$$0, $$1x)), buq.a(1.0F), bts.a(20)), bzw.o);
   }

   private static bui<cit> a() {
      return new bui<>(
         ImmutableList.of(
            Pair.of(buk.a(bqg.bx, 8.0F), 1),
            Pair.of(buk.a(bqg.az, 8.0F), 1),
            Pair.of(buk.a(bqg.aA, 8.0F), 1),
            Pair.of(buk.a(8.0F), 1),
            Pair.of(new bsv(30, 60), 1)
         )
      );
   }

   private static bui<cit> b() {
      return new bui<>(
         ImmutableList.of(
            Pair.of(bud.a(0.6F), 2),
            Pair.of(bti.a(bqg.az, 8, bzw.q, 0.6F, 2), 2),
            Pair.of(bti.a(bqg.aA, 8, bzw.q, 0.6F, 2), 2),
            Pair.of(bvd.a(bzw.b, 0.6F, 2, 100), 2),
            Pair.of(bvc.a(bzw.b, 0.6F, 5), 2),
            Pair.of(new bsv(30, 60), 1)
         )
      );
   }

   protected static void b(cit $$0) {
      bru<cit> $$1 = $$0.dP();
      clp $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(clp.k, clp.b));
      clp $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(bzw.o));
   }

   private static boolean a(cip $$0, bqt $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bqt> a(cip $$0) {
      Optional<bqt> $$1 = bsn.a($$0, bzw.ab);
      if ($$1.isPresent() && cbc.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bqt> $$2 = a($$0, bzw.l);
         return $$2.isPresent() ? $$2 : $$0.dP().c(bzw.M);
      }
   }

   private static Optional<? extends bqt> a(cip $$0, bzw<? extends bqt> $$1) {
      return $$0.dP().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cit $$0, bqt $$1) {
      if (!($$1 instanceof cip)) {
         cir.a($$0, $$1);
      }
   }

   protected static void b(cit $$0, bqt $$1) {
      $$0.dP().b(bzw.E);
      $$0.dP().a(bzw.ab, $$1.cw(), 600L);
   }

   protected static void c(cit $$0) {
      if ((double)$$0.dM().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cit $$0) {
      $$0.dP().g().ifPresent($$1 -> {
         if ($$1 == clp.k) {
            $$0.gu();
         }
      });
   }
}
