import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cll {
   private static final bun a = bun.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bzf<?> a(bzf<clk> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<clk> $$0) {
      $$0.a(cuc.p, ImmutableList.of(Pair.of(0, new clm()), Pair.of(1, cai.a(bzy::a, chh.O))), ImmutableSet.of(Pair.of(chh.O, chi.a)), ImmutableSet.of(chh.O));
   }

   private static void c(bzf<clk> $$0) {
      $$0.a(cuc.k, 0, ImmutableList.of(ccl.a(clk::a), ccb.a(cll::b), cbd.a(20), cai.a(bzy::a, chh.p)), chh.p);
   }

   private static void d(bzf<clk> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new cbc(45, 90), new cbg(), cln.a(), new cac(chh.Q)));
   }

   private static void e(bzf<clk> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, cbw.a(bxn.bT, 6.0F, bun.a(30, 60))),
            Pair.of(1, new bzq(bxn.i, 0.2F, 2)),
            Pair.of(2, new cbt(ImmutableList.of(Pair.of(new caj(cll::d), 1), Pair.of(bzt.a(a, cll::c), 1)))),
            Pair.of(3, cci.a(cll::a)),
            Pair.of(3, ccv.a(6, 0.15F)),
            Pair.of(
               4,
               new cak(
                  ImmutableMap.of(chh.n, chi.b),
                  ImmutableSet.of(),
                  cak.a.a,
                  cak.b.b,
                  ImmutableList.of(
                     Pair.of(cbo.c(0.5F), 2),
                     Pair.of(cbo.a(0.15F, false), 2),
                     Pair.of(ccd.a(cll::a, cll::d, 3), 3),
                     Pair.of(cdj.a(bxe::bi), 5),
                     Pair.of(cdj.a(bxe::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(byf $$0) {
      dkj $$1 = $$0.dV();
      Optional<cbk> $$2 = $$0.ec().c(chh.o);
      if ($$2.isPresent()) {
         iw $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bi();
      } else {
         return false;
      }
   }

   public static void a(clk $$0) {
      bzf<clk> $$1 = $$0.ec();
      cuc $$2 = $$1.g().orElse(null);
      if ($$2 != cuc.p) {
         $$1.a(ImmutableList.of(cuc.p, cuc.k, cuc.b));
         if ($$2 == cuc.k && $$1.g().orElse(null) != cuc.k) {
            $$1.a(chh.V, true, 2400L);
         }
      }
   }

   private static float b(byf $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float c(byf $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float d(byf $$0) {
      return $$0.bi() ? 0.5F : 0.15F;
   }

   private static Optional<? extends byf> a(asb $$0, clk $$1) {
      return bzy.a($$1) ? Optional.empty() : $$1.ec().c(chh.C);
   }

   public static Predicate<dak> a() {
      return $$0 -> $$0.a(axv.aE);
   }
}
