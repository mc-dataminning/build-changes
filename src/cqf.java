import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cqf {
   private static final int a = 600;
   private static final int b = 20;
   private static final double c = 0.0125;
   private static final int d = 8;
   private static final int e = 8;
   private static final float f = 0.6F;
   private static final int g = 2;
   private static final int h = 100;
   private static final int i = 5;

   protected static byj<?> a(cqe $$0, byj<cqe> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(ctg.a));
      $$1.b(ctg.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cqe $$0) {
      je $$1 = je.a($$0.dU().aj(), $$0.du());
      $$0.eb().a(cgl.b, $$1);
   }

   private static void b(cqe $$0, byj<cqe> $$1) {
      $$1.a(ctg.a, 0, ImmutableList.of(new cag(45, 90), new cak(), bzy.a(), cbq.a()));
   }

   private static void c(cqe $$0, byj<cqe> $$1) {
      $$1.a(ctg.b, 10, ImmutableList.of(cbm.a(cqf::a), a(), b(), cbc.a(bwr.bS, 4)));
   }

   private static void d(cqe $$0, byj<cqe> $$1) {
      $$1.a(ctg.k, 10, ImmutableList.of(cbp.a(($$1x, $$2) -> !a($$1x, (cqa)$$0, $$2)), cbf.a(1.0F), cah.a(20)), cgl.p);
   }

   private static cax<cqe> a() {
      return new cax<>(
         ImmutableList.of(
            Pair.of(caz.a(bwr.bS, 8.0F), 1),
            Pair.of(caz.a(bwr.aR, 8.0F), 1),
            Pair.of(caz.a(bwr.aS, 8.0F), 1),
            Pair.of(caz.a(8.0F), 1),
            Pair.of(new bzk(30, 60), 1)
         )
      );
   }

   private static cax<cqe> b() {
      return new cax<>(
         ImmutableList.of(
            Pair.of(cas.a(0.6F), 2),
            Pair.of(bzx.a(bwr.aR, 8, cgl.r, 0.6F, 2), 2),
            Pair.of(bzx.a(bwr.aS, 8, cgl.r, 0.6F, 2), 2),
            Pair.of(cbs.a(cgl.b, 0.6F, 2, 100), 2),
            Pair.of(cbr.a(cgl.b, 0.6F, 5), 2),
            Pair.of(new bzk(30, 60), 1)
         )
      );
   }

   protected static void b(cqe $$0) {
      byj<cqe> $$1 = $$0.eb();
      ctg $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(ctg.k, ctg.b));
      ctg $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cgl.p));
   }

   private static boolean a(arq $$0, cqa $$1, bxj $$2) {
      return a($$0, $$1).filter($$1x -> $$1x == $$2).isPresent();
   }

   private static Optional<? extends bxj> a(arq $$0, cqa $$1) {
      Optional<bxj> $$2 = bzc.a($$1, cgl.ac);
      if ($$2.isPresent() && chr.d($$0, $$1, $$2.get())) {
         return $$2;
      } else {
         Optional<? extends bxj> $$3 = $$1.eb().c(cgl.l);
         return $$3.isPresent() ? $$3 : $$1.eb().c(cgl.N);
      }
   }

   protected static void a(arq $$0, cqe $$1, bxj $$2) {
      if (!($$2 instanceof cqa)) {
         cqc.a($$0, $$1, $$2);
      }
   }

   protected static void a(cqe $$0, bxj $$1) {
      $$0.eb().b(cgl.F);
      $$0.eb().a(cgl.ac, $$1.cF(), 600L);
   }

   protected static void c(cqe $$0) {
      if ((double)$$0.dU().A.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cqe $$0) {
      $$0.eb().g().ifPresent($$1 -> {
         if ($$1 == ctg.k) {
            $$0.gx();
         }
      });
   }
}
