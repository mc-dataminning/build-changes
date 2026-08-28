import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cnx {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azm.f(100.0F);
   public static final int a = azm.f(133.59999F);
   public static final int b = azm.f(84.0F);
   private static final int i = azm.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cfs<? extends cfr<? super cnw>>> k = List.of(cfs.d, cfs.x);
   private static final List<cel<?>> l = List.of(
      cel.g,
      cel.h,
      cel.k,
      cel.l,
      cel.M,
      cel.n,
      cel.m,
      cel.E,
      cel.t,
      cel.o,
      cel.p,
      cel.B,
      cel.ay,
      cel.az,
      cel.aA,
      cel.aB,
      cel.aC,
      cel.aD,
      cel.aE,
      cel.aF,
      cel.aG,
      cel.aH,
      cel.aI,
      cel.aJ,
      cel.aK,
      cel.aL
   );
   private static final bxb<cnw> m = can.a(
      (Function<can.b<cnw>, ? extends App<can.c<cnw>, caq<cnw>>>)($$0 -> $$0.group($$0.a(cel.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bas.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cnw $$0) {
      $$0.eb().a(ImmutableList.of(cql.y, cql.z, cql.x, cql.k, cql.w, cql.v, cql.b));
   }

   protected static bwj<?> a(cnw $$0, Dynamic<?> $$1) {
      bwj.b<cnw> $$2 = bwj.a(l, k);
      bwj<cnw> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cql.a));
      $$3.b(cql.b);
      $$3.f();
      return $$3;
   }

   private static void a(bwj<cnw> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new bzu(0.8F), cay.a(), new byg(45, 90), new byk()));
   }

   private static void b(bwj<cnw> $$0) {
      $$0.a(cql.y, 5, ImmutableList.of(new cau(a)), cel.aC);
   }

   private static void c(bwj<cnw> $$0) {
      $$0.a(cql.z, ImmutableList.of(Pair.of(0, new cav()), Pair.of(1, new cat(h))), ImmutableSet.of(Pair.of(cel.ay, cem.b), Pair.of(cel.aE, cem.b)));
   }

   private static void d(bwj<cnw> $$0) {
      $$0.a(
         cql.b,
         10,
         ImmutableList.of(
            cax.a(cnw::gm), cbb.a(), new byx(ImmutableMap.of(cel.aB, cem.b), ImmutableList.of(Pair.of(bys.a(0.5F), 2), Pair.of(new bxk(30, 60), 1)))
         )
      );
   }

   private static void e(bwj<cnw> $$0) {
      $$0.a(cql.w, 5, ImmutableList.of(cax.a(cnw::gm), bxt.a(cel.az, 2, 0.7F)), cel.az);
   }

   private static void f(bwj<cnw> $$0) {
      $$0.a(cql.v, 5, ImmutableList.of(cax.a(cnw::gm), new caz(i)), cel.aB);
   }

   private static void g(bwj<cnw> $$0) {
      $$0.a(cql.x, 10, ImmutableList.of(new caw()), cel.ay);
   }

   private static void a(cnw $$0, bwj<cnw> $$1) {
      $$1.a(
         cql.k,
         10,
         ImmutableList.of(
            m,
            bzp.a(($$1x, $$2) -> !$$0.v().d() || !$$0.b($$2), cnx::a, false),
            byz.a($$1x -> a($$0, $$1x), (float)$$0.h(bwp.m)),
            bzf.a(1.2F),
            new cba(),
            byh.a(18)
         ),
         cel.o
      );
   }

   private static boolean a(cnw $$0, bvh $$1) {
      return $$0.eb().c(cel.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(arp $$0, cnw $$1, bvh $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bvh)$$1);
   }

   public static void a(bvh $$0) {
      if ($$0.eb().a(cel.aE)) {
         $$0.eb().a(cel.aE, bas.a, 1200L);
      }
   }

   public static void a(cnw $$0, jh $$1) {
      if ($$0.dV().E_().a($$1) && !$$0.gm().isPresent() && !$$0.eb().c(cel.o).isPresent()) {
         a((bvh)$$0);
         $$0.eb().a(cel.aG, bas.a, 100L);
         $$0.eb().a(cel.n, new bxd($$1), 100L);
         $$0.eb().a(cel.az, $$1, 100L);
         $$0.eb().b(cel.m);
      }
   }
}
