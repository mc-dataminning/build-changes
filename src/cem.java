import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cem {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = aun.f(100.0F);
   public static final int a = aun.f(133.59999F);
   public static final int b = aun.f(84.0F);
   private static final int i = aun.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bws<? extends bwr<? super cel>>> k = List.of(bws.d, bws.v);
   private static final List<bvm<?>> l = List.of(
      bvm.g,
      bvm.h,
      bvm.k,
      bvm.l,
      bvm.L,
      bvm.n,
      bvm.m,
      bvm.E,
      bvm.t,
      bvm.o,
      bvm.p,
      bvm.B,
      bvm.ax,
      bvm.ay,
      bvm.az,
      bvm.aA,
      bvm.aB,
      bvm.aC,
      bvm.aD,
      bvm.aE,
      bvm.aF,
      bvm.aG,
      bvm.aH,
      bvm.aI,
      bvm.aJ,
      bvm.aK
   );
   private static final boc<cel> m = bro.a(
      (Function<bro.b<cel>, ? extends App<bro.c<cel>, brr<cel>>>)($$0 -> $$0.group($$0.a(bvm.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(avr.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cel $$0) {
      $$0.dO().a(ImmutableList.of(cgt.y, cgt.z, cgt.x, cgt.k, cgt.w, cgt.v, cgt.b));
   }

   protected static bnk<?> a(cel $$0, Dynamic<?> $$1) {
      bnk.b<cel> $$2 = bnk.a(l, k);
      bnk<cel> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cgt.a));
      $$3.b(cgt.b);
      $$3.f();
      return $$3;
   }

   private static void a(bnk<cel> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bqv(0.8F), brz.a(), new bph(45, 90), new bpl()));
   }

   private static void b(bnk<cel> $$0) {
      $$0.a(cgt.y, 5, ImmutableList.of(new brv(a)), bvm.aB);
   }

   private static void c(bnk<cel> $$0) {
      $$0.a(cgt.z, ImmutableList.of(Pair.of(0, new brw()), Pair.of(1, new bru(h))), ImmutableSet.of(Pair.of(bvm.ax, bvn.b), Pair.of(bvm.aD, bvn.b)));
   }

   private static void d(bnk<cel> $$0) {
      $$0.a(
         cgt.b,
         10,
         ImmutableList.of(
            bry.a(cel::ge), bsc.a(), new bpy(ImmutableMap.of(bvm.aA, bvn.b), ImmutableList.of(Pair.of(bpt.a(0.5F), 2), Pair.of(new bol(30, 60), 1)))
         )
      );
   }

   private static void e(bnk<cel> $$0) {
      $$0.a(cgt.w, 5, ImmutableList.of(bry.a(cel::ge), bou.a(bvm.ay, 2, 0.7F)), bvm.ay);
   }

   private static void f(bnk<cel> $$0) {
      $$0.a(cgt.v, 5, ImmutableList.of(bry.a(cel::ge), new bsa(i)), bvm.aA);
   }

   private static void g(bnk<cel> $$0) {
      $$0.a(cgt.x, 10, ImmutableList.of(new brx()), bvm.ax);
   }

   private static void a(cel $$0, bnk<cel> $$1) {
      $$1.a(
         cgt.k,
         10,
         ImmutableList.of(
            m, bqq.a($$1x -> !$$0.A().d() || !$$0.a($$1x), cem::b, false), bqa.a($$1x -> a($$0, $$1x), (float)$$0.b(bnq.g)), bqg.a(1.2F), new bsb(), bpi.a(18)
         ),
         bvm.o
      );
   }

   private static boolean a(cel $$0, bmk $$1) {
      return $$0.dO().c(bvm.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cel $$0, bmk $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bmk)$$0);
   }

   public static void a(bmk $$0) {
      if ($$0.dO().a(bvm.aD)) {
         $$0.dO().a(bvm.aD, avr.a, 1200L);
      }
   }

   public static void a(cel $$0, hx $$1) {
      if ($$0.dM().D_().a($$1) && !$$0.ge().isPresent() && !$$0.dO().c(bvm.o).isPresent()) {
         a((bmk)$$0);
         $$0.dO().a(bvm.aF, avr.a, 100L);
         $$0.dO().a(bvm.n, new boe($$1), 100L);
         $$0.dO().a(bvm.ay, $$1, 100L);
         $$0.dO().b(bvm.m);
      }
   }
}
