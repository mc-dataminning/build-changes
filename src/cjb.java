import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cjb {
   private static final bsl a = bsl.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bwz<?> a(bwz<cja> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwz<cja> $$0) {
      $$0.a(crf.p, ImmutableList.of(Pair.of(0, new cjc()), Pair.of(1, byc.a(bxs::a, cfb.N))), ImmutableSet.of(Pair.of(cfb.N, cfc.a)), ImmutableSet.of(cfb.N));
   }

   private static void c(bwz<cja> $$0) {
      $$0.a(crf.k, 0, ImmutableList.of(caf.a(cja::a), bzv.a(cjb::b), byx.a(20), byc.a(bxs::a, cfb.o)), cfb.o);
   }

   private static void d(bwz<cja> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new byw(45, 90), new bza(), cjd.a(), new bxw(cfb.P)));
   }

   private static void e(bwz<cja> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, bzq.a(bvi.bS, 6.0F, bsl.a(30, 60))),
            Pair.of(1, new bxk(bvi.h, 0.2F, 2)),
            Pair.of(2, new bzn(ImmutableList.of(Pair.of(new byd(cjb::d), 1), Pair.of(bxn.a(a, cjb::c), 1)))),
            Pair.of(3, cac.a(cjb::a)),
            Pair.of(3, cap.a(6, 0.15F)),
            Pair.of(
               4,
               new bye(
                  ImmutableMap.of(cfb.m, cfc.b),
                  ImmutableSet.of(),
                  bye.a.a,
                  bye.b.b,
                  ImmutableList.of(
                     Pair.of(bzi.c(0.5F), 2),
                     Pair.of(bzi.a(0.15F, false), 2),
                     Pair.of(bzx.a(cjb::a, cjb::d, 3), 3),
                     Pair.of(cbd.a(bvb::bm), 5),
                     Pair.of(cbd.a(bvb::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bvx $$0) {
      dgz $$1 = $$0.dW();
      Optional<bze> $$2 = $$0.ec().c(cfb.n);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cja $$0) {
      bwz<cja> $$1 = $$0.ec();
      crf $$2 = $$1.g().orElse(null);
      if ($$2 != crf.p) {
         $$1.a(ImmutableList.of(crf.p, crf.k, crf.b));
         if ($$2 == crf.k && $$1.g().orElse(null) != crf.k) {
            $$1.a(cfb.U, true, 2400L);
         }
      }
   }

   private static float b(bvx $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bvx $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bvx $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bvx> a(arx $$0, cja $$1) {
      return bxs.a($$1) ? Optional.empty() : $$1.ec().c(cfb.B);
   }

   public static Predicate<cxg> a() {
      return $$0 -> $$0.a(axt.aE);
   }
}
