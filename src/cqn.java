import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cqn {
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
   private static final List<chs<? extends chr<? super cqm>>> k = List.of(chs.d, chs.x);
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
   private static final bzb<cqm> m = ccn.a(
      (Function<ccn.b<cqm>, ? extends App<ccn.c<cqm>, ccq<cqm>>>)($$0 -> $$0.group($$0.a(cgl.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bau.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cqm $$0) {
      $$0.eb().a(ImmutableList.of(ctd.y, ctd.z, ctd.x, ctd.k, ctd.w, ctd.v, ctd.b));
   }

   protected static byj<?> a(cqm $$0, Dynamic<?> $$1) {
      byj.b<cqm> $$2 = byj.a(l, k);
      byj<cqm> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ctd.a));
      $$3.b(ctd.b);
      $$3.f();
      return $$3;
   }

   private static void a(byj<cqm> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new cbu(0.8F), ccy.a(), new cag(45, 90), new cak()));
   }

   private static void b(byj<cqm> $$0) {
      $$0.a(ctd.y, 5, ImmutableList.of(new ccu(a)), cgl.aD);
   }

   private static void c(byj<cqm> $$0) {
      $$0.a(ctd.z, ImmutableList.of(Pair.of(0, new ccv()), Pair.of(1, new cct(h))), ImmutableSet.of(Pair.of(cgl.az, cgm.b), Pair.of(cgl.aF, cgm.b)));
   }

   private static void d(byj<cqm> $$0) {
      $$0.a(
         ctd.b,
         10,
         ImmutableList.of(
            ccx.a(cqm::q), cdb.a(), new cax(ImmutableMap.of(cgl.aC, cgm.b), ImmutableList.of(Pair.of(cas.a(0.5F), 2), Pair.of(new bzk(30, 60), 1)))
         )
      );
   }

   private static void e(byj<cqm> $$0) {
      $$0.a(ctd.w, 5, ImmutableList.of(ccx.a(cqm::q), bzt.a(cgl.aA, 2, 0.7F)), cgl.aA);
   }

   private static void f(byj<cqm> $$0) {
      $$0.a(ctd.v, 5, ImmutableList.of(ccx.a(cqm::q), new ccz(i)), cgl.aC);
   }

   private static void g(byj<cqm> $$0) {
      $$0.a(ctd.x, 10, ImmutableList.of(new ccw()), cgl.az);
   }

   private static void a(cqm $$0, byj<cqm> $$1) {
      $$1.a(
         ctd.k,
         10,
         ImmutableList.of(
            m,
            cbp.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), cqn::a, false),
            caz.a($$1x -> a($$0, $$1x), (float)$$0.h(byp.m)),
            cbf.a(1.2F),
            new cda(),
            cah.a(18)
         ),
         cgl.p
      );
   }

   private static boolean a(cqm $$0, bxj $$1) {
      return $$0.eb().c(cgl.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arq $$0, cqm $$1, bxj $$2) {
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

   public static void a(cqm $$0, iv $$1) {
      if ($$0.dU().A_().a($$1) && !$$0.q().isPresent() && !$$0.eb().c(cgl.p).isPresent()) {
         a((bxj)$$0);
         $$0.eb().a(cgl.aH, bau.a, 100L);
         $$0.eb().a(cgl.o, new bzd($$1), 100L);
         $$0.eb().a(cgl.aA, $$1, 100L);
         $$0.eb().b(cgl.n);
      }
   }
}
