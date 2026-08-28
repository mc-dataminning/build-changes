import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cov {
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
   private static final List<cgj<? extends cgi<? super cou>>> k = List.of(cgj.d, cgj.x);
   private static final List<cfc<?>> l = List.of(
      cfc.g,
      cfc.h,
      cfc.k,
      cfc.l,
      cfc.M,
      cfc.n,
      cfc.m,
      cfc.E,
      cfc.t,
      cfc.o,
      cfc.p,
      cfc.B,
      cfc.ay,
      cfc.az,
      cfc.aA,
      cfc.aB,
      cfc.aC,
      cfc.aD,
      cfc.aE,
      cfc.aF,
      cfc.aG,
      cfc.aH,
      cfc.aI,
      cfc.aJ,
      cfc.aK,
      cfc.aL
   );
   private static final bxs<cou> m = cbe.a(
      (Function<cbe.b<cou>, ? extends App<cbe.c<cou>, cbh<cou>>>)($$0 -> $$0.group($$0.a(cfc.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(baf.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cou $$0) {
      $$0.ea().a(ImmutableList.of(cri.y, cri.z, cri.x, cri.k, cri.w, cri.v, cri.b));
   }

   protected static bxa<?> a(cou $$0, Dynamic<?> $$1) {
      bxa.b<cou> $$2 = bxa.a(l, k);
      bxa<cou> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cri.a));
      $$3.b(cri.b);
      $$3.f();
      return $$3;
   }

   private static void a(bxa<cou> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal(0.8F), cbp.a(), new byx(45, 90), new bzb()));
   }

   private static void b(bxa<cou> $$0) {
      $$0.a(cri.y, 5, ImmutableList.of(new cbl(a)), cfc.aC);
   }

   private static void c(bxa<cou> $$0) {
      $$0.a(cri.z, ImmutableList.of(Pair.of(0, new cbm()), Pair.of(1, new cbk(h))), ImmutableSet.of(Pair.of(cfc.ay, cfd.b), Pair.of(cfc.aE, cfd.b)));
   }

   private static void d(bxa<cou> $$0) {
      $$0.a(
         cri.b,
         10,
         ImmutableList.of(
            cbo.a(cou::q), cbs.a(), new bzo(ImmutableMap.of(cfc.aB, cfd.b), ImmutableList.of(Pair.of(bzj.a(0.5F), 2), Pair.of(new byb(30, 60), 1)))
         )
      );
   }

   private static void e(bxa<cou> $$0) {
      $$0.a(cri.w, 5, ImmutableList.of(cbo.a(cou::q), byk.a(cfc.az, 2, 0.7F)), cfc.az);
   }

   private static void f(bxa<cou> $$0) {
      $$0.a(cri.v, 5, ImmutableList.of(cbo.a(cou::q), new cbq(i)), cfc.aB);
   }

   private static void g(bxa<cou> $$0) {
      $$0.a(cri.x, 10, ImmutableList.of(new cbn()), cfc.ay);
   }

   private static void a(cou $$0, bxa<cou> $$1) {
      $$1.a(
         cri.k,
         10,
         ImmutableList.of(
            m,
            cag.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), cov::a, false),
            bzq.a($$1x -> a($$0, $$1x), (float)$$0.h(bxg.m)),
            bzw.a(1.2F),
            new cbr(),
            byy.a(18)
         ),
         cfc.o
      );
   }

   private static boolean a(cou $$0, bvy $$1) {
      return $$0.ea().c(cfc.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(ard $$0, cou $$1, bvy $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bvy)$$1);
   }

   public static void a(bvy $$0) {
      if ($$0.ea().a(cfc.aE)) {
         $$0.ea().a(cfc.aE, baf.a, 1200L);
      }
   }

   public static void a(cou $$0, ji $$1) {
      if ($$0.dU().A_().a($$1) && !$$0.q().isPresent() && !$$0.ea().c(cfc.o).isPresent()) {
         a((bvy)$$0);
         $$0.ea().a(cfc.aG, baf.a, 100L);
         $$0.ea().a(cfc.n, new bxu($$1), 100L);
         $$0.ea().a(cfc.az, $$1, 100L);
         $$0.ea().b(cfc.m);
      }
   }
}
