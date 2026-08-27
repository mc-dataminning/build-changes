import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cjf {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = axm.f(100.0F);
   public static final int a = axm.f(133.59999F);
   public static final int b = axm.f(84.0F);
   private static final int i = axm.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cbd<? extends cbc<? super cje>>> k = List.of(cbd.d, cbd.x);
   private static final List<bzw<?>> l = List.of(
      bzw.g,
      bzw.h,
      bzw.k,
      bzw.l,
      bzw.M,
      bzw.n,
      bzw.m,
      bzw.E,
      bzw.t,
      bzw.o,
      bzw.p,
      bzw.B,
      bzw.ay,
      bzw.az,
      bzw.aA,
      bzw.aB,
      bzw.aC,
      bzw.aD,
      bzw.aE,
      bzw.aF,
      bzw.aG,
      bzw.aH,
      bzw.aI,
      bzw.aJ,
      bzw.aK,
      bzw.aL
   );
   private static final bsm<cje> m = bvy.a(
      (Function<bvy.b<cje>, ? extends App<bvy.c<cje>, bwb<cje>>>)($$0 -> $$0.group($$0.a(bzw.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(ayo.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cje $$0) {
      $$0.dP().a(ImmutableList.of(clp.y, clp.z, clp.x, clp.k, clp.w, clp.v, clp.b));
   }

   protected static bru<?> a(cje $$0, Dynamic<?> $$1) {
      bru.b<cje> $$2 = bru.a(l, k);
      bru<cje> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(clp.a));
      $$3.b(clp.b);
      $$3.f();
      return $$3;
   }

   private static void a(bru<cje> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bvf(0.8F), bwj.a(), new btr(45, 90), new btv()));
   }

   private static void b(bru<cje> $$0) {
      $$0.a(clp.y, 5, ImmutableList.of(new bwf(a)), bzw.aC);
   }

   private static void c(bru<cje> $$0) {
      $$0.a(clp.z, ImmutableList.of(Pair.of(0, new bwg()), Pair.of(1, new bwe(h))), ImmutableSet.of(Pair.of(bzw.ay, bzx.b), Pair.of(bzw.aE, bzx.b)));
   }

   private static void d(bru<cje> $$0) {
      $$0.a(
         clp.b,
         10,
         ImmutableList.of(
            bwi.a(cje::gn), bwm.a(), new bui(ImmutableMap.of(bzw.aB, bzx.b), ImmutableList.of(Pair.of(bud.a(0.5F), 2), Pair.of(new bsv(30, 60), 1)))
         )
      );
   }

   private static void e(bru<cje> $$0) {
      $$0.a(clp.w, 5, ImmutableList.of(bwi.a(cje::gn), bte.a(bzw.az, 2, 0.7F)), bzw.az);
   }

   private static void f(bru<cje> $$0) {
      $$0.a(clp.v, 5, ImmutableList.of(bwi.a(cje::gn), new bwk(i)), bzw.aB);
   }

   private static void g(bru<cje> $$0) {
      $$0.a(clp.x, 10, ImmutableList.of(new bwh()), bzw.ay);
   }

   private static void a(cje $$0, bru<cje> $$1) {
      $$1.a(
         clp.k,
         10,
         ImmutableList.of(
            m, bva.a($$1x -> !$$0.y().d() || !$$0.b($$1x), cjf::b, false), buk.a($$1x -> a($$0, $$1x), (float)$$0.g(bsa.k)), buq.a(1.2F), new bwl(), bts.a(18)
         ),
         bzw.o
      );
   }

   private static boolean a(cje $$0, bqt $$1) {
      return $$0.dP().c(bzw.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cje $$0, bqt $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bqt)$$0);
   }

   public static void a(bqt $$0) {
      if ($$0.dP().a(bzw.aE)) {
         $$0.dP().a(bzw.aE, ayo.a, 1200L);
      }
   }

   public static void a(cje $$0, id $$1) {
      if ($$0.dM().C_().a($$1) && !$$0.gn().isPresent() && !$$0.dP().c(bzw.o).isPresent()) {
         a((bqt)$$0);
         $$0.dP().a(bzw.aG, ayo.a, 100L);
         $$0.dP().a(bzw.n, new bso($$1), 100L);
         $$0.dP().a(bzw.az, $$1, 100L);
         $$0.dP().b(bzw.m);
      }
   }
}
