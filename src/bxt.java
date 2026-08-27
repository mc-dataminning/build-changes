import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class bxt {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = apa.f(100.0F);
   public static final int a = apa.f(133.59999F);
   public static final int b = apa.f(84.0F);
   private static final int i = apa.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bqg<? extends bqf<? super bxs>>> k = List.of(bqg.d, bqg.v);
   private static final List<bpb<?>> l = List.of(
      bpb.g,
      bpb.h,
      bpb.k,
      bpb.l,
      bpb.L,
      bpb.n,
      bpb.m,
      bpb.E,
      bpb.t,
      bpb.o,
      bpb.p,
      bpb.B,
      bpb.ax,
      bpb.ay,
      bpb.az,
      bpb.aA,
      bpb.aB,
      bpb.aC,
      bpb.aD,
      bpb.aE,
      bpb.aF,
      bpb.aG,
      bpb.aH,
      bpb.aI,
      bpb.aJ,
      bpb.aK
   );
   private static final bhs<bxs> m = bld.a(
      (Function<bld.b<bxs>, ? extends App<bld.c<bxs>, blg<bxs>>>)($$0 -> $$0.group($$0.a(bpb.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(apz.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(bxs $$0) {
      $$0.dK().a(ImmutableList.of(bzz.y, bzz.z, bzz.x, bzz.k, bzz.w, bzz.v, bzz.b));
   }

   protected static bha<?> a(bxs $$0, Dynamic<?> $$1) {
      bha.b<bxs> $$2 = bha.a(l, k);
      bha<bxs> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(bzz.a));
      $$3.b(bzz.b);
      $$3.f();
      return $$3;
   }

   private static void a(bha<bxs> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new bkk(0.8F), blo.a(), new biw(45, 90), new bja()));
   }

   private static void b(bha<bxs> $$0) {
      $$0.a(bzz.y, 5, ImmutableList.of(new blk(a)), bpb.aB);
   }

   private static void c(bha<bxs> $$0) {
      $$0.a(bzz.z, ImmutableList.of(Pair.of(0, new bll()), Pair.of(1, new blj(h))), ImmutableSet.of(Pair.of(bpb.ax, bpc.b), Pair.of(bpb.aD, bpc.b)));
   }

   private static void d(bha<bxs> $$0) {
      $$0.a(
         bzz.b,
         10,
         ImmutableList.of(
            bln.a(bxs::fY), blr.a(), new bjn(ImmutableMap.of(bpb.aA, bpc.b), ImmutableList.of(Pair.of(bji.a(0.5F), 2), Pair.of(new bib(30, 60), 1)))
         )
      );
   }

   private static void e(bha<bxs> $$0) {
      $$0.a(bzz.w, 5, ImmutableList.of(bln.a(bxs::fY), bik.a(bpb.ay, 2, 0.7F)), bpb.ay);
   }

   private static void f(bha<bxs> $$0) {
      $$0.a(bzz.v, 5, ImmutableList.of(bln.a(bxs::fY), new blp(i)), bpb.aA);
   }

   private static void g(bha<bxs> $$0) {
      $$0.a(bzz.x, 10, ImmutableList.of(new blm()), bpb.ax);
   }

   private static void a(bxs $$0, bha<bxs> $$1) {
      $$1.a(
         bzz.k,
         10,
         ImmutableList.of(
            m, bkf.a($$1x -> !$$0.w().d() || !$$0.a($$1x), bxt::b, false), bjp.a($$1x -> a($$0, $$1x), (float)$$0.b(bhg.b)), bjv.a(1.2F), new blq(), bix.a(18)
         ),
         bpb.o
      );
   }

   private static boolean a(bxs $$0, bfz $$1) {
      return $$0.dK().c(bpb.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(bxs $$0, bfz $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bfz)$$0);
   }

   public static void a(bfz $$0) {
      if ($$0.dK().a(bpb.aD)) {
         $$0.dK().a(bpb.aD, apz.a, 1200L);
      }
   }

   public static void a(bxs $$0, gu $$1) {
      if ($$0.dI().w_().a($$1) && !$$0.fY().isPresent() && !$$0.dK().c(bpb.o).isPresent()) {
         a((bfz)$$0);
         $$0.dK().a(bpb.aF, apz.a, 100L);
         $$0.dK().a(bpb.n, new bhu($$1), 100L);
         $$0.dK().a(bpb.ay, $$1, 100L);
         $$0.dK().b(bpb.m);
      }
   }
}
