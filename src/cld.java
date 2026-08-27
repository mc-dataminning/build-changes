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
   private static final int h = aym.f(100.0F);
   public static final int a = aym.f(133.59999F);
   public static final int b = aym.f(84.0F);
   private static final int i = aym.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<ccy<? extends ccx<? super clc>>> k = List.of(ccy.d, ccy.x);
   private static final List<cbr<?>> l = List.of(
      cbr.g,
      cbr.h,
      cbr.k,
      cbr.l,
      cbr.M,
      cbr.n,
      cbr.m,
      cbr.E,
      cbr.t,
      cbr.o,
      cbr.p,
      cbr.B,
      cbr.ay,
      cbr.az,
      cbr.aA,
      cbr.aB,
      cbr.aC,
      cbr.aD,
      cbr.aE,
      cbr.aF,
      cbr.aG,
      cbr.aH,
      cbr.aI,
      cbr.aJ,
      cbr.aK,
      cbr.aL
   );
   private static final buh<clc> m = bxt.a(
      (Function<bxt.b<clc>, ? extends App<bxt.c<clc>, bxw<clc>>>)($$0 -> $$0.group($$0.a(cbr.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azo.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(clc $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.y, cnq.z, cnq.x, cnq.k, cnq.w, cnq.v, cnq.b));
   }

   protected static btp<?> a(clc $$0, Dynamic<?> $$1) {
      btp.b<clc> $$2 = btp.a(l, k);
      btp<clc> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cnq.a));
      $$3.b(cnq.b);
      $$3.f();
      return $$3;
   }

   private static void a(btp<clc> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bxa(0.8F), bye.a(), new bvm(45, 90), new bvq()));
   }

   private static void b(btp<clc> $$0) {
      $$0.a(cnq.y, 5, ImmutableList.of(new bya(a)), cbr.aC);
   }

   private static void c(btp<clc> $$0) {
      $$0.a(cnq.z, ImmutableList.of(Pair.of(0, new byb()), Pair.of(1, new bxz(h))), ImmutableSet.of(Pair.of(cbr.ay, cbs.b), Pair.of(cbr.aE, cbs.b)));
   }

   private static void d(btp<clc> $$0) {
      $$0.a(
         cnq.b,
         10,
         ImmutableList.of(
            byd.a(clc::gy), byh.a(), new bwd(ImmutableMap.of(cbr.aB, cbs.b), ImmutableList.of(Pair.of(bvy.a(0.5F), 2), Pair.of(new buq(30, 60), 1)))
         )
      );
   }

   private static void e(btp<clc> $$0) {
      $$0.a(cnq.w, 5, ImmutableList.of(byd.a(clc::gy), buz.a(cbr.az, 2, 0.7F)), cbr.az);
   }

   private static void f(btp<clc> $$0) {
      $$0.a(cnq.v, 5, ImmutableList.of(byd.a(clc::gy), new byf(i)), cbr.aB);
   }

   private static void g(btp<clc> $$0) {
      $$0.a(cnq.x, 10, ImmutableList.of(new byc()), cbr.ay);
   }

   private static void a(clc $$0, btp<clc> $$1) {
      $$1.a(
         cnq.k,
         10,
         ImmutableList.of(
            m, bwv.a($$1x -> !$$0.x().d() || !$$0.b($$1x), cld::b, false), bwf.a($$1x -> a($$0, $$1x), (float)$$0.g(btv.k)), bwl.a(1.2F), new byg(), bvn.a(18)
         ),
         cbr.o
      );
   }

   private static boolean a(clc $$0, bso $$1) {
      return $$0.dZ().c(cbr.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(clc $$0, bso $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bso)$$0);
   }

   public static void a(bso $$0) {
      if ($$0.dZ().a(cbr.aE)) {
         $$0.dZ().a(cbr.aE, azo.a, 1200L);
      }
   }

   public static void a(clc $$0, ir $$1) {
      if ($$0.dU().D_().a($$1) && !$$0.gy().isPresent() && !$$0.dZ().c(cbr.o).isPresent()) {
         a((bso)$$0);
         $$0.dZ().a(cbr.aG, azo.a, 100L);
         $$0.dZ().a(cbr.n, new buj($$1), 100L);
         $$0.dZ().a(cbr.az, $$1, 100L);
         $$0.dZ().b(cbr.m);
      }
   }
}
