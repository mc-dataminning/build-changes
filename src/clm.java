import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class clm {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = aye.f(100.0F);
   public static final int a = aye.f(133.59999F);
   public static final int b = aye.f(84.0F);
   private static final int i = aye.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cdj<? extends cdi<? super cll>>> k = List.of(cdj.d, cdj.x);
   private static final List<ccc<?>> l = List.of(
      ccc.g,
      ccc.h,
      ccc.k,
      ccc.l,
      ccc.M,
      ccc.n,
      ccc.m,
      ccc.E,
      ccc.t,
      ccc.o,
      ccc.p,
      ccc.B,
      ccc.ay,
      ccc.az,
      ccc.aA,
      ccc.aB,
      ccc.aC,
      ccc.aD,
      ccc.aE,
      ccc.aF,
      ccc.aG,
      ccc.aH,
      ccc.aI,
      ccc.aJ,
      ccc.aK,
      ccc.aL
   );
   private static final bus<cll> m = bye.a(
      (Function<bye.b<cll>, ? extends App<bye.c<cll>, byh<cll>>>)($$0 -> $$0.group($$0.a(ccc.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(azh.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cll $$0) {
      $$0.dT().a(ImmutableList.of(cnw.y, cnw.z, cnw.x, cnw.k, cnw.w, cnw.v, cnw.b));
   }

   protected static bua<?> a(cll $$0, Dynamic<?> $$1) {
      bua.b<cll> $$2 = bua.a(l, k);
      bua<cll> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cnw.a));
      $$3.b(cnw.b);
      $$3.f();
      return $$3;
   }

   private static void a(bua<cll> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bxl(0.8F), byp.a(), new bvx(45, 90), new bwb()));
   }

   private static void b(bua<cll> $$0) {
      $$0.a(cnw.y, 5, ImmutableList.of(new byl(a)), ccc.aC);
   }

   private static void c(bua<cll> $$0) {
      $$0.a(cnw.z, ImmutableList.of(Pair.of(0, new bym()), Pair.of(1, new byk(h))), ImmutableSet.of(Pair.of(ccc.ay, ccd.b), Pair.of(ccc.aE, ccd.b)));
   }

   private static void d(bua<cll> $$0) {
      $$0.a(
         cnw.b,
         10,
         ImmutableList.of(
            byo.a(cll::gn), bys.a(), new bwo(ImmutableMap.of(ccc.aB, ccd.b), ImmutableList.of(Pair.of(bwj.a(0.5F), 2), Pair.of(new bvb(30, 60), 1)))
         )
      );
   }

   private static void e(bua<cll> $$0) {
      $$0.a(cnw.w, 5, ImmutableList.of(byo.a(cll::gn), bvk.a(ccc.az, 2, 0.7F)), ccc.az);
   }

   private static void f(bua<cll> $$0) {
      $$0.a(cnw.v, 5, ImmutableList.of(byo.a(cll::gn), new byq(i)), ccc.aB);
   }

   private static void g(bua<cll> $$0) {
      $$0.a(cnw.x, 10, ImmutableList.of(new byn()), ccc.ay);
   }

   private static void a(cll $$0, bua<cll> $$1) {
      $$1.a(
         cnw.k,
         10,
         ImmutableList.of(
            m, bxg.a($$1x -> !$$0.y().d() || !$$0.b($$1x), clm::b, false), bwq.a($$1x -> a($$0, $$1x), (float)$$0.g(bug.m)), bww.a(1.2F), new byr(), bvy.a(18)
         ),
         ccc.o
      );
   }

   private static boolean a(cll $$0, bsy $$1) {
      return $$0.dT().c(ccc.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cll $$0, bsy $$1) {
      if (!$$0.b($$1)) {
         $$0.c($$1);
      }

      a((bsy)$$0);
   }

   public static void a(bsy $$0) {
      if ($$0.dT().a(ccc.aE)) {
         $$0.dT().a(ccc.aE, azh.a, 1200L);
      }
   }

   public static void a(cll $$0, ja $$1) {
      if ($$0.dP().C_().a($$1) && !$$0.gn().isPresent() && !$$0.dT().c(ccc.o).isPresent()) {
         a((bsy)$$0);
         $$0.dT().a(ccc.aG, azh.a, 100L);
         $$0.dT().a(ccc.n, new buu($$1), 100L);
         $$0.dT().a(ccc.az, $$1, 100L);
         $$0.dT().b(ccc.m);
      }
   }
}
