import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgn {
   private static final bqa a = bqa.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bum<?> a(bum<cgm> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bum<cgm> $$0) {
      $$0.a(coh.p, ImmutableList.of(Pair.of(0, new cgo()), Pair.of(1, bvp.a(bvf::a, cco.N))), ImmutableSet.of(Pair.of(cco.N, ccp.a)), ImmutableSet.of(cco.N));
   }

   private static void c(bum<cgm> $$0) {
      $$0.a(coh.k, 0, ImmutableList.of(bxs.a(cgm::a), bxi.a(cgn::b), bwk.a(20), bvp.a(bvf::a, cco.o)), cco.o);
   }

   private static void d(bum<cgm> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bwj(45, 90), new bwn(), cgp.a(), new bvj(cco.P)));
   }

   private static void e(bum<cgm> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, bxd.a(bsv.by, 6.0F, bqa.a(30, 60))),
            Pair.of(1, new bux(bsv.f, 0.2F, 2)),
            Pair.of(2, new bxa(ImmutableList.of(Pair.of(new bvq(cgn::d), 1), Pair.of(bva.a(a, cgn::c), 1)))),
            Pair.of(3, bxp.a(cgn::b)),
            Pair.of(3, byc.a(6, 0.15F)),
            Pair.of(
               4,
               new bvr(
                  ImmutableMap.of(cco.m, ccp.b),
                  ImmutableSet.of(),
                  bvr.a.a,
                  bvr.b.b,
                  ImmutableList.of(
                     Pair.of(bwv.c(0.5F), 2),
                     Pair.of(bwv.a(0.15F, false), 2),
                     Pair.of(bxk.a(cgn::a, cgn::d, 3), 3),
                     Pair.of(byq.a(bsp::bh), 5),
                     Pair.of(byq.a(bsp::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btk $$0) {
      dbt $$1 = $$0.dP();
      Optional<bwr> $$2 = $$0.dS().c(cco.n);
      if ($$2.isPresent()) {
         iz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cgm $$0) {
      bum<cgm> $$1 = $$0.dS();
      coh $$2 = $$1.g().orElse(null);
      if ($$2 != coh.p) {
         $$1.a(ImmutableList.of(coh.p, coh.k, coh.b));
         if ($$2 == coh.k && $$1.g().orElse(null) != coh.k) {
            $$1.a(cco.U, true, 2400L);
         }
      }
   }

   private static float b(btk $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(btk $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(btk $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btk> b(cgm $$0) {
      return bvf.a($$0) ? Optional.empty() : $$0.dS().c(cco.B);
   }

   public static Predicate<cuk> a() {
      return $$0 -> $$0.a(awu.ay);
   }
}
