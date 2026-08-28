import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cme {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayz.f(100.0F);
   public static final int a = ayz.f(133.59999F);
   public static final int b = ayz.f(84.0F);
   private static final int i = ayz.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cec<? extends ceb<? super cmd>>> k = List.of(cec.d, cec.x);
   private static final List<ccv<?>> l = List.of(
      ccv.g,
      ccv.h,
      ccv.k,
      ccv.l,
      ccv.M,
      ccv.n,
      ccv.m,
      ccv.E,
      ccv.t,
      ccv.o,
      ccv.p,
      ccv.B,
      ccv.ay,
      ccv.az,
      ccv.aA,
      ccv.aB,
      ccv.aC,
      ccv.aD,
      ccv.aE,
      ccv.aF,
      ccv.aG,
      ccv.aH,
      ccv.aI,
      ccv.aJ,
      ccv.aK,
      ccv.aL
   );
   private static final bvl<cmd> m = byx.a(
      (Function<byx.b<cmd>, ? extends App<byx.c<cmd>, bza<cmd>>>)($$0 -> $$0.group($$0.a(ccv.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bac.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cmd $$0) {
      $$0.dS().a(ImmutableList.of(cop.y, cop.z, cop.x, cop.k, cop.w, cop.v, cop.b));
   }

   protected static but<?> a(cmd $$0, Dynamic<?> $$1) {
      but.b<cmd> $$2 = but.a(l, k);
      but<cmd> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cop.a));
      $$3.b(cop.b);
      $$3.f();
      return $$3;
   }

   private static void a(but<cmd> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bye(0.8F), bzi.a(), new bwq(45, 90), new bwu()));
   }

   private static void b(but<cmd> $$0) {
      $$0.a(cop.y, 5, ImmutableList.of(new bze(a)), ccv.aC);
   }

   private static void c(but<cmd> $$0) {
      $$0.a(cop.z, ImmutableList.of(Pair.of(0, new bzf()), Pair.of(1, new bzd(h))), ImmutableSet.of(Pair.of(ccv.ay, ccw.b), Pair.of(ccv.aE, ccw.b)));
   }

   private static void d(but<cmd> $$0) {
      $$0.a(
         cop.b,
         10,
         ImmutableList.of(
            bzh.a(cmd::gq), bzl.a(), new bxh(ImmutableMap.of(ccv.aB, ccw.b), ImmutableList.of(Pair.of(bxc.a(0.5F), 2), Pair.of(new bvu(30, 60), 1)))
         )
      );
   }

   private static void e(but<cmd> $$0) {
      $$0.a(cop.w, 5, ImmutableList.of(bzh.a(cmd::gq), bwd.a(ccv.az, 2, 0.7F)), ccv.az);
   }

   private static void f(but<cmd> $$0) {
      $$0.a(cop.v, 5, ImmutableList.of(bzh.a(cmd::gq), new bzj(i)), ccv.aB);
   }

   private static void g(but<cmd> $$0) {
      $$0.a(cop.x, 10, ImmutableList.of(new bzg()), ccv.ay);
   }

   private static void a(cmd $$0, but<cmd> $$1) {
      $$1.a(
         cop.k,
         10,
         ImmutableList.of(
            m, bxz.a($$1x -> !$$0.y().d() || !$$0.b($$1x), cme::b, false), bxj.a($$1x -> a($$0, $$1x), (float)$$0.g(buz.k)), bxp.a(1.2F), new bzk(), bwr.a(18)
         ),
         ccv.o
      );
   }

   private static boolean a(cmd $$0, btr $$1) {
      return $$0.dS().c(ccv.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cmd $$0, btr $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btr)$$0);
   }

   public static void a(btr $$0) {
      if ($$0.dS().a(ccv.aE)) {
         $$0.dS().a(ccv.aE, bac.a, 1200L);
      }
   }

   public static void a(cmd $$0, iz $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gq().isPresent() && !$$0.dS().c(ccv.o).isPresent()) {
         a((btr)$$0);
         $$0.dS().a(ccv.aG, bac.a, 100L);
         $$0.dS().a(ccv.n, new bvn($$1), 100L);
         $$0.dS().a(ccv.az, $$1, 100L);
         $$0.dS().b(ccv.m);
      }
   }
}
