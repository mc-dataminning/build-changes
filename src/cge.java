import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cge {
   private static final bpr a = bpr.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bud<?> a(bud<cgd> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bud<cgd> $$0) {
      $$0.a(cnz.p, ImmutableList.of(Pair.of(0, new cgf()), Pair.of(1, bvg.a(buw::a, ccf.N))), ImmutableSet.of(Pair.of(ccf.N, ccg.a)), ImmutableSet.of(ccf.N));
   }

   private static void c(bud<cgd> $$0) {
      $$0.a(cnz.k, 0, ImmutableList.of(bxj.a(cgd::a), bwz.a(cge::b), bwb.a(20), bvg.a(buw::a, ccf.o)), ccf.o);
   }

   private static void d(bud<cgd> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bwa(45, 90), new bwe(), cgg.a(), new bva(ccf.P)));
   }

   private static void e(bud<cgd> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, bwu.a(bsm.by, 6.0F, bpr.a(30, 60))),
            Pair.of(1, new buo(bsm.f, 0.2F, 2)),
            Pair.of(2, new bwr(ImmutableList.of(Pair.of(new bvh(cge::d), 1), Pair.of(bur.a(a, cge::c), 1)))),
            Pair.of(3, bxg.a(cge::b)),
            Pair.of(3, bxt.a(6, 0.15F)),
            Pair.of(
               4,
               new bvi(
                  ImmutableMap.of(ccf.m, ccg.b),
                  ImmutableSet.of(),
                  bvi.a.a,
                  bvi.b.b,
                  ImmutableList.of(
                     Pair.of(bwm.c(0.5F), 2),
                     Pair.of(bwm.a(0.15F, false), 2),
                     Pair.of(bxb.a(cge::a, cge::d, 3), 3),
                     Pair.of(byh.a(bsg::bi), 5),
                     Pair.of(byh.a(bsg::aF), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btb $$0) {
      dcf $$1 = $$0.dQ();
      Optional<bwi> $$2 = $$0.dU().c(ccf.n);
      if ($$2.isPresent()) {
         ja $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bi();
      } else {
         return false;
      }
   }

   public static void a(cgd $$0) {
      bud<cgd> $$1 = $$0.dU();
      cnz $$2 = $$1.g().orElse(null);
      if ($$2 != cnz.p) {
         $$1.a(ImmutableList.of(cnz.p, cnz.k, cnz.b));
         if ($$2 == cnz.k && $$1.g().orElse(null) != cnz.k) {
            $$1.a(ccf.U, true, 2400L);
         }
      }
   }

   private static float b(btb $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float c(btb $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float d(btb $$0) {
      return $$0.bi() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btb> b(cgd $$0) {
      return buw.a($$0) ? Optional.empty() : $$0.dU().c(ccf.B);
   }

   public static Predicate<cuc> a() {
      return $$0 -> $$0.a(awf.ay);
   }
}
