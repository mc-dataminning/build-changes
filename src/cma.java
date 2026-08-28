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
   private static final int h = ayn.f(100.0F);
   public static final int a = ayn.f(133.59999F);
   public static final int b = ayn.f(84.0F);
   private static final int i = ayn.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cdx<? extends cdw<? super clz>>> k = List.of(cdx.d, cdx.x);
   private static final List<ccq<?>> l = List.of(
      ccq.g,
      ccq.h,
      ccq.k,
      ccq.l,
      ccq.M,
      ccq.n,
      ccq.m,
      ccq.E,
      ccq.t,
      ccq.o,
      ccq.p,
      ccq.B,
      ccq.ay,
      ccq.az,
      ccq.aA,
      ccq.aB,
      ccq.aC,
      ccq.aD,
      ccq.aE,
      ccq.aF,
      ccq.aG,
      ccq.aH,
      ccq.aI,
      ccq.aJ,
      ccq.aK,
      ccq.aL
   );
   private static final bvg<clz> m = bys.a(
      (Function<bys.b<clz>, ? extends App<bys.c<clz>, byv<clz>>>)($$0 -> $$0.group($$0.a(ccq.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azr.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(clz $$0) {
      $$0.dU().a(ImmutableList.of(cok.y, cok.z, cok.x, cok.k, cok.w, cok.v, cok.b));
   }

   protected static buo<?> a(clz $$0, Dynamic<?> $$1) {
      buo.b<clz> $$2 = buo.a(l, k);
      buo<clz> $$3 = $$2.a($$1);
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

   private static void a(buo<clz> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bxz(0.8F), bzd.a(), new bwl(45, 90), new bwp()));
   }

   private static void b(buo<clz> $$0) {
      $$0.a(cok.y, 5, ImmutableList.of(new byz(a)), ccq.aC);
   }

   private static void c(buo<clz> $$0) {
      $$0.a(cok.z, ImmutableList.of(Pair.of(0, new bza()), Pair.of(1, new byy(h))), ImmutableSet.of(Pair.of(ccq.ay, ccr.b), Pair.of(ccq.aE, ccr.b)));
   }

   private static void d(buo<clz> $$0) {
      $$0.a(
         cok.b,
         10,
         ImmutableList.of(
            bzc.a(clz::gm), bzg.a(), new bxc(ImmutableMap.of(ccq.aB, ccr.b), ImmutableList.of(Pair.of(bwx.a(0.5F), 2), Pair.of(new bvp(30, 60), 1)))
         )
      );
   }

   private static void e(buo<clz> $$0) {
      $$0.a(cok.w, 5, ImmutableList.of(bzc.a(clz::gm), bvy.a(ccq.az, 2, 0.7F)), ccq.az);
   }

   private static void f(buo<clz> $$0) {
      $$0.a(cok.v, 5, ImmutableList.of(bzc.a(clz::gm), new bze(i)), ccq.aB);
   }

   private static void g(buo<clz> $$0) {
      $$0.a(cok.x, 10, ImmutableList.of(new bzb()), ccq.ay);
   }

   private static void a(clz $$0, buo<clz> $$1) {
      $$1.a(
         cok.k,
         10,
         ImmutableList.of(
            m, bxu.a($$1x -> !$$0.x().d() || !$$0.b($$1x), cma::b, false), bxe.a($$1x -> a($$0, $$1x), (float)$$0.g(buu.m)), bxk.a(1.2F), new bzf(), bwm.a(18)
         ),
         ccq.o
      );
   }

   private static boolean a(clz $$0, btl $$1) {
      return $$0.dU().c(ccq.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(clz $$0, btl $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btl)$$0);
   }

   public static void a(btl $$0) {
      if ($$0.dU().a(ccq.aE)) {
         $$0.dU().a(ccq.aE, azr.a, 1200L);
      }
   }

   public static void a(clz $$0, jd $$1) {
      if ($$0.dQ().C_().a($$1) && !$$0.gm().isPresent() && !$$0.dU().c(ccq.o).isPresent()) {
         a((btl)$$0);
         $$0.dU().a(ccq.aG, azr.a, 100L);
         $$0.dU().a(ccq.n, new bvi($$1), 100L);
         $$0.dU().a(ccq.az, $$1, 100L);
         $$0.dU().b(ccq.m);
      }
   }
}
