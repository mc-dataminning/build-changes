import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class ckm {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = axz.f(100.0F);
   public static final int a = axz.f(133.59999F);
   public static final int b = axz.f(84.0F);
   private static final int i = axz.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cck<? extends ccj<? super ckl>>> k = List.of(cck.d, cck.x);
   private static final List<cbd<?>> l = List.of(
      cbd.g,
      cbd.h,
      cbd.k,
      cbd.l,
      cbd.M,
      cbd.n,
      cbd.m,
      cbd.E,
      cbd.t,
      cbd.o,
      cbd.p,
      cbd.B,
      cbd.ay,
      cbd.az,
      cbd.aA,
      cbd.aB,
      cbd.aC,
      cbd.aD,
      cbd.aE,
      cbd.aF,
      cbd.aG,
      cbd.aH,
      cbd.aI,
      cbd.aJ,
      cbd.aK,
      cbd.aL
   );
   private static final btt<ckl> m = bxf.a(
      (Function<bxf.b<ckl>, ? extends App<bxf.c<ckl>, bxi<ckl>>>)($$0 -> $$0.group($$0.a(cbd.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azb.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(ckl $$0) {
      $$0.dQ().a(ImmutableList.of(cmw.y, cmw.z, cmw.x, cmw.k, cmw.w, cmw.v, cmw.b));
   }

   protected static btb<?> a(ckl $$0, Dynamic<?> $$1) {
      btb.b<ckl> $$2 = btb.a(l, k);
      btb<ckl> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cmw.a));
      $$3.b(cmw.b);
      $$3.f();
      return $$3;
   }

   private static void a(btb<ckl> $$0) {
      $$0.a(cmw.a, 0, ImmutableList.of(new bwm(0.8F), bxq.a(), new buy(45, 90), new bvc()));
   }

   private static void b(btb<ckl> $$0) {
      $$0.a(cmw.y, 5, ImmutableList.of(new bxm(a)), cbd.aC);
   }

   private static void c(btb<ckl> $$0) {
      $$0.a(cmw.z, ImmutableList.of(Pair.of(0, new bxn()), Pair.of(1, new bxl(h))), ImmutableSet.of(Pair.of(cbd.ay, cbe.b), Pair.of(cbd.aE, cbe.b)));
   }

   private static void d(btb<ckl> $$0) {
      $$0.a(
         cmw.b,
         10,
         ImmutableList.of(
            bxp.a(ckl::gp), bxt.a(), new bvp(ImmutableMap.of(cbd.aB, cbe.b), ImmutableList.of(Pair.of(bvk.a(0.5F), 2), Pair.of(new buc(30, 60), 1)))
         )
      );
   }

   private static void e(btb<ckl> $$0) {
      $$0.a(cmw.w, 5, ImmutableList.of(bxp.a(ckl::gp), bul.a(cbd.az, 2, 0.7F)), cbd.az);
   }

   private static void f(btb<ckl> $$0) {
      $$0.a(cmw.v, 5, ImmutableList.of(bxp.a(ckl::gp), new bxr(i)), cbd.aB);
   }

   private static void g(btb<ckl> $$0) {
      $$0.a(cmw.x, 10, ImmutableList.of(new bxo()), cbd.ay);
   }

   private static void a(ckl $$0, btb<ckl> $$1) {
      $$1.a(
         cmw.k,
         10,
         ImmutableList.of(
            m, bwh.a($$1x -> !$$0.y().d() || !$$0.b($$1x), ckm::b, false), bvr.a($$1x -> a($$0, $$1x), (float)$$0.g(bth.k)), bvx.a(1.2F), new bxs(), buz.a(18)
         ),
         cbd.o
      );
   }

   private static boolean a(ckl $$0, bsa $$1) {
      return $$0.dQ().c(cbd.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(ckl $$0, bsa $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bsa)$$0);
   }

   public static void a(bsa $$0) {
      if ($$0.dQ().a(cbd.aE)) {
         $$0.dQ().a(cbd.aE, azb.a, 1200L);
      }
   }

   public static void a(ckl $$0, in $$1) {
      if ($$0.dN().C_().a($$1) && !$$0.gp().isPresent() && !$$0.dQ().c(cbd.o).isPresent()) {
         a((bsa)$$0);
         $$0.dQ().a(cbd.aG, azb.a, 100L);
         $$0.dQ().a(cbd.n, new btv($$1), 100L);
         $$0.dQ().a(cbd.az, $$1, 100L);
         $$0.dQ().b(cbd.m);
      }
   }
}
