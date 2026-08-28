import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cnz {
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
   private static final List<cfr<? extends cfq<? super cny>>> k = List.of(cfr.d, cfr.x);
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
   private static final bxa<cny> m = cam.a(
      (Function<cam.b<cny>, ? extends App<cam.c<cny>, cap<cny>>>)($$0 -> $$0.group($$0.a(cek.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(baf.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cny $$0) {
      $$0.eb().a(ImmutableList.of(cqn.y, cqn.z, cqn.x, cqn.k, cqn.w, cqn.v, cqn.b));
   }

   protected static bwi<?> a(cny $$0, Dynamic<?> $$1) {
      bwi.b<cny> $$2 = bwi.a(l, k);
      bwi<cny> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cqn.a));
      $$3.b(cqn.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwi<cny> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt(0.8F), cax.a(), new byf(45, 90), new byj()));
   }

   private static void b(bwi<cny> $$0) {
      $$0.a(cqn.y, 5, ImmutableList.of(new cat(a)), cek.aC);
   }

   private static void c(bwi<cny> $$0) {
      $$0.a(cqn.z, ImmutableList.of(Pair.of(0, new cau()), Pair.of(1, new cas(h))), ImmutableSet.of(Pair.of(cek.ay, cel.b), Pair.of(cek.aE, cel.b)));
   }

   private static void d(bwi<cny> $$0) {
      $$0.a(
         cqn.b,
         10,
         ImmutableList.of(
            caw.a(cny::x), cba.a(), new byw(ImmutableMap.of(cek.aB, cel.b), ImmutableList.of(Pair.of(byr.a(0.5F), 2), Pair.of(new bxj(30, 60), 1)))
         )
      );
   }

   private static void e(bwi<cny> $$0) {
      $$0.a(cqn.w, 5, ImmutableList.of(caw.a(cny::x), bxs.a(cek.az, 2, 0.7F)), cek.az);
   }

   private static void f(bwi<cny> $$0) {
      $$0.a(cqn.v, 5, ImmutableList.of(caw.a(cny::x), new cay(i)), cek.aB);
   }

   private static void g(bwi<cny> $$0) {
      $$0.a(cqn.x, 10, ImmutableList.of(new cav()), cek.ay);
   }

   private static void a(cny $$0, bwi<cny> $$1) {
      $$1.a(
         cqn.k,
         10,
         ImmutableList.of(
            m,
            bzo.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), cnz::a, false),
            byy.a($$1x -> a($$0, $$1x), (float)$$0.h(bwo.m)),
            bze.a(1.2F),
            new caz(),
            byg.a(18)
         ),
         cek.o
      );
   }

   private static boolean a(cny $$0, bvg $$1) {
      return $$0.eb().c(cek.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(ard $$0, cny $$1, bvg $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bvg)$$1);
   }

   public static void a(bvg $$0) {
      if ($$0.eb().a(cek.aE)) {
         $$0.eb().a(cek.aE, baf.a, 1200L);
      }
   }

   public static void a(cny $$0, ji $$1) {
      if ($$0.dV().F_().a($$1) && !$$0.x().isPresent() && !$$0.eb().c(cek.o).isPresent()) {
         a((bvg)$$0);
         $$0.eb().a(cek.aG, baf.a, 100L);
         $$0.eb().a(cek.n, new bxc($$1), 100L);
         $$0.eb().a(cek.az, $$1, 100L);
         $$0.eb().b(cek.m);
      }
   }
}
