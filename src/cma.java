import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cma {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayx.f(100.0F);
   public static final int a = ayx.f(133.59999F);
   public static final int b = ayx.f(84.0F);
   private static final int i = ayx.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cdy<? extends cdx<? super clz>>> k = List.of(cdy.d, cdy.x);
   private static final List<ccr<?>> l = List.of(
      ccr.g,
      ccr.h,
      ccr.k,
      ccr.l,
      ccr.M,
      ccr.n,
      ccr.m,
      ccr.E,
      ccr.t,
      ccr.o,
      ccr.p,
      ccr.B,
      ccr.ay,
      ccr.az,
      ccr.aA,
      ccr.aB,
      ccr.aC,
      ccr.aD,
      ccr.aE,
      ccr.aF,
      ccr.aG,
      ccr.aH,
      ccr.aI,
      ccr.aJ,
      ccr.aK,
      ccr.aL
   );
   private static final bvh<clz> m = byt.a(
      (Function<byt.b<clz>, ? extends App<byt.c<clz>, byw<clz>>>)($$0 -> $$0.group($$0.a(ccr.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(baa.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(clz $$0) {
      $$0.dS().a(ImmutableList.of(cok.y, cok.z, cok.x, cok.k, cok.w, cok.v, cok.b));
   }

   protected static bup<?> a(clz $$0, Dynamic<?> $$1) {
      bup.b<clz> $$2 = bup.a(l, k);
      bup<clz> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cok.a));
      $$3.b(cok.b);
      $$3.f();
      return $$3;
   }

   private static void a(bup<clz> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bya(0.8F), bze.a(), new bwm(45, 90), new bwq()));
   }

   private static void b(bup<clz> $$0) {
      $$0.a(cok.y, 5, ImmutableList.of(new bza(a)), ccr.aC);
   }

   private static void c(bup<clz> $$0) {
      $$0.a(cok.z, ImmutableList.of(Pair.of(0, new bzb()), Pair.of(1, new byz(h))), ImmutableSet.of(Pair.of(ccr.ay, ccs.b), Pair.of(ccr.aE, ccs.b)));
   }

   private static void d(bup<clz> $$0) {
      $$0.a(
         cok.b,
         10,
         ImmutableList.of(
            bzd.a(clz::gq), bzh.a(), new bxd(ImmutableMap.of(ccr.aB, ccs.b), ImmutableList.of(Pair.of(bwy.a(0.5F), 2), Pair.of(new bvq(30, 60), 1)))
         )
      );
   }

   private static void e(bup<clz> $$0) {
      $$0.a(cok.w, 5, ImmutableList.of(bzd.a(clz::gq), bvz.a(ccr.az, 2, 0.7F)), ccr.az);
   }

   private static void f(bup<clz> $$0) {
      $$0.a(cok.v, 5, ImmutableList.of(bzd.a(clz::gq), new bzf(i)), ccr.aB);
   }

   private static void g(bup<clz> $$0) {
      $$0.a(cok.x, 10, ImmutableList.of(new bzc()), ccr.ay);
   }

   private static void a(clz $$0, bup<clz> $$1) {
      $$1.a(
         cok.k,
         10,
         ImmutableList.of(
            m, bxv.a($$1x -> !$$0.y().d() || !$$0.b($$1x), cma::b, false), bxf.a($$1x -> a($$0, $$1x), (float)$$0.g(buv.k)), bxl.a(1.2F), new bzg(), bwn.a(18)
         ),
         ccr.o
      );
   }

   private static boolean a(clz $$0, btn $$1) {
      return $$0.dS().c(ccr.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(clz $$0, btn $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btn)$$0);
   }

   public static void a(btn $$0) {
      if ($$0.dS().a(ccr.aE)) {
         $$0.dS().a(ccr.aE, baa.a, 1200L);
      }
   }

   public static void a(clz $$0, iz $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gq().isPresent() && !$$0.dS().c(ccr.o).isPresent()) {
         a((btn)$$0);
         $$0.dS().a(ccr.aG, baa.a, 100L);
         $$0.dS().a(ccr.n, new bvj($$1), 100L);
         $$0.dS().a(ccr.az, $$1, 100L);
         $$0.dS().b(ccr.m);
      }
   }
}
