import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cii {
   private static final brs a = brs.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bwg<?> a(bwg<cih> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwg<cih> $$0) {
      $$0.a(cqi.p, ImmutableList.of(Pair.of(0, new cij()), Pair.of(1, bxj.a(bwz::a, cei.N))), ImmutableSet.of(Pair.of(cei.N, cej.a)), ImmutableSet.of(cei.N));
   }

   private static void c(bwg<cih> $$0) {
      $$0.a(cqi.k, 0, ImmutableList.of(bzm.a(cih::a), bzc.a(cii::b), bye.a(20), bxj.a(bwz::a, cei.o)), cei.o);
   }

   private static void d(bwg<cih> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new byd(45, 90), new byh(), cik.a(), new bxd(cei.P)));
   }

   private static void e(bwg<cih> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, byx.a(bup.by, 6.0F, brs.a(30, 60))),
            Pair.of(1, new bwr(bup.f, 0.2F, 2)),
            Pair.of(2, new byu(ImmutableList.of(Pair.of(new bxk(cii::d), 1), Pair.of(bwu.a(a, cii::c), 1)))),
            Pair.of(3, bzj.a(cii::b)),
            Pair.of(3, bzw.a(6, 0.15F)),
            Pair.of(
               4,
               new bxl(
                  ImmutableMap.of(cei.m, cej.b),
                  ImmutableSet.of(),
                  bxl.a.a,
                  bxl.b.b,
                  ImmutableList.of(
                     Pair.of(byp.c(0.5F), 2),
                     Pair.of(byp.a(0.15F, false), 2),
                     Pair.of(bze.a(cii::a, cii::d, 3), 3),
                     Pair.of(cak.a(bui::bo), 5),
                     Pair.of(cak.a(bui::aL), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bve $$0) {
      dff $$1 = $$0.dY();
      Optional<byl> $$2 = $$0.ee().c(cei.n);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bo();
      } else {
         return false;
      }
   }

   public static void a(cih $$0) {
      bwg<cih> $$1 = $$0.ee();
      cqi $$2 = $$1.g().orElse(null);
      if ($$2 != cqi.p) {
         $$1.a(ImmutableList.of(cqi.p, cqi.k, cqi.b));
         if ($$2 == cqi.k && $$1.g().orElse(null) != cqi.k) {
            $$1.a(cei.U, true, 2400L);
         }
      }
   }

   private static float b(bve $$0) {
      return $$0.bo() ? 0.6F : 0.15F;
   }

   private static float c(bve $$0) {
      return $$0.bo() ? 0.6F : 0.15F;
   }

   private static float d(bve $$0) {
      return $$0.bo() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bve> b(cih $$0) {
      return bwz.a($$0) ? Optional.empty() : $$0.ee().c(cei.B);
   }

   public static Predicate<cwf> a() {
      return $$0 -> $$0.a(axm.aD);
   }
}
