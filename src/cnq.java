import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cnq {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azk.f(100.0F);
   public static final int a = azk.f(133.59999F);
   public static final int b = azk.f(84.0F);
   private static final int i = azk.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cfl<? extends cfk<? super cnp>>> k = List.of(cfl.d, cfl.x);
   private static final List<cee<?>> l = List.of(
      cee.g,
      cee.h,
      cee.k,
      cee.l,
      cee.M,
      cee.n,
      cee.m,
      cee.E,
      cee.t,
      cee.o,
      cee.p,
      cee.B,
      cee.ay,
      cee.az,
      cee.aA,
      cee.aB,
      cee.aC,
      cee.aD,
      cee.aE,
      cee.aF,
      cee.aG,
      cee.aH,
      cee.aI,
      cee.aJ,
      cee.aK,
      cee.aL
   );
   private static final bwu<cnp> m = cag.a(
      (Function<cag.b<cnp>, ? extends App<cag.c<cnp>, caj<cnp>>>)($$0 -> $$0.group($$0.a(cee.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bap.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cnp $$0) {
      $$0.ed().a(ImmutableList.of(cqe.y, cqe.z, cqe.x, cqe.k, cqe.w, cqe.v, cqe.b));
   }

   protected static bwc<?> a(cnp $$0, Dynamic<?> $$1) {
      bwc.b<cnp> $$2 = bwc.a(l, k);
      bwc<cnp> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cqe.a));
      $$3.b(cqe.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwc<cnp> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bzn(0.8F), car.a(), new bxz(45, 90), new byd()));
   }

   private static void b(bwc<cnp> $$0) {
      $$0.a(cqe.y, 5, ImmutableList.of(new can(a)), cee.aC);
   }

   private static void c(bwc<cnp> $$0) {
      $$0.a(cqe.z, ImmutableList.of(Pair.of(0, new cao()), Pair.of(1, new cam(h))), ImmutableSet.of(Pair.of(cee.ay, cef.b), Pair.of(cee.aE, cef.b)));
   }

   private static void d(bwc<cnp> $$0) {
      $$0.a(
         cqe.b,
         10,
         ImmutableList.of(
            caq.a(cnp::gu), cau.a(), new byq(ImmutableMap.of(cee.aB, cef.b), ImmutableList.of(Pair.of(byl.a(0.5F), 2), Pair.of(new bxd(30, 60), 1)))
         )
      );
   }

   private static void e(bwc<cnp> $$0) {
      $$0.a(cqe.w, 5, ImmutableList.of(caq.a(cnp::gu), bxm.a(cee.az, 2, 0.7F)), cee.az);
   }

   private static void f(bwc<cnp> $$0) {
      $$0.a(cqe.v, 5, ImmutableList.of(caq.a(cnp::gu), new cas(i)), cee.aB);
   }

   private static void g(bwc<cnp> $$0) {
      $$0.a(cqe.x, 10, ImmutableList.of(new cap()), cee.ay);
   }

   private static void a(cnp $$0, bwc<cnp> $$1) {
      $$1.a(
         cqe.k,
         10,
         ImmutableList.of(
            m, bzi.a($$1x -> !$$0.y().d() || !$$0.c($$1x), cnq::b, false), bys.a($$1x -> a($$0, $$1x), (float)$$0.h(bwi.m)), byy.a(1.2F), new cat(), bya.a(18)
         ),
         cee.o
      );
   }

   private static boolean a(cnp $$0, bva $$1) {
      return $$0.ed().c(cee.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cnp $$0, bva $$1) {
      if (!$$0.c($$1)) {
         $$0.d($$1);
      }

      a((bva)$$0);
   }

   public static void a(bva $$0) {
      if ($$0.ed().a(cee.aE)) {
         $$0.ed().a(cee.aE, bap.a, 1200L);
      }
   }

   public static void a(cnp $$0, jh $$1) {
      if ($$0.dX().C_().a($$1) && !$$0.gu().isPresent() && !$$0.ed().c(cee.o).isPresent()) {
         a((bva)$$0);
         $$0.ed().a(cee.aG, bap.a, 100L);
         $$0.ed().a(cee.n, new bww($$1), 100L);
         $$0.ed().a(cee.az, $$1, 100L);
         $$0.ed().b(cee.m);
      }
   }
}
