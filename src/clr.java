import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class clr {
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

   protected static buq<?> a(clq $$0, buq<clq> $$1) {
      b($$0, $$1);
      c($$0, $$1);
      d($$0, $$1);
      $$1.a(ImmutableSet.of(com.a));
      $$1.b(com.b);
      $$1.f();
      return $$1;
   }

   protected static void a(clq $$0) {
      jl $$1 = jl.a($$0.dO().af(), $$0.do());
      $$0.dT().a(ccs.b, $$1);
   }

   private static void b(clq $$0, buq<clq> $$1) {
      $$1.a(com.a, 0, ImmutableList.of(new bwn(45, 90), new bwr(), bwf.a(), bxx.a()));
   }

   private static void c(clq $$0, buq<clq> $$1) {
      $$1.a(com.b, 10, ImmutableList.of(bxt.a(clr::a), a(), b(), bxj.a(bsx.by, 4)));
   }

   private static void d(clq $$0, buq<clq> $$1) {
      $$1.a(com.k, 10, ImmutableList.of(bxw.a($$1x -> !a((clm)$$0, $$1x)), bxm.a(1.0F), bwo.a(20)), ccs.o);
   }

   private static bxe<clq> a() {
      return new bxe<>(
         ImmutableList.of(
            Pair.of(bxg.a(bsx.by, 8.0F), 1),
            Pair.of(bxg.a(bsx.aA, 8.0F), 1),
            Pair.of(bxg.a(bsx.aB, 8.0F), 1),
            Pair.of(bxg.a(8.0F), 1),
            Pair.of(new bvr(30, 60), 1)
         )
      );
   }

   private static bxe<clq> b() {
      return new bxe<>(
         ImmutableList.of(
            Pair.of(bwz.a(0.6F), 2),
            Pair.of(bwe.a(bsx.aA, 8, ccs.q, 0.6F, 2), 2),
            Pair.of(bwe.a(bsx.aB, 8, ccs.q, 0.6F, 2), 2),
            Pair.of(bxz.a(ccs.b, 0.6F, 2, 100), 2),
            Pair.of(bxy.a(ccs.b, 0.6F, 5), 2),
            Pair.of(new bvr(30, 60), 1)
         )
      );
   }

   protected static void b(clq $$0) {
      buq<clq> $$1 = $$0.dT();
      com $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(com.k, com.b));
      com $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         d($$0);
      }

      $$0.w($$1.a(ccs.o));
   }

   private static boolean a(clm $$0, btn $$1) {
      return a($$0).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static Optional<? extends btn> a(clm $$0) {
      Optional<btn> $$1 = bvj.a($$0, ccs.ab);
      if ($$1.isPresent() && cdy.d($$0, $$1.get())) {
         return $$1;
      } else {
         Optional<? extends btn> $$2 = a($$0, ccs.l);
         return $$2.isPresent() ? $$2 : $$0.dT().c(ccs.M);
      }
   }

   private static Optional<? extends btn> a(clm $$0, ccs<? extends btn> $$1) {
      return $$0.dT().c($$1).filter($$1x -> $$1x.a($$0, 12.0));
   }

   protected static void a(clq $$0, btn $$1) {
      if (!($$1 instanceof clm)) {
         clo.a($$0, $$1);
      }
   }

   protected static void b(clq $$0, btn $$1) {
      $$0.dT().b(ccs.E);
      $$0.dT().a(ccs.ab, $$1.cz(), 600L);
   }

   protected static void c(clq $$0) {
      if ((double)$$0.dO().z.i() < 0.0125) {
         d($$0);
      }
   }

   private static void d(clq $$0) {
      $$0.dT().g().ifPresent($$1 -> {
         if ($$1 == com.k) {
            $$0.gr();
         }
      });
   }
}
