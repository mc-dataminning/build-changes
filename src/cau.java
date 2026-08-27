import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cau {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = ars.f(100.0F);
   public static final int a = ars.f(133.59999F);
   public static final int b = ars.f(84.0F);
   private static final int i = ars.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bth<? extends btg<? super cat>>> k = List.of(bth.d, bth.v);
   private static final List<bsc<?>> l = List.of(
      bsc.g,
      bsc.h,
      bsc.k,
      bsc.l,
      bsc.L,
      bsc.n,
      bsc.m,
      bsc.E,
      bsc.t,
      bsc.o,
      bsc.p,
      bsc.B,
      bsc.ax,
      bsc.ay,
      bsc.az,
      bsc.aA,
      bsc.aB,
      bsc.aC,
      bsc.aD,
      bsc.aE,
      bsc.aF,
      bsc.aG,
      bsc.aH,
      bsc.aI,
      bsc.aJ,
      bsc.aK
   );
   private static final bkt<cat> m = boe.a(
      (Function<boe.b<cat>, ? extends App<boe.c<cat>, boh<cat>>>)($$0 -> $$0.group($$0.a(bsc.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(ass.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cat $$0) {
      $$0.dM().a(ImmutableList.of(cda.y, cda.z, cda.x, cda.k, cda.w, cda.v, cda.b));
   }

   protected static bkb<?> a(cat $$0, Dynamic<?> $$1) {
      bkb.b<cat> $$2 = bkb.a(l, k);
      bkb<cat> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cda.a));
      $$3.b(cda.b);
      $$3.f();
      return $$3;
   }

   private static void a(bkb<cat> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new bnl(0.8F), bop.a(), new blx(45, 90), new bmb()));
   }

   private static void b(bkb<cat> $$0) {
      $$0.a(cda.y, 5, ImmutableList.of(new bol(a)), bsc.aB);
   }

   private static void c(bkb<cat> $$0) {
      $$0.a(cda.z, ImmutableList.of(Pair.of(0, new bom()), Pair.of(1, new bok(h))), ImmutableSet.of(Pair.of(bsc.ax, bsd.b), Pair.of(bsc.aD, bsd.b)));
   }

   private static void d(bkb<cat> $$0) {
      $$0.a(
         cda.b,
         10,
         ImmutableList.of(
            boo.a(cat::ga), bos.a(), new bmo(ImmutableMap.of(bsc.aA, bsd.b), ImmutableList.of(Pair.of(bmj.a(0.5F), 2), Pair.of(new blc(30, 60), 1)))
         )
      );
   }

   private static void e(bkb<cat> $$0) {
      $$0.a(cda.w, 5, ImmutableList.of(boo.a(cat::ga), bll.a(bsc.ay, 2, 0.7F)), bsc.ay);
   }

   private static void f(bkb<cat> $$0) {
      $$0.a(cda.v, 5, ImmutableList.of(boo.a(cat::ga), new boq(i)), bsc.aA);
   }

   private static void g(bkb<cat> $$0) {
      $$0.a(cda.x, 10, ImmutableList.of(new bon()), bsc.ax);
   }

   private static void a(cat $$0, bkb<cat> $$1) {
      $$1.a(
         cda.k,
         10,
         ImmutableList.of(
            m, bng.a($$1x -> !$$0.t().d() || !$$0.a($$1x), cau::b, false), bmq.a($$1x -> a($$0, $$1x), (float)$$0.b(bkh.b)), bmw.a(1.2F), new bor(), bly.a(18)
         ),
         bsc.o
      );
   }

   private static boolean a(cat $$0, bjb $$1) {
      return $$0.dM().c(bsc.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cat $$0, bjb $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bjb)$$0);
   }

   public static void a(bjb $$0) {
      if ($$0.dM().a(bsc.aD)) {
         $$0.dM().a(bsc.aD, ass.a, 1200L);
      }
   }

   public static void a(cat $$0, gw $$1) {
      if ($$0.dK().w_().a($$1) && !$$0.ga().isPresent() && !$$0.dM().c(bsc.o).isPresent()) {
         a((bjb)$$0);
         $$0.dM().a(bsc.aF, ass.a, 100L);
         $$0.dM().a(bsc.n, new bkv($$1), 100L);
         $$0.dM().a(bsc.ay, $$1, 100L);
         $$0.dM().b(bsc.m);
      }
   }
}
