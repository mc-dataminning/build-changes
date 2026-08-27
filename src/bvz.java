import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bvz {
   private static final bgj a = bgj.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bkg<?> a(bkg<bvy> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkg<bvy> $$0) {
      $$0.a(cdf.p, ImmutableList.of(Pair.of(0, new bwa()), Pair.of(1, blj.a(bkz::a, bsh.M))), ImmutableSet.of(Pair.of(bsh.M, bsi.a)), ImmutableSet.of(bsh.M));
   }

   private static void c(bkg<bvy> $$0) {
      $$0.a(cdf.k, 0, ImmutableList.of(bnl.a(bvy::a), bnb.a(bvz::b), bmd.a(20), blj.a(bkz::a, bsh.o)), bsh.o);
   }

   private static void d(bkg<bvy> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bmc(45, 90), new bmg(), bwb.a(), new bld(bsh.O)));
   }

   private static void e(bkg<bvy> $$0) {
      $$0.a(
         cdf.b,
         ImmutableList.of(
            Pair.of(0, bmw.a(biu.bt, 6.0F, bgj.a(30, 60))),
            Pair.of(1, new bkr(biu.f, 0.2F)),
            Pair.of(2, new bmt(ImmutableList.of(Pair.of(new blk(bvz::d), 1), Pair.of(bku.a(a, bvz::c), 1)))),
            Pair.of(3, bni.a(bvz::b)),
            Pair.of(3, bnv.a(6, 0.15F)),
            Pair.of(
               4,
               new bll(
                  ImmutableMap.of(bsh.m, bsi.b),
                  ImmutableSet.of(),
                  bll.a.a,
                  bll.b.b,
                  ImmutableList.of(
                     Pair.of(bmo.c(0.5F), 2),
                     Pair.of(bmo.a(0.15F, false), 2),
                     Pair.of(bnd.a(bvz::a, bvz::d, 3), 3),
                     Pair.of(boj.a(biq::ba), 5),
                     Pair.of(boj.a(biq::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bjg $$0) {
      cpv $$1 = $$0.dL();
      Optional<bmk> $$2 = $$0.dN().c(bsh.n);
      if ($$2.isPresent()) {
         gw $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bvy $$0) {
      bkg<bvy> $$1 = $$0.dN();
      cdf $$2 = $$1.g().orElse(null);
      if ($$2 != cdf.p) {
         $$1.a(ImmutableList.of(cdf.p, cdf.k, cdf.b));
         if ($$2 == cdf.k && $$1.g().orElse(null) != cdf.k) {
            $$1.a(bsh.T, true, 2400L);
         }
      }
   }

   private static float b(bjg $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(bjg $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(bjg $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bjg> b(bvy $$0) {
      return bkz.a($$0) ? Optional.empty() : $$0.dN().c(bsh.B);
   }

   public static cmg a() {
      return cmg.a(aqa.aA);
   }
}
