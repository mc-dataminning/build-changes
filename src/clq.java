import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class clq {
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
   private static final List<cdn<? extends cdm<? super clp>>> k = List.of(cdn.d, cdn.x);
   private static final List<ccg<?>> l = List.of(
      ccg.g,
      ccg.h,
      ccg.k,
      ccg.l,
      ccg.M,
      ccg.n,
      ccg.m,
      ccg.E,
      ccg.t,
      ccg.o,
      ccg.p,
      ccg.B,
      ccg.ay,
      ccg.az,
      ccg.aA,
      ccg.aB,
      ccg.aC,
      ccg.aD,
      ccg.aE,
      ccg.aF,
      ccg.aG,
      ccg.aH,
      ccg.aI,
      ccg.aJ,
      ccg.aK,
      ccg.aL
   );
   private static final buw<clp> m = byi.a(
      (Function<byi.b<clp>, ? extends App<byi.c<clp>, byl<clp>>>)($$0 -> $$0.group($$0.a(ccg.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azk.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(clp $$0) {
      $$0.dV().a(ImmutableList.of(coa.y, coa.z, coa.x, coa.k, coa.w, coa.v, coa.b));
   }

   protected static bue<?> a(clp $$0, Dynamic<?> $$1) {
      bue.b<clp> $$2 = bue.a(l, k);
      bue<clp> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(coa.a));
      $$3.b(coa.b);
      $$3.f();
      return $$3;
   }

   private static void a(bue<clp> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bxp(0.8F), byt.a(), new bwb(45, 90), new bwf()));
   }

   private static void b(bue<clp> $$0) {
      $$0.a(coa.y, 5, ImmutableList.of(new byp(a)), ccg.aC);
   }

   private static void c(bue<clp> $$0) {
      $$0.a(coa.z, ImmutableList.of(Pair.of(0, new byq()), Pair.of(1, new byo(h))), ImmutableSet.of(Pair.of(ccg.ay, cch.b), Pair.of(ccg.aE, cch.b)));
   }

   private static void d(bue<clp> $$0) {
      $$0.a(
         coa.b,
         10,
         ImmutableList.of(
            bys.a(clp::gn), byw.a(), new bws(ImmutableMap.of(ccg.aB, cch.b), ImmutableList.of(Pair.of(bwn.a(0.5F), 2), Pair.of(new bvf(30, 60), 1)))
         )
      );
   }

   private static void e(bue<clp> $$0) {
      $$0.a(coa.w, 5, ImmutableList.of(bys.a(clp::gn), bvo.a(ccg.az, 2, 0.7F)), ccg.az);
   }

   private static void f(bue<clp> $$0) {
      $$0.a(coa.v, 5, ImmutableList.of(bys.a(clp::gn), new byu(i)), ccg.aB);
   }

   private static void g(bue<clp> $$0) {
      $$0.a(coa.x, 10, ImmutableList.of(new byr()), ccg.ay);
   }

   private static void a(clp $$0, bue<clp> $$1) {
      $$1.a(
         coa.k,
         10,
         ImmutableList.of(
            m, bxk.a($$1x -> !$$0.x().d() || !$$0.b($$1x), clq::b, false), bwu.a($$1x -> a($$0, $$1x), (float)$$0.g(buk.m)), bxa.a(1.2F), new byv(), bwc.a(18)
         ),
         ccg.o
      );
   }

   private static boolean a(clp $$0, btc $$1) {
      return $$0.dV().c(ccg.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(clp $$0, btc $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btc)$$0);
   }

   public static void a(btc $$0) {
      if ($$0.dV().a(ccg.aE)) {
         $$0.dV().a(ccg.aE, azk.a, 1200L);
      }
   }

   public static void a(clp $$0, ja $$1) {
      if ($$0.dR().C_().a($$1) && !$$0.gn().isPresent() && !$$0.dV().c(ccg.o).isPresent()) {
         a((btc)$$0);
         $$0.dV().a(ccg.aG, azk.a, 100L);
         $$0.dV().a(ccg.n, new buy($$1), 100L);
         $$0.dV().a(ccg.az, $$1, 100L);
         $$0.dV().b(ccg.m);
      }
   }
}
