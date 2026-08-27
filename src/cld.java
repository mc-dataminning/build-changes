import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cld {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayf.f(100.0F);
   public static final int a = ayf.f(133.59999F);
   public static final int b = ayf.f(84.0F);
   private static final int i = ayf.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cdb<? extends cda<? super clc>>> k = List.of(cdb.d, cdb.x);
   private static final List<cbu<?>> l = List.of(
      cbu.g,
      cbu.h,
      cbu.k,
      cbu.l,
      cbu.M,
      cbu.n,
      cbu.m,
      cbu.E,
      cbu.t,
      cbu.o,
      cbu.p,
      cbu.B,
      cbu.ay,
      cbu.az,
      cbu.aA,
      cbu.aB,
      cbu.aC,
      cbu.aD,
      cbu.aE,
      cbu.aF,
      cbu.aG,
      cbu.aH,
      cbu.aI,
      cbu.aJ,
      cbu.aK,
      cbu.aL
   );
   private static final buk<clc> m = bxw.a(
      (Function<bxw.b<clc>, ? extends App<bxw.c<clc>, bxz<clc>>>)($$0 -> $$0.group($$0.a(cbu.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azh.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(clc $$0) {
      $$0.dS().a(ImmutableList.of(cnn.y, cnn.z, cnn.x, cnn.k, cnn.w, cnn.v, cnn.b));
   }

   protected static bts<?> a(clc $$0, Dynamic<?> $$1) {
      bts.b<clc> $$2 = bts.a(l, k);
      bts<clc> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cnn.a));
      $$3.b(cnn.b);
      $$3.f();
      return $$3;
   }

   private static void a(bts<clc> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bxd(0.8F), byh.a(), new bvp(45, 90), new bvt()));
   }

   private static void b(bts<clc> $$0) {
      $$0.a(cnn.y, 5, ImmutableList.of(new byd(a)), cbu.aC);
   }

   private static void c(bts<clc> $$0) {
      $$0.a(cnn.z, ImmutableList.of(Pair.of(0, new bye()), Pair.of(1, new byc(h))), ImmutableSet.of(Pair.of(cbu.ay, cbv.b), Pair.of(cbu.aE, cbv.b)));
   }

   private static void d(bts<clc> $$0) {
      $$0.a(
         cnn.b,
         10,
         ImmutableList.of(
            byg.a(clc::gp), byk.a(), new bwg(ImmutableMap.of(cbu.aB, cbv.b), ImmutableList.of(Pair.of(bwb.a(0.5F), 2), Pair.of(new but(30, 60), 1)))
         )
      );
   }

   private static void e(bts<clc> $$0) {
      $$0.a(cnn.w, 5, ImmutableList.of(byg.a(clc::gp), bvc.a(cbu.az, 2, 0.7F)), cbu.az);
   }

   private static void f(bts<clc> $$0) {
      $$0.a(cnn.v, 5, ImmutableList.of(byg.a(clc::gp), new byi(i)), cbu.aB);
   }

   private static void g(bts<clc> $$0) {
      $$0.a(cnn.x, 10, ImmutableList.of(new byf()), cbu.ay);
   }

   private static void a(clc $$0, bts<clc> $$1) {
      $$1.a(
         cnn.k,
         10,
         ImmutableList.of(
            m, bwy.a($$1x -> !$$0.y().d() || !$$0.b($$1x), cld::b, false), bwi.a($$1x -> a($$0, $$1x), (float)$$0.g(bty.k)), bwo.a(1.2F), new byj(), bvq.a(18)
         ),
         cbu.o
      );
   }

   private static boolean a(clc $$0, bsq $$1) {
      return $$0.dS().c(cbu.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(clc $$0, bsq $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bsq)$$0);
   }

   public static void a(bsq $$0) {
      if ($$0.dS().a(cbu.aE)) {
         $$0.dS().a(cbu.aE, azh.a, 1200L);
      }
   }

   public static void a(clc $$0, io $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gp().isPresent() && !$$0.dS().c(cbu.o).isPresent()) {
         a((bsq)$$0);
         $$0.dS().a(cbu.aG, azh.a, 100L);
         $$0.dS().a(cbu.n, new bum($$1), 100L);
         $$0.dS().a(cbu.az, $$1, 100L);
         $$0.dS().b(cbu.m);
      }
   }
}
