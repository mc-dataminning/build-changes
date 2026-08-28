import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cos {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azu.f(100.0F);
   public static final int a = azu.f(133.59999F);
   public static final int b = azu.f(84.0F);
   private static final int i = azu.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cgi<? extends cgh<? super cor>>> k = List.of(cgi.d, cgi.x);
   private static final List<cfb<?>> l = List.of(
      cfb.g,
      cfb.h,
      cfb.k,
      cfb.l,
      cfb.M,
      cfb.n,
      cfb.m,
      cfb.E,
      cfb.t,
      cfb.o,
      cfb.p,
      cfb.B,
      cfb.ay,
      cfb.az,
      cfb.aA,
      cfb.aB,
      cfb.aC,
      cfb.aD,
      cfb.aE,
      cfb.aF,
      cfb.aG,
      cfb.aH,
      cfb.aI,
      cfb.aJ,
      cfb.aK,
      cfb.aL
   );
   private static final bxr<cor> m = cbd.a(
      (Function<cbd.b<cor>, ? extends App<cbd.c<cor>, cbg<cor>>>)($$0 -> $$0.group($$0.a(cfb.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bba.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cor $$0) {
      $$0.ec().a(ImmutableList.of(crf.y, crf.z, crf.x, crf.k, crf.w, crf.v, crf.b));
   }

   protected static bwz<?> a(cor $$0, Dynamic<?> $$1) {
      bwz.b<cor> $$2 = bwz.a(l, k);
      bwz<cor> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(crf.a));
      $$3.b(crf.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwz<cor> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak(0.8F), cbo.a(), new byw(45, 90), new bza()));
   }

   private static void b(bwz<cor> $$0) {
      $$0.a(crf.y, 5, ImmutableList.of(new cbk(a)), cfb.aC);
   }

   private static void c(bwz<cor> $$0) {
      $$0.a(crf.z, ImmutableList.of(Pair.of(0, new cbl()), Pair.of(1, new cbj(h))), ImmutableSet.of(Pair.of(cfb.ay, cfc.b), Pair.of(cfb.aE, cfc.b)));
   }

   private static void d(bwz<cor> $$0) {
      $$0.a(
         crf.b,
         10,
         ImmutableList.of(
            cbn.a(cor::x), cbr.a(), new bzn(ImmutableMap.of(cfb.aB, cfc.b), ImmutableList.of(Pair.of(bzi.a(0.5F), 2), Pair.of(new bya(30, 60), 1)))
         )
      );
   }

   private static void e(bwz<cor> $$0) {
      $$0.a(crf.w, 5, ImmutableList.of(cbn.a(cor::x), byj.a(cfb.az, 2, 0.7F)), cfb.az);
   }

   private static void f(bwz<cor> $$0) {
      $$0.a(crf.v, 5, ImmutableList.of(cbn.a(cor::x), new cbp(i)), cfb.aB);
   }

   private static void g(bwz<cor> $$0) {
      $$0.a(crf.x, 10, ImmutableList.of(new cbm()), cfb.ay);
   }

   private static void a(cor $$0, bwz<cor> $$1) {
      $$1.a(
         crf.k,
         10,
         ImmutableList.of(
            m,
            caf.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), cos::a, false),
            bzp.a($$1x -> a($$0, $$1x), (float)$$0.h(bxf.m)),
            bzv.a(1.2F),
            new cbq(),
            byx.a(18)
         ),
         cfb.o
      );
   }

   private static boolean a(cor $$0, bvx $$1) {
      return $$0.ec().c(cfb.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arx $$0, cor $$1, bvx $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bvx)$$1);
   }

   public static void a(bvx $$0) {
      if ($$0.ec().a(cfb.aE)) {
         $$0.ec().a(cfb.aE, bba.a, 1200L);
      }
   }

   public static void a(cor $$0, jh $$1) {
      if ($$0.dW().F_().a($$1) && !$$0.x().isPresent() && !$$0.ec().c(cfb.o).isPresent()) {
         a((bvx)$$0);
         $$0.ec().a(cfb.aG, bba.a, 100L);
         $$0.ec().a(cfb.n, new bxt($$1), 100L);
         $$0.ec().a(cfb.az, $$1, 100L);
         $$0.ec().b(cfb.m);
      }
   }
}
