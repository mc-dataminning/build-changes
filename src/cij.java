import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cij {
   private static final brt a = brt.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bwh<?> a(bwh<cii> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwh<cii> $$0) {
      $$0.a(cqm.p, ImmutableList.of(Pair.of(0, new cik()), Pair.of(1, bxk.a(bxa::a, cej.N))), ImmutableSet.of(Pair.of(cej.N, cek.a)), ImmutableSet.of(cej.N));
   }

   private static void c(bwh<cii> $$0) {
      $$0.a(cqm.k, 0, ImmutableList.of(bzn.a(cii::a), bzd.a(cij::b), byf.a(20), bxk.a(bxa::a, cej.o)), cej.o);
   }

   private static void d(bwh<cii> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bye(45, 90), new byi(), cil.a(), new bxe(cej.P)));
   }

   private static void e(bwh<cii> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, byy.a(buq.bR, 6.0F, brt.a(30, 60))),
            Pair.of(1, new bws(buq.h, 0.2F, 2)),
            Pair.of(2, new byv(ImmutableList.of(Pair.of(new bxl(cij::d), 1), Pair.of(bwv.a(a, cij::c), 1)))),
            Pair.of(3, bzk.a(cij::a)),
            Pair.of(3, bzx.a(6, 0.15F)),
            Pair.of(
               4,
               new bxm(
                  ImmutableMap.of(cej.m, cek.b),
                  ImmutableSet.of(),
                  bxm.a.a,
                  bxm.b.b,
                  ImmutableList.of(
                     Pair.of(byq.c(0.5F), 2),
                     Pair.of(byq.a(0.15F, false), 2),
                     Pair.of(bzf.a(cij::a, cij::d, 3), 3),
                     Pair.of(cal.a(buj::bm), 5),
                     Pair.of(cal.a(buj::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bvf $$0) {
      dgg $$1 = $$0.dW();
      Optional<bym> $$2 = $$0.ec().c(cej.n);
      if ($$2.isPresent()) {
         ji $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cii $$0) {
      bwh<cii> $$1 = $$0.ec();
      cqm $$2 = $$1.g().orElse(null);
      if ($$2 != cqm.p) {
         $$1.a(ImmutableList.of(cqm.p, cqm.k, cqm.b));
         if ($$2 == cqm.k && $$1.g().orElse(null) != cqm.k) {
            $$1.a(cej.U, true, 2400L);
         }
      }
   }

   private static float b(bvf $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bvf $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bvf $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bvf> a(arc $$0, cii $$1) {
      return bxa.a($$1) ? Optional.empty() : $$1.ec().c(cej.B);
   }

   public static Predicate<cwn> a() {
      return $$0 -> $$0.a(awx.aC);
   }
}
