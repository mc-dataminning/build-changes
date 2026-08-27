import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cev {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = aup.f(100.0F);
   public static final int a = aup.f(133.59999F);
   public static final int b = aup.f(84.0F);
   private static final int i = aup.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bwx<? extends bww<? super ceu>>> k = List.of(bwx.d, bwx.x);
   private static final List<bvq<?>> l = List.of(
      bvq.g,
      bvq.h,
      bvq.k,
      bvq.l,
      bvq.M,
      bvq.n,
      bvq.m,
      bvq.E,
      bvq.t,
      bvq.o,
      bvq.p,
      bvq.B,
      bvq.ay,
      bvq.az,
      bvq.aA,
      bvq.aB,
      bvq.aC,
      bvq.aD,
      bvq.aE,
      bvq.aF,
      bvq.aG,
      bvq.aH,
      bvq.aI,
      bvq.aJ,
      bvq.aK,
      bvq.aL
   );
   private static final bog<ceu> m = brs.a(
      (Function<brs.b<ceu>, ? extends App<brs.c<ceu>, brv<ceu>>>)($$0 -> $$0.group($$0.a(bvq.aE)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(avt.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(ceu $$0) {
      $$0.dN().a(ImmutableList.of(chc.y, chc.z, chc.x, chc.k, chc.w, chc.v, chc.b));
   }

   protected static bno<?> a(ceu $$0, Dynamic<?> $$1) {
      bno.b<ceu> $$2 = bno.a(l, k);
      bno<ceu> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(chc.a));
      $$3.b(chc.b);
      $$3.f();
      return $$3;
   }

   private static void a(bno<ceu> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bqz(0.8F), bsd.a(), new bpl(45, 90), new bpp()));
   }

   private static void b(bno<ceu> $$0) {
      $$0.a(chc.y, 5, ImmutableList.of(new brz(a)), bvq.aC);
   }

   private static void c(bno<ceu> $$0) {
      $$0.a(chc.z, ImmutableList.of(Pair.of(0, new bsa()), Pair.of(1, new bry(h))), ImmutableSet.of(Pair.of(bvq.ay, bvr.b), Pair.of(bvq.aE, bvr.b)));
   }

   private static void d(bno<ceu> $$0) {
      $$0.a(
         chc.b,
         10,
         ImmutableList.of(
            bsc.a(ceu::gf), bsg.a(), new bqc(ImmutableMap.of(bvq.aB, bvr.b), ImmutableList.of(Pair.of(bpx.a(0.5F), 2), Pair.of(new bop(30, 60), 1)))
         )
      );
   }

   private static void e(bno<ceu> $$0) {
      $$0.a(chc.w, 5, ImmutableList.of(bsc.a(ceu::gf), boy.a(bvq.az, 2, 0.7F)), bvq.az);
   }

   private static void f(bno<ceu> $$0) {
      $$0.a(chc.v, 5, ImmutableList.of(bsc.a(ceu::gf), new bse(i)), bvq.aB);
   }

   private static void g(bno<ceu> $$0) {
      $$0.a(chc.x, 10, ImmutableList.of(new bsb()), bvq.ay);
   }

   private static void a(ceu $$0, bno<ceu> $$1) {
      $$1.a(
         chc.k,
         10,
         ImmutableList.of(
            m, bqu.a($$1x -> !$$0.A().d() || !$$0.a($$1x), cev::b, false), bqe.a($$1x -> a($$0, $$1x), (float)$$0.g(bnu.i)), bqk.a(1.2F), new bsf(), bpm.a(18)
         ),
         bvq.o
      );
   }

   private static boolean a(ceu $$0, bmo $$1) {
      return $$0.dN().c(bvq.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(ceu $$0, bmo $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bmo)$$0);
   }

   public static void a(bmo $$0) {
      if ($$0.dN().a(bvq.aE)) {
         $$0.dN().a(bvq.aE, avt.a, 1200L);
      }
   }

   public static void a(ceu $$0, hx $$1) {
      if ($$0.dL().D_().a($$1) && !$$0.gf().isPresent() && !$$0.dN().c(bvq.o).isPresent()) {
         a((bmo)$$0);
         $$0.dN().a(bvq.aG, avt.a, 100L);
         $$0.dN().a(bvq.n, new boi($$1), 100L);
         $$0.dN().a(bvq.az, $$1, 100L);
         $$0.dN().b(bvq.m);
      }
   }
}
