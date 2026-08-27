import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class clb {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ayd.f(100.0F);
   public static final int a = ayd.f(133.59999F);
   public static final int b = ayd.f(84.0F);
   private static final int i = ayd.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<ccz<? extends ccy<? super cla>>> k = List.of(ccz.d, ccz.x);
   private static final List<cbs<?>> l = List.of(
      cbs.g,
      cbs.h,
      cbs.k,
      cbs.l,
      cbs.M,
      cbs.n,
      cbs.m,
      cbs.E,
      cbs.t,
      cbs.o,
      cbs.p,
      cbs.B,
      cbs.ay,
      cbs.az,
      cbs.aA,
      cbs.aB,
      cbs.aC,
      cbs.aD,
      cbs.aE,
      cbs.aF,
      cbs.aG,
      cbs.aH,
      cbs.aI,
      cbs.aJ,
      cbs.aK,
      cbs.aL
   );
   private static final bui<cla> m = bxu.a(
      (Function<bxu.b<cla>, ? extends App<bxu.c<cla>, bxx<cla>>>)($$0 -> $$0.group($$0.a(cbs.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azf.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cla $$0) {
      $$0.dS().a(ImmutableList.of(cnl.y, cnl.z, cnl.x, cnl.k, cnl.w, cnl.v, cnl.b));
   }

   protected static btq<?> a(cla $$0, Dynamic<?> $$1) {
      btq.b<cla> $$2 = btq.a(l, k);
      btq<cla> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cnl.a));
      $$3.b(cnl.b);
      $$3.f();
      return $$3;
   }

   private static void a(btq<cla> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bxb(0.8F), byf.a(), new bvn(45, 90), new bvr()));
   }

   private static void b(btq<cla> $$0) {
      $$0.a(cnl.y, 5, ImmutableList.of(new byb(a)), cbs.aC);
   }

   private static void c(btq<cla> $$0) {
      $$0.a(cnl.z, ImmutableList.of(Pair.of(0, new byc()), Pair.of(1, new bya(h))), ImmutableSet.of(Pair.of(cbs.ay, cbt.b), Pair.of(cbs.aE, cbt.b)));
   }

   private static void d(btq<cla> $$0) {
      $$0.a(
         cnl.b,
         10,
         ImmutableList.of(
            bye.a(cla::gp), byi.a(), new bwe(ImmutableMap.of(cbs.aB, cbt.b), ImmutableList.of(Pair.of(bvz.a(0.5F), 2), Pair.of(new bur(30, 60), 1)))
         )
      );
   }

   private static void e(btq<cla> $$0) {
      $$0.a(cnl.w, 5, ImmutableList.of(bye.a(cla::gp), bva.a(cbs.az, 2, 0.7F)), cbs.az);
   }

   private static void f(btq<cla> $$0) {
      $$0.a(cnl.v, 5, ImmutableList.of(bye.a(cla::gp), new byg(i)), cbs.aB);
   }

   private static void g(btq<cla> $$0) {
      $$0.a(cnl.x, 10, ImmutableList.of(new byd()), cbs.ay);
   }

   private static void a(cla $$0, btq<cla> $$1) {
      $$1.a(
         cnl.k,
         10,
         ImmutableList.of(
            m, bww.a($$1x -> !$$0.y().d() || !$$0.b($$1x), clb::b, false), bwg.a($$1x -> a($$0, $$1x), (float)$$0.g(btw.k)), bwm.a(1.2F), new byh(), bvo.a(18)
         ),
         cbs.o
      );
   }

   private static boolean a(cla $$0, bso $$1) {
      return $$0.dS().c(cbs.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cla $$0, bso $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bso)$$0);
   }

   public static void a(bso $$0) {
      if ($$0.dS().a(cbs.aE)) {
         $$0.dS().a(cbs.aE, azf.a, 1200L);
      }
   }

   public static void a(cla $$0, io $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gp().isPresent() && !$$0.dS().c(cbs.o).isPresent()) {
         a((bso)$$0);
         $$0.dS().a(cbs.aG, azf.a, 100L);
         $$0.dS().a(cbs.n, new buk($$1), 100L);
         $$0.dS().a(cbs.az, $$1, 100L);
         $$0.dS().b(cbs.m);
      }
   }
}
