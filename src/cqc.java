import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cqc {
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
   private static final List<chl<? extends chk<? super cqb>>> k = List.of(chl.d, chl.x);
   private static final List<cge<?>> l = List.of(
      cge.g,
      cge.h,
      cge.k,
      cge.l,
      cge.N,
      cge.o,
      cge.n,
      cge.F,
      cge.u,
      cge.p,
      cge.q,
      cge.C,
      cge.az,
      cge.aA,
      cge.aB,
      cge.aC,
      cge.aD,
      cge.aE,
      cge.aF,
      cge.aG,
      cge.aH,
      cge.aI,
      cge.aJ,
      cge.aK,
      cge.aL,
      cge.aM
   );
   private static final byu<cqb> m = ccg.a(
      (Function<ccg.b<cqb>, ? extends App<ccg.c<cqb>, ccj<cqb>>>)($$0 -> $$0.group($$0.a(cge.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bau.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cqb $$0) {
      $$0.eb().a(ImmutableList.of(csr.y, csr.z, csr.x, csr.k, csr.w, csr.v, csr.b));
   }

   protected static byc<?> a(cqb $$0, Dynamic<?> $$1) {
      byc.b<cqb> $$2 = byc.a(l, k);
      byc<cqb> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(csr.a));
      $$3.b(csr.b);
      $$3.f();
      return $$3;
   }

   private static void a(byc<cqb> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn(0.8F), ccr.a(), new bzz(45, 90), new cad()));
   }

   private static void b(byc<cqb> $$0) {
      $$0.a(csr.y, 5, ImmutableList.of(new ccn(a)), cge.aD);
   }

   private static void c(byc<cqb> $$0) {
      $$0.a(csr.z, ImmutableList.of(Pair.of(0, new cco()), Pair.of(1, new ccm(h))), ImmutableSet.of(Pair.of(cge.az, cgf.b), Pair.of(cge.aF, cgf.b)));
   }

   private static void d(byc<cqb> $$0) {
      $$0.a(
         csr.b,
         10,
         ImmutableList.of(
            ccq.a(cqb::q), ccu.a(), new caq(ImmutableMap.of(cge.aC, cgf.b), ImmutableList.of(Pair.of(cal.a(0.5F), 2), Pair.of(new bzd(30, 60), 1)))
         )
      );
   }

   private static void e(byc<cqb> $$0) {
      $$0.a(csr.w, 5, ImmutableList.of(ccq.a(cqb::q), bzm.a(cge.aA, 2, 0.7F)), cge.aA);
   }

   private static void f(byc<cqb> $$0) {
      $$0.a(csr.v, 5, ImmutableList.of(ccq.a(cqb::q), new ccs(i)), cge.aC);
   }

   private static void g(byc<cqb> $$0) {
      $$0.a(csr.x, 10, ImmutableList.of(new ccp()), cge.az);
   }

   private static void a(cqb $$0, byc<cqb> $$1) {
      $$1.a(
         csr.k,
         10,
         ImmutableList.of(
            m,
            cbi.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), cqc::a, false),
            cas.a($$1x -> a($$0, $$1x), (float)$$0.h(byi.m)),
            cay.a(1.2F),
            new cct(),
            caa.a(18)
         ),
         cge.p
      );
   }

   private static boolean a(cqb $$0, bxc $$1) {
      return $$0.eb().c(cge.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arq $$0, cqb $$1, bxc $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bxc)$$1);
   }

   public static void a(bxc $$0) {
      if ($$0.eb().a(cge.aF)) {
         $$0.eb().a(cge.aF, bau.a, 1200L);
      }
   }

   public static void a(cqb $$0, iu $$1) {
      if ($$0.dV().A_().a($$1) && !$$0.q().isPresent() && !$$0.eb().c(cge.p).isPresent()) {
         a((bxc)$$0);
         $$0.eb().a(cge.aH, bau.a, 100L);
         $$0.eb().a(cge.o, new byw($$1), 100L);
         $$0.eb().a(cge.aA, $$1, 100L);
         $$0.eb().b(cge.n);
      }
   }
}
