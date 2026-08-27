import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class chz {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = aww.f(100.0F);
   public static final int a = aww.f(133.59999F);
   public static final int b = aww.f(84.0F);
   private static final int i = aww.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bzz<? extends bzy<? super chy>>> k = List.of(bzz.d, bzz.x);
   private static final List<bys<?>> l = List.of(
      bys.g,
      bys.h,
      bys.k,
      bys.l,
      bys.M,
      bys.n,
      bys.m,
      bys.E,
      bys.t,
      bys.o,
      bys.p,
      bys.B,
      bys.ay,
      bys.az,
      bys.aA,
      bys.aB,
      bys.aC,
      bys.aD,
      bys.aE,
      bys.aF,
      bys.aG,
      bys.aH,
      bys.aI,
      bys.aJ,
      bys.aK,
      bys.aL
   );
   private static final bri<chy> m = buu.a(
      (Function<buu.b<chy>, ? extends App<buu.c<chy>, bux<chy>>>)($$0 -> $$0.group($$0.a(bys.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(axy.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(chy $$0) {
      $$0.dP().a(ImmutableList.of(ckj.y, ckj.z, ckj.x, ckj.k, ckj.w, ckj.v, ckj.b));
   }

   protected static bqq<?> a(chy $$0, Dynamic<?> $$1) {
      bqq.b<chy> $$2 = bqq.a(l, k);
      bqq<chy> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ckj.a));
      $$3.b(ckj.b);
      $$3.f();
      return $$3;
   }

   private static void a(bqq<chy> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bub(0.8F), bvf.a(), new bsn(45, 90), new bsr()));
   }

   private static void b(bqq<chy> $$0) {
      $$0.a(ckj.y, 5, ImmutableList.of(new bvb(a)), bys.aC);
   }

   private static void c(bqq<chy> $$0) {
      $$0.a(ckj.z, ImmutableList.of(Pair.of(0, new bvc()), Pair.of(1, new bva(h))), ImmutableSet.of(Pair.of(bys.ay, byt.b), Pair.of(bys.aE, byt.b)));
   }

   private static void d(bqq<chy> $$0) {
      $$0.a(
         ckj.b,
         10,
         ImmutableList.of(
            bve.a(chy::gn), bvi.a(), new bte(ImmutableMap.of(bys.aB, byt.b), ImmutableList.of(Pair.of(bsz.a(0.5F), 2), Pair.of(new brr(30, 60), 1)))
         )
      );
   }

   private static void e(bqq<chy> $$0) {
      $$0.a(ckj.w, 5, ImmutableList.of(bve.a(chy::gn), bsa.a(bys.az, 2, 0.7F)), bys.az);
   }

   private static void f(bqq<chy> $$0) {
      $$0.a(ckj.v, 5, ImmutableList.of(bve.a(chy::gn), new bvg(i)), bys.aB);
   }

   private static void g(bqq<chy> $$0) {
      $$0.a(ckj.x, 10, ImmutableList.of(new bvd()), bys.ay);
   }

   private static void a(chy $$0, bqq<chy> $$1) {
      $$1.a(
         ckj.k,
         10,
         ImmutableList.of(
            m, btw.a($$1x -> !$$0.y().d() || !$$0.b($$1x), chz::b, false), btg.a($$1x -> a($$0, $$1x), (float)$$0.g(bqw.k)), btm.a(1.2F), new bvh(), bso.a(18)
         ),
         bys.o
      );
   }

   private static boolean a(chy $$0, bpp $$1) {
      return $$0.dP().c(bys.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(chy $$0, bpp $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bpp)$$0);
   }

   public static void a(bpp $$0) {
      if ($$0.dP().a(bys.aE)) {
         $$0.dP().a(bys.aE, axy.a, 1200L);
      }
   }

   public static void a(chy $$0, ib $$1) {
      if ($$0.dM().C_().a($$1) && !$$0.gn().isPresent() && !$$0.dP().c(bys.o).isPresent()) {
         a((bpp)$$0);
         $$0.dP().a(bys.aG, axy.a, 100L);
         $$0.dP().a(bys.n, new brk($$1), 100L);
         $$0.dP().a(bys.az, $$1, 100L);
         $$0.dP().b(bys.m);
      }
   }
}
