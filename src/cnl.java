import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cnl {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azj.f(100.0F);
   public static final int a = azj.f(133.59999F);
   public static final int b = azj.f(84.0F);
   private static final int i = azj.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cfg<? extends cff<? super cnk>>> k = List.of(cfg.d, cfg.x);
   private static final List<cdz<?>> l = List.of(
      cdz.g,
      cdz.h,
      cdz.k,
      cdz.l,
      cdz.M,
      cdz.n,
      cdz.m,
      cdz.E,
      cdz.t,
      cdz.o,
      cdz.p,
      cdz.B,
      cdz.ay,
      cdz.az,
      cdz.aA,
      cdz.aB,
      cdz.aC,
      cdz.aD,
      cdz.aE,
      cdz.aF,
      cdz.aG,
      cdz.aH,
      cdz.aI,
      cdz.aJ,
      cdz.aK,
      cdz.aL
   );
   private static final bwp<cnk> m = cab.a(
      (Function<cab.b<cnk>, ? extends App<cab.c<cnk>, cae<cnk>>>)($$0 -> $$0.group($$0.a(cdz.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bao.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cnk $$0) {
      $$0.ed().a(ImmutableList.of(cpz.y, cpz.z, cpz.x, cpz.k, cpz.w, cpz.v, cpz.b));
   }

   protected static bvx<?> a(cnk $$0, Dynamic<?> $$1) {
      bvx.b<cnk> $$2 = bvx.a(l, k);
      bvx<cnk> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cpz.a));
      $$3.b(cpz.b);
      $$3.f();
      return $$3;
   }

   private static void a(bvx<cnk> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bzi(0.8F), cam.a(), new bxu(45, 90), new bxy()));
   }

   private static void b(bvx<cnk> $$0) {
      $$0.a(cpz.y, 5, ImmutableList.of(new cai(a)), cdz.aC);
   }

   private static void c(bvx<cnk> $$0) {
      $$0.a(cpz.z, ImmutableList.of(Pair.of(0, new caj()), Pair.of(1, new cah(h))), ImmutableSet.of(Pair.of(cdz.ay, cea.b), Pair.of(cdz.aE, cea.b)));
   }

   private static void d(bvx<cnk> $$0) {
      $$0.a(
         cpz.b,
         10,
         ImmutableList.of(
            cal.a(cnk::gv), cap.a(), new byl(ImmutableMap.of(cdz.aB, cea.b), ImmutableList.of(Pair.of(byg.a(0.5F), 2), Pair.of(new bwy(30, 60), 1)))
         )
      );
   }

   private static void e(bvx<cnk> $$0) {
      $$0.a(cpz.w, 5, ImmutableList.of(cal.a(cnk::gv), bxh.a(cdz.az, 2, 0.7F)), cdz.az);
   }

   private static void f(bvx<cnk> $$0) {
      $$0.a(cpz.v, 5, ImmutableList.of(cal.a(cnk::gv), new can(i)), cdz.aB);
   }

   private static void g(bvx<cnk> $$0) {
      $$0.a(cpz.x, 10, ImmutableList.of(new cak()), cdz.ay);
   }

   private static void a(cnk $$0, bvx<cnk> $$1) {
      $$1.a(
         cpz.k,
         10,
         ImmutableList.of(
            m, bzd.a($$1x -> !$$0.y().d() || !$$0.c($$1x), cnl::b, false), byn.a($$1x -> a($$0, $$1x), (float)$$0.h(bwd.m)), byt.a(1.2F), new cao(), bxv.a(18)
         ),
         cdz.o
      );
   }

   private static boolean a(cnk $$0, buv $$1) {
      return $$0.ed().c(cdz.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cnk $$0, buv $$1) {
      if (!$$0.c($$1)) {
         $$0.d($$1);
      }

      a((buv)$$0);
   }

   public static void a(buv $$0) {
      if ($$0.ed().a(cdz.aE)) {
         $$0.ed().a(cdz.aE, bao.a, 1200L);
      }
   }

   public static void a(cnk $$0, jg $$1) {
      if ($$0.dX().C_().a($$1) && !$$0.gv().isPresent() && !$$0.ed().c(cdz.o).isPresent()) {
         a((buv)$$0);
         $$0.ed().a(cdz.aG, bao.a, 100L);
         $$0.ed().a(cdz.n, new bwr($$1), 100L);
         $$0.ed().a(cdz.az, $$1, 100L);
         $$0.ed().b(cdz.m);
      }
   }
}
