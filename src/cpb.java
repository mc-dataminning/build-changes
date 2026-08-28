import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cpb {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = bae.f(100.0F);
   public static final int a = bae.f(133.59999F);
   public static final int b = bae.f(84.0F);
   private static final int i = bae.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cgr<? extends cgq<? super cpa>>> k = List.of(cgr.d, cgr.x);
   private static final List<cfk<?>> l = List.of(
      cfk.g,
      cfk.h,
      cfk.k,
      cfk.l,
      cfk.M,
      cfk.n,
      cfk.m,
      cfk.E,
      cfk.t,
      cfk.o,
      cfk.p,
      cfk.B,
      cfk.ay,
      cfk.az,
      cfk.aA,
      cfk.aB,
      cfk.aC,
      cfk.aD,
      cfk.aE,
      cfk.aF,
      cfk.aG,
      cfk.aH,
      cfk.aI,
      cfk.aJ,
      cfk.aK,
      cfk.aL
   );
   private static final bya<cpa> m = cbm.a(
      (Function<cbm.b<cpa>, ? extends App<cbm.c<cpa>, cbp<cpa>>>)($$0 -> $$0.group($$0.a(cfk.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bbk.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cpa $$0) {
      $$0.ec().a(ImmutableList.of(cro.y, cro.z, cro.x, cro.k, cro.w, cro.v, cro.b));
   }

   protected static bxi<?> a(cpa $$0, Dynamic<?> $$1) {
      bxi.b<cpa> $$2 = bxi.a(l, k);
      bxi<cpa> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cro.a));
      $$3.b(cro.b);
      $$3.f();
      return $$3;
   }

   private static void a(bxi<cpa> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new cat(0.8F), cbx.a(), new bzf(45, 90), new bzj()));
   }

   private static void b(bxi<cpa> $$0) {
      $$0.a(cro.y, 5, ImmutableList.of(new cbt(a)), cfk.aC);
   }

   private static void c(bxi<cpa> $$0) {
      $$0.a(cro.z, ImmutableList.of(Pair.of(0, new cbu()), Pair.of(1, new cbs(h))), ImmutableSet.of(Pair.of(cfk.ay, cfl.b), Pair.of(cfk.aE, cfl.b)));
   }

   private static void d(bxi<cpa> $$0) {
      $$0.a(
         cro.b,
         10,
         ImmutableList.of(
            cbw.a(cpa::x), cca.a(), new bzw(ImmutableMap.of(cfk.aB, cfl.b), ImmutableList.of(Pair.of(bzr.a(0.5F), 2), Pair.of(new byj(30, 60), 1)))
         )
      );
   }

   private static void e(bxi<cpa> $$0) {
      $$0.a(cro.w, 5, ImmutableList.of(cbw.a(cpa::x), bys.a(cfk.az, 2, 0.7F)), cfk.az);
   }

   private static void f(bxi<cpa> $$0) {
      $$0.a(cro.v, 5, ImmutableList.of(cbw.a(cpa::x), new cby(i)), cfk.aB);
   }

   private static void g(bxi<cpa> $$0) {
      $$0.a(cro.x, 10, ImmutableList.of(new cbv()), cfk.ay);
   }

   private static void a(cpa $$0, bxi<cpa> $$1) {
      $$1.a(
         cro.k,
         10,
         ImmutableList.of(
            m,
            cao.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), cpb::a, false),
            bzy.a($$1x -> a($$0, $$1x), (float)$$0.h(bxo.m)),
            cae.a(1.2F),
            new cbz(),
            bzg.a(18)
         ),
         cfk.o
      );
   }

   private static boolean a(cpa $$0, bwg $$1) {
      return $$0.ec().c(cfk.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(ash $$0, cpa $$1, bwg $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bwg)$$1);
   }

   public static void a(bwg $$0) {
      if ($$0.ec().a(cfk.aE)) {
         $$0.ec().a(cfk.aE, bbk.a, 1200L);
      }
   }

   public static void a(cpa $$0, jh $$1) {
      if ($$0.dW().F_().a($$1) && !$$0.x().isPresent() && !$$0.ec().c(cfk.o).isPresent()) {
         a((bwg)$$0);
         $$0.ec().a(cfk.aG, bbk.a, 100L);
         $$0.ec().a(cfk.n, new byc($$1), 100L);
         $$0.ec().a(cfk.az, $$1, 100L);
         $$0.ec().b(cfk.m);
      }
   }
}
