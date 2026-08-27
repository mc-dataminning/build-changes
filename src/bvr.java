import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bvr {
   private static final bgb a = bgb.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bjy<?> a(bjy<bvq> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ccx.a));
      $$0.b(ccx.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjy<bvq> $$0) {
      $$0.a(ccx.p, ImmutableList.of(Pair.of(0, new bvs()), Pair.of(1, blb.a(bkr::a, brz.M))), ImmutableSet.of(Pair.of(brz.M, bsa.a)), ImmutableSet.of(brz.M));
   }

   private static void c(bjy<bvq> $$0) {
      $$0.a(ccx.k, 0, ImmutableList.of(bnd.a(bvq::a), bmt.a(bvr::b), blv.a(20), blb.a(bkr::a, brz.o)), brz.o);
   }

   private static void d(bjy<bvq> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new blu(45, 90), new bly(), bvt.a(), new bkv(brz.O)));
   }

   private static void e(bjy<bvq> $$0) {
      $$0.a(
         ccx.b,
         ImmutableList.of(
            Pair.of(0, bmo.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new bkj(bim.f, 0.2F)),
            Pair.of(2, new bml(ImmutableList.of(Pair.of(new blc(bvr::d), 1), Pair.of(bkm.a(a, bvr::c), 1)))),
            Pair.of(3, bna.a(bvr::b)),
            Pair.of(3, bnn.a(6, 0.15F)),
            Pair.of(
               4,
               new bld(
                  ImmutableMap.of(brz.m, bsa.b),
                  ImmutableSet.of(),
                  bld.a.a,
                  bld.b.b,
                  ImmutableList.of(
                     Pair.of(bmg.c(0.5F), 2),
                     Pair.of(bmg.a(0.15F, false), 2),
                     Pair.of(bmv.a(bvr::a, bvr::d, 3), 3),
                     Pair.of(bob.a(bii::ba), 5),
                     Pair.of(bob.a(bii::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(biy $$0) {
      cpl $$1 = $$0.dK();
      Optional<bmc> $$2 = $$0.dM().c(brz.n);
      if ($$2.isPresent()) {
         gu $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bvq $$0) {
      bjy<bvq> $$1 = $$0.dM();
      ccx $$2 = $$1.g().orElse(null);
      if ($$2 != ccx.p) {
         $$1.a(ImmutableList.of(ccx.p, ccx.k, ccx.b));
         if ($$2 == ccx.k && $$1.g().orElse(null) != ccx.k) {
            $$1.a(brz.T, true, 2400L);
         }
      }
   }

   private static float b(biy $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(biy $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(biy $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends biy> b(bvq $$0) {
      return bkr.a($$0) ? Optional.empty() : $$0.dM().c(brz.B);
   }

   public static clx a() {
      return clx.a(apt.aA);
   }
}
