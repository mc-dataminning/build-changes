import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cow {
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
   private static final List<cgm<? extends cgl<? super cov>>> k = List.of(cgm.d, cgm.x);
   private static final List<cff<?>> l = List.of(
      cff.g,
      cff.h,
      cff.k,
      cff.l,
      cff.M,
      cff.n,
      cff.m,
      cff.E,
      cff.t,
      cff.o,
      cff.p,
      cff.B,
      cff.ay,
      cff.az,
      cff.aA,
      cff.aB,
      cff.aC,
      cff.aD,
      cff.aE,
      cff.aF,
      cff.aG,
      cff.aH,
      cff.aI,
      cff.aJ,
      cff.aK,
      cff.aL
   );
   private static final bxv<cov> m = cbh.a(
      (Function<cbh.b<cov>, ? extends App<cbh.c<cov>, cbk<cov>>>)($$0 -> $$0.group($$0.a(cff.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bbk.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cov $$0) {
      $$0.eb().a(ImmutableList.of(crj.y, crj.z, crj.x, crj.k, crj.w, crj.v, crj.b));
   }

   protected static bxd<?> a(cov $$0, Dynamic<?> $$1) {
      bxd.b<cov> $$2 = bxd.a(l, k);
      bxd<cov> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(crj.a));
      $$3.b(crj.b);
      $$3.f();
      return $$3;
   }

   private static void a(bxd<cov> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao(0.8F), cbs.a(), new bza(45, 90), new bze()));
   }

   private static void b(bxd<cov> $$0) {
      $$0.a(crj.y, 5, ImmutableList.of(new cbo(a)), cff.aC);
   }

   private static void c(bxd<cov> $$0) {
      $$0.a(crj.z, ImmutableList.of(Pair.of(0, new cbp()), Pair.of(1, new cbn(h))), ImmutableSet.of(Pair.of(cff.ay, cfg.b), Pair.of(cff.aE, cfg.b)));
   }

   private static void d(bxd<cov> $$0) {
      $$0.a(
         crj.b,
         10,
         ImmutableList.of(
            cbr.a(cov::x), cbv.a(), new bzr(ImmutableMap.of(cff.aB, cfg.b), ImmutableList.of(Pair.of(bzm.a(0.5F), 2), Pair.of(new bye(30, 60), 1)))
         )
      );
   }

   private static void e(bxd<cov> $$0) {
      $$0.a(crj.w, 5, ImmutableList.of(cbr.a(cov::x), byn.a(cff.az, 2, 0.7F)), cff.az);
   }

   private static void f(bxd<cov> $$0) {
      $$0.a(crj.v, 5, ImmutableList.of(cbr.a(cov::x), new cbt(i)), cff.aB);
   }

   private static void g(bxd<cov> $$0) {
      $$0.a(crj.x, 10, ImmutableList.of(new cbq()), cff.ay);
   }

   private static void a(cov $$0, bxd<cov> $$1) {
      $$1.a(
         crj.k,
         10,
         ImmutableList.of(
            m,
            caj.a(($$1x, $$2) -> !$$0.t().d() || !$$0.b($$2), cow::a, false),
            bzt.a($$1x -> a($$0, $$1x), (float)$$0.h(bxj.m)),
            bzz.a(1.2F),
            new cbu(),
            bzb.a(18)
         ),
         cff.o
      );
   }

   private static boolean a(cov $$0, bwb $$1) {
      return $$0.eb().c(cff.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(ash $$0, cov $$1, bwb $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((bwb)$$1);
   }

   public static void a(bwb $$0) {
      if ($$0.eb().a(cff.aE)) {
         $$0.eb().a(cff.aE, bbk.a, 1200L);
      }
   }

   public static void a(cov $$0, jh $$1) {
      if ($$0.dV().F_().a($$1) && !$$0.x().isPresent() && !$$0.eb().c(cff.o).isPresent()) {
         a((bwb)$$0);
         $$0.eb().a(cff.aG, bbk.a, 100L);
         $$0.eb().a(cff.n, new bxx($$1), 100L);
         $$0.eb().a(cff.az, $$1, 100L);
         $$0.eb().b(cff.m);
      }
   }
}
