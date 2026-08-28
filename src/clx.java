import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class clx {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayu.f(100.0F);
   public static final int a = ayu.f(133.59999F);
   public static final int b = ayu.f(84.0F);
   private static final int i = ayu.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cdv<? extends cdu<? super clw>>> k = List.of(cdv.d, cdv.x);
   private static final List<cco<?>> l = List.of(
      cco.g,
      cco.h,
      cco.k,
      cco.l,
      cco.M,
      cco.n,
      cco.m,
      cco.E,
      cco.t,
      cco.o,
      cco.p,
      cco.B,
      cco.ay,
      cco.az,
      cco.aA,
      cco.aB,
      cco.aC,
      cco.aD,
      cco.aE,
      cco.aF,
      cco.aG,
      cco.aH,
      cco.aI,
      cco.aJ,
      cco.aK,
      cco.aL
   );
   private static final bve<clw> m = byq.a(
      (Function<byq.b<clw>, ? extends App<byq.c<clw>, byt<clw>>>)($$0 -> $$0.group($$0.a(cco.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azx.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(clw $$0) {
      $$0.dS().a(ImmutableList.of(coh.y, coh.z, coh.x, coh.k, coh.w, coh.v, coh.b));
   }

   protected static bum<?> a(clw $$0, Dynamic<?> $$1) {
      bum.b<clw> $$2 = bum.a(l, k);
      bum<clw> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(coh.a));
      $$3.b(coh.b);
      $$3.f();
      return $$3;
   }

   private static void a(bum<clw> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bxx(0.8F), bzb.a(), new bwj(45, 90), new bwn()));
   }

   private static void b(bum<clw> $$0) {
      $$0.a(coh.y, 5, ImmutableList.of(new byx(a)), cco.aC);
   }

   private static void c(bum<clw> $$0) {
      $$0.a(coh.z, ImmutableList.of(Pair.of(0, new byy()), Pair.of(1, new byw(h))), ImmutableSet.of(Pair.of(cco.ay, ccp.b), Pair.of(cco.aE, ccp.b)));
   }

   private static void d(bum<clw> $$0) {
      $$0.a(
         coh.b,
         10,
         ImmutableList.of(
            bza.a(clw::gq), bze.a(), new bxa(ImmutableMap.of(cco.aB, ccp.b), ImmutableList.of(Pair.of(bwv.a(0.5F), 2), Pair.of(new bvn(30, 60), 1)))
         )
      );
   }

   private static void e(bum<clw> $$0) {
      $$0.a(coh.w, 5, ImmutableList.of(bza.a(clw::gq), bvw.a(cco.az, 2, 0.7F)), cco.az);
   }

   private static void f(bum<clw> $$0) {
      $$0.a(coh.v, 5, ImmutableList.of(bza.a(clw::gq), new bzc(i)), cco.aB);
   }

   private static void g(bum<clw> $$0) {
      $$0.a(coh.x, 10, ImmutableList.of(new byz()), cco.ay);
   }

   private static void a(clw $$0, bum<clw> $$1) {
      $$1.a(
         coh.k,
         10,
         ImmutableList.of(
            m, bxs.a($$1x -> !$$0.y().d() || !$$0.b($$1x), clx::b, false), bxc.a($$1x -> a($$0, $$1x), (float)$$0.g(bus.k)), bxi.a(1.2F), new bzd(), bwk.a(18)
         ),
         cco.o
      );
   }

   private static boolean a(clw $$0, btk $$1) {
      return $$0.dS().c(cco.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(clw $$0, btk $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((btk)$$0);
   }

   public static void a(btk $$0) {
      if ($$0.dS().a(cco.aE)) {
         $$0.dS().a(cco.aE, azx.a, 1200L);
      }
   }

   public static void a(clw $$0, iz $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gq().isPresent() && !$$0.dS().c(cco.o).isPresent()) {
         a((btk)$$0);
         $$0.dS().a(cco.aG, azx.a, 100L);
         $$0.dS().a(cco.n, new bvg($$1), 100L);
         $$0.dS().a(cco.az, $$1, 100L);
         $$0.dS().b(cco.m);
      }
   }
}
