import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cjj {
   private static final bst a = bst.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bxh<?> a(bxh<cji> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxh<cji> $$0) {
      $$0.a(crn.p, ImmutableList.of(Pair.of(0, new cjk()), Pair.of(1, byk.a(bya::a, cfj.N))), ImmutableSet.of(Pair.of(cfj.N, cfk.a)), ImmutableSet.of(cfj.N));
   }

   private static void c(bxh<cji> $$0) {
      $$0.a(crn.k, 0, ImmutableList.of(can.a(cji::a), cad.a(cjj::b), bzf.a(20), byk.a(bya::a, cfj.o)), cfj.o);
   }

   private static void d(bxh<cji> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new bze(45, 90), new bzi(), cjl.a(), new bye(cfj.P)));
   }

   private static void e(bxh<cji> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, bzy.a(bvq.bS, 6.0F, bst.a(30, 60))),
            Pair.of(1, new bxs(bvq.h, 0.2F, 2)),
            Pair.of(2, new bzv(ImmutableList.of(Pair.of(new byl(cjj::d), 1), Pair.of(bxv.a(a, cjj::c), 1)))),
            Pair.of(3, cak.a(cjj::a)),
            Pair.of(3, cax.a(6, 0.15F)),
            Pair.of(
               4,
               new bym(
                  ImmutableMap.of(cfj.m, cfk.b),
                  ImmutableSet.of(),
                  bym.a.a,
                  bym.b.b,
                  ImmutableList.of(
                     Pair.of(bzq.c(0.5F), 2),
                     Pair.of(bzq.a(0.15F, false), 2),
                     Pair.of(caf.a(cjj::a, cjj::d, 3), 3),
                     Pair.of(cbl.a(bvj::bm), 5),
                     Pair.of(cbl.a(bvj::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bwf $$0) {
      dhh $$1 = $$0.dV();
      Optional<bzm> $$2 = $$0.eb().c(cfj.n);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cji $$0) {
      bxh<cji> $$1 = $$0.eb();
      crn $$2 = $$1.g().orElse(null);
      if ($$2 != crn.p) {
         $$1.a(ImmutableList.of(crn.p, crn.k, crn.b));
         if ($$2 == crn.k && $$1.g().orElse(null) != crn.k) {
            $$1.a(cfj.U, true, 2400L);
         }
      }
   }

   private static float b(bwf $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bwf $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bwf $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bwf> a(ash $$0, cji $$1) {
      return bya.a($$1) ? Optional.empty() : $$1.eb().c(cfj.B);
   }

   public static Predicate<cxo> a() {
      return $$0 -> $$0.a(ayd.aE);
   }
}
