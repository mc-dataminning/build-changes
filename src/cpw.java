import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cpw {
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
   private static final List<chi<? extends chh<? super cpv>>> k = List.of(chi.d, chi.x);
   private static final List<cgb<?>> l = List.of(
      cgb.g,
      cgb.h,
      cgb.k,
      cgb.l,
      cgb.N,
      cgb.o,
      cgb.n,
      cgb.F,
      cgb.u,
      cgb.p,
      cgb.q,
      cgb.C,
      cgb.az,
      cgb.aA,
      cgb.aB,
      cgb.aC,
      cgb.aD,
      cgb.aE,
      cgb.aF,
      cgb.aG,
      cgb.aH,
      cgb.aI,
      cgb.aJ,
      cgb.aK,
      cgb.aL,
      cgb.aM
   );
   private static final byr<cpv> m = ccd.a(
      (Function<ccd.b<cpv>, ? extends App<ccd.c<cpv>, ccg<cpv>>>)($$0 -> $$0.group($$0.a(cgb.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bas.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cpv $$0) {
      $$0.eb().a(ImmutableList.of(csl.y, csl.z, csl.x, csl.k, csl.w, csl.v, csl.b));
   }

   protected static bxz<?> a(cpv $$0, Dynamic<?> $$1) {
      bxz.b<cpv> $$2 = bxz.a(l, k);
      bxz<cpv> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(csl.a));
      $$3.b(csl.b);
      $$3.f();
      return $$3;
   }

   private static void a(bxz<cpv> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk(0.8F), cco.a(), new bzw(45, 90), new caa()));
   }

   private static void b(bxz<cpv> $$0) {
      $$0.a(csl.y, 5, ImmutableList.of(new cck(a)), cgb.aD);
   }

   private static void c(bxz<cpv> $$0) {
      $$0.a(csl.z, ImmutableList.of(Pair.of(0, new ccl()), Pair.of(1, new ccj(h))), ImmutableSet.of(Pair.of(cgb.az, cgc.b), Pair.of(cgb.aF, cgc.b)));
   }

   private static void d(bxz<cpv> $$0) {
      $$0.a(
         csl.b,
         10,
         ImmutableList.of(
            ccn.a(cpv::q), ccr.a(), new can(ImmutableMap.of(cgb.aC, cgc.b), ImmutableList.of(Pair.of(cai.a(0.5F), 2), Pair.of(new bza(30, 60), 1)))
         )
      );
   }

   private static void e(bxz<cpv> $$0) {
      $$0.a(csl.w, 5, ImmutableList.of(ccn.a(cpv::q), bzj.a(cgb.aA, 2, 0.7F)), cgb.aA);
   }

   private static void f(bxz<cpv> $$0) {
      $$0.a(csl.v, 5, ImmutableList.of(ccn.a(cpv::q), new ccp(i)), cgb.aC);
   }

   private static void g(bxz<cpv> $$0) {
      $$0.a(csl.x, 10, ImmutableList.of(new ccm()), cgb.az);
   }

   private static void a(cpv $$0, bxz<cpv> $$1) {
      $$1.a(
         csl.k,
         10,
         ImmutableList.of(
            m,
            cbf.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), cpw::a, false),
            cap.a($$1x -> a($$0, $$1x), (float)$$0.h(byf.m)),
            cav.a(1.2F),
            new ccq(),
            bzx.a(18)
         ),
         cgb.p
      );
   }

   private static boolean a(cpv $$0, bwz $$1) {
      return $$0.eb().c(cgb.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(aro $$0, cpv $$1, bwz $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bwz)$$1);
   }

   public static void a(bwz $$0) {
      if ($$0.eb().a(cgb.aF)) {
         $$0.eb().a(cgb.aF, bas.a, 1200L);
      }
   }

   public static void a(cpv $$0, iu $$1) {
      if ($$0.dV().A_().a($$1) && !$$0.q().isPresent() && !$$0.eb().c(cgb.p).isPresent()) {
         a((bwz)$$0);
         $$0.eb().a(cgb.aH, bas.a, 100L);
         $$0.eb().a(cgb.o, new byt($$1), 100L);
         $$0.eb().a(cgb.aA, $$1, 100L);
         $$0.eb().b(cgb.n);
      }
   }
}
