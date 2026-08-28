import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class ckp {
   private static final btr a = btr.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static byj<?> a(byj<cko> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ctg.a));
      $$0.b(ctg.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<cko> $$0) {
      $$0.a(ctg.p, ImmutableList.of(Pair.of(0, new ckq()), Pair.of(1, bzm.a(bzc::a, cgl.O))), ImmutableSet.of(Pair.of(cgl.O, cgm.a)), ImmutableSet.of(cgl.O));
   }

   private static void c(byj<cko> $$0) {
      $$0.a(ctg.k, 0, ImmutableList.of(cbp.a(cko::a), cbf.a(ckp::b), cah.a(20), bzm.a(bzc::a, cgl.p)), cgl.p);
   }

   private static void d(byj<cko> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cag(45, 90), new cak(), ckr.a(), new bzg(cgl.Q)));
   }

   private static void e(byj<cko> $$0) {
      $$0.a(
         ctg.b,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(1, new byu(bwr.h, 0.2F, 2)),
            Pair.of(2, new cax(ImmutableList.of(Pair.of(new bzn(ckp::d), 1), Pair.of(byx.a(a, ckp::c), 1)))),
            Pair.of(3, cbm.a(ckp::a)),
            Pair.of(3, cbz.a(6, 0.15F)),
            Pair.of(
               4,
               new bzo(
                  ImmutableMap.of(cgl.n, cgm.b),
                  ImmutableSet.of(),
                  bzo.a.a,
                  bzo.b.b,
                  ImmutableList.of(
                     Pair.of(cas.c(0.5F), 2),
                     Pair.of(cas.a(0.15F, false), 2),
                     Pair.of(cbh.a(ckp::a, ckp::d, 3), 3),
                     Pair.of(ccn.a(bwi::bh), 5),
                     Pair.of(ccn.a(bwi::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bxj $$0) {
      djm $$1 = $$0.dU();
      Optional<cao> $$2 = $$0.eb().c(cgl.o);
      if ($$2.isPresent()) {
         iv $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cko $$0) {
      byj<cko> $$1 = $$0.eb();
      ctg $$2 = $$1.g().orElse(null);
      if ($$2 != ctg.p) {
         $$1.a(ImmutableList.of(ctg.p, ctg.k, ctg.b));
         if ($$2 == ctg.k && $$1.g().orElse(null) != ctg.k) {
            $$1.a(cgl.V, true, 2400L);
         }
      }
   }

   private static float b(bxj $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(bxj $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(bxj $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bxj> a(arq $$0, cko $$1) {
      return bzc.a($$1) ? Optional.empty() : $$1.eb().c(cgl.C);
   }

   public static Predicate<czn> a() {
      return $$0 -> $$0.a(axk.aD);
   }
}
