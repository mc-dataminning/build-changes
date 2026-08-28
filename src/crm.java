import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.Function;

public class crm {
   private static final float d = 0.5F;
   private static final float e = 0.7F;
   private static final float f = 1.2F;
   private static final int g = 18;
   private static final int h = azz.f(100.0F);
   public static final int a = azz.f(133.59999F);
   public static final int b = azz.f(84.0F);
   private static final int i = azz.f(83.2F);
   public static final int c = 1200;
   private static final int j = 100;
   private static final List<cio<? extends cin<? super crl>>> k = List.of(cio.d, cio.x);
   private static final List<chh<?>> l = List.of(
      chh.g,
      chh.h,
      chh.k,
      chh.l,
      chh.N,
      chh.o,
      chh.n,
      chh.F,
      chh.u,
      chh.p,
      chh.q,
      chh.C,
      chh.az,
      chh.aA,
      chh.aB,
      chh.aC,
      chh.aD,
      chh.aE,
      chh.aF,
      chh.aG,
      chh.aH,
      chh.aI,
      chh.aJ,
      chh.aK,
      chh.aL,
      chh.aM
   );
   private static final bzx<crl> m = cdj.a(
      (Function<cdj.b<crl>, ? extends App<cdj.c<crl>, cdm<crl>>>)($$0 -> $$0.group($$0.a(chh.aF)).apply($$0, $$1 -> ($$2, $$3, $$4) -> {
               if ($$0.a($$1).isPresent()) {
                  $$1.a(bbh.a, 1200L);
               }

               return true;
            }))
   );

   public static void a(crl $$0) {
      $$0.ec().a(ImmutableList.of(cuc.y, cuc.z, cuc.x, cuc.k, cuc.w, cuc.v, cuc.b));
   }

   protected static bzf<?> a(crl $$0, Dynamic<?> $$1) {
      bzf.b<crl> $$2 = bzf.a(l, k);
      bzf<crl> $$3 = $$2.a($$1);
      a($$3);
      b($$3);
      c($$3);
      d($$3);
      g($$3);
      a($$0, $$3);
      e($$3);
      f($$3);
      $$3.a(ImmutableSet.of(cuc.a));
      $$3.b(cuc.b);
      $$3.f();
      return $$3;
   }

   private static void a(bzf<crl> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq(0.8F), cdu.a(), new cbc(45, 90), new cbg()));
   }

   private static void b(bzf<crl> $$0) {
      $$0.a(cuc.y, 5, ImmutableList.of(new cdq(a)), chh.aD);
   }

   private static void c(bzf<crl> $$0) {
      $$0.a(cuc.z, ImmutableList.of(Pair.of(0, new cdr()), Pair.of(1, new cdp(h))), ImmutableSet.of(Pair.of(chh.az, chi.b), Pair.of(chh.aF, chi.b)));
   }

   private static void d(bzf<crl> $$0) {
      $$0.a(
         cuc.b,
         10,
         ImmutableList.of(
            cdt.a(crl::q), cdx.a(), new cbt(ImmutableMap.of(chh.aC, chi.b), ImmutableList.of(Pair.of(cbo.a(0.5F), 2), Pair.of(new cag(30, 60), 1)))
         )
      );
   }

   private static void e(bzf<crl> $$0) {
      $$0.a(cuc.w, 5, ImmutableList.of(cdt.a(crl::q), cap.a(chh.aA, 2, 0.7F)), chh.aA);
   }

   private static void f(bzf<crl> $$0) {
      $$0.a(cuc.v, 5, ImmutableList.of(cdt.a(crl::q), new cdv(i)), chh.aC);
   }

   private static void g(bzf<crl> $$0) {
      $$0.a(cuc.x, 10, ImmutableList.of(new cds()), chh.az);
   }

   private static void a(crl $$0, bzf<crl> $$1) {
      $$1.a(
         cuc.k,
         10,
         ImmutableList.of(
            m,
            ccl.a(($$1x, $$2) -> !$$0.n().d() || !$$0.b($$2), crm::a, false),
            cbv.a($$1x -> a($$0, $$1x), (float)$$0.h(bzl.m)),
            ccb.a(1.2F),
            new cdw(),
            cbd.a(18)
         ),
         chh.p
      );
   }

   private static boolean a(crl $$0, byf $$1) {
      return $$0.ec().c(chh.p).filter($$1x -> $$1x == $$1).isPresent();
   }

   private static void a(asb $$0, crl $$1, byf $$2) {
      if (!$$1.b($$2)) {
         $$1.c($$2);
      }

      a((byf)$$1);
   }

   public static void a(byf $$0) {
      if ($$0.ec().a(chh.aF)) {
         $$0.ec().a(chh.aF, bbh.a, 1200L);
      }
   }

   public static void a(crl $$0, iw $$1) {
      if ($$0.dV().E_().a($$1) && !$$0.q().isPresent() && !$$0.ec().c(chh.p).isPresent()) {
         a((byf)$$0);
         $$0.ec().a(chh.aH, bbh.a, 100L);
         $$0.ec().a(chh.o, new bzz($$1), 100L);
         $$0.ec().a(chh.aA, $$1, 100L);
         $$0.ec().b(chh.n);
      }
   }
}
