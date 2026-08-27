import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class ciy {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = axk.f(100.0F);
   public static final int a = axk.f(133.59999F);
   public static final int b = axk.f(84.0F);
   private static final int i = axk.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cay<? extends cax<? super cix>>> k = List.of(cay.d, cay.x);
   private static final List<bzr<?>> l = List.of(
      bzr.g,
      bzr.h,
      bzr.k,
      bzr.l,
      bzr.M,
      bzr.n,
      bzr.m,
      bzr.E,
      bzr.t,
      bzr.o,
      bzr.p,
      bzr.B,
      bzr.ay,
      bzr.az,
      bzr.aA,
      bzr.aB,
      bzr.aC,
      bzr.aD,
      bzr.aE,
      bzr.aF,
      bzr.aG,
      bzr.aH,
      bzr.aI,
      bzr.aJ,
      bzr.aK,
      bzr.aL
   );
   private static final bsh<cix> m = bvt.a(
      (Function<bvt.b<cix>, ? extends App<bvt.c<cix>, bvw<cix>>>)($$0 -> $$0.group($$0.a(bzr.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(aym.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cix $$0) {
      $$0.dP().a(ImmutableList.of(cli.y, cli.z, cli.x, cli.k, cli.w, cli.v, cli.b));
   }

   protected static brp<?> a(cix $$0, Dynamic<?> $$1) {
      brp.b<cix> $$2 = brp.a(l, k);
      brp<cix> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cli.a));
      $$3.b(cli.b);
      $$3.f();
      return $$3;
   }

   private static void a(brp<cix> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bva(0.8F), bwe.a(), new btm(45, 90), new btq()));
   }

   private static void b(brp<cix> $$0) {
      $$0.a(cli.y, 5, ImmutableList.of(new bwa(a)), bzr.aC);
   }

   private static void c(brp<cix> $$0) {
      $$0.a(cli.z, ImmutableList.of(Pair.of(0, new bwb()), Pair.of(1, new bvz(h))), ImmutableSet.of(Pair.of(bzr.ay, bzs.b), Pair.of(bzr.aE, bzs.b)));
   }

   private static void d(brp<cix> $$0) {
      $$0.a(
         cli.b,
         10,
         ImmutableList.of(
            bwd.a(cix::gn), bwh.a(), new bud(ImmutableMap.of(bzr.aB, bzs.b), ImmutableList.of(Pair.of(bty.a(0.5F), 2), Pair.of(new bsq(30, 60), 1)))
         )
      );
   }

   private static void e(brp<cix> $$0) {
      $$0.a(cli.w, 5, ImmutableList.of(bwd.a(cix::gn), bsz.a(bzr.az, 2, 0.7F)), bzr.az);
   }

   private static void f(brp<cix> $$0) {
      $$0.a(cli.v, 5, ImmutableList.of(bwd.a(cix::gn), new bwf(i)), bzr.aB);
   }

   private static void g(brp<cix> $$0) {
      $$0.a(cli.x, 10, ImmutableList.of(new bwc()), bzr.ay);
   }

   private static void a(cix $$0, brp<cix> $$1) {
      $$1.a(
         cli.k,
         10,
         ImmutableList.of(
            m, buv.a($$1x -> !$$0.y().d() || !$$0.b($$1x), ciy::b, false), buf.a($$1x -> a($$0, $$1x), (float)$$0.g(brv.k)), bul.a(1.2F), new bwg(), btn.a(18)
         ),
         bzr.o
      );
   }

   private static boolean a(cix $$0, bqo $$1) {
      return $$0.dP().c(bzr.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cix $$0, bqo $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bqo)$$0);
   }

   public static void a(bqo $$0) {
      if ($$0.dP().a(bzr.aE)) {
         $$0.dP().a(bzr.aE, aym.a, 1200L);
      }
   }

   public static void a(cix $$0, ib $$1) {
      if ($$0.dM().C_().a($$1) && !$$0.gn().isPresent() && !$$0.dP().c(bzr.o).isPresent()) {
         a((bqo)$$0);
         $$0.dP().a(bzr.aG, aym.a, 100L);
         $$0.dP().a(bzr.n, new bsj($$1), 100L);
         $$0.dP().a(bzr.az, $$1, 100L);
         $$0.dP().b(bzr.m);
      }
   }
}
