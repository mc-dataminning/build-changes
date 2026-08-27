import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bwf {
   private static final bgp a = bgp.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bkm<?> a(bkm<bwe> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkm<bwe> $$0) {
      $$0.a(cdl.p, ImmutableList.of(Pair.of(0, new bwg()), Pair.of(1, blp.a(blf::a, bsn.M))), ImmutableSet.of(Pair.of(bsn.M, bso.a)), ImmutableSet.of(bsn.M));
   }

   private static void c(bkm<bwe> $$0) {
      $$0.a(cdl.k, 0, ImmutableList.of(bnr.a(bwe::a), bnh.a(bwf::b), bmj.a(20), blp.a(blf::a, bsn.o)), bsn.o);
   }

   private static void d(bkm<bwe> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bmi(45, 90), new bmm(), bwh.a(), new blj(bsn.O)));
   }

   private static void e(bkm<bwe> $$0) {
      $$0.a(
         cdl.b,
         ImmutableList.of(
            Pair.of(0, bnc.a(bja.bt, 6.0F, bgp.a(30, 60))),
            Pair.of(1, new bkx(bja.f, 0.2F)),
            Pair.of(2, new bmz(ImmutableList.of(Pair.of(new blq(bwf::d), 1), Pair.of(bla.a(a, bwf::c), 1)))),
            Pair.of(3, bno.a(bwf::b)),
            Pair.of(3, bob.a(6, 0.15F)),
            Pair.of(
               4,
               new blr(
                  ImmutableMap.of(bsn.m, bso.b),
                  ImmutableSet.of(),
                  blr.a.a,
                  blr.b.b,
                  ImmutableList.of(
                     Pair.of(bmu.c(0.5F), 2),
                     Pair.of(bmu.a(0.15F, false), 2),
                     Pair.of(bnj.a(bwf::a, bwf::d, 3), 3),
                     Pair.of(bop.a(biw::ba), 5),
                     Pair.of(bop.a(biw::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bjm $$0) {
      cqb $$1 = $$0.dL();
      Optional<bmq> $$2 = $$0.dN().c(bsn.n);
      if ($$2.isPresent()) {
         gw $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bwe $$0) {
      bkm<bwe> $$1 = $$0.dN();
      cdl $$2 = $$1.g().orElse(null);
      if ($$2 != cdl.p) {
         $$1.a(ImmutableList.of(cdl.p, cdl.k, cdl.b));
         if ($$2 == cdl.k && $$1.g().orElse(null) != cdl.k) {
            $$1.a(bsn.T, true, 2400L);
         }
      }
   }

   private static float b(bjm $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(bjm $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(bjm $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bjm> b(bwe $$0) {
      return blf.a($$0) ? Optional.empty() : $$0.dN().c(bsn.B);
   }

   public static cmm a() {
      return cmm.a(aqd.aA);
   }
}
