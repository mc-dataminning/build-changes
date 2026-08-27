import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cde {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = atq.f(100.0F);
   public static final int a = atq.f(133.59999F);
   public static final int b = atq.f(84.0F);
   private static final int i = atq.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bvr<? extends bvq<? super cdd>>> k = List.of(bvr.d, bvr.v);
   private static final List<bum<?>> l = List.of(
      bum.g,
      bum.h,
      bum.k,
      bum.l,
      bum.L,
      bum.n,
      bum.m,
      bum.E,
      bum.t,
      bum.o,
      bum.p,
      bum.B,
      bum.ax,
      bum.ay,
      bum.az,
      bum.aA,
      bum.aB,
      bum.aC,
      bum.aD,
      bum.aE,
      bum.aF,
      bum.aG,
      bum.aH,
      bum.aI,
      bum.aJ,
      bum.aK
   );
   private static final bnd<cdd> m = bqo.a(
      (Function<bqo.b<cdd>, ? extends App<bqo.c<cdd>, bqr<cdd>>>)($$0 -> $$0.group($$0.a(bum.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(aus.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cdd $$0) {
      $$0.dP().a(ImmutableList.of(cfk.y, cfk.z, cfk.x, cfk.k, cfk.w, cfk.v, cfk.b));
   }

   protected static bml<?> a(cdd $$0, Dynamic<?> $$1) {
      bml.b<cdd> $$2 = bml.a(l, k);
      bml<cdd> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cfk.a));
      $$3.b(cfk.b);
      $$3.f();
      return $$3;
   }

   private static void a(bml<cdd> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new bpv(0.8F), bqz.a(), new boh(45, 90), new bol()));
   }

   private static void b(bml<cdd> $$0) {
      $$0.a(cfk.y, 5, ImmutableList.of(new bqv(a)), bum.aB);
   }

   private static void c(bml<cdd> $$0) {
      $$0.a(cfk.z, ImmutableList.of(Pair.of(0, new bqw()), Pair.of(1, new bqu(h))), ImmutableSet.of(Pair.of(bum.ax, bun.b), Pair.of(bum.aD, bun.b)));
   }

   private static void d(bml<cdd> $$0) {
      $$0.a(
         cfk.b,
         10,
         ImmutableList.of(
            bqy.a(cdd::gf), brc.a(), new boy(ImmutableMap.of(bum.aA, bun.b), ImmutableList.of(Pair.of(bot.a(0.5F), 2), Pair.of(new bnm(30, 60), 1)))
         )
      );
   }

   private static void e(bml<cdd> $$0) {
      $$0.a(cfk.w, 5, ImmutableList.of(bqy.a(cdd::gf), bnv.a(bum.ay, 2, 0.7F)), bum.ay);
   }

   private static void f(bml<cdd> $$0) {
      $$0.a(cfk.v, 5, ImmutableList.of(bqy.a(cdd::gf), new bra(i)), bum.aA);
   }

   private static void g(bml<cdd> $$0) {
      $$0.a(cfk.x, 10, ImmutableList.of(new bqx()), bum.ax);
   }

   private static void a(cdd $$0, bml<cdd> $$1) {
      $$1.a(
         cfk.k,
         10,
         ImmutableList.of(
            m, bpq.a($$1x -> !$$0.A().d() || !$$0.a($$1x), cde::b, false), bpa.a($$1x -> a($$0, $$1x), (float)$$0.b(bmr.g)), bpg.a(1.2F), new brb(), boi.a(18)
         ),
         bum.o
      );
   }

   private static boolean a(cdd $$0, bll $$1) {
      return $$0.dP().c(bum.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cdd $$0, bll $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bll)$$0);
   }

   public static void a(bll $$0) {
      if ($$0.dP().a(bum.aD)) {
         $$0.dP().a(bum.aD, aus.a, 1200L);
      }
   }

   public static void a(cdd $$0, hx $$1) {
      if ($$0.dN().D_().a($$1) && !$$0.gf().isPresent() && !$$0.dP().c(bum.o).isPresent()) {
         a((bll)$$0);
         $$0.dP().a(bum.aF, aus.a, 100L);
         $$0.dP().a(bum.n, new bnf($$1), 100L);
         $$0.dP().a(bum.ay, $$1, 100L);
         $$0.dP().b(bum.m);
      }
   }
}
