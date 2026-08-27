import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class chx {
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
   private static final List<bzy<? extends bzx<? super chw>>> k = List.of(bzy.d, bzy.x);
   private static final List<byr<?>> l = List.of(
      byr.g,
      byr.h,
      byr.k,
      byr.l,
      byr.M,
      byr.n,
      byr.m,
      byr.E,
      byr.t,
      byr.o,
      byr.p,
      byr.B,
      byr.ay,
      byr.az,
      byr.aA,
      byr.aB,
      byr.aC,
      byr.aD,
      byr.aE,
      byr.aF,
      byr.aG,
      byr.aH,
      byr.aI,
      byr.aJ,
      byr.aK,
      byr.aL
   );
   private static final brh<chw> m = but.a(
      (Function<but.b<chw>, ? extends App<but.c<chw>, buw<chw>>>)($$0 -> $$0.group($$0.a(byr.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(axy.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(chw $$0) {
      $$0.dP().a(ImmutableList.of(ckh.y, ckh.z, ckh.x, ckh.k, ckh.w, ckh.v, ckh.b));
   }

   protected static bqp<?> a(chw $$0, Dynamic<?> $$1) {
      bqp.b<chw> $$2 = bqp.a(l, k);
      bqp<chw> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ckh.a));
      $$3.b(ckh.b);
      $$3.f();
      return $$3;
   }

   private static void a(bqp<chw> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bua(0.8F), bve.a(), new bsm(45, 90), new bsq()));
   }

   private static void b(bqp<chw> $$0) {
      $$0.a(ckh.y, 5, ImmutableList.of(new bva(a)), byr.aC);
   }

   private static void c(bqp<chw> $$0) {
      $$0.a(ckh.z, ImmutableList.of(Pair.of(0, new bvb()), Pair.of(1, new buz(h))), ImmutableSet.of(Pair.of(byr.ay, bys.b), Pair.of(byr.aE, bys.b)));
   }

   private static void d(bqp<chw> $$0) {
      $$0.a(
         ckh.b,
         10,
         ImmutableList.of(
            bvd.a(chw::gn), bvh.a(), new btd(ImmutableMap.of(byr.aB, bys.b), ImmutableList.of(Pair.of(bsy.a(0.5F), 2), Pair.of(new brq(30, 60), 1)))
         )
      );
   }

   private static void e(bqp<chw> $$0) {
      $$0.a(ckh.w, 5, ImmutableList.of(bvd.a(chw::gn), brz.a(byr.az, 2, 0.7F)), byr.az);
   }

   private static void f(bqp<chw> $$0) {
      $$0.a(ckh.v, 5, ImmutableList.of(bvd.a(chw::gn), new bvf(i)), byr.aB);
   }

   private static void g(bqp<chw> $$0) {
      $$0.a(ckh.x, 10, ImmutableList.of(new bvc()), byr.ay);
   }

   private static void a(chw $$0, bqp<chw> $$1) {
      $$1.a(
         ckh.k,
         10,
         ImmutableList.of(
            m, btv.a($$1x -> !$$0.y().d() || !$$0.b($$1x), chx::b, false), btf.a($$1x -> a($$0, $$1x), (float)$$0.g(bqv.k)), btl.a(1.2F), new bvg(), bsn.a(18)
         ),
         byr.o
      );
   }

   private static boolean a(chw $$0, bpo $$1) {
      return $$0.dP().c(byr.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(chw $$0, bpo $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bpo)$$0);
   }

   public static void a(bpo $$0) {
      if ($$0.dP().a(byr.aE)) {
         $$0.dP().a(byr.aE, axy.a, 1200L);
      }
   }

   public static void a(chw $$0, ib $$1) {
      if ($$0.dM().C_().a($$1) && !$$0.gn().isPresent() && !$$0.dP().c(byr.o).isPresent()) {
         a((bpo)$$0);
         $$0.dP().a(byr.aG, axy.a, 100L);
         $$0.dP().a(byr.n, new brj($$1), 100L);
         $$0.dP().a(byr.az, $$1, 100L);
         $$0.dP().b(byr.m);
      }
   }
}
