import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cmz {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azd.f(100.0F);
   public static final int a = azd.f(133.59999F);
   public static final int b = azd.f(84.0F);
   private static final int i = azd.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<ceu<? extends cet<? super cmy>>> k = List.of(ceu.d, ceu.x);
   private static final List<cdn<?>> l = List.of(
      cdn.g,
      cdn.h,
      cdn.k,
      cdn.l,
      cdn.M,
      cdn.n,
      cdn.m,
      cdn.E,
      cdn.t,
      cdn.o,
      cdn.p,
      cdn.B,
      cdn.ay,
      cdn.az,
      cdn.aA,
      cdn.aB,
      cdn.aC,
      cdn.aD,
      cdn.aE,
      cdn.aF,
      cdn.aG,
      cdn.aH,
      cdn.aI,
      cdn.aJ,
      cdn.aK,
      cdn.aL
   );
   private static final bwd<cmy> m = bzp.a(
      (Function<bzp.b<cmy>, ? extends App<bzp.c<cmy>, bzs<cmy>>>)($$0 -> $$0.group($$0.a(cdn.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bai.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cmy $$0) {
      $$0.dX().a(ImmutableList.of(cpm.y, cpm.z, cpm.x, cpm.k, cpm.w, cpm.v, cpm.b));
   }

   protected static bvl<?> a(cmy $$0, Dynamic<?> $$1) {
      bvl.b<cmy> $$2 = bvl.a(l, k);
      bvl<cmy> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cpm.a));
      $$3.b(cpm.b);
      $$3.f();
      return $$3;
   }

   private static void a(bvl<cmy> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new byw(0.8F), caa.a(), new bxi(45, 90), new bxm()));
   }

   private static void b(bvl<cmy> $$0) {
      $$0.a(cpm.y, 5, ImmutableList.of(new bzw(a)), cdn.aC);
   }

   private static void c(bvl<cmy> $$0) {
      $$0.a(cpm.z, ImmutableList.of(Pair.of(0, new bzx()), Pair.of(1, new bzv(h))), ImmutableSet.of(Pair.of(cdn.ay, cdo.b), Pair.of(cdn.aE, cdo.b)));
   }

   private static void d(bvl<cmy> $$0) {
      $$0.a(
         cpm.b,
         10,
         ImmutableList.of(
            bzz.a(cmy::gp), cad.a(), new bxz(ImmutableMap.of(cdn.aB, cdo.b), ImmutableList.of(Pair.of(bxu.a(0.5F), 2), Pair.of(new bwm(30, 60), 1)))
         )
      );
   }

   private static void e(bvl<cmy> $$0) {
      $$0.a(cpm.w, 5, ImmutableList.of(bzz.a(cmy::gp), bwv.a(cdn.az, 2, 0.7F)), cdn.az);
   }

   private static void f(bvl<cmy> $$0) {
      $$0.a(cpm.v, 5, ImmutableList.of(bzz.a(cmy::gp), new cab(i)), cdn.aB);
   }

   private static void g(bvl<cmy> $$0) {
      $$0.a(cpm.x, 10, ImmutableList.of(new bzy()), cdn.ay);
   }

   private static void a(cmy $$0, bvl<cmy> $$1) {
      $$1.a(
         cpm.k,
         10,
         ImmutableList.of(
            m, byr.a($$1x -> !$$0.y().d() || !$$0.c($$1x), cmz::b, false), byb.a($$1x -> a($$0, $$1x), (float)$$0.h(bvr.m)), byh.a(1.2F), new cac(), bxj.a(18)
         ),
         cdn.o
      );
   }

   private static boolean a(cmy $$0, buk $$1) {
      return $$0.dX().c(cdn.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cmy $$0, buk $$1) {
      if (!$$0.c($$1)) {
         $$0.d($$1);
      }

      a((buk)$$0);
   }

   public static void a(buk $$0) {
      if ($$0.dX().a(cdn.aE)) {
         $$0.dX().a(cdn.aE, bai.a, 1200L);
      }
   }

   public static void a(cmy $$0, je $$1) {
      if ($$0.dS().A_().a($$1) && !$$0.gp().isPresent() && !$$0.dX().c(cdn.o).isPresent()) {
         a((buk)$$0);
         $$0.dX().a(cdn.aG, bai.a, 100L);
         $$0.dX().a(cdn.n, new bwf($$1), 100L);
         $$0.dX().a(cdn.az, $$1, 100L);
         $$0.dX().b(cdn.m);
      }
   }
}
