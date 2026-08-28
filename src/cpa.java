import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cpa {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = bae.f(100.0F);
   public static final int a = bae.f(133.59999F);
   public static final int b = bae.f(84.0F);
   private static final int i = bae.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cgq<? extends cgp<? super coz>>> k = List.of(cgq.d, cgq.x);
   private static final List<cfj<?>> l = List.of(
      cfj.g,
      cfj.h,
      cfj.k,
      cfj.l,
      cfj.M,
      cfj.n,
      cfj.m,
      cfj.E,
      cfj.t,
      cfj.o,
      cfj.p,
      cfj.B,
      cfj.ay,
      cfj.az,
      cfj.aA,
      cfj.aB,
      cfj.aC,
      cfj.aD,
      cfj.aE,
      cfj.aF,
      cfj.aG,
      cfj.aH,
      cfj.aI,
      cfj.aJ,
      cfj.aK,
      cfj.aL
   );
   private static final bxz<coz> m = cbl.a(
      (Function<cbl.b<coz>, ? extends App<cbl.c<coz>, cbo<coz>>>)($$0 -> $$0.group($$0.a(cfj.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bbk.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(coz $$0) {
      $$0.eb().a(ImmutableList.of(crn.y, crn.z, crn.x, crn.k, crn.w, crn.v, crn.b));
   }

   protected static bxh<?> a(coz $$0, Dynamic<?> $$1) {
      bxh.b<coz> $$2 = bxh.a(l, k);
      bxh<coz> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(crn.a));
      $$3.b(crn.b);
      $$3.f();
      return $$3;
   }

   private static void a(bxh<coz> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas(0.8F), cbw.a(), new bze(45, 90), new bzi()));
   }

   private static void b(bxh<coz> $$0) {
      $$0.a(crn.y, 5, ImmutableList.of(new cbs(a)), cfj.aC);
   }

   private static void c(bxh<coz> $$0) {
      $$0.a(crn.z, ImmutableList.of(Pair.of(0, new cbt()), Pair.of(1, new cbr(h))), ImmutableSet.of(Pair.of(cfj.ay, cfk.b), Pair.of(cfj.aE, cfk.b)));
   }

   private static void d(bxh<coz> $$0) {
      $$0.a(
         crn.b,
         10,
         ImmutableList.of(
            cbv.a(coz::x), cbz.a(), new bzv(ImmutableMap.of(cfj.aB, cfk.b), ImmutableList.of(Pair.of(bzq.a(0.5F), 2), Pair.of(new byi(30, 60), 1)))
         )
      );
   }

   private static void e(bxh<coz> $$0) {
      $$0.a(crn.w, 5, ImmutableList.of(cbv.a(coz::x), byr.a(cfj.az, 2, 0.7F)), cfj.az);
   }

   private static void f(bxh<coz> $$0) {
      $$0.a(crn.v, 5, ImmutableList.of(cbv.a(coz::x), new cbx(i)), cfj.aB);
   }

   private static void g(bxh<coz> $$0) {
      $$0.a(crn.x, 10, ImmutableList.of(new cbu()), cfj.ay);
   }

   private static void a(coz $$0, bxh<coz> $$1) {
      $$1.a(
         crn.k,
         10,
         ImmutableList.of(
            m,
            can.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), cpa::a, false),
            bzx.a($$1x -> a($$0, $$1x), (float)$$0.h(bxn.m)),
            cad.a(1.2F),
            new cby(),
            bzf.a(18)
         ),
         cfj.o
      );
   }

   private static boolean a(coz $$0, bwf $$1) {
      return $$0.eb().c(cfj.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(ash $$0, coz $$1, bwf $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bwf)$$1);
   }

   public static void a(bwf $$0) {
      if ($$0.eb().a(cfj.aE)) {
         $$0.eb().a(cfj.aE, bbk.a, 1200L);
      }
   }

   public static void a(coz $$0, jh $$1) {
      if ($$0.dV().F_().a($$1) && !$$0.x().isPresent() && !$$0.eb().c(cfj.o).isPresent()) {
         a((bwf)$$0);
         $$0.eb().a(cfj.aG, bbk.a, 100L);
         $$0.eb().a(cfj.n, new byb($$1), 100L);
         $$0.eb().a(cfj.az, $$1, 100L);
         $$0.eb().b(cfj.m);
      }
   }
}
