import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cdw {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = aty.f(100.0F);
   public static final int a = aty.f(133.59999F);
   public static final int b = aty.f(84.0F);
   private static final int i = aty.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bwd<? extends bwc<? super cdv>>> k = List.of(bwd.d, bwd.v);
   private static final List<bux<?>> l = List.of(
      bux.g,
      bux.h,
      bux.k,
      bux.l,
      bux.L,
      bux.n,
      bux.m,
      bux.E,
      bux.t,
      bux.o,
      bux.p,
      bux.B,
      bux.ax,
      bux.ay,
      bux.az,
      bux.aA,
      bux.aB,
      bux.aC,
      bux.aD,
      bux.aE,
      bux.aF,
      bux.aG,
      bux.aH,
      bux.aI,
      bux.aJ,
      bux.aK
   );
   private static final bnn<cdv> m = bqz.a(
      (Function<bqz.b<cdv>, ? extends App<bqz.c<cdv>, brc<cdv>>>)($$0 -> $$0.group($$0.a(bux.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(avc.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cdv $$0) {
      $$0.dO().a(ImmutableList.of(cgd.y, cgd.z, cgd.x, cgd.k, cgd.w, cgd.v, cgd.b));
   }

   protected static bmv<?> a(cdv $$0, Dynamic<?> $$1) {
      bmv.b<cdv> $$2 = bmv.a(l, k);
      bmv<cdv> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cgd.a));
      $$3.b(cgd.b);
      $$3.f();
      return $$3;
   }

   private static void a(bmv<cdv> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bqg(0.8F), brk.a(), new bos(45, 90), new bow()));
   }

   private static void b(bmv<cdv> $$0) {
      $$0.a(cgd.y, 5, ImmutableList.of(new brg(a)), bux.aB);
   }

   private static void c(bmv<cdv> $$0) {
      $$0.a(cgd.z, ImmutableList.of(Pair.of(0, new brh()), Pair.of(1, new brf(h))), ImmutableSet.of(Pair.of(bux.ax, buy.b), Pair.of(bux.aD, buy.b)));
   }

   private static void d(bmv<cdv> $$0) {
      $$0.a(
         cgd.b,
         10,
         ImmutableList.of(
            brj.a(cdv::ge), brn.a(), new bpj(ImmutableMap.of(bux.aA, buy.b), ImmutableList.of(Pair.of(bpe.a(0.5F), 2), Pair.of(new bnw(30, 60), 1)))
         )
      );
   }

   private static void e(bmv<cdv> $$0) {
      $$0.a(cgd.w, 5, ImmutableList.of(brj.a(cdv::ge), bof.a(bux.ay, 2, 0.7F)), bux.ay);
   }

   private static void f(bmv<cdv> $$0) {
      $$0.a(cgd.v, 5, ImmutableList.of(brj.a(cdv::ge), new brl(i)), bux.aA);
   }

   private static void g(bmv<cdv> $$0) {
      $$0.a(cgd.x, 10, ImmutableList.of(new bri()), bux.ax);
   }

   private static void a(cdv $$0, bmv<cdv> $$1) {
      $$1.a(
         cgd.k,
         10,
         ImmutableList.of(
            m, bqb.a($$1x -> !$$0.A().d() || !$$0.a($$1x), cdw::b, false), bpl.a($$1x -> a($$0, $$1x), (float)$$0.b(bnb.g)), bpr.a(1.2F), new brm(), bot.a(18)
         ),
         bux.o
      );
   }

   private static boolean a(cdv $$0, blv $$1) {
      return $$0.dO().c(bux.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cdv $$0, blv $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((blv)$$0);
   }

   public static void a(blv $$0) {
      if ($$0.dO().a(bux.aD)) {
         $$0.dO().a(bux.aD, avc.a, 1200L);
      }
   }

   public static void a(cdv $$0, hv $$1) {
      if ($$0.dM().D_().a($$1) && !$$0.ge().isPresent() && !$$0.dO().c(bux.o).isPresent()) {
         a((blv)$$0);
         $$0.dO().a(bux.aF, avc.a, 100L);
         $$0.dO().a(bux.n, new bnp($$1), 100L);
         $$0.dO().a(bux.ay, $$1, 100L);
         $$0.dO().b(bux.m);
      }
   }
}
