import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class crd {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azq.f(100.0F);
   public static final int a = azq.f(133.59999F);
   public static final int b = azq.f(84.0F);
   private static final int i = azq.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cif<? extends cie<? super crc>>> k = List.of(cif.d, cif.x);
   private static final List<cgy<?>> l = List.of(
      cgy.g,
      cgy.h,
      cgy.k,
      cgy.l,
      cgy.N,
      cgy.o,
      cgy.n,
      cgy.F,
      cgy.u,
      cgy.p,
      cgy.q,
      cgy.C,
      cgy.az,
      cgy.aA,
      cgy.aB,
      cgy.aC,
      cgy.aD,
      cgy.aE,
      cgy.aF,
      cgy.aG,
      cgy.aH,
      cgy.aI,
      cgy.aJ,
      cgy.aK,
      cgy.aL,
      cgy.aM
   );
   private static final bzo<crc> m = cda.a(
      (Function<cda.b<crc>, ? extends App<cda.c<crc>, cdd<crc>>>)($$0 -> $$0.group($$0.a(cgy.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bay.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(crc $$0) {
      $$0.ec().a(ImmutableList.of(ctt.y, ctt.z, ctt.x, ctt.k, ctt.w, ctt.v, ctt.b));
   }

   protected static byw<?> a(crc $$0, Dynamic<?> $$1) {
      byw.b<crc> $$2 = byw.a(l, k);
      byw<crc> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ctt.a));
      $$3.b(ctt.b);
      $$3.f();
      return $$3;
   }

   private static void a(byw<crc> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch(0.8F), cdl.a(), new cat(45, 90), new cax()));
   }

   private static void b(byw<crc> $$0) {
      $$0.a(ctt.y, 5, ImmutableList.of(new cdh(a)), cgy.aD);
   }

   private static void c(byw<crc> $$0) {
      $$0.a(ctt.z, ImmutableList.of(Pair.of(0, new cdi()), Pair.of(1, new cdg(h))), ImmutableSet.of(Pair.of(cgy.az, cgz.b), Pair.of(cgy.aF, cgz.b)));
   }

   private static void d(byw<crc> $$0) {
      $$0.a(
         ctt.b,
         10,
         ImmutableList.of(
            cdk.a(crc::q), cdo.a(), new cbk(ImmutableMap.of(cgy.aC, cgz.b), ImmutableList.of(Pair.of(cbf.a(0.5F), 2), Pair.of(new bzx(30, 60), 1)))
         )
      );
   }

   private static void e(byw<crc> $$0) {
      $$0.a(ctt.w, 5, ImmutableList.of(cdk.a(crc::q), cag.a(cgy.aA, 2, 0.7F)), cgy.aA);
   }

   private static void f(byw<crc> $$0) {
      $$0.a(ctt.v, 5, ImmutableList.of(cdk.a(crc::q), new cdm(i)), cgy.aC);
   }

   private static void g(byw<crc> $$0) {
      $$0.a(ctt.x, 10, ImmutableList.of(new cdj()), cgy.az);
   }

   private static void a(crc $$0, byw<crc> $$1) {
      $$1.a(
         ctt.k,
         10,
         ImmutableList.of(
            m,
            ccc.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), crd::a, false),
            cbm.a($$1x -> a($$0, $$1x), (float)$$0.h(bzc.m)),
            cbs.a(1.2F),
            new cdn(),
            cau.a(18)
         ),
         cgy.p
      );
   }

   private static boolean a(crc $$0, bxw $$1) {
      return $$0.ec().c(cgy.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(aru $$0, crc $$1, bxw $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bxw)$$1);
   }

   public static void a(bxw $$0) {
      if ($$0.ec().a(cgy.aF)) {
         $$0.ec().a(cgy.aF, bay.a, 1200L);
      }
   }

   public static void a(crc $$0, iw $$1) {
      if ($$0.dV().E_().a($$1) && !$$0.q().isPresent() && !$$0.ec().c(cgy.p).isPresent()) {
         a((bxw)$$0);
         $$0.ec().a(cgy.aH, bay.a, 100L);
         $$0.ec().a(cgy.o, new bzq($$1), 100L);
         $$0.ec().a(cgy.aA, $$1, 100L);
         $$0.ec().b(cgy.n);
      }
   }
}
