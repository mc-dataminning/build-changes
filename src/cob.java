import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cob {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayz.f(100.0F);
   public static final int a = ayz.f(133.59999F);
   public static final int b = ayz.f(84.0F);
   private static final int i = ayz.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cft<? extends cfs<? super coa>>> k = List.of(cft.d, cft.x);
   private static final List<cem<?>> l = List.of(
      cem.g,
      cem.h,
      cem.k,
      cem.l,
      cem.M,
      cem.n,
      cem.m,
      cem.E,
      cem.t,
      cem.o,
      cem.p,
      cem.B,
      cem.ay,
      cem.az,
      cem.aA,
      cem.aB,
      cem.aC,
      cem.aD,
      cem.aE,
      cem.aF,
      cem.aG,
      cem.aH,
      cem.aI,
      cem.aJ,
      cem.aK,
      cem.aL
   );
   private static final bxc<coa> m = cao.a(
      (Function<cao.b<coa>, ? extends App<cao.c<coa>, car<coa>>>)($$0 -> $$0.group($$0.a(cem.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(baf.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(coa $$0) {
      $$0.eb().a(ImmutableList.of(cqp.y, cqp.z, cqp.x, cqp.k, cqp.w, cqp.v, cqp.b));
   }

   protected static bwk<?> a(coa $$0, Dynamic<?> $$1) {
      bwk.b<coa> $$2 = bwk.a(l, k);
      bwk<coa> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cqp.a));
      $$3.b(cqp.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwk<coa> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv(0.8F), caz.a(), new byh(45, 90), new byl()));
   }

   private static void b(bwk<coa> $$0) {
      $$0.a(cqp.y, 5, ImmutableList.of(new cav(a)), cem.aC);
   }

   private static void c(bwk<coa> $$0) {
      $$0.a(cqp.z, ImmutableList.of(Pair.of(0, new caw()), Pair.of(1, new cau(h))), ImmutableSet.of(Pair.of(cem.ay, cen.b), Pair.of(cem.aE, cen.b)));
   }

   private static void d(bwk<coa> $$0) {
      $$0.a(
         cqp.b,
         10,
         ImmutableList.of(
            cay.a(coa::x), cbc.a(), new byy(ImmutableMap.of(cem.aB, cen.b), ImmutableList.of(Pair.of(byt.a(0.5F), 2), Pair.of(new bxl(30, 60), 1)))
         )
      );
   }

   private static void e(bwk<coa> $$0) {
      $$0.a(cqp.w, 5, ImmutableList.of(cay.a(coa::x), bxu.a(cem.az, 2, 0.7F)), cem.az);
   }

   private static void f(bwk<coa> $$0) {
      $$0.a(cqp.v, 5, ImmutableList.of(cay.a(coa::x), new cba(i)), cem.aB);
   }

   private static void g(bwk<coa> $$0) {
      $$0.a(cqp.x, 10, ImmutableList.of(new cax()), cem.ay);
   }

   private static void a(coa $$0, bwk<coa> $$1) {
      $$1.a(
         cqp.k,
         10,
         ImmutableList.of(
            m,
            bzq.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), cob::a, false),
            bza.a($$1x -> a($$0, $$1x), (float)$$0.h(bwq.m)),
            bzg.a(1.2F),
            new cbb(),
            byi.a(18)
         ),
         cem.o
      );
   }

   private static boolean a(coa $$0, bvi $$1) {
      return $$0.eb().c(cem.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(ard $$0, coa $$1, bvi $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bvi)$$1);
   }

   public static void a(bvi $$0) {
      if ($$0.eb().a(cem.aE)) {
         $$0.eb().a(cem.aE, baf.a, 1200L);
      }
   }

   public static void a(coa $$0, ji $$1) {
      if ($$0.dV().F_().a($$1) && !$$0.x().isPresent() && !$$0.eb().c(cem.o).isPresent()) {
         a((bvi)$$0);
         $$0.eb().a(cem.aG, baf.a, 100L);
         $$0.eb().a(cem.n, new bxe($$1), 100L);
         $$0.eb().a(cem.az, $$1, 100L);
         $$0.eb().b(cem.m);
      }
   }
}
