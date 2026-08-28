import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cik {
   private static final bru a = bru.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bwi<?> a(bwi<cij> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwi<cij> $$0) {
      $$0.a(cqn.p, ImmutableList.of(Pair.of(0, new cil()), Pair.of(1, bxl.a(bxb::a, cek.N))), ImmutableSet.of(Pair.of(cek.N, cel.a)), ImmutableSet.of(cek.N));
   }

   private static void c(bwi<cij> $$0) {
      $$0.a(cqn.k, 0, ImmutableList.of(bzo.a(cij::a), bze.a(cik::b), byg.a(20), bxl.a(bxb::a, cek.o)), cek.o);
   }

   private static void d(bwi<cij> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new byf(45, 90), new byj(), cim.a(), new bxf(cek.P)));
   }

   private static void e(bwi<cij> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, byz.a(bur.bR, 6.0F, bru.a(30, 60))),
            Pair.of(1, new bwt(bur.h, 0.2F, 2)),
            Pair.of(2, new byw(ImmutableList.of(Pair.of(new bxm(cik::d), 1), Pair.of(bww.a(a, cik::c), 1)))),
            Pair.of(3, bzl.a(cik::a)),
            Pair.of(3, bzy.a(6, 0.15F)),
            Pair.of(
               4,
               new bxn(
                  ImmutableMap.of(cek.m, cel.b),
                  ImmutableSet.of(),
                  bxn.a.a,
                  bxn.b.b,
                  ImmutableList.of(
                     Pair.of(byr.c(0.5F), 2),
                     Pair.of(byr.a(0.15F, false), 2),
                     Pair.of(bzg.a(cik::a, cik::d, 3), 3),
                     Pair.of(cam.a(buk::bm), 5),
                     Pair.of(cam.a(buk::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bvg $$0) {
      dgh $$1 = $$0.dV();
      Optional<byn> $$2 = $$0.eb().c(cek.n);
      if ($$2.isPresent()) {
         ji $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cij $$0) {
      bwi<cij> $$1 = $$0.eb();
      cqn $$2 = $$1.g().orElse(null);
      if ($$2 != cqn.p) {
         $$1.a(ImmutableList.of(cqn.p, cqn.k, cqn.b));
         if ($$2 == cqn.k && $$1.g().orElse(null) != cqn.k) {
            $$1.a(cek.U, true, 2400L);
         }
      }
   }

   private static float b(bvg $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bvg $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bvg $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bvg> a(ard $$0, cij $$1) {
      return bxb.a($$1) ? Optional.empty() : $$1.eb().c(cek.B);
   }

   public static Predicate<cwo> a() {
      return $$0 -> $$0.a(awy.aC);
   }
}
