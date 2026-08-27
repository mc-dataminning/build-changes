import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class caq {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = aro.f(100.0F);
   public static final int a = aro.f(133.59999F);
   public static final int b = aro.f(84.0F);
   private static final int i = aro.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<btd<? extends btc<? super cap>>> k = List.of(btd.d, btd.v);
   private static final List<bry<?>> l = List.of(
      bry.g,
      bry.h,
      bry.k,
      bry.l,
      bry.L,
      bry.n,
      bry.m,
      bry.E,
      bry.t,
      bry.o,
      bry.p,
      bry.B,
      bry.ax,
      bry.ay,
      bry.az,
      bry.aA,
      bry.aB,
      bry.aC,
      bry.aD,
      bry.aE,
      bry.aF,
      bry.aG,
      bry.aH,
      bry.aI,
      bry.aJ,
      bry.aK
   );
   private static final bkp<cap> m = boa.a(
      (Function<boa.b<cap>, ? extends App<boa.c<cap>, bod<cap>>>)($$0 -> $$0.group($$0.a(bry.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(asn.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cap $$0) {
      $$0.dM().a(ImmutableList.of(ccw.y, ccw.z, ccw.x, ccw.k, ccw.w, ccw.v, ccw.b));
   }

   protected static bjx<?> a(cap $$0, Dynamic<?> $$1) {
      bjx.b<cap> $$2 = bjx.a(l, k);
      bjx<cap> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ccw.a));
      $$3.b(ccw.b);
      $$3.f();
      return $$3;
   }

   private static void a(bjx<cap> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new bnh(0.8F), bol.a(), new blt(45, 90), new blx()));
   }

   private static void b(bjx<cap> $$0) {
      $$0.a(ccw.y, 5, ImmutableList.of(new boh(a)), bry.aB);
   }

   private static void c(bjx<cap> $$0) {
      $$0.a(ccw.z, ImmutableList.of(Pair.of(0, new boi()), Pair.of(1, new bog(h))), ImmutableSet.of(Pair.of(bry.ax, brz.b), Pair.of(bry.aD, brz.b)));
   }

   private static void d(bjx<cap> $$0) {
      $$0.a(
         ccw.b,
         10,
         ImmutableList.of(
            bok.a(cap::fZ), boo.a(), new bmk(ImmutableMap.of(bry.aA, brz.b), ImmutableList.of(Pair.of(bmf.a(0.5F), 2), Pair.of(new bky(30, 60), 1)))
         )
      );
   }

   private static void e(bjx<cap> $$0) {
      $$0.a(ccw.w, 5, ImmutableList.of(bok.a(cap::fZ), blh.a(bry.ay, 2, 0.7F)), bry.ay);
   }

   private static void f(bjx<cap> $$0) {
      $$0.a(ccw.v, 5, ImmutableList.of(bok.a(cap::fZ), new bom(i)), bry.aA);
   }

   private static void g(bjx<cap> $$0) {
      $$0.a(ccw.x, 10, ImmutableList.of(new boj()), bry.ax);
   }

   private static void a(cap $$0, bjx<cap> $$1) {
      $$1.a(
         ccw.k,
         10,
         ImmutableList.of(
            m, bnc.a($$1x -> !$$0.t().d() || !$$0.a($$1x), caq::b, false), bmm.a($$1x -> a($$0, $$1x), (float)$$0.b(bkd.b)), bms.a(1.2F), new bon(), blu.a(18)
         ),
         bry.o
      );
   }

   private static boolean a(cap $$0, biw $$1) {
      return $$0.dM().c(bry.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cap $$0, biw $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((biw)$$0);
   }

   public static void a(biw $$0) {
      if ($$0.dM().a(bry.aD)) {
         $$0.dM().a(bry.aD, asn.a, 1200L);
      }
   }

   public static void a(cap $$0, gv $$1) {
      if ($$0.dK().w_().a($$1) && !$$0.fZ().isPresent() && !$$0.dM().c(bry.o).isPresent()) {
         a((biw)$$0);
         $$0.dM().a(bry.aF, asn.a, 100L);
         $$0.dM().a(bry.n, new bkr($$1), 100L);
         $$0.dM().a(bry.ay, $$1, 100L);
         $$0.dM().b(bry.m);
      }
   }
}
