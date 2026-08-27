import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cjq {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = axw.f(100.0F);
   public static final int a = axw.f(133.59999F);
   public static final int b = axw.f(84.0F);
   private static final int i = axw.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cbo<? extends cbn<? super cjp>>> k = List.of(cbo.d, cbo.x);
   private static final List<cah<?>> l = List.of(
      cah.g,
      cah.h,
      cah.k,
      cah.l,
      cah.M,
      cah.n,
      cah.m,
      cah.E,
      cah.t,
      cah.o,
      cah.p,
      cah.B,
      cah.ay,
      cah.az,
      cah.aA,
      cah.aB,
      cah.aC,
      cah.aD,
      cah.aE,
      cah.aF,
      cah.aG,
      cah.aH,
      cah.aI,
      cah.aJ,
      cah.aK,
      cah.aL
   );
   private static final bsx<cjp> m = bwj.a(
      (Function<bwj.b<cjp>, ? extends App<bwj.c<cjp>, bwm<cjp>>>)($$0 -> $$0.group($$0.a(cah.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(ayy.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cjp $$0) {
      $$0.dQ().a(ImmutableList.of(cma.y, cma.z, cma.x, cma.k, cma.w, cma.v, cma.b));
   }

   protected static bsf<?> a(cjp $$0, Dynamic<?> $$1) {
      bsf.b<cjp> $$2 = bsf.a(l, k);
      bsf<cjp> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cma.a));
      $$3.b(cma.b);
      $$3.f();
      return $$3;
   }

   private static void a(bsf<cjp> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bvq(0.8F), bwu.a(), new buc(45, 90), new bug()));
   }

   private static void b(bsf<cjp> $$0) {
      $$0.a(cma.y, 5, ImmutableList.of(new bwq(a)), cah.aC);
   }

   private static void c(bsf<cjp> $$0) {
      $$0.a(cma.z, ImmutableList.of(Pair.of(0, new bwr()), Pair.of(1, new bwp(h))), ImmutableSet.of(Pair.of(cah.ay, cai.b), Pair.of(cah.aE, cai.b)));
   }

   private static void d(bsf<cjp> $$0) {
      $$0.a(
         cma.b,
         10,
         ImmutableList.of(
            bwt.a(cjp::gp), bwx.a(), new but(ImmutableMap.of(cah.aB, cai.b), ImmutableList.of(Pair.of(buo.a(0.5F), 2), Pair.of(new btg(30, 60), 1)))
         )
      );
   }

   private static void e(bsf<cjp> $$0) {
      $$0.a(cma.w, 5, ImmutableList.of(bwt.a(cjp::gp), btp.a(cah.az, 2, 0.7F)), cah.az);
   }

   private static void f(bsf<cjp> $$0) {
      $$0.a(cma.v, 5, ImmutableList.of(bwt.a(cjp::gp), new bwv(i)), cah.aB);
   }

   private static void g(bsf<cjp> $$0) {
      $$0.a(cma.x, 10, ImmutableList.of(new bws()), cah.ay);
   }

   private static void a(cjp $$0, bsf<cjp> $$1) {
      $$1.a(
         cma.k,
         10,
         ImmutableList.of(
            m, bvl.a($$1x -> !$$0.y().d() || !$$0.b($$1x), cjq::b, false), buv.a($$1x -> a($$0, $$1x), (float)$$0.g(bsl.k)), bvb.a(1.2F), new bww(), bud.a(18)
         ),
         cah.o
      );
   }

   private static boolean a(cjp $$0, bre $$1) {
      return $$0.dQ().c(cah.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cjp $$0, bre $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bre)$$0);
   }

   public static void a(bre $$0) {
      if ($$0.dQ().a(cah.aE)) {
         $$0.dQ().a(cah.aE, ayy.a, 1200L);
      }
   }

   public static void a(cjp $$0, im $$1) {
      if ($$0.dN().C_().a($$1) && !$$0.gp().isPresent() && !$$0.dQ().c(cah.o).isPresent()) {
         a((bre)$$0);
         $$0.dQ().a(cah.aG, ayy.a, 100L);
         $$0.dQ().a(cah.n, new bsz($$1), 100L);
         $$0.dQ().a(cah.az, $$1, 100L);
         $$0.dQ().b(cah.m);
      }
   }
}
