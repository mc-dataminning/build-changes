import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class chn {
   private static final bra a = bra.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bvl<?> a(bvl<chm> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<chm> $$0) {
      $$0.a(cpm.p, ImmutableList.of(Pair.of(0, new cho()), Pair.of(1, bwo.a(bwe::a, cdn.N))), ImmutableSet.of(Pair.of(cdn.N, cdo.a)), ImmutableSet.of(cdn.N));
   }

   private static void c(bvl<chm> $$0) {
      $$0.a(cpm.k, 0, ImmutableList.of(byr.a(chm::a), byh.a(chn::b), bxj.a(20), bwo.a(bwe::a, cdn.o)), cdn.o);
   }

   private static void d(bvl<chm> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new bxi(45, 90), new bxm(), chp.a(), new bwi(cdn.P)));
   }

   private static void e(bvl<chm> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, byc.a(btv.by, 6.0F, bra.a(30, 60))),
            Pair.of(1, new bvw(btv.f, 0.2F, 2)),
            Pair.of(2, new bxz(ImmutableList.of(Pair.of(new bwp(chn::d), 1), Pair.of(bvz.a(a, chn::c), 1)))),
            Pair.of(3, byo.a(chn::b)),
            Pair.of(3, bzb.a(6, 0.15F)),
            Pair.of(
               4,
               new bwq(
                  ImmutableMap.of(cdn.m, cdo.b),
                  ImmutableSet.of(),
                  bwq.a.a,
                  bwq.b.b,
                  ImmutableList.of(
                     Pair.of(bxu.c(0.5F), 2),
                     Pair.of(bxu.a(0.15F, false), 2),
                     Pair.of(byj.a(chn::a, chn::d, 3), 3),
                     Pair.of(bzp.a(bto::bl), 5),
                     Pair.of(bzp.a(bto::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(buk $$0) {
      deg $$1 = $$0.dS();
      Optional<bxq> $$2 = $$0.dX().c(cdn.n);
      if ($$2.isPresent()) {
         je $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bl();
      } else {
         return false;
      }
   }

   public static void a(chm $$0) {
      bvl<chm> $$1 = $$0.dX();
      cpm $$2 = $$1.g().orElse(null);
      if ($$2 != cpm.p) {
         $$1.a(ImmutableList.of(cpm.p, cpm.k, cpm.b));
         if ($$2 == cpm.k && $$1.g().orElse(null) != cpm.k) {
            $$1.a(cdn.U, true, 2400L);
         }
      }
   }

   private static float b(buk $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float c(buk $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float d(buk $$0) {
      return $$0.bl() ? 0.5F : 0.15F;
   }

   private static Optional<? extends buk> b(chm $$0) {
      return bwe.a($$0) ? Optional.empty() : $$0.dX().c(cdn.B);
   }

   public static Predicate<cvp> a() {
      return $$0 -> $$0.a(axc.ay);
   }
}
