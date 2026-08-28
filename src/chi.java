import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class chi {
   private static final bqv a = bqv.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bvg<?> a(bvg<chh> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvg<chh> $$0) {
      $$0.a(cpg.p, ImmutableList.of(Pair.of(0, new chj()), Pair.of(1, bwj.a(bvz::a, cdi.N))), ImmutableSet.of(Pair.of(cdi.N, cdj.a)), ImmutableSet.of(cdi.N));
   }

   private static void c(bvg<chh> $$0) {
      $$0.a(cpg.k, 0, ImmutableList.of(bym.a(chh::a), byc.a(chi::b), bxe.a(20), bwj.a(bvz::a, cdi.o)), cdi.o);
   }

   private static void d(bvg<chh> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new bxd(45, 90), new bxh(), chk.a(), new bwd(cdi.P)));
   }

   private static void e(bvg<chh> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, bxx.a(btq.by, 6.0F, bqv.a(30, 60))),
            Pair.of(1, new bvr(btq.f, 0.2F, 2)),
            Pair.of(2, new bxu(ImmutableList.of(Pair.of(new bwk(chi::d), 1), Pair.of(bvu.a(a, chi::c), 1)))),
            Pair.of(3, byj.a(chi::b)),
            Pair.of(3, byw.a(6, 0.15F)),
            Pair.of(
               4,
               new bwl(
                  ImmutableMap.of(cdi.m, cdj.b),
                  ImmutableSet.of(),
                  bwl.a.a,
                  bwl.b.b,
                  ImmutableList.of(
                     Pair.of(bxp.c(0.5F), 2),
                     Pair.of(bxp.a(0.15F, false), 2),
                     Pair.of(bye.a(chi::a, chi::d, 3), 3),
                     Pair.of(bzk.a(btj::bl), 5),
                     Pair.of(bzk.a(btj::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(buf $$0) {
      dds $$1 = $$0.dS();
      Optional<bxl> $$2 = $$0.dX().c(cdi.n);
      if ($$2.isPresent()) {
         je $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bl();
      } else {
         return false;
      }
   }

   public static void a(chh $$0) {
      bvg<chh> $$1 = $$0.dX();
      cpg $$2 = $$1.g().orElse(null);
      if ($$2 != cpg.p) {
         $$1.a(ImmutableList.of(cpg.p, cpg.k, cpg.b));
         if ($$2 == cpg.k && $$1.g().orElse(null) != cpg.k) {
            $$1.a(cdi.U, true, 2400L);
         }
      }
   }

   private static float b(buf $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float c(buf $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float d(buf $$0) {
      return $$0.bl() ? 0.5F : 0.15F;
   }

   private static Optional<? extends buf> b(chh $$0) {
      return bvz.a($$0) ? Optional.empty() : $$0.dX().c(cdi.B);
   }

   public static Predicate<cvl> a() {
      return $$0 -> $$0.a(axb.ay);
   }
}
