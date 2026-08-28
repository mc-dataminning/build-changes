import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cjf {
   private static final bsp a = bsp.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bxd<?> a(bxd<cje> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<cje> $$0) {
      $$0.a(crj.p, ImmutableList.of(Pair.of(0, new cjg()), Pair.of(1, byg.a(bxw::a, cff.N))), ImmutableSet.of(Pair.of(cff.N, cfg.a)), ImmutableSet.of(cff.N));
   }

   private static void c(bxd<cje> $$0) {
      $$0.a(crj.k, 0, ImmutableList.of(caj.a(cje::a), bzz.a(cjf::b), bzb.a(20), byg.a(bxw::a, cff.o)), cff.o);
   }

   private static void d(bxd<cje> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new bza(45, 90), new bze(), cjh.a(), new bya(cff.P)));
   }

   private static void e(bxd<cje> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, bzu.a(bvm.bS, 6.0F, bsp.a(30, 60))),
            Pair.of(1, new bxo(bvm.h, 0.2F, 2)),
            Pair.of(2, new bzr(ImmutableList.of(Pair.of(new byh(cjf::d), 1), Pair.of(bxr.a(a, cjf::c), 1)))),
            Pair.of(3, cag.a(cjf::a)),
            Pair.of(3, cat.a(6, 0.15F)),
            Pair.of(
               4,
               new byi(
                  ImmutableMap.of(cff.m, cfg.b),
                  ImmutableSet.of(),
                  byi.a.a,
                  byi.b.b,
                  ImmutableList.of(
                     Pair.of(bzm.c(0.5F), 2),
                     Pair.of(bzm.a(0.15F, false), 2),
                     Pair.of(cab.a(cjf::a, cjf::d, 3), 3),
                     Pair.of(cbh.a(bvf::bm), 5),
                     Pair.of(cbh.a(bvf::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bwb $$0) {
      dha $$1 = $$0.dV();
      Optional<bzi> $$2 = $$0.eb().c(cff.n);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cje $$0) {
      bxd<cje> $$1 = $$0.eb();
      crj $$2 = $$1.g().orElse(null);
      if ($$2 != crj.p) {
         $$1.a(ImmutableList.of(crj.p, crj.k, crj.b));
         if ($$2 == crj.k && $$1.g().orElse(null) != crj.k) {
            $$1.a(cff.U, true, 2400L);
         }
      }
   }

   private static float b(bwb $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bwb $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bwb $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bwb> a(ash $$0, cje $$1) {
      return bxw.a($$1) ? Optional.empty() : $$1.eb().c(cff.B);
   }

   public static Predicate<cxk> a() {
      return $$0 -> $$0.a(ayd.aE);
   }
}
