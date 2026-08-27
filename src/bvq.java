import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bvq {
   private static final bfz a = bfz.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bjx<?> a(bjx<bvp> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjx<bvp> $$0) {
      $$0.a(ccw.p, ImmutableList.of(Pair.of(0, new bvr()), Pair.of(1, bla.a(bkq::a, bry.M))), ImmutableSet.of(Pair.of(bry.M, brz.a)), ImmutableSet.of(bry.M));
   }

   private static void c(bjx<bvp> $$0) {
      $$0.a(ccw.k, 0, ImmutableList.of(bnc.a(bvp::a), bms.a(bvq::b), blu.a(20), bla.a(bkq::a, bry.o)), bry.o);
   }

   private static void d(bjx<bvp> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new blt(45, 90), new blx(), bvs.a(), new bku(bry.O)));
   }

   private static void e(bjx<bvp> $$0) {
      $$0.a(
         ccw.b,
         ImmutableList.of(
            Pair.of(0, bmn.a(bik.bt, 6.0F, bfz.a(30, 60))),
            Pair.of(1, new bki(bik.f, 0.2F)),
            Pair.of(2, new bmk(ImmutableList.of(Pair.of(new blb(bvq::d), 1), Pair.of(bkl.a(a, bvq::c), 1)))),
            Pair.of(3, bmz.a(bvq::b)),
            Pair.of(3, bnm.a(6, 0.15F)),
            Pair.of(
               4,
               new blc(
                  ImmutableMap.of(bry.m, brz.b),
                  ImmutableSet.of(),
                  blc.a.a,
                  blc.b.b,
                  ImmutableList.of(
                     Pair.of(bmf.c(0.5F), 2),
                     Pair.of(bmf.a(0.15F, false), 2),
                     Pair.of(bmu.a(bvq::a, bvq::d, 3), 3),
                     Pair.of(boa.a(big::ba), 5),
                     Pair.of(boa.a(big::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(biw $$0) {
      cpk $$1 = $$0.dK();
      Optional<bmb> $$2 = $$0.dM().c(bry.n);
      if ($$2.isPresent()) {
         gv $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bvp $$0) {
      bjx<bvp> $$1 = $$0.dM();
      ccw $$2 = $$1.g().orElse(null);
      if ($$2 != ccw.p) {
         $$1.a(ImmutableList.of(ccw.p, ccw.k, ccw.b));
         if ($$2 == ccw.k && $$1.g().orElse(null) != ccw.k) {
            $$1.a(bry.T, true, 2400L);
         }
      }
   }

   private static float b(biw $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(biw $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(biw $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends biw> b(bvp $$0) {
      return bkq.a($$0) ? Optional.empty() : $$0.dM().c(bry.B);
   }

   public static clw a() {
      return clw.a(apr.aA);
   }
}
