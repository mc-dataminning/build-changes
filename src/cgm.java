import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cgm {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = awh.f(100.0F);
   public static final int a = awh.f(133.59999F);
   public static final int b = awh.f(84.0F);
   private static final int i = awh.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<byo<? extends byn<? super cgl>>> k = List.of(byo.d, byo.x);
   private static final List<bxh<?>> l = List.of(
      bxh.g,
      bxh.h,
      bxh.k,
      bxh.l,
      bxh.M,
      bxh.n,
      bxh.m,
      bxh.E,
      bxh.t,
      bxh.o,
      bxh.p,
      bxh.B,
      bxh.ay,
      bxh.az,
      bxh.aA,
      bxh.aB,
      bxh.aC,
      bxh.aD,
      bxh.aE,
      bxh.aF,
      bxh.aG,
      bxh.aH,
      bxh.aI,
      bxh.aJ,
      bxh.aK,
      bxh.aL
   );
   private static final bpx<cgl> m = btj.a(
      (Function<btj.b<cgl>, ? extends App<btj.c<cgl>, btm<cgl>>>)($$0 -> $$0.group($$0.a(bxh.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(axk.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cgl $$0) {
      $$0.dO().a(ImmutableList.of(ciu.y, ciu.z, ciu.x, ciu.k, ciu.w, ciu.v, ciu.b));
   }

   protected static bpf<?> a(cgl $$0, Dynamic<?> $$1) {
      bpf.b<cgl> $$2 = bpf.a(l, k);
      bpf<cgl> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ciu.a));
      $$3.b(ciu.b);
      $$3.f();
      return $$3;
   }

   private static void a(bpf<cgl> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bsq(0.8F), btu.a(), new brc(45, 90), new brg()));
   }

   private static void b(bpf<cgl> $$0) {
      $$0.a(ciu.y, 5, ImmutableList.of(new btq(a)), bxh.aC);
   }

   private static void c(bpf<cgl> $$0) {
      $$0.a(ciu.z, ImmutableList.of(Pair.of(0, new btr()), Pair.of(1, new btp(h))), ImmutableSet.of(Pair.of(bxh.ay, bxi.b), Pair.of(bxh.aE, bxi.b)));
   }

   private static void d(bpf<cgl> $$0) {
      $$0.a(
         ciu.b,
         10,
         ImmutableList.of(
            btt.a(cgl::gg), btx.a(), new brt(ImmutableMap.of(bxh.aB, bxi.b), ImmutableList.of(Pair.of(bro.a(0.5F), 2), Pair.of(new bqg(30, 60), 1)))
         )
      );
   }

   private static void e(bpf<cgl> $$0) {
      $$0.a(ciu.w, 5, ImmutableList.of(btt.a(cgl::gg), bqp.a(bxh.az, 2, 0.7F)), bxh.az);
   }

   private static void f(bpf<cgl> $$0) {
      $$0.a(ciu.v, 5, ImmutableList.of(btt.a(cgl::gg), new btv(i)), bxh.aB);
   }

   private static void g(bpf<cgl> $$0) {
      $$0.a(ciu.x, 10, ImmutableList.of(new bts()), bxh.ay);
   }

   private static void a(cgl $$0, bpf<cgl> $$1) {
      $$1.a(
         ciu.k,
         10,
         ImmutableList.of(
            m, bsl.a($$1x -> !$$0.A().d() || !$$0.a($$1x), cgm::b, false), brv.a($$1x -> a($$0, $$1x), (float)$$0.g(bpl.i)), bsb.a(1.2F), new btw(), brd.a(18)
         ),
         bxh.o
      );
   }

   private static boolean a(cgl $$0, bog $$1) {
      return $$0.dO().c(bxh.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cgl $$0, bog $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bog)$$0);
   }

   public static void a(bog $$0) {
      if ($$0.dO().a(bxh.aE)) {
         $$0.dO().a(bxh.aE, axk.a, 1200L);
      }
   }

   public static void a(cgl $$0, hz $$1) {
      if ($$0.dM().D_().a($$1) && !$$0.gg().isPresent() && !$$0.dO().c(bxh.o).isPresent()) {
         a((bog)$$0);
         $$0.dO().a(bxh.aG, axk.a, 100L);
         $$0.dO().a(bxh.n, new bpz($$1), 100L);
         $$0.dO().a(bxh.az, $$1, 100L);
         $$0.dO().b(bxh.m);
      }
   }
}
