import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class cbf {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = asb.f(100.0F);
   public static final int a = asb.f(133.59999F);
   public static final int b = asb.f(84.0F);
   private static final int i = asb.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<bts<? extends btr<? super cbe>>> k = List.of(bts.d, bts.v);
   private static final List<bsn<?>> l = List.of(
      bsn.g,
      bsn.h,
      bsn.k,
      bsn.l,
      bsn.L,
      bsn.n,
      bsn.m,
      bsn.E,
      bsn.t,
      bsn.o,
      bsn.p,
      bsn.B,
      bsn.ax,
      bsn.ay,
      bsn.az,
      bsn.aA,
      bsn.aB,
      bsn.aC,
      bsn.aD,
      bsn.aE,
      bsn.aF,
      bsn.aG,
      bsn.aH,
      bsn.aI,
      bsn.aJ,
      bsn.aK
   );
   private static final ble<cbe> m = bop.a(
      (Function<bop.b<cbe>, ? extends App<bop.c<cbe>, bos<cbe>>>)($$0 -> $$0.group($$0.a(bsn.aD)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(atc.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(cbe $$0) {
      $$0.dN().a(ImmutableList.of(cdl.y, cdl.z, cdl.x, cdl.k, cdl.w, cdl.v, cdl.b));
   }

   protected static bkm<?> a(cbe $$0, Dynamic<?> $$1) {
      bkm.b<cbe> $$2 = bkm.a(l, k);
      bkm<cbe> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cdl.a));
      $$3.b(cdl.b);
      $$3.f();
      return $$3;
   }

   private static void a(bkm<cbe> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bnw(0.8F), bpa.a(), new bmi(45, 90), new bmm()));
   }

   private static void b(bkm<cbe> $$0) {
      $$0.a(cdl.y, 5, ImmutableList.of(new bow(a)), bsn.aB);
   }

   private static void c(bkm<cbe> $$0) {
      $$0.a(cdl.z, ImmutableList.of(Pair.of(0, new box()), Pair.of(1, new bov(h))), ImmutableSet.of(Pair.of(bsn.ax, bso.b), Pair.of(bsn.aD, bso.b)));
   }

   private static void d(bkm<cbe> $$0) {
      $$0.a(
         cdl.b,
         10,
         ImmutableList.of(
            boz.a(cbe::ge), bpd.a(), new bmz(ImmutableMap.of(bsn.aA, bso.b), ImmutableList.of(Pair.of(bmu.a(0.5F), 2), Pair.of(new bln(30, 60), 1)))
         )
      );
   }

   private static void e(bkm<cbe> $$0) {
      $$0.a(cdl.w, 5, ImmutableList.of(boz.a(cbe::ge), blw.a(bsn.ay, 2, 0.7F)), bsn.ay);
   }

   private static void f(bkm<cbe> $$0) {
      $$0.a(cdl.v, 5, ImmutableList.of(boz.a(cbe::ge), new bpb(i)), bsn.aA);
   }

   private static void g(bkm<cbe> $$0) {
      $$0.a(cdl.x, 10, ImmutableList.of(new boy()), bsn.ax);
   }

   private static void a(cbe $$0, bkm<cbe> $$1) {
      $$1.a(
         cdl.k,
         10,
         ImmutableList.of(
            m, bnr.a($$1x -> !$$0.y().d() || !$$0.a($$1x), cbf::b, false), bnb.a($$1x -> a($$0, $$1x), (float)$$0.b(bks.g)), bnh.a(1.2F), new bpc(), bmj.a(18)
         ),
         bsn.o
      );
   }

   private static boolean a(cbe $$0, bjm $$1) {
      return $$0.dN().c(bsn.o).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void b(cbe $$0, bjm $$1) {
      if (!$$0.a($$1)) {
         $$0.b($$1);
      }

      a((bjm)$$0);
   }

   public static void a(bjm $$0) {
      if ($$0.dN().a(bsn.aD)) {
         $$0.dN().a(bsn.aD, atc.a, 1200L);
      }
   }

   public static void a(cbe $$0, gw $$1) {
      if ($$0.dL().B_().a($$1) && !$$0.ge().isPresent() && !$$0.dN().c(bsn.o).isPresent()) {
         a((bjm)$$0);
         $$0.dN().a(bsn.aF, atc.a, 100L);
         $$0.dN().a(bsn.n, new blg($$1), 100L);
         $$0.dN().a(bsn.ay, $$1, 100L);
         $$0.dN().b(bsn.m);
      }
   }
}
