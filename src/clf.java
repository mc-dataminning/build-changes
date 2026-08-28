import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clf {
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

   protected static bue<?> a(cle $$0, bue<cle> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(coa.a));
      $$1.b(coa.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cle $$0) {
      ji $$1 = ji.a($$0.dR().af(), $$0.dr());
      $$0.dV().a(ccg.b, $$1);
   }

   private static void b(cle $$0, bue<cle> $$1) {
      $$1.a(coa.a, 0, ImmutableList.of(new bwb(45, 90), new bwf(), bvt.a(), bxl.a()));
   }

   private static void c(cle $$0, bue<cle> $$1) {
      $$1.a(coa.b, 10, ImmutableList.of(bxh.a(clf::a), a(), b(), bwx.a(bsn.by, 4)));
   }

   private static void d(cle $$0, bue<cle> $$1) {
      $$1.a(coa.k, 10, ImmutableList.of(bxk.a($$1x -> !a((cla)$$0, $$1x)), bxa.a(1.0F), bwc.a(20)), ccg.o);
   }

   private static bws<cle> a() {
      return new bws<>(
         ImmutableList.of(
            Pair.of(bwu.a(bsn.by, 8.0F), 1),
            Pair.of(bwu.a(bsn.aA, 8.0F), 1),
            Pair.of(bwu.a(bsn.aB, 8.0F), 1),
            Pair.of(bwu.a(8.0F), 1),
            Pair.of(new bvf(30, 60), 1)
         )
      );
   }

   private static bws<cle> b() {
      return new bws<>(
         ImmutableList.of(
            Pair.of(bwn.a(0.6F), 2),
            Pair.of(bvs.a(bsn.aA, 8, ccg.q, 0.6F, 2), 2),
            Pair.of(bvs.a(bsn.aB, 8, ccg.q, 0.6F, 2), 2),
            Pair.of(bxn.a(ccg.b, 0.6F, 2, 100), 2),
            Pair.of(bxm.a(ccg.b, 0.6F, 5), 2),
            Pair.of(new bvf(30, 60), 1)
         )
      );
   }

   protected static void b(cle $$0) {
      bue<cle> $$1 = $$0.dV();
      coa $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coa.k, coa.b));
      coa $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccg.o));
   }

   private static boolean a(cla $$0, btc $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btc> a(cla $$0) {
      Optional<btc> $$1 = bux.a($$0, ccg.ab);
      if ($$1.isPresent() && cdm.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btc> $$2 = a($$0, ccg.l);
         return $$2.isPresent() ? $$2 : $$0.dV().c(ccg.M);
      }
   }

   private static Optional<? extends btc> a(cla $$0, ccg<? extends btc> $$1) {
      return $$0.dV().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cle $$0, btc $$1) {
      if (!($$1 instanceof cla)) {
         clc.a($$0, $$1);
      }
   }

   protected static void b(cle $$0, btc $$1) {
      $$0.dV().b(ccg.E);
      $$0.dV().a(ccg.ab, $$1.cB(), 600L);
   }

   protected static void c(cle $$0) {
      if ((double)$$0.dR().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cle $$0) {
      $$0.dV().g().ifPresent($$1 -> {
         if ($$1 == coa.k) {
            $$0.gu();
         }
      });
   }
}
