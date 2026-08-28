import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class crb {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azo.f(100.0F);
   public static final int a = azo.f(133.59999F);
   public static final int b = azo.f(84.0F);
   private static final int i = azo.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cid<? extends cic<? super cra>>> k = List.of(cid.d, cid.x);
   private static final List<cgw<?>> l = List.of(
      cgw.g,
      cgw.h,
      cgw.k,
      cgw.l,
      cgw.N,
      cgw.o,
      cgw.n,
      cgw.F,
      cgw.u,
      cgw.p,
      cgw.q,
      cgw.C,
      cgw.az,
      cgw.aA,
      cgw.aB,
      cgw.aC,
      cgw.aD,
      cgw.aE,
      cgw.aF,
      cgw.aG,
      cgw.aH,
      cgw.aI,
      cgw.aJ,
      cgw.aK,
      cgw.aL,
      cgw.aM
   );
   private static final bzm<cra> m = ccy.a(
      (Function<ccy.b<cra>, ? extends App<ccy.c<cra>, cdb<cra>>>)($$0 -> $$0.group($$0.a(cgw.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(baw.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cra $$0) {
      $$0.ec().a(ImmutableList.of(ctr.y, ctr.z, ctr.x, ctr.k, ctr.w, ctr.v, ctr.b));
   }

   protected static byu<?> a(cra $$0, Dynamic<?> $$1) {
      byu.b<cra> $$2 = byu.a(l, k);
      byu<cra> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ctr.a));
      $$3.b(ctr.b);
      $$3.f();
      return $$3;
   }

   private static void a(byu<cra> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf(0.8F), cdj.a(), new car(45, 90), new cav()));
   }

   private static void b(byu<cra> $$0) {
      $$0.a(ctr.y, 5, ImmutableList.of(new cdf(a)), cgw.aD);
   }

   private static void c(byu<cra> $$0) {
      $$0.a(ctr.z, ImmutableList.of(Pair.of(0, new cdg()), Pair.of(1, new cde(h))), ImmutableSet.of(Pair.of(cgw.az, cgx.b), Pair.of(cgw.aF, cgx.b)));
   }

   private static void d(byu<cra> $$0) {
      $$0.a(
         ctr.b,
         10,
         ImmutableList.of(
            cdi.a(cra::q), cdm.a(), new cbi(ImmutableMap.of(cgw.aC, cgx.b), ImmutableList.of(Pair.of(cbd.a(0.5F), 2), Pair.of(new bzv(30, 60), 1)))
         )
      );
   }

   private static void e(byu<cra> $$0) {
      $$0.a(ctr.w, 5, ImmutableList.of(cdi.a(cra::q), cae.a(cgw.aA, 2, 0.7F)), cgw.aA);
   }

   private static void f(byu<cra> $$0) {
      $$0.a(ctr.v, 5, ImmutableList.of(cdi.a(cra::q), new cdk(i)), cgw.aC);
   }

   private static void g(byu<cra> $$0) {
      $$0.a(ctr.x, 10, ImmutableList.of(new cdh()), cgw.az);
   }

   private static void a(cra $$0, byu<cra> $$1) {
      $$1.a(
         ctr.k,
         10,
         ImmutableList.of(
            m,
            cca.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), crb::a, false),
            cbk.a($$1x -> a($$0, $$1x), (float)$$0.h(bza.m)),
            cbq.a(1.2F),
            new cdl(),
            cas.a(18)
         ),
         cgw.p
      );
   }

   private static boolean a(cra $$0, bxu $$1) {
      return $$0.ec().c(cgw.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(ars $$0, cra $$1, bxu $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bxu)$$1);
   }

   public static void a(bxu $$0) {
      if ($$0.ec().a(cgw.aF)) {
         $$0.ec().a(cgw.aF, baw.a, 1200L);
      }
   }

   public static void a(cra $$0, iv $$1) {
      if ($$0.dV().E_().a($$1) && !$$0.q().isPresent() && !$$0.ec().c(cgw.p).isPresent()) {
         a((bxu)$$0);
         $$0.ec().a(cgw.aH, baw.a, 100L);
         $$0.ec().a(cgw.o, new bzo($$1), 100L);
         $$0.ec().a(cgw.aA, $$1, 100L);
         $$0.ec().b(cgw.n);
      }
   }
}
