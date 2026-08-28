import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cny {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayy.f(100.0F);
   public static final int a = ayy.f(133.59999F);
   public static final int b = ayy.f(84.0F);
   private static final int i = ayy.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cfq<? extends cfp<? super cnx>>> k = List.of(cfq.d, cfq.x);
   private static final List<cej<?>> l = List.of(
      cej.g,
      cej.h,
      cej.k,
      cej.l,
      cej.M,
      cej.n,
      cej.m,
      cej.E,
      cej.t,
      cej.o,
      cej.p,
      cej.B,
      cej.ay,
      cej.az,
      cej.aA,
      cej.aB,
      cej.aC,
      cej.aD,
      cej.aE,
      cej.aF,
      cej.aG,
      cej.aH,
      cej.aI,
      cej.aJ,
      cej.aK,
      cej.aL
   );
   private static final bwz<cnx> m = cal.a(
      (Function<cal.b<cnx>, ? extends App<cal.c<cnx>, cao<cnx>>>)($$0 -> $$0.group($$0.a(cej.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bae.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cnx $$0) {
      $$0.ec().a(ImmutableList.of(cqm.y, cqm.z, cqm.x, cqm.k, cqm.w, cqm.v, cqm.b));
   }

   protected static bwh<?> a(cnx $$0, Dynamic<?> $$1) {
      bwh.b<cnx> $$2 = bwh.a(l, k);
      bwh<cnx> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cqm.a));
      $$3.b(cqm.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwh<cnx> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs(0.8F), caw.a(), new bye(45, 90), new byi()));
   }

   private static void b(bwh<cnx> $$0) {
      $$0.a(cqm.y, 5, ImmutableList.of(new cas(a)), cej.aC);
   }

   private static void c(bwh<cnx> $$0) {
      $$0.a(cqm.z, ImmutableList.of(Pair.of(0, new cat()), Pair.of(1, new car(h))), ImmutableSet.of(Pair.of(cej.ay, cek.b), Pair.of(cej.aE, cek.b)));
   }

   private static void d(bwh<cnx> $$0) {
      $$0.a(
         cqm.b,
         10,
         ImmutableList.of(
            cav.a(cnx::x), caz.a(), new byv(ImmutableMap.of(cej.aB, cek.b), ImmutableList.of(Pair.of(byq.a(0.5F), 2), Pair.of(new bxi(30, 60), 1)))
         )
      );
   }

   private static void e(bwh<cnx> $$0) {
      $$0.a(cqm.w, 5, ImmutableList.of(cav.a(cnx::x), bxr.a(cej.az, 2, 0.7F)), cej.az);
   }

   private static void f(bwh<cnx> $$0) {
      $$0.a(cqm.v, 5, ImmutableList.of(cav.a(cnx::x), new cax(i)), cej.aB);
   }

   private static void g(bwh<cnx> $$0) {
      $$0.a(cqm.x, 10, ImmutableList.of(new cau()), cej.ay);
   }

   private static void a(cnx $$0, bwh<cnx> $$1) {
      $$1.a(
         cqm.k,
         10,
         ImmutableList.of(
            m,
            bzn.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), cny::a, false),
            byx.a($$1x -> a($$0, $$1x), (float)$$0.h(bwn.m)),
            bzd.a(1.2F),
            new cay(),
            byf.a(18)
         ),
         cej.o
      );
   }

   private static boolean a(cnx $$0, bvf $$1) {
      return $$0.ec().c(cej.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arc $$0, cnx $$1, bvf $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bvf)$$1);
   }

   public static void a(bvf $$0) {
      if ($$0.ec().a(cej.aE)) {
         $$0.ec().a(cej.aE, bae.a, 1200L);
      }
   }

   public static void a(cnx $$0, ji $$1) {
      if ($$0.dW().F_().a($$1) && !$$0.x().isPresent() && !$$0.ec().c(cej.o).isPresent()) {
         a((bvf)$$0);
         $$0.ec().a(cej.aG, bae.a, 100L);
         $$0.ec().a(cej.n, new bxb($$1), 100L);
         $$0.ec().a(cej.az, $$1, 100L);
         $$0.ec().b(cej.m);
      }
   }
}
