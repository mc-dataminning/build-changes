import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cpm {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azk.f(100.0F);
   public static final int a = azk.f(133.59999F);
   public static final int b = azk.f(84.0F);
   private static final int i = azk.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cha<? extends cgz<? super cpl>>> k = List.of(cha.d, cha.x);
   private static final List<cft<?>> l = List.of(
      cft.g,
      cft.h,
      cft.k,
      cft.l,
      cft.N,
      cft.o,
      cft.n,
      cft.F,
      cft.u,
      cft.p,
      cft.q,
      cft.C,
      cft.az,
      cft.aA,
      cft.aB,
      cft.aC,
      cft.aD,
      cft.aE,
      cft.aF,
      cft.aG,
      cft.aH,
      cft.aI,
      cft.aJ,
      cft.aK,
      cft.aL,
      cft.aM
   );
   private static final byj<cpl> m = cbv.a(
      (Function<cbv.b<cpl>, ? extends App<cbv.c<cpl>, cby<cpl>>>)($$0 -> $$0.group($$0.a(cft.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(baq.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cpl $$0) {
      $$0.eb().a(ImmutableList.of(crz.y, crz.z, crz.x, crz.k, crz.w, crz.v, crz.b));
   }

   protected static bxr<?> a(cpl $$0, Dynamic<?> $$1) {
      bxr.b<cpl> $$2 = bxr.a(l, k);
      bxr<cpl> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(crz.a));
      $$3.b(crz.b);
      $$3.f();
      return $$3;
   }

   private static void a(bxr<cpl> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc(0.8F), ccg.a(), new bzo(45, 90), new bzs()));
   }

   private static void b(bxr<cpl> $$0) {
      $$0.a(crz.y, 5, ImmutableList.of(new ccc(a)), cft.aD);
   }

   private static void c(bxr<cpl> $$0) {
      $$0.a(crz.z, ImmutableList.of(Pair.of(0, new ccd()), Pair.of(1, new ccb(h))), ImmutableSet.of(Pair.of(cft.az, cfu.b), Pair.of(cft.aF, cfu.b)));
   }

   private static void d(bxr<cpl> $$0) {
      $$0.a(
         crz.b,
         10,
         ImmutableList.of(
            ccf.a(cpl::q), ccj.a(), new caf(ImmutableMap.of(cft.aC, cfu.b), ImmutableList.of(Pair.of(caa.a(0.5F), 2), Pair.of(new bys(30, 60), 1)))
         )
      );
   }

   private static void e(bxr<cpl> $$0) {
      $$0.a(crz.w, 5, ImmutableList.of(ccf.a(cpl::q), bzb.a(cft.aA, 2, 0.7F)), cft.aA);
   }

   private static void f(bxr<cpl> $$0) {
      $$0.a(crz.v, 5, ImmutableList.of(ccf.a(cpl::q), new cch(i)), cft.aC);
   }

   private static void g(bxr<cpl> $$0) {
      $$0.a(crz.x, 10, ImmutableList.of(new cce()), cft.az);
   }

   private static void a(cpl $$0, bxr<cpl> $$1) {
      $$1.a(
         crz.k,
         10,
         ImmutableList.of(
            m,
            cax.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), cpm::a, false),
            cah.a($$1x -> a($$0, $$1x), (float)$$0.h(bxx.m)),
            can.a(1.2F),
            new cci(),
            bzp.a(18)
         ),
         cft.p
      );
   }

   private static boolean a(cpl $$0, bwr $$1) {
      return $$0.eb().c(cft.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arn $$0, cpl $$1, bwr $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bwr)$$1);
   }

   public static void a(bwr $$0) {
      if ($$0.eb().a(cft.aF)) {
         $$0.eb().a(cft.aF, baq.a, 1200L);
      }
   }

   public static void a(cpl $$0, jj $$1) {
      if ($$0.dV().A_().a($$1) && !$$0.q().isPresent() && !$$0.eb().c(cft.p).isPresent()) {
         a((bwr)$$0);
         $$0.eb().a(cft.aH, baq.a, 100L);
         $$0.eb().a(cft.o, new byl($$1), 100L);
         $$0.eb().a(cft.aA, $$1, 100L);
         $$0.eb().b(cft.n);
      }
   }
}
