import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cnu {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azn.f(100.0F);
   public static final int a = azn.f(133.59999F);
   public static final int b = azn.f(84.0F);
   private static final int i = azn.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cfp<? extends cfo<? super cnt>>> k = List.of(cfp.d, cfp.x);
   private static final List<cei<?>> l = List.of(
      cei.g,
      cei.h,
      cei.k,
      cei.l,
      cei.M,
      cei.n,
      cei.m,
      cei.E,
      cei.t,
      cei.o,
      cei.p,
      cei.B,
      cei.ay,
      cei.az,
      cei.aA,
      cei.aB,
      cei.aC,
      cei.aD,
      cei.aE,
      cei.aF,
      cei.aG,
      cei.aH,
      cei.aI,
      cei.aJ,
      cei.aK,
      cei.aL
   );
   private static final bwy<cnt> m = cak.a(
      (Function<cak.b<cnt>, ? extends App<cak.c<cnt>, can<cnt>>>)($$0 -> $$0.group($$0.a(cei.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bat.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cnt $$0) {
      $$0.ee().a(ImmutableList.of(cqi.y, cqi.z, cqi.x, cqi.k, cqi.w, cqi.v, cqi.b));
   }

   protected static bwg<?> a(cnt $$0, Dynamic<?> $$1) {
      bwg.b<cnt> $$2 = bwg.a(l, k);
      bwg<cnt> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cqi.a));
      $$3.b(cqi.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwg<cnt> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bzr(0.8F), cav.a(), new byd(45, 90), new byh()));
   }

   private static void b(bwg<cnt> $$0) {
      $$0.a(cqi.y, 5, ImmutableList.of(new car(a)), cei.aC);
   }

   private static void c(bwg<cnt> $$0) {
      $$0.a(cqi.z, ImmutableList.of(Pair.of(0, new cas()), Pair.of(1, new caq(h))), ImmutableSet.of(Pair.of(cei.ay, cej.b), Pair.of(cei.aE, cej.b)));
   }

   private static void d(bwg<cnt> $$0) {
      $$0.a(
         cqi.b,
         10,
         ImmutableList.of(
            cau.a(cnt::gv), cay.a(), new byu(ImmutableMap.of(cei.aB, cej.b), ImmutableList.of(Pair.of(byp.a(0.5F), 2), Pair.of(new bxh(30, 60), 1)))
         )
      );
   }

   private static void e(bwg<cnt> $$0) {
      $$0.a(cqi.w, 5, ImmutableList.of(cau.a(cnt::gv), bxq.a(cei.az, 2, 0.7F)), cei.az);
   }

   private static void f(bwg<cnt> $$0) {
      $$0.a(cqi.v, 5, ImmutableList.of(cau.a(cnt::gv), new caw(i)), cei.aB);
   }

   private static void g(bwg<cnt> $$0) {
      $$0.a(cqi.x, 10, ImmutableList.of(new cat()), cei.ay);
   }

   private static void a(cnt $$0, bwg<cnt> $$1) {
      $$1.a(
         cqi.k,
         10,
         ImmutableList.of(
            m, bzm.a($$1x -> !$$0.y().d() || !$$0.c($$1x), cnu::b, false), byw.a($$1x -> a($$0, $$1x), (float)$$0.h(bwm.m)), bzc.a(1.2F), new cax(), bye.a(18)
         ),
         cei.o
      );
   }

   private static boolean a(cnt $$0, bve $$1) {
      return $$0.ee().c(cei.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cnt $$0, bve $$1) {
      if (!$$0.c($$1)) {
         $$0.d($$1);
      }

      a((bve)$$0);
   }

   public static void a(bve $$0) {
      if ($$0.ee().a(cei.aE)) {
         $$0.ee().a(cei.aE, bat.a, 1200L);
      }
   }

   public static void a(cnt $$0, jh $$1) {
      if ($$0.dY().C_().a($$1) && !$$0.gv().isPresent() && !$$0.ee().c(cei.o).isPresent()) {
         a((bve)$$0);
         $$0.ee().a(cei.aG, bat.a, 100L);
         $$0.ee().a(cei.n, new bxa($$1), 100L);
         $$0.ee().a(cei.az, $$1, 100L);
         $$0.ee().b(cei.m);
      }
   }
}
