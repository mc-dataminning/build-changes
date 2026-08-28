import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cmu {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azc.f(100.0F);
   public static final int a = azc.f(133.59999F);
   public static final int b = azc.f(84.0F);
   private static final int i = azc.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cep<? extends ceo<? super cmt>>> k = List.of(cep.d, cep.x);
   private static final List<cdi<?>> l = List.of(
      cdi.g,
      cdi.h,
      cdi.k,
      cdi.l,
      cdi.M,
      cdi.n,
      cdi.m,
      cdi.E,
      cdi.t,
      cdi.o,
      cdi.p,
      cdi.B,
      cdi.ay,
      cdi.az,
      cdi.aA,
      cdi.aB,
      cdi.aC,
      cdi.aD,
      cdi.aE,
      cdi.aF,
      cdi.aG,
      cdi.aH,
      cdi.aI,
      cdi.aJ,
      cdi.aK,
      cdi.aL
   );
   private static final bvy<cmt> m = bzk.a(
      (Function<bzk.b<cmt>, ? extends App<bzk.c<cmt>, bzn<cmt>>>)($$0 -> $$0.group($$0.a(cdi.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bah.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cmt $$0) {
      $$0.dX().a(ImmutableList.of(cpg.y, cpg.z, cpg.x, cpg.k, cpg.w, cpg.v, cpg.b));
   }

   protected static bvg<?> a(cmt $$0, Dynamic<?> $$1) {
      bvg.b<cmt> $$2 = bvg.a(l, k);
      bvg<cmt> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cpg.a));
      $$3.b(cpg.b);
      $$3.f();
      return $$3;
   }

   private static void a(bvg<cmt> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new byr(0.8F), bzv.a(), new bxd(45, 90), new bxh()));
   }

   private static void b(bvg<cmt> $$0) {
      $$0.a(cpg.y, 5, ImmutableList.of(new bzr(a)), cdi.aC);
   }

   private static void c(bvg<cmt> $$0) {
      $$0.a(cpg.z, ImmutableList.of(Pair.of(0, new bzs()), Pair.of(1, new bzq(h))), ImmutableSet.of(Pair.of(cdi.ay, cdj.b), Pair.of(cdi.aE, cdj.b)));
   }

   private static void d(bvg<cmt> $$0) {
      $$0.a(
         cpg.b,
         10,
         ImmutableList.of(
            bzu.a(cmt::go), bzy.a(), new bxu(ImmutableMap.of(cdi.aB, cdj.b), ImmutableList.of(Pair.of(bxp.a(0.5F), 2), Pair.of(new bwh(30, 60), 1)))
         )
      );
   }

   private static void e(bvg<cmt> $$0) {
      $$0.a(cpg.w, 5, ImmutableList.of(bzu.a(cmt::go), bwq.a(cdi.az, 2, 0.7F)), cdi.az);
   }

   private static void f(bvg<cmt> $$0) {
      $$0.a(cpg.v, 5, ImmutableList.of(bzu.a(cmt::go), new bzw(i)), cdi.aB);
   }

   private static void g(bvg<cmt> $$0) {
      $$0.a(cpg.x, 10, ImmutableList.of(new bzt()), cdi.ay);
   }

   private static void a(cmt $$0, bvg<cmt> $$1) {
      $$1.a(
         cpg.k,
         10,
         ImmutableList.of(
            m, bym.a($$1x -> !$$0.y().d() || !$$0.c($$1x), cmu::b, false), bxw.a($$1x -> a($$0, $$1x), (float)$$0.h(bvm.m)), byc.a(1.2F), new bzx(), bxe.a(18)
         ),
         cdi.o
      );
   }

   private static boolean a(cmt $$0, buf $$1) {
      return $$0.dX().c(cdi.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cmt $$0, buf $$1) {
      if (!$$0.c($$1)) {
         $$0.d($$1);
      }

      a((buf)$$0);
   }

   public static void a(buf $$0) {
      if ($$0.dX().a(cdi.aE)) {
         $$0.dX().a(cdi.aE, bah.a, 1200L);
      }
   }

   public static void a(cmt $$0, je $$1) {
      if ($$0.dS().A_().a($$1) && !$$0.go().isPresent() && !$$0.dX().c(cdi.o).isPresent()) {
         a((buf)$$0);
         $$0.dX().a(cdi.aG, bah.a, 100L);
         $$0.dX().a(cdi.n, new bwa($$1), 100L);
         $$0.dX().a(cdi.az, $$1, 100L);
         $$0.dX().b(cdi.m);
      }
   }
}
