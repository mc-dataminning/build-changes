import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cke {
   private static final btj a = btj.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bxz<?> a(bxz<ckd> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<ckd> $$0) {
      $$0.a(csl.p, ImmutableList.of(Pair.of(0, new ckf()), Pair.of(1, bzc.a(bys::a, cgb.O))), ImmutableSet.of(Pair.of(cgb.O, cgc.a)), ImmutableSet.of(cgb.O));
   }

   private static void c(bxz<ckd> $$0) {
      $$0.a(csl.k, 0, ImmutableList.of(cbf.a(ckd::a), cav.a(cke::b), bzx.a(20), bzc.a(bys::a, cgb.p)), cgb.p);
   }

   private static void d(bxz<ckd> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new bzw(45, 90), new caa(), ckg.a(), new byw(cgb.Q)));
   }

   private static void e(bxz<ckd> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, caq.a(bwj.bS, 6.0F, btj.a(30, 60))),
            Pair.of(1, new byk(bwj.h, 0.2F, 2)),
            Pair.of(2, new can(ImmutableList.of(Pair.of(new bzd(cke::d), 1), Pair.of(byn.a(a, cke::c), 1)))),
            Pair.of(3, cbc.a(cke::a)),
            Pair.of(3, cbp.a(6, 0.15F)),
            Pair.of(
               4,
               new bze(
                  ImmutableMap.of(cgb.n, cgc.b),
                  ImmutableSet.of(),
                  bze.a.a,
                  bze.b.b,
                  ImmutableList.of(
                     Pair.of(cai.c(0.5F), 2),
                     Pair.of(cai.a(0.15F, false), 2),
                     Pair.of(cax.a(cke::a, cke::d, 3), 3),
                     Pair.of(ccd.a(bwa::bj), 5),
                     Pair.of(ccd.a(bwa::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bwz $$0) {
      dip $$1 = $$0.dV();
      Optional<cae> $$2 = $$0.eb().c(cgb.o);
      if ($$2.isPresent()) {
         iu $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bj();
      } else {
         return false;
      }
   }

   public static void a(ckd $$0) {
      bxz<ckd> $$1 = $$0.eb();
      csl $$2 = $$1.g().orElse(null);
      if ($$2 != csl.p) {
         $$1.a(ImmutableList.of(csl.p, csl.k, csl.b));
         if ($$2 == csl.k && $$1.g().orElse(null) != csl.k) {
            $$1.a(cgb.V, true, 2400L);
         }
      }
   }

   private static float b(bwz $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float c(bwz $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float d(bwz $$0) {
      return $$0.bj() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bwz> a(aro $$0, ckd $$1) {
      return bys.a($$1) ? Optional.empty() : $$1.eb().c(cgb.C);
   }

   public static Predicate<cys> a() {
      return $$0 -> $$0.a(axi.aC);
   }
}
