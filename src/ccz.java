import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class ccz {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = atm.f(100.0F);
   public static final int a = atm.f(133.59999F);
   public static final int b = atm.f(84.0F);
   private static final int i = atm.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bvm<? extends bvl<? super ccy>>> k = List.of(bvm.d, bvm.v);
   private static final List<buh<?>> l = List.of(
      buh.g,
      buh.h,
      buh.k,
      buh.l,
      buh.L,
      buh.n,
      buh.m,
      buh.E,
      buh.t,
      buh.o,
      buh.p,
      buh.B,
      buh.ax,
      buh.ay,
      buh.az,
      buh.aA,
      buh.aB,
      buh.aC,
      buh.aD,
      buh.aE,
      buh.aF,
      buh.aG,
      buh.aH,
      buh.aI,
      buh.aJ,
      buh.aK
   );
   private static final bmy<ccy> m = bqj.a(
      (Function<bqj.b<ccy>, ? extends App<bqj.c<ccy>, bqm<ccy>>>)($$0 -> $$0.group($$0.a(buh.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(auo.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(ccy $$0) {
      $$0.dP().a(ImmutableList.of(cff.y, cff.z, cff.x, cff.k, cff.w, cff.v, cff.b));
   }

   protected static bmg<?> a(ccy $$0, Dynamic<?> $$1) {
      bmg.b<ccy> $$2 = bmg.a(l, k);
      bmg<ccy> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cff.a));
      $$3.b(cff.b);
      $$3.f();
      return $$3;
   }

   private static void a(bmg<ccy> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new bpq(0.8F), bqu.a(), new boc(45, 90), new bog()));
   }

   private static void b(bmg<ccy> $$0) {
      $$0.a(cff.y, 5, ImmutableList.of(new bqq(a)), buh.aB);
   }

   private static void c(bmg<ccy> $$0) {
      $$0.a(cff.z, ImmutableList.of(Pair.of(0, new bqr()), Pair.of(1, new bqp(h))), ImmutableSet.of(Pair.of(buh.ax, bui.b), Pair.of(buh.aD, bui.b)));
   }

   private static void d(bmg<ccy> $$0) {
      $$0.a(
         cff.b,
         10,
         ImmutableList.of(
            bqt.a(ccy::gf), bqx.a(), new bot(ImmutableMap.of(buh.aA, bui.b), ImmutableList.of(Pair.of(boo.a(0.5F), 2), Pair.of(new bnh(30, 60), 1)))
         )
      );
   }

   private static void e(bmg<ccy> $$0) {
      $$0.a(cff.w, 5, ImmutableList.of(bqt.a(ccy::gf), bnq.a(buh.ay, 2, 0.7F)), buh.ay);
   }

   private static void f(bmg<ccy> $$0) {
      $$0.a(cff.v, 5, ImmutableList.of(bqt.a(ccy::gf), new bqv(i)), buh.aA);
   }

   private static void g(bmg<ccy> $$0) {
      $$0.a(cff.x, 10, ImmutableList.of(new bqs()), buh.ax);
   }

   private static void a(ccy $$0, bmg<ccy> $$1) {
      $$1.a(
         cff.k,
         10,
         ImmutableList.of(
            m, bpl.a($$1x -> !$$0.A().d() || !$$0.a($$1x), ccz::b, false), bov.a($$1x -> a($$0, $$1x), (float)$$0.b(bmm.g)), bpb.a(1.2F), new bqw(), bod.a(18)
         ),
         buh.o
      );
   }

   private static boolean a(ccy $$0, blg $$1) {
      return $$0.dP().c(buh.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(ccy $$0, blg $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((blg)$$0);
   }

   public static void a(blg $$0) {
      if ($$0.dP().a(buh.aD)) {
         $$0.dP().a(buh.aD, auo.a, 1200L);
      }
   }

   public static void a(ccy $$0, ht $$1) {
      if ($$0.dN().C_().a($$1) && !$$0.gf().isPresent() && !$$0.dP().c(buh.o).isPresent()) {
         a((blg)$$0);
         $$0.dP().a(buh.aF, auo.a, 100L);
         $$0.dP().a(buh.n, new bna($$1), 100L);
         $$0.dP().a(buh.ay, $$1, 100L);
         $$0.dP().b(buh.m);
      }
   }
}
