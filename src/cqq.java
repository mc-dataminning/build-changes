import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cqq {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azm.f(100.0F);
   public static final int a = azm.f(133.59999F);
   public static final int b = azm.f(84.0F);
   private static final int i = azm.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<chs<? extends chr<? super cqp>>> k = List.of(chs.d, chs.x);
   private static final List<cgl<?>> l = List.of(
      cgl.g,
      cgl.h,
      cgl.k,
      cgl.l,
      cgl.N,
      cgl.o,
      cgl.n,
      cgl.F,
      cgl.u,
      cgl.p,
      cgl.q,
      cgl.C,
      cgl.az,
      cgl.aA,
      cgl.aB,
      cgl.aC,
      cgl.aD,
      cgl.aE,
      cgl.aF,
      cgl.aG,
      cgl.aH,
      cgl.aI,
      cgl.aJ,
      cgl.aK,
      cgl.aL,
      cgl.aM
   );
   private static final bzb<cqp> m = ccn.a(
      (Function<ccn.b<cqp>, ? extends App<ccn.c<cqp>, ccq<cqp>>>)($$0 -> $$0.group($$0.a(cgl.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bau.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cqp $$0) {
      $$0.eb().a(ImmutableList.of(ctg.y, ctg.z, ctg.x, ctg.k, ctg.w, ctg.v, ctg.b));
   }

   protected static byj<?> a(cqp $$0, Dynamic<?> $$1) {
      byj.b<cqp> $$2 = byj.a(l, k);
      byj<cqp> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ctg.a));
      $$3.b(ctg.b);
      $$3.f();
      return $$3;
   }

   private static void a(byj<cqp> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cbu(0.8F), ccy.a(), new cag(45, 90), new cak()));
   }

   private static void b(byj<cqp> $$0) {
      $$0.a(ctg.y, 5, ImmutableList.of(new ccu(a)), cgl.aD);
   }

   private static void c(byj<cqp> $$0) {
      $$0.a(ctg.z, ImmutableList.of(Pair.of(0, new ccv()), Pair.of(1, new cct(h))), ImmutableSet.of(Pair.of(cgl.az, cgm.b), Pair.of(cgl.aF, cgm.b)));
   }

   private static void d(byj<cqp> $$0) {
      $$0.a(
         ctg.b,
         10,
         ImmutableList.of(
            ccx.a(cqp::q), cdb.a(), new cax(ImmutableMap.of(cgl.aC, cgm.b), ImmutableList.of(Pair.of(cas.a(0.5F), 2), Pair.of(new bzk(30, 60), 1)))
         )
      );
   }

   private static void e(byj<cqp> $$0) {
      $$0.a(ctg.w, 5, ImmutableList.of(ccx.a(cqp::q), bzt.a(cgl.aA, 2, 0.7F)), cgl.aA);
   }

   private static void f(byj<cqp> $$0) {
      $$0.a(ctg.v, 5, ImmutableList.of(ccx.a(cqp::q), new ccz(i)), cgl.aC);
   }

   private static void g(byj<cqp> $$0) {
      $$0.a(ctg.x, 10, ImmutableList.of(new ccw()), cgl.az);
   }

   private static void a(cqp $$0, byj<cqp> $$1) {
      $$1.a(
         ctg.k,
         10,
         ImmutableList.of(
            m,
            cbp.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), cqq::a, false),
            caz.a($$1x -> a($$0, $$1x), (float)$$0.h(byp.m)),
            cbf.a(1.2F),
            new cda(),
            cah.a(18)
         ),
         cgl.p
      );
   }

   private static boolean a(cqp $$0, bxj $$1) {
      return $$0.eb().c(cgl.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arq $$0, cqp $$1, bxj $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bxj)$$1);
   }

   public static void a(bxj $$0) {
      if ($$0.eb().a(cgl.aF)) {
         $$0.eb().a(cgl.aF, bau.a, 1200L);
      }
   }

   public static void a(cqp $$0, iv $$1) {
      if ($$0.dU().A_().a($$1) && !$$0.q().isPresent() && !$$0.eb().c(cgl.p).isPresent()) {
         a((bxj)$$0);
         $$0.eb().a(cgl.aH, bau.a, 100L);
         $$0.eb().a(cgl.o, new bzd($$1), 100L);
         $$0.eb().a(cgl.aA, $$1, 100L);
         $$0.eb().b(cgl.n);
      }
   }
}
