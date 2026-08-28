import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cks {
   private static final btr a = btr.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static byj<?> a(byj<ckr> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ctd.a));
      $$0.b(ctd.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<ckr> $$0) {
      $$0.a(ctd.p, ImmutableList.of(Pair.of(0, new ckt()), Pair.of(1, bzm.a(bzc::a, cgl.O))), ImmutableSet.of(Pair.of(cgl.O, cgm.a)), ImmutableSet.of(cgl.O));
   }

   private static void c(byj<ckr> $$0) {
      $$0.a(ctd.k, 0, ImmutableList.of(cbp.a(ckr::a), cbf.a(cks::b), cah.a(20), bzm.a(bzc::a, cgl.p)), cgl.p);
   }

   private static void d(byj<ckr> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new cag(45, 90), new cak(), cku.a(), new bzg(cgl.Q)));
   }

   private static void e(byj<ckr> $$0) {
      $$0.a(
         ctd.b,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(1, new byu(bwr.h, 0.2F, 2)),
            Pair.of(2, new cax(ImmutableList.of(Pair.of(new bzn(cks::d), 1), Pair.of(byx.a(a, cks::c), 1)))),
            Pair.of(3, cbm.a(cks::a)),
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
                     Pair.of(cbh.a(cks::a, cks::d, 3), 3),
                     Pair.of(ccn.a(bwi::bh), 5),
                     Pair.of(ccn.a(bwi::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bxj $$0) {
      djh $$1 = $$0.dU();
      Optional<cao> $$2 = $$0.eb().c(cgl.o);
      if ($$2.isPresent()) {
         iv $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(ckr $$0) {
      byj<ckr> $$1 = $$0.eb();
      ctd $$2 = $$1.g().orElse(null);
      if ($$2 != ctd.p) {
         $$1.a(ImmutableList.of(ctd.p, ctd.k, ctd.b));
         if ($$2 == ctd.k && $$1.g().orElse(null) != ctd.k) {
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

   private static Optional<? extends bxj> a(arq $$0, ckr $$1) {
      return bzc.a($$1) ? Optional.empty() : $$1.eb().c(cgl.C);
   }

   public static Predicate<czk> a() {
      return $$0 -> $$0.a(axk.aD);
   }
}
