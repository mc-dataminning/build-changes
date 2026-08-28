import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class clp {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayg.f(100.0F);
   public static final int a = ayg.f(133.59999F);
   public static final int b = ayg.f(84.0F);
   private static final int i = ayg.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cdm<? extends cdl<? super clo>>> k = List.of(cdm.d, cdm.x);
   private static final List<ccf<?>> l = List.of(
      ccf.g,
      ccf.h,
      ccf.k,
      ccf.l,
      ccf.M,
      ccf.n,
      ccf.m,
      ccf.E,
      ccf.t,
      ccf.o,
      ccf.p,
      ccf.B,
      ccf.ay,
      ccf.az,
      ccf.aA,
      ccf.aB,
      ccf.aC,
      ccf.aD,
      ccf.aE,
      ccf.aF,
      ccf.aG,
      ccf.aH,
      ccf.aI,
      ccf.aJ,
      ccf.aK,
      ccf.aL
   );
   private static final buv<clo> m = byh.a(
      (Function<byh.b<clo>, ? extends App<byh.c<clo>, byk<clo>>>)($$0 -> $$0.group($$0.a(ccf.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azk.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(clo $$0) {
      $$0.dU().a(ImmutableList.of(cnz.y, cnz.z, cnz.x, cnz.k, cnz.w, cnz.v, cnz.b));
   }

   protected static bud<?> a(clo $$0, Dynamic<?> $$1) {
      bud.b<clo> $$2 = bud.a(l, k);
      bud<clo> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cnz.a));
      $$3.b(cnz.b);
      $$3.f();
      return $$3;
   }

   private static void a(bud<clo> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bxo(0.8F), bys.a(), new bwa(45, 90), new bwe()));
   }

   private static void b(bud<clo> $$0) {
      $$0.a(cnz.y, 5, ImmutableList.of(new byo(a)), ccf.aC);
   }

   private static void c(bud<clo> $$0) {
      $$0.a(cnz.z, ImmutableList.of(Pair.of(0, new byp()), Pair.of(1, new byn(h))), ImmutableSet.of(Pair.of(ccf.ay, ccg.b), Pair.of(ccf.aE, ccg.b)));
   }

   private static void d(bud<clo> $$0) {
      $$0.a(
         cnz.b,
         10,
         ImmutableList.of(
            byr.a(clo::go), byv.a(), new bwr(ImmutableMap.of(ccf.aB, ccg.b), ImmutableList.of(Pair.of(bwm.a(0.5F), 2), Pair.of(new bve(30, 60), 1)))
         )
      );
   }

   private static void e(bud<clo> $$0) {
      $$0.a(cnz.w, 5, ImmutableList.of(byr.a(clo::go), bvn.a(ccf.az, 2, 0.7F)), ccf.az);
   }

   private static void f(bud<clo> $$0) {
      $$0.a(cnz.v, 5, ImmutableList.of(byr.a(clo::go), new byt(i)), ccf.aB);
   }

   private static void g(bud<clo> $$0) {
      $$0.a(cnz.x, 10, ImmutableList.of(new byq()), ccf.ay);
   }

   private static void a(clo $$0, bud<clo> $$1) {
      $$1.a(
         cnz.k,
         10,
         ImmutableList.of(
            m, bxj.a($$1x -> !$$0.y().d() || !$$0.b($$1x), clp::b, false), bwt.a($$1x -> a($$0, $$1x), (float)$$0.g(buj.m)), bwz.a(1.2F), new byu(), bwb.a(18)
         ),
         ccf.o
      );
   }

   private static boolean a(clo $$0, btb $$1) {
      return $$0.dU().c(ccf.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(clo $$0, btb $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btb)$$0);
   }

   public static void a(btb $$0) {
      if ($$0.dU().a(ccf.aE)) {
         $$0.dU().a(ccf.aE, azk.a, 1200L);
      }
   }

   public static void a(clo $$0, ja $$1) {
      if ($$0.dQ().C_().a($$1) && !$$0.go().isPresent() && !$$0.dU().c(ccf.o).isPresent()) {
         a((btb)$$0);
         $$0.dU().a(ccf.aG, azk.a, 100L);
         $$0.dU().a(ccf.n, new bux($$1), 100L);
         $$0.dU().a(ccf.az, $$1, 100L);
         $$0.dU().b(ccf.m);
      }
   }
}
