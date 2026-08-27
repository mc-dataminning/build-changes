import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class car {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = arp.f(100.0F);
   public static final int a = arp.f(133.59999F);
   public static final int b = arp.f(84.0F);
   private static final int i = arp.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bte<? extends btd<? super caq>>> k = List.of(bte.d, bte.v);
   private static final List<brz<?>> l = List.of(
      brz.g,
      brz.h,
      brz.k,
      brz.l,
      brz.L,
      brz.n,
      brz.m,
      brz.E,
      brz.t,
      brz.o,
      brz.p,
      brz.B,
      brz.ax,
      brz.ay,
      brz.az,
      brz.aA,
      brz.aB,
      brz.aC,
      brz.aD,
      brz.aE,
      brz.aF,
      brz.aG,
      brz.aH,
      brz.aI,
      brz.aJ,
      brz.aK
   );
   private static final bkq<caq> m = bob.a(
      (Function<bob.b<caq>, ? extends App<bob.c<caq>, boe<caq>>>)($$0 -> $$0.group($$0.a(brz.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(asp.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(caq $$0) {
      $$0.dM().a(ImmutableList.of(ccx.y, ccx.z, ccx.x, ccx.k, ccx.w, ccx.v, ccx.b));
   }

   protected static bjy<?> a(caq $$0, Dynamic<?> $$1) {
      bjy.b<caq> $$2 = bjy.a(l, k);
      bjy<caq> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(ccx.a));
      $$3.b(ccx.b);
      $$3.f();
      return $$3;
   }

   private static void a(bjy<caq> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new bni(0.8F), bom.a(), new blu(45, 90), new bly()));
   }

   private static void b(bjy<caq> $$0) {
      $$0.a(ccx.y, 5, ImmutableList.of(new boi(a)), brz.aB);
   }

   private static void c(bjy<caq> $$0) {
      $$0.a(ccx.z, ImmutableList.of(Pair.of(0, new boj()), Pair.of(1, new boh(h))), ImmutableSet.of(Pair.of(brz.ax, bsa.b), Pair.of(brz.aD, bsa.b)));
   }

   private static void d(bjy<caq> $$0) {
      $$0.a(
         ccx.b,
         10,
         ImmutableList.of(
            bol.a(caq::ga), bop.a(), new bml(ImmutableMap.of(brz.aA, bsa.b), ImmutableList.of(Pair.of(bmg.a(0.5F), 2), Pair.of(new bkz(30, 60), 1)))
         )
      );
   }

   private static void e(bjy<caq> $$0) {
      $$0.a(ccx.w, 5, ImmutableList.of(bol.a(caq::ga), bli.a(brz.ay, 2, 0.7F)), brz.ay);
   }

   private static void f(bjy<caq> $$0) {
      $$0.a(ccx.v, 5, ImmutableList.of(bol.a(caq::ga), new bon(i)), brz.aA);
   }

   private static void g(bjy<caq> $$0) {
      $$0.a(ccx.x, 10, ImmutableList.of(new bok()), brz.ax);
   }

   private static void a(caq $$0, bjy<caq> $$1) {
      $$1.a(
         ccx.k,
         10,
         ImmutableList.of(
            m, bnd.a($$1x -> !$$0.t().d() || !$$0.a($$1x), car::b, false), bmn.a($$1x -> a($$0, $$1x), (float)$$0.b(bke.b)), bmt.a(1.2F), new boo(), blv.a(18)
         ),
         brz.o
      );
   }

   private static boolean a(caq $$0, biy $$1) {
      return $$0.dM().c(brz.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(caq $$0, biy $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((biy)$$0);
   }

   public static void a(biy $$0) {
      if ($$0.dM().a(brz.aD)) {
         $$0.dM().a(brz.aD, asp.a, 1200L);
      }
   }

   public static void a(caq $$0, gu $$1) {
      if ($$0.dK().w_().a($$1) && !$$0.ga().isPresent() && !$$0.dM().c(brz.o).isPresent()) {
         a((biy)$$0);
         $$0.dM().a(brz.aF, asp.a, 100L);
         $$0.dM().a(brz.n, new bks($$1), 100L);
         $$0.dM().a(brz.ay, $$1, 100L);
         $$0.dM().b(brz.m);
      }
   }
}
