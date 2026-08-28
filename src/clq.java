import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clq {
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

   protected static buq<?> a(clp $$0, buq<clp> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(col.a));
      $$1.b(col.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clp $$0) {
      jh $$1 = jh.a($$0.dP().af(), $$0.dp());
      $$0.dS().a(ccs.b, $$1);
   }

   private static void b(clp $$0, buq<clp> $$1) {
      $$1.a(col.a, 0, ImmutableList.of(new bwn(45, 90), new bwr(), bwf.a(), bxx.a()));
   }

   private static void c(clp $$0, buq<clp> $$1) {
      $$1.a(col.b, 10, ImmutableList.of(bxt.a(clq::a), a(), b(), bxj.a(bsz.by, 4)));
   }

   private static void d(clp $$0, buq<clp> $$1) {
      $$1.a(col.k, 10, ImmutableList.of(bxw.a($$1x -> !a((cll)$$0, $$1x)), bxm.a(1.0F), bwo.a(20)), ccs.o);
   }

   private static bxe<clp> a() {
      return new bxe<>(
         ImmutableList.of(
            Pair.of(bxg.a(bsz.by, 8.0F), 1),
            Pair.of(bxg.a(bsz.aA, 8.0F), 1),
            Pair.of(bxg.a(bsz.aB, 8.0F), 1),
            Pair.of(bxg.a(8.0F), 1),
            Pair.of(new bvr(30, 60), 1)
         )
      );
   }

   private static bxe<clp> b() {
      return new bxe<>(
         ImmutableList.of(
            Pair.of(bwz.a(0.6F), 2),
            Pair.of(bwe.a(bsz.aA, 8, ccs.q, 0.6F, 2), 2),
            Pair.of(bwe.a(bsz.aB, 8, ccs.q, 0.6F, 2), 2),
            Pair.of(bxz.a(ccs.b, 0.6F, 2, 100), 2),
            Pair.of(bxy.a(ccs.b, 0.6F, 5), 2),
            Pair.of(new bvr(30, 60), 1)
         )
      );
   }

   protected static void b(clp $$0) {
      buq<clp> $$1 = $$0.dS();
      col $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(col.k, col.b));
      col $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.v($$1.a(ccs.o));
   }

   private static boolean a(cll $$0, bto $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends bto> a(cll $$0) {
      Optional<bto> $$1 = bvj.a($$0, ccs.ab);
      if ($$1.isPresent() && cdy.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends bto> $$2 = a($$0, ccs.l);
         return $$2.isPresent() ? $$2 : $$0.dS().c(ccs.M);
      }
   }

   private static Optional<? extends bto> a(cll $$0, ccs<? extends bto> $$1) {
      return $$0.dS().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(clp $$0, bto $$1) {
      if (!($$1 instanceof cll)) {
         cln.a($$0, $$1);
      }
   }

   protected static void b(clp $$0, bto $$1) {
      $$0.dS().b(ccs.E);
      $$0.dS().a(ccs.ab, $$1.cz(), 600L);
   }

   protected static void c(clp $$0) {
      if ((double)$$0.dP().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(clp $$0) {
      $$0.dS().g().ifPresent($$1 -> {
         if ($$1 == col.k) {
            $$0.gx();
         }
      });
   }
}
