import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class ceg {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = aui.f(100.0F);
   public static final int a = aui.f(133.59999F);
   public static final int b = aui.f(84.0F);
   private static final int i = aui.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bwn<? extends bwm<? super cef>>> k = List.of(bwn.d, bwn.v);
   private static final List<bvh<?>> l = List.of(
      bvh.g,
      bvh.h,
      bvh.k,
      bvh.l,
      bvh.L,
      bvh.n,
      bvh.m,
      bvh.E,
      bvh.t,
      bvh.o,
      bvh.p,
      bvh.B,
      bvh.ax,
      bvh.ay,
      bvh.az,
      bvh.aA,
      bvh.aB,
      bvh.aC,
      bvh.aD,
      bvh.aE,
      bvh.aF,
      bvh.aG,
      bvh.aH,
      bvh.aI,
      bvh.aJ,
      bvh.aK
   );
   private static final bnx<cef> m = brj.a(
      (Function<brj.b<cef>, ? extends App<brj.c<cef>, brm<cef>>>)($$0 -> $$0.group($$0.a(bvh.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(avm.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cef $$0) {
      $$0.dO().a(ImmutableList.of(cgn.y, cgn.z, cgn.x, cgn.k, cgn.w, cgn.v, cgn.b));
   }

   protected static bnf<?> a(cef $$0, Dynamic<?> $$1) {
      bnf.b<cef> $$2 = bnf.a(l, k);
      bnf<cef> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cgn.a));
      $$3.b(cgn.b);
      $$3.f();
      return $$3;
   }

   private static void a(bnf<cef> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bqq(0.8F), bru.a(), new bpc(45, 90), new bpg()));
   }

   private static void b(bnf<cef> $$0) {
      $$0.a(cgn.y, 5, ImmutableList.of(new brq(a)), bvh.aB);
   }

   private static void c(bnf<cef> $$0) {
      $$0.a(cgn.z, ImmutableList.of(Pair.of(0, new brr()), Pair.of(1, new brp(h))), ImmutableSet.of(Pair.of(bvh.ax, bvi.b), Pair.of(bvh.aD, bvi.b)));
   }

   private static void d(bnf<cef> $$0) {
      $$0.a(
         cgn.b,
         10,
         ImmutableList.of(
            brt.a(cef::ge), brx.a(), new bpt(ImmutableMap.of(bvh.aA, bvi.b), ImmutableList.of(Pair.of(bpo.a(0.5F), 2), Pair.of(new bog(30, 60), 1)))
         )
      );
   }

   private static void e(bnf<cef> $$0) {
      $$0.a(cgn.w, 5, ImmutableList.of(brt.a(cef::ge), bop.a(bvh.ay, 2, 0.7F)), bvh.ay);
   }

   private static void f(bnf<cef> $$0) {
      $$0.a(cgn.v, 5, ImmutableList.of(brt.a(cef::ge), new brv(i)), bvh.aA);
   }

   private static void g(bnf<cef> $$0) {
      $$0.a(cgn.x, 10, ImmutableList.of(new brs()), bvh.ax);
   }

   private static void a(cef $$0, bnf<cef> $$1) {
      $$1.a(
         cgn.k,
         10,
         ImmutableList.of(
            m, bql.a($$1x -> !$$0.A().d() || !$$0.a($$1x), ceg::b, false), bpv.a($$1x -> a($$0, $$1x), (float)$$0.b(bnl.g)), bqb.a(1.2F), new brw(), bpd.a(18)
         ),
         bvh.o
      );
   }

   private static boolean a(cef $$0, bmf $$1) {
      return $$0.dO().c(bvh.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cef $$0, bmf $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bmf)$$0);
   }

   public static void a(bmf $$0) {
      if ($$0.dO().a(bvh.aD)) {
         $$0.dO().a(bvh.aD, avm.a, 1200L);
      }
   }

   public static void a(cef $$0, hx $$1) {
      if ($$0.dM().D_().a($$1) && !$$0.ge().isPresent() && !$$0.dO().c(bvh.o).isPresent()) {
         a((bmf)$$0);
         $$0.dO().a(bvh.aF, avm.a, 100L);
         $$0.dO().a(bvh.n, new bnz($$1), 100L);
         $$0.dO().a(bvh.ay, $$1, 100L);
         $$0.dO().b(bvh.m);
      }
   }
}
