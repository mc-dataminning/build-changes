import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cqg {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azm.f(100.0F);
   public static final int a = azm.f(133.59999F);
   public static final int b = azm.f(84.0F);
   private static final int i = azm.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<chn<? extends chm<? super cqf>>> k = List.of(chn.d, chn.x);
   private static final List<cgg<?>> l = List.of(
      cgg.g,
      cgg.h,
      cgg.k,
      cgg.l,
      cgg.N,
      cgg.o,
      cgg.n,
      cgg.F,
      cgg.u,
      cgg.p,
      cgg.q,
      cgg.C,
      cgg.az,
      cgg.aA,
      cgg.aB,
      cgg.aC,
      cgg.aD,
      cgg.aE,
      cgg.aF,
      cgg.aG,
      cgg.aH,
      cgg.aI,
      cgg.aJ,
      cgg.aK,
      cgg.aL,
      cgg.aM
   );
   private static final byw<cqf> m = cci.a(
      (Function<cci.b<cqf>, ? extends App<cci.c<cqf>, ccl<cqf>>>)($$0 -> $$0.group($$0.a(cgg.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bau.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cqf $$0) {
      $$0.ec().a(ImmutableList.of(csw.y, csw.z, csw.x, csw.k, csw.w, csw.v, csw.b));
   }

   protected static bye<?> a(cqf $$0, Dynamic<?> $$1) {
      bye.b<cqf> $$2 = bye.a(l, k);
      bye<cqf> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(csw.a));
      $$3.b(csw.b);
      $$3.f();
      return $$3;
   }

   private static void a(bye<cqf> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp(0.8F), cct.a(), new cab(45, 90), new caf()));
   }

   private static void b(bye<cqf> $$0) {
      $$0.a(csw.y, 5, ImmutableList.of(new ccp(a)), cgg.aD);
   }

   private static void c(bye<cqf> $$0) {
      $$0.a(csw.z, ImmutableList.of(Pair.of(0, new ccq()), Pair.of(1, new cco(h))), ImmutableSet.of(Pair.of(cgg.az, cgh.b), Pair.of(cgg.aF, cgh.b)));
   }

   private static void d(bye<cqf> $$0) {
      $$0.a(
         csw.b,
         10,
         ImmutableList.of(
            ccs.a(cqf::q), ccw.a(), new cas(ImmutableMap.of(cgg.aC, cgh.b), ImmutableList.of(Pair.of(can.a(0.5F), 2), Pair.of(new bzf(30, 60), 1)))
         )
      );
   }

   private static void e(bye<cqf> $$0) {
      $$0.a(csw.w, 5, ImmutableList.of(ccs.a(cqf::q), bzo.a(cgg.aA, 2, 0.7F)), cgg.aA);
   }

   private static void f(bye<cqf> $$0) {
      $$0.a(csw.v, 5, ImmutableList.of(ccs.a(cqf::q), new ccu(i)), cgg.aC);
   }

   private static void g(bye<cqf> $$0) {
      $$0.a(csw.x, 10, ImmutableList.of(new ccr()), cgg.az);
   }

   private static void a(cqf $$0, bye<cqf> $$1) {
      $$1.a(
         csw.k,
         10,
         ImmutableList.of(
            m,
            cbk.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), cqg::a, false),
            cau.a($$1x -> a($$0, $$1x), (float)$$0.h(byk.m)),
            cba.a(1.2F),
            new ccv(),
            cac.a(18)
         ),
         cgg.p
      );
   }

   private static boolean a(cqf $$0, bxe $$1) {
      return $$0.ec().c(cgg.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arq $$0, cqf $$1, bxe $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bxe)$$1);
   }

   public static void a(bxe $$0) {
      if ($$0.ec().a(cgg.aF)) {
         $$0.ec().a(cgg.aF, bau.a, 1200L);
      }
   }

   public static void a(cqf $$0, iu $$1) {
      if ($$0.dV().A_().a($$1) && !$$0.q().isPresent() && !$$0.ec().c(cgg.p).isPresent()) {
         a((bxe)$$0);
         $$0.ec().a(cgg.aH, bau.a, 100L);
         $$0.ec().a(cgg.o, new byy($$1), 100L);
         $$0.ec().a(cgg.aA, $$1, 100L);
         $$0.ec().b(cgg.n);
      }
   }
}
