import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clm {
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

   protected static bum<?> a(cll $$0, bum<cll> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(coh.a));
      $$1.b(coh.b);
      $$1.f();
      return $$1;
   }

   protected static void a(cll $$0) {
      jh $$1 = jh.a($$0.dP().af(), $$0.dp());
      $$0.dS().a(cco.b, $$1);
   }

   private static void b(cll $$0, bum<cll> $$1) {
      $$1.a(coh.a, 0, ImmutableList.of(new bwj(45, 90), new bwn(), bwb.a(), bxt.a()));
   }

   private static void c(cll $$0, bum<cll> $$1) {
      $$1.a(coh.b, 10, ImmutableList.of(bxp.a(clm::a), a(), b(), bxf.a(bsv.by, 4)));
   }

   private static void d(cll $$0, bum<cll> $$1) {
      $$1.a(coh.k, 10, ImmutableList.of(bxs.a($$1x -> !a((clh)$$0, $$1x)), bxi.a(1.0F), bwk.a(20)), cco.o);
   }

   private static bxa<cll> a() {
      return new bxa<>(
         ImmutableList.of(
            Pair.of(bxc.a(bsv.by, 8.0F), 1),
            Pair.of(bxc.a(bsv.aA, 8.0F), 1),
            Pair.of(bxc.a(bsv.aB, 8.0F), 1),
            Pair.of(bxc.a(8.0F), 1),
            Pair.of(new bvn(30, 60), 1)
         )
      );
   }

   private static bxa<cll> b() {
      return new bxa<>(
         ImmutableList.of(
            Pair.of(bwv.a(0.6F), 2),
            Pair.of(bwa.a(bsv.aA, 8, cco.q, 0.6F, 2), 2),
            Pair.of(bwa.a(bsv.aB, 8, cco.q, 0.6F, 2), 2),
            Pair.of(bxv.a(cco.b, 0.6F, 2, 100), 2),
            Pair.of(bxu.a(cco.b, 0.6F, 5), 2),
            Pair.of(new bvn(30, 60), 1)
         )
      );
   }

   protected static void b(cll $$0) {
      bum<cll> $$1 = $$0.dS();
      coh $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(coh.k, coh.b));
      coh $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(cco.o));
   }

   private static boolean a(clh $$0, btk $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btk> a(clh $$0) {
      Optional<btk> $$1 = bvf.a($$0, cco.ab);
      if ($$1.isPresent() && cdu.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btk> $$2 = a($$0, cco.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(cco.M);
      }
   }

   private static Optional<? extends btk> a(clh $$0, cco<? extends btk> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(cll $$0, btk $$1) {
      if (!($$1 instanceof clh)) {
         clj.a($$0, $$1);
      }
   }

   protected static void b(cll $$0, btk $$1) {
      $$0.dS().b(cco.E);
      $$0.dS().a(cco.ab, $$1.cz(), 600L);
   }

   protected static void c(cll $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(cll $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == coh.k) {
            $$0.gx();
         }
      });
   }
}
