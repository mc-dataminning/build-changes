import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class coa {
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
   private static final List<cfr<? extends cfq<? super cnz>>> k = List.of(cfr.d, cfr.x);
   private static final List<cek<?>> l = List.of(
      cek.g,
      cek.h,
      cek.k,
      cek.l,
      cek.M,
      cek.n,
      cek.m,
      cek.E,
      cek.t,
      cek.o,
      cek.p,
      cek.B,
      cek.ay,
      cek.az,
      cek.aA,
      cek.aB,
      cek.aC,
      cek.aD,
      cek.aE,
      cek.aF,
      cek.aG,
      cek.aH,
      cek.aI,
      cek.aJ,
      cek.aK,
      cek.aL
   );
   private static final bxa<cnz> m = cam.a(
      (Function<cam.b<cnz>, ? extends App<cam.c<cnz>, cap<cnz>>>)($$0 -> $$0.group($$0.a(cek.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(baf.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cnz $$0) {
      $$0.ec().a(ImmutableList.of(cqo.y, cqo.z, cqo.x, cqo.k, cqo.w, cqo.v, cqo.b));
   }

   protected static bwi<?> a(cnz $$0, Dynamic<?> $$1) {
      bwi.b<cnz> $$2 = bwi.a(l, k);
      bwi<cnz> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cqo.a));
      $$3.b(cqo.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwi<cnz> $$0) {
      $$0.a(cqo.a, 0, ImmutableList.of(new bzt(0.8F), cax.a(), new byf(45, 90), new byj()));
   }

   private static void b(bwi<cnz> $$0) {
      $$0.a(cqo.y, 5, ImmutableList.of(new cat(a)), cek.aC);
   }

   private static void c(bwi<cnz> $$0) {
      $$0.a(cqo.z, ImmutableList.of(Pair.of(0, new cau()), Pair.of(1, new cas(h))), ImmutableSet.of(Pair.of(cek.ay, cel.b), Pair.of(cek.aE, cel.b)));
   }

   private static void d(bwi<cnz> $$0) {
      $$0.a(
         cqo.b,
         10,
         ImmutableList.of(
            caw.a(cnz::x), cba.a(), new byw(ImmutableMap.of(cek.aB, cel.b), ImmutableList.of(Pair.of(byr.a(0.5F), 2), Pair.of(new bxj(30, 60), 1)))
         )
      );
   }

   private static void e(bwi<cnz> $$0) {
      $$0.a(cqo.w, 5, ImmutableList.of(caw.a(cnz::x), bxs.a(cek.az, 2, 0.7F)), cek.az);
   }

   private static void f(bwi<cnz> $$0) {
      $$0.a(cqo.v, 5, ImmutableList.of(caw.a(cnz::x), new cay(i)), cek.aB);
   }

   private static void g(bwi<cnz> $$0) {
      $$0.a(cqo.x, 10, ImmutableList.of(new cav()), cek.ay);
   }

   private static void a(cnz $$0, bwi<cnz> $$1) {
      $$1.a(
         cqo.k,
         10,
         ImmutableList.of(
            m,
            bzo.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), coa::a, false),
            byy.a($$1x -> a($$0, $$1x), (float)$$0.h(bwo.m)),
            bze.a(1.2F),
            new caz(),
            byg.a(18)
         ),
         cek.o
      );
   }

   private static boolean a(cnz $$0, bvg $$1) {
      return $$0.ec().c(cek.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arc $$0, cnz $$1, bvg $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bvg)$$1);
   }

   public static void a(bvg $$0) {
      if ($$0.ec().a(cek.aE)) {
         $$0.ec().a(cek.aE, baf.a, 1200L);
      }
   }

   public static void a(cnz $$0, ji $$1) {
      if ($$0.dW().F_().a($$1) && !$$0.x().isPresent() && !$$0.ec().c(cek.o).isPresent()) {
         a((bvg)$$0);
         $$0.ec().a(cek.aG, baf.a, 100L);
         $$0.ec().a(cek.n, new bxc($$1), 100L);
         $$0.ec().a(cek.az, $$1, 100L);
         $$0.ec().b(cek.m);
      }
   }
}
