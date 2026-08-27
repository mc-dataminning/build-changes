import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cen {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = auo.f(100.0F);
   public static final int a = auo.f(133.59999F);
   public static final int b = auo.f(84.0F);
   private static final int i = auo.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bwt<? extends bws<? super cem>>> k = List.of(bwt.d, bwt.v);
   private static final List<bvn<?>> l = List.of(
      bvn.g,
      bvn.h,
      bvn.k,
      bvn.l,
      bvn.L,
      bvn.n,
      bvn.m,
      bvn.E,
      bvn.t,
      bvn.o,
      bvn.p,
      bvn.B,
      bvn.ax,
      bvn.ay,
      bvn.az,
      bvn.aA,
      bvn.aB,
      bvn.aC,
      bvn.aD,
      bvn.aE,
      bvn.aF,
      bvn.aG,
      bvn.aH,
      bvn.aI,
      bvn.aJ,
      bvn.aK
   );
   private static final bod<cem> m = brp.a(
      (Function<brp.b<cem>, ? extends App<brp.c<cem>, brs<cem>>>)($$0 -> $$0.group($$0.a(bvn.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(avs.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cem $$0) {
      $$0.dO().a(ImmutableList.of(cgu.y, cgu.z, cgu.x, cgu.k, cgu.w, cgu.v, cgu.b));
   }

   protected static bnl<?> a(cem $$0, Dynamic<?> $$1) {
      bnl.b<cem> $$2 = bnl.a(l, k);
      bnl<cem> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cgu.a));
      $$3.b(cgu.b);
      $$3.f();
      return $$3;
   }

   private static void a(bnl<cem> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bqw(0.8F), bsa.a(), new bpi(45, 90), new bpm()));
   }

   private static void b(bnl<cem> $$0) {
      $$0.a(cgu.y, 5, ImmutableList.of(new brw(a)), bvn.aB);
   }

   private static void c(bnl<cem> $$0) {
      $$0.a(cgu.z, ImmutableList.of(Pair.of(0, new brx()), Pair.of(1, new brv(h))), ImmutableSet.of(Pair.of(bvn.ax, bvo.b), Pair.of(bvn.aD, bvo.b)));
   }

   private static void d(bnl<cem> $$0) {
      $$0.a(
         cgu.b,
         10,
         ImmutableList.of(
            brz.a(cem::ge), bsd.a(), new bpz(ImmutableMap.of(bvn.aA, bvo.b), ImmutableList.of(Pair.of(bpu.a(0.5F), 2), Pair.of(new bom(30, 60), 1)))
         )
      );
   }

   private static void e(bnl<cem> $$0) {
      $$0.a(cgu.w, 5, ImmutableList.of(brz.a(cem::ge), bov.a(bvn.ay, 2, 0.7F)), bvn.ay);
   }

   private static void f(bnl<cem> $$0) {
      $$0.a(cgu.v, 5, ImmutableList.of(brz.a(cem::ge), new bsb(i)), bvn.aA);
   }

   private static void g(bnl<cem> $$0) {
      $$0.a(cgu.x, 10, ImmutableList.of(new bry()), bvn.ax);
   }

   private static void a(cem $$0, bnl<cem> $$1) {
      $$1.a(
         cgu.k,
         10,
         ImmutableList.of(
            m, bqr.a($$1x -> !$$0.A().d() || !$$0.a($$1x), cen::b, false), bqb.a($$1x -> a($$0, $$1x), (float)$$0.b(bnr.g)), bqh.a(1.2F), new bsc(), bpj.a(18)
         ),
         bvn.o
      );
   }

   private static boolean a(cem $$0, bml $$1) {
      return $$0.dO().c(bvn.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cem $$0, bml $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bml)$$0);
   }

   public static void a(bml $$0) {
      if ($$0.dO().a(bvn.aD)) {
         $$0.dO().a(bvn.aD, avs.a, 1200L);
      }
   }

   public static void a(cem $$0, hx $$1) {
      if ($$0.dM().D_().a($$1) && !$$0.ge().isPresent() && !$$0.dO().c(bvn.o).isPresent()) {
         a((bml)$$0);
         $$0.dO().a(bvn.aF, avs.a, 100L);
         $$0.dO().a(bvn.n, new bof($$1), 100L);
         $$0.dO().a(bvn.ay, $$1, 100L);
         $$0.dO().b(bvn.m);
      }
   }
}
