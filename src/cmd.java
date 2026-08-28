import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cmd {
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
   private static final List<ceb<? extends cea<? super cmc>>> k = List.of(ceb.d, ceb.x);
   private static final List<ccu<?>> l = List.of(
      ccu.g,
      ccu.h,
      ccu.k,
      ccu.l,
      ccu.M,
      ccu.n,
      ccu.m,
      ccu.E,
      ccu.t,
      ccu.o,
      ccu.p,
      ccu.B,
      ccu.ay,
      ccu.az,
      ccu.aA,
      ccu.aB,
      ccu.aC,
      ccu.aD,
      ccu.aE,
      ccu.aF,
      ccu.aG,
      ccu.aH,
      ccu.aI,
      ccu.aJ,
      ccu.aK,
      ccu.aL
   );
   private static final bvk<cmc> m = byw.a(
      (Function<byw.b<cmc>, ? extends App<byw.c<cmc>, byz<cmc>>>)($$0 -> $$0.group($$0.a(ccu.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bac.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cmc $$0) {
      $$0.dS().a(ImmutableList.of(coo.y, coo.z, coo.x, coo.k, coo.w, coo.v, coo.b));
   }

   protected static bus<?> a(cmc $$0, Dynamic<?> $$1) {
      bus.b<cmc> $$2 = bus.a(l, k);
      bus<cmc> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(coo.a));
      $$3.b(coo.b);
      $$3.f();
      return $$3;
   }

   private static void a(bus<cmc> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new byd(0.8F), bzh.a(), new bwp(45, 90), new bwt()));
   }

   private static void b(bus<cmc> $$0) {
      $$0.a(coo.y, 5, ImmutableList.of(new bzd(a)), ccu.aC);
   }

   private static void c(bus<cmc> $$0) {
      $$0.a(coo.z, ImmutableList.of(Pair.of(0, new bze()), Pair.of(1, new bzc(h))), ImmutableSet.of(Pair.of(ccu.ay, ccv.b), Pair.of(ccu.aE, ccv.b)));
   }

   private static void d(bus<cmc> $$0) {
      $$0.a(
         coo.b,
         10,
         ImmutableList.of(
            bzg.a(cmc::gq), bzk.a(), new bxg(ImmutableMap.of(ccu.aB, ccv.b), ImmutableList.of(Pair.of(bxb.a(0.5F), 2), Pair.of(new bvt(30, 60), 1)))
         )
      );
   }

   private static void e(bus<cmc> $$0) {
      $$0.a(coo.w, 5, ImmutableList.of(bzg.a(cmc::gq), bwc.a(ccu.az, 2, 0.7F)), ccu.az);
   }

   private static void f(bus<cmc> $$0) {
      $$0.a(coo.v, 5, ImmutableList.of(bzg.a(cmc::gq), new bzi(i)), ccu.aB);
   }

   private static void g(bus<cmc> $$0) {
      $$0.a(coo.x, 10, ImmutableList.of(new bzf()), ccu.ay);
   }

   private static void a(cmc $$0, bus<cmc> $$1) {
      $$1.a(
         coo.k,
         10,
         ImmutableList.of(
            m, bxy.a($$1x -> !$$0.y().d() || !$$0.b($$1x), cmd::b, false), bxi.a($$1x -> a($$0, $$1x), (float)$$0.g(buy.k)), bxo.a(1.2F), new bzj(), bwq.a(18)
         ),
         ccu.o
      );
   }

   private static boolean a(cmc $$0, btq $$1) {
      return $$0.dS().c(ccu.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cmc $$0, btq $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btq)$$0);
   }

   public static void a(btq $$0) {
      if ($$0.dS().a(ccu.aE)) {
         $$0.dS().a(ccu.aE, bac.a, 1200L);
      }
   }

   public static void a(cmc $$0, iz $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gq().isPresent() && !$$0.dS().c(ccu.o).isPresent()) {
         a((btq)$$0);
         $$0.dS().a(ccu.aG, bac.a, 100L);
         $$0.dS().a(ccu.n, new bvm($$1), 100L);
         $$0.dS().a(ccu.az, $$1, 100L);
         $$0.dS().b(ccu.m);
      }
   }
}
