import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cjk {
   private static final bsu a = bsu.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bxi<?> a(bxi<cjj> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cro.a));
      $$0.b(cro.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxi<cjj> $$0) {
      $$0.a(cro.p, ImmutableList.of(Pair.of(0, new cjl()), Pair.of(1, byl.a(byb::a, cfk.N))), ImmutableSet.of(Pair.of(cfk.N, cfl.a)), ImmutableSet.of(cfk.N));
   }

   private static void c(bxi<cjj> $$0) {
      $$0.a(cro.k, 0, ImmutableList.of(cao.a(cjj::a), cae.a(cjk::b), bzg.a(20), byl.a(byb::a, cfk.o)), cfk.o);
   }

   private static void d(bxi<cjj> $$0) {
      $$0.a(cro.a, 0, ImmutableList.of(new bzf(45, 90), new bzj(), cjm.a(), new byf(cfk.P)));
   }

   private static void e(bxi<cjj> $$0) {
      $$0.a(
         cro.b,
         ImmutableList.of(
            Pair.of(0, bzz.a(bvr.bS, 6.0F, bsu.a(30, 60))),
            Pair.of(1, new bxt(bvr.h, 0.2F, 2)),
            Pair.of(2, new bzw(ImmutableList.of(Pair.of(new bym(cjk::d), 1), Pair.of(bxw.a(a, cjk::c), 1)))),
            Pair.of(3, cal.a(cjk::a)),
            Pair.of(3, cay.a(6, 0.15F)),
            Pair.of(
               4,
               new byn(
                  ImmutableMap.of(cfk.m, cfl.b),
                  ImmutableSet.of(),
                  byn.a.a,
                  byn.b.b,
                  ImmutableList.of(
                     Pair.of(bzr.c(0.5F), 2),
                     Pair.of(bzr.a(0.15F, false), 2),
                     Pair.of(cag.a(cjk::a, cjk::d, 3), 3),
                     Pair.of(cbm.a(bvk::bm), 5),
                     Pair.of(cbm.a(bvk::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bwg $$0) {
      dhi $$1 = $$0.dW();
      Optional<bzn> $$2 = $$0.ec().c(cfk.n);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cjj $$0) {
      bxi<cjj> $$1 = $$0.ec();
      cro $$2 = $$1.g().orElse(null);
      if ($$2 != cro.p) {
         $$1.a(ImmutableList.of(cro.p, cro.k, cro.b));
         if ($$2 == cro.k && $$1.g().orElse(null) != cro.k) {
            $$1.a(cfk.U, true, 2400L);
         }
      }
   }

   private static float b(bwg $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bwg $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bwg $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bwg> a(ash $$0, cjj $$1) {
      return byb.a($$1) ? Optional.empty() : $$1.ec().c(cfk.B);
   }

   public static Predicate<cxp> a() {
      return $$0 -> $$0.a(ayd.aE);
   }
}
