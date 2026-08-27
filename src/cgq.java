import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cgq {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = awi.f(100.0F);
   public static final int a = awi.f(133.59999F);
   public static final int b = awi.f(84.0F);
   private static final int i = awi.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bys<? extends byr<? super cgp>>> k = List.of(bys.d, bys.x);
   private static final List<bxl<?>> l = List.of(
      bxl.g,
      bxl.h,
      bxl.k,
      bxl.l,
      bxl.M,
      bxl.n,
      bxl.m,
      bxl.E,
      bxl.t,
      bxl.o,
      bxl.p,
      bxl.B,
      bxl.ay,
      bxl.az,
      bxl.aA,
      bxl.aB,
      bxl.aC,
      bxl.aD,
      bxl.aE,
      bxl.aF,
      bxl.aG,
      bxl.aH,
      bxl.aI,
      bxl.aJ,
      bxl.aK,
      bxl.aL
   );
   private static final bqb<cgp> m = btn.a(
      (Function<btn.b<cgp>, ? extends App<btn.c<cgp>, btq<cgp>>>)($$0 -> $$0.group($$0.a(bxl.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(axk.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cgp $$0) {
      $$0.dO().a(ImmutableList.of(ciy.y, ciy.z, ciy.x, ciy.k, ciy.w, ciy.v, ciy.b));
   }

   protected static bpj<?> a(cgp $$0, Dynamic<?> $$1) {
      bpj.b<cgp> $$2 = bpj.a(l, k);
      bpj<cgp> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ciy.a));
      $$3.b(ciy.b);
      $$3.f();
      return $$3;
   }

   private static void a(bpj<cgp> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bsu(0.8F), bty.a(), new brg(45, 90), new brk()));
   }

   private static void b(bpj<cgp> $$0) {
      $$0.a(ciy.y, 5, ImmutableList.of(new btu(a)), bxl.aC);
   }

   private static void c(bpj<cgp> $$0) {
      $$0.a(ciy.z, ImmutableList.of(Pair.of(0, new btv()), Pair.of(1, new btt(h))), ImmutableSet.of(Pair.of(bxl.ay, bxm.b), Pair.of(bxl.aE, bxm.b)));
   }

   private static void d(bpj<cgp> $$0) {
      $$0.a(
         ciy.b,
         10,
         ImmutableList.of(
            btx.a(cgp::gg), bub.a(), new brx(ImmutableMap.of(bxl.aB, bxm.b), ImmutableList.of(Pair.of(brs.a(0.5F), 2), Pair.of(new bqk(30, 60), 1)))
         )
      );
   }

   private static void e(bpj<cgp> $$0) {
      $$0.a(ciy.w, 5, ImmutableList.of(btx.a(cgp::gg), bqt.a(bxl.az, 2, 0.7F)), bxl.az);
   }

   private static void f(bpj<cgp> $$0) {
      $$0.a(ciy.v, 5, ImmutableList.of(btx.a(cgp::gg), new btz(i)), bxl.aB);
   }

   private static void g(bpj<cgp> $$0) {
      $$0.a(ciy.x, 10, ImmutableList.of(new btw()), bxl.ay);
   }

   private static void a(cgp $$0, bpj<cgp> $$1) {
      $$1.a(
         ciy.k,
         10,
         ImmutableList.of(
            m, bsp.a($$1x -> !$$0.A().d() || !$$0.a($$1x), cgq::b, false), brz.a($$1x -> a($$0, $$1x), (float)$$0.g(bpp.i)), bsf.a(1.2F), new bua(), brh.a(18)
         ),
         bxl.o
      );
   }

   private static boolean a(cgp $$0, boi $$1) {
      return $$0.dO().c(bxl.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cgp $$0, boi $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((boi)$$0);
   }

   public static void a(boi $$0) {
      if ($$0.dO().a(bxl.aE)) {
         $$0.dO().a(bxl.aE, axk.a, 1200L);
      }
   }

   public static void a(cgp $$0, hz $$1) {
      if ($$0.dM().D_().a($$1) && !$$0.gg().isPresent() && !$$0.dO().c(bxl.o).isPresent()) {
         a((boi)$$0);
         $$0.dO().a(bxl.aG, axk.a, 100L);
         $$0.dO().a(bxl.n, new bqd($$1), 100L);
         $$0.dO().a(bxl.az, $$1, 100L);
         $$0.dO().b(bxl.m);
      }
   }
}
