import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cbb {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ary.f(100.0F);
   public static final int a = ary.f(133.59999F);
   public static final int b = ary.f(84.0F);
   private static final int i = ary.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bto<? extends btn<? super cba>>> k = List.of(bto.d, bto.v);
   private static final List<bsj<?>> l = List.of(
      bsj.g,
      bsj.h,
      bsj.k,
      bsj.l,
      bsj.L,
      bsj.n,
      bsj.m,
      bsj.E,
      bsj.t,
      bsj.o,
      bsj.p,
      bsj.B,
      bsj.ax,
      bsj.ay,
      bsj.az,
      bsj.aA,
      bsj.aB,
      bsj.aC,
      bsj.aD,
      bsj.aE,
      bsj.aF,
      bsj.aG,
      bsj.aH,
      bsj.aI,
      bsj.aJ,
      bsj.aK
   );
   private static final bla<cba> m = bol.a(
      (Function<bol.b<cba>, ? extends App<bol.c<cba>, boo<cba>>>)($$0 -> $$0.group($$0.a(bsj.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(asz.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cba $$0) {
      $$0.dN().a(ImmutableList.of(cdh.y, cdh.z, cdh.x, cdh.k, cdh.w, cdh.v, cdh.b));
   }

   protected static bki<?> a(cba $$0, Dynamic<?> $$1) {
      bki.b<cba> $$2 = bki.a(l, k);
      bki<cba> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cdh.a));
      $$3.b(cdh.b);
      $$3.f();
      return $$3;
   }

   private static void a(bki<cba> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bns(0.8F), bow.a(), new bme(45, 90), new bmi()));
   }

   private static void b(bki<cba> $$0) {
      $$0.a(cdh.y, 5, ImmutableList.of(new bos(a)), bsj.aB);
   }

   private static void c(bki<cba> $$0) {
      $$0.a(cdh.z, ImmutableList.of(Pair.of(0, new bot()), Pair.of(1, new bor(h))), ImmutableSet.of(Pair.of(bsj.ax, bsk.b), Pair.of(bsj.aD, bsk.b)));
   }

   private static void d(bki<cba> $$0) {
      $$0.a(
         cdh.b,
         10,
         ImmutableList.of(
            bov.a(cba::gd), boz.a(), new bmv(ImmutableMap.of(bsj.aA, bsk.b), ImmutableList.of(Pair.of(bmq.a(0.5F), 2), Pair.of(new blj(30, 60), 1)))
         )
      );
   }

   private static void e(bki<cba> $$0) {
      $$0.a(cdh.w, 5, ImmutableList.of(bov.a(cba::gd), bls.a(bsj.ay, 2, 0.7F)), bsj.ay);
   }

   private static void f(bki<cba> $$0) {
      $$0.a(cdh.v, 5, ImmutableList.of(bov.a(cba::gd), new box(i)), bsj.aA);
   }

   private static void g(bki<cba> $$0) {
      $$0.a(cdh.x, 10, ImmutableList.of(new bou()), bsj.ax);
   }

   private static void a(cba $$0, bki<cba> $$1) {
      $$1.a(
         cdh.k,
         10,
         ImmutableList.of(
            m, bnn.a($$1x -> !$$0.y().d() || !$$0.a($$1x), cbb::b, false), bmx.a($$1x -> a($$0, $$1x), (float)$$0.b(bko.b)), bnd.a(1.2F), new boy(), bmf.a(18)
         ),
         bsj.o
      );
   }

   private static boolean a(cba $$0, bji $$1) {
      return $$0.dN().c(bsj.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cba $$0, bji $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bji)$$0);
   }

   public static void a(bji $$0) {
      if ($$0.dN().a(bsj.aD)) {
         $$0.dN().a(bsj.aD, asz.a, 1200L);
      }
   }

   public static void a(cba $$0, gw $$1) {
      if ($$0.dL().B_().a($$1) && !$$0.gd().isPresent() && !$$0.dN().c(bsj.o).isPresent()) {
         a((bji)$$0);
         $$0.dN().a(bsj.aF, asz.a, 100L);
         $$0.dN().a(bsj.n, new blc($$1), 100L);
         $$0.dN().a(bsj.ay, $$1, 100L);
         $$0.dN().b(bsj.m);
      }
   }
}
