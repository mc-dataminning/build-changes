import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cmc {
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
   private static final List<cea<? extends cdz<? super cmb>>> k = List.of(cea.d, cea.x);
   private static final List<cct<?>> l = List.of(
      cct.g,
      cct.h,
      cct.k,
      cct.l,
      cct.M,
      cct.n,
      cct.m,
      cct.E,
      cct.t,
      cct.o,
      cct.p,
      cct.B,
      cct.ay,
      cct.az,
      cct.aA,
      cct.aB,
      cct.aC,
      cct.aD,
      cct.aE,
      cct.aF,
      cct.aG,
      cct.aH,
      cct.aI,
      cct.aJ,
      cct.aK,
      cct.aL
   );
   private static final bvj<cmb> m = byv.a(
      (Function<byv.b<cmb>, ? extends App<byv.c<cmb>, byy<cmb>>>)($$0 -> $$0.group($$0.a(cct.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bac.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cmb $$0) {
      $$0.dS().a(ImmutableList.of(com.y, com.z, com.x, com.k, com.w, com.v, com.b));
   }

   protected static bur<?> a(cmb $$0, Dynamic<?> $$1) {
      bur.b<cmb> $$2 = bur.a(l, k);
      bur<cmb> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(com.a));
      $$3.b(com.b);
      $$3.f();
      return $$3;
   }

   private static void a(bur<cmb> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byc(0.8F), bzg.a(), new bwo(45, 90), new bws()));
   }

   private static void b(bur<cmb> $$0) {
      $$0.a(com.y, 5, ImmutableList.of(new bzc(a)), cct.aC);
   }

   private static void c(bur<cmb> $$0) {
      $$0.a(com.z, ImmutableList.of(Pair.of(0, new bzd()), Pair.of(1, new bzb(h))), ImmutableSet.of(Pair.of(cct.ay, ccu.b), Pair.of(cct.aE, ccu.b)));
   }

   private static void d(bur<cmb> $$0) {
      $$0.a(
         com.b,
         10,
         ImmutableList.of(
            bzf.a(cmb::gq), bzj.a(), new bxf(ImmutableMap.of(cct.aB, ccu.b), ImmutableList.of(Pair.of(bxa.a(0.5F), 2), Pair.of(new bvs(30, 60), 1)))
         )
      );
   }

   private static void e(bur<cmb> $$0) {
      $$0.a(com.w, 5, ImmutableList.of(bzf.a(cmb::gq), bwb.a(cct.az, 2, 0.7F)), cct.az);
   }

   private static void f(bur<cmb> $$0) {
      $$0.a(com.v, 5, ImmutableList.of(bzf.a(cmb::gq), new bzh(i)), cct.aB);
   }

   private static void g(bur<cmb> $$0) {
      $$0.a(com.x, 10, ImmutableList.of(new bze()), cct.ay);
   }

   private static void a(cmb $$0, bur<cmb> $$1) {
      $$1.a(
         com.k,
         10,
         ImmutableList.of(
            m, bxx.a($$1x -> !$$0.y().d() || !$$0.b($$1x), cmc::b, false), bxh.a($$1x -> a($$0, $$1x), (float)$$0.g(bux.k)), bxn.a(1.2F), new bzi(), bwp.a(18)
         ),
         cct.o
      );
   }

   private static boolean a(cmb $$0, btp $$1) {
      return $$0.dS().c(cct.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cmb $$0, btp $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btp)$$0);
   }

   public static void a(btp $$0) {
      if ($$0.dS().a(cct.aE)) {
         $$0.dS().a(cct.aE, bac.a, 1200L);
      }
   }

   public static void a(cmb $$0, iz $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gq().isPresent() && !$$0.dS().c(cct.o).isPresent()) {
         a((btp)$$0);
         $$0.dS().a(cct.aG, bac.a, 100L);
         $$0.dS().a(cct.n, new bvl($$1), 100L);
         $$0.dS().a(cct.az, $$1, 100L);
         $$0.dS().b(cct.m);
      }
   }
}
