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
   private static final int h = ayo.f(100.0F);
   public static final int a = ayo.f(133.59999F);
   public static final int b = ayo.f(84.0F);
   private static final int i = ayo.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cdz<? extends cdy<? super cmb>>> k = List.of(cdz.d, cdz.x);
   private static final List<ccs<?>> l = List.of(
      ccs.g,
      ccs.h,
      ccs.k,
      ccs.l,
      ccs.M,
      ccs.n,
      ccs.m,
      ccs.E,
      ccs.t,
      ccs.o,
      ccs.p,
      ccs.B,
      ccs.ay,
      ccs.az,
      ccs.aA,
      ccs.aB,
      ccs.aC,
      ccs.aD,
      ccs.aE,
      ccs.aF,
      ccs.aG,
      ccs.aH,
      ccs.aI,
      ccs.aJ,
      ccs.aK,
      ccs.aL
   );
   private static final bvi<cmb> m = byu.a(
      (Function<byu.b<cmb>, ? extends App<byu.c<cmb>, byx<cmb>>>)($$0 -> $$0.group($$0.a(ccs.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azs.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cmb $$0) {
      $$0.dU().a(ImmutableList.of(com.y, com.z, com.x, com.k, com.w, com.v, com.b));
   }

   protected static buq<?> a(cmb $$0, Dynamic<?> $$1) {
      buq.b<cmb> $$2 = buq.a(l, k);
      buq<cmb> $$3 = $$2.a($$1);
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

   private static void a(buq<cmb> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byb(0.8F), bzf.a(), new bwn(45, 90), new bwr()));
   }

   private static void b(buq<cmb> $$0) {
      $$0.a(com.y, 5, ImmutableList.of(new bzb(a)), ccs.aC);
   }

   private static void c(buq<cmb> $$0) {
      $$0.a(com.z, ImmutableList.of(Pair.of(0, new bzc()), Pair.of(1, new bza(h))), ImmutableSet.of(Pair.of(ccs.ay, cct.b), Pair.of(ccs.aE, cct.b)));
   }

   private static void d(buq<cmb> $$0) {
      $$0.a(
         com.b,
         10,
         ImmutableList.of(
            bze.a(cmb::gl), bzi.a(), new bxe(ImmutableMap.of(ccs.aB, cct.b), ImmutableList.of(Pair.of(bwz.a(0.5F), 2), Pair.of(new bvr(30, 60), 1)))
         )
      );
   }

   private static void e(buq<cmb> $$0) {
      $$0.a(com.w, 5, ImmutableList.of(bze.a(cmb::gl), bwa.a(ccs.az, 2, 0.7F)), ccs.az);
   }

   private static void f(buq<cmb> $$0) {
      $$0.a(com.v, 5, ImmutableList.of(bze.a(cmb::gl), new bzg(i)), ccs.aB);
   }

   private static void g(buq<cmb> $$0) {
      $$0.a(com.x, 10, ImmutableList.of(new bzd()), ccs.ay);
   }

   private static void a(cmb $$0, buq<cmb> $$1) {
      $$1.a(
         com.k,
         10,
         ImmutableList.of(
            m, bxw.a($$1x -> !$$0.x().d() || !$$0.c($$1x), cmc::b, false), bxg.a($$1x -> a($$0, $$1x), (float)$$0.g(buw.m)), bxm.a(1.2F), new bzh(), bwo.a(18)
         ),
         ccs.o
      );
   }

   private static boolean a(cmb $$0, btn $$1) {
      return $$0.dU().c(ccs.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cmb $$0, btn $$1) {
      if (!$$0.c($$1)) {
         $$0.d($$1);
      }

      a((btn)$$0);
   }

   public static void a(btn $$0) {
      if ($$0.dU().a(ccs.aE)) {
         $$0.dU().a(ccs.aE, azs.a, 1200L);
      }
   }

   public static void a(cmb $$0, jd $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gl().isPresent() && !$$0.dU().c(ccs.o).isPresent()) {
         a((btn)$$0);
         $$0.dU().a(ccs.aG, azs.a, 100L);
         $$0.dU().a(ccs.n, new bvk($$1), 100L);
         $$0.dU().a(ccs.az, $$1, 100L);
         $$0.dU().b(ccs.m);
      }
   }
}
