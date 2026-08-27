import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class caz {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = arx.f(100.0F);
   public static final int a = arx.f(133.59999F);
   public static final int b = arx.f(84.0F);
   private static final int i = arx.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<btm<? extends btl<? super cay>>> k = List.of(btm.d, btm.v);
   private static final List<bsh<?>> l = List.of(
      bsh.g,
      bsh.h,
      bsh.k,
      bsh.l,
      bsh.L,
      bsh.n,
      bsh.m,
      bsh.E,
      bsh.t,
      bsh.o,
      bsh.p,
      bsh.B,
      bsh.ax,
      bsh.ay,
      bsh.az,
      bsh.aA,
      bsh.aB,
      bsh.aC,
      bsh.aD,
      bsh.aE,
      bsh.aF,
      bsh.aG,
      bsh.aH,
      bsh.aI,
      bsh.aJ,
      bsh.aK
   );
   private static final bky<cay> m = boj.a(
      (Function<boj.b<cay>, ? extends App<boj.c<cay>, bom<cay>>>)($$0 -> $$0.group($$0.a(bsh.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(asx.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cay $$0) {
      $$0.dN().a(ImmutableList.of(cdf.y, cdf.z, cdf.x, cdf.k, cdf.w, cdf.v, cdf.b));
   }

   protected static bkg<?> a(cay $$0, Dynamic<?> $$1) {
      bkg.b<cay> $$2 = bkg.a(l, k);
      bkg<cay> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cdf.a));
      $$3.b(cdf.b);
      $$3.f();
      return $$3;
   }

   private static void a(bkg<cay> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bnq(0.8F), bou.a(), new bmc(45, 90), new bmg()));
   }

   private static void b(bkg<cay> $$0) {
      $$0.a(cdf.y, 5, ImmutableList.of(new boq(a)), bsh.aB);
   }

   private static void c(bkg<cay> $$0) {
      $$0.a(cdf.z, ImmutableList.of(Pair.of(0, new bor()), Pair.of(1, new bop(h))), ImmutableSet.of(Pair.of(bsh.ax, bsi.b), Pair.of(bsh.aD, bsi.b)));
   }

   private static void d(bkg<cay> $$0) {
      $$0.a(
         cdf.b,
         10,
         ImmutableList.of(
            bot.a(cay::gd), box.a(), new bmt(ImmutableMap.of(bsh.aA, bsi.b), ImmutableList.of(Pair.of(bmo.a(0.5F), 2), Pair.of(new blh(30, 60), 1)))
         )
      );
   }

   private static void e(bkg<cay> $$0) {
      $$0.a(cdf.w, 5, ImmutableList.of(bot.a(cay::gd), blq.a(bsh.ay, 2, 0.7F)), bsh.ay);
   }

   private static void f(bkg<cay> $$0) {
      $$0.a(cdf.v, 5, ImmutableList.of(bot.a(cay::gd), new bov(i)), bsh.aA);
   }

   private static void g(bkg<cay> $$0) {
      $$0.a(cdf.x, 10, ImmutableList.of(new bos()), bsh.ax);
   }

   private static void a(cay $$0, bkg<cay> $$1) {
      $$1.a(
         cdf.k,
         10,
         ImmutableList.of(
            m, bnl.a($$1x -> !$$0.y().d() || !$$0.a($$1x), caz::b, false), bmv.a($$1x -> a($$0, $$1x), (float)$$0.b(bkm.b)), bnb.a(1.2F), new bow(), bmd.a(18)
         ),
         bsh.o
      );
   }

   private static boolean a(cay $$0, bjg $$1) {
      return $$0.dN().c(bsh.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cay $$0, bjg $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bjg)$$0);
   }

   public static void a(bjg $$0) {
      if ($$0.dN().a(bsh.aD)) {
         $$0.dN().a(bsh.aD, asx.a, 1200L);
      }
   }

   public static void a(cay $$0, gw $$1) {
      if ($$0.dL().B_().a($$1) && !$$0.gd().isPresent() && !$$0.dN().c(bsh.o).isPresent()) {
         a((bjg)$$0);
         $$0.dN().a(bsh.aF, asx.a, 100L);
         $$0.dN().a(bsh.n, new bla($$1), 100L);
         $$0.dN().a(bsh.ay, $$1, 100L);
         $$0.dN().b(bsh.m);
      }
   }
}
