import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class ccr {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ati.f(100.0F);
   public static final int a = ati.f(133.59999F);
   public static final int b = ati.f(84.0F);
   private static final int i = ati.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bve<? extends bvd<? super ccq>>> k = List.of(bve.d, bve.v);
   private static final List<btz<?>> l = List.of(
      btz.g,
      btz.h,
      btz.k,
      btz.l,
      btz.L,
      btz.n,
      btz.m,
      btz.E,
      btz.t,
      btz.o,
      btz.p,
      btz.B,
      btz.ax,
      btz.ay,
      btz.az,
      btz.aA,
      btz.aB,
      btz.aC,
      btz.aD,
      btz.aE,
      btz.aF,
      btz.aG,
      btz.aH,
      btz.aI,
      btz.aJ,
      btz.aK
   );
   private static final bmq<ccq> m = bqb.a(
      (Function<bqb.b<ccq>, ? extends App<bqb.c<ccq>, bqe<ccq>>>)($$0 -> $$0.group($$0.a(btz.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(auj.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(ccq $$0) {
      $$0.dN().a(ImmutableList.of(cex.y, cex.z, cex.x, cex.k, cex.w, cex.v, cex.b));
   }

   protected static bly<?> a(ccq $$0, Dynamic<?> $$1) {
      bly.b<ccq> $$2 = bly.a(l, k);
      bly<ccq> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cex.a));
      $$3.b(cex.b);
      $$3.f();
      return $$3;
   }

   private static void a(bly<ccq> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bpi(0.8F), bqm.a(), new bnu(45, 90), new bny()));
   }

   private static void b(bly<ccq> $$0) {
      $$0.a(cex.y, 5, ImmutableList.of(new bqi(a)), btz.aB);
   }

   private static void c(bly<ccq> $$0) {
      $$0.a(cex.z, ImmutableList.of(Pair.of(0, new bqj()), Pair.of(1, new bqh(h))), ImmutableSet.of(Pair.of(btz.ax, bua.b), Pair.of(btz.aD, bua.b)));
   }

   private static void d(bly<ccq> $$0) {
      $$0.a(
         cex.b,
         10,
         ImmutableList.of(
            bql.a(ccq::ge), bqp.a(), new bol(ImmutableMap.of(btz.aA, bua.b), ImmutableList.of(Pair.of(bog.a(0.5F), 2), Pair.of(new bmz(30, 60), 1)))
         )
      );
   }

   private static void e(bly<ccq> $$0) {
      $$0.a(cex.w, 5, ImmutableList.of(bql.a(ccq::ge), bni.a(btz.ay, 2, 0.7F)), btz.ay);
   }

   private static void f(bly<ccq> $$0) {
      $$0.a(cex.v, 5, ImmutableList.of(bql.a(ccq::ge), new bqn(i)), btz.aA);
   }

   private static void g(bly<ccq> $$0) {
      $$0.a(cex.x, 10, ImmutableList.of(new bqk()), btz.ax);
   }

   private static void a(ccq $$0, bly<ccq> $$1) {
      $$1.a(
         cex.k,
         10,
         ImmutableList.of(
            m, bpd.a($$1x -> !$$0.y().d() || !$$0.a($$1x), ccr::b, false), bon.a($$1x -> a($$0, $$1x), (float)$$0.b(bme.g)), bot.a(1.2F), new bqo(), bnv.a(18)
         ),
         btz.o
      );
   }

   private static boolean a(ccq $$0, bky $$1) {
      return $$0.dN().c(btz.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(ccq $$0, bky $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bky)$$0);
   }

   public static void a(bky $$0) {
      if ($$0.dN().a(btz.aD)) {
         $$0.dN().a(btz.aD, auj.a, 1200L);
      }
   }

   public static void a(ccq $$0, ht $$1) {
      if ($$0.dL().C_().a($$1) && !$$0.ge().isPresent() && !$$0.dN().c(btz.o).isPresent()) {
         a((bky)$$0);
         $$0.dN().a(btz.aF, auj.a, 100L);
         $$0.dN().a(btz.n, new bms($$1), 100L);
         $$0.dN().a(btz.ay, $$1, 100L);
         $$0.dN().b(btz.m);
      }
   }
}
