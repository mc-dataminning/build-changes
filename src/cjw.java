import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cjw {
   private static final btb a = btb.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bxr<?> a(bxr<cjv> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<cjv> $$0) {
      $$0.a(crz.p, ImmutableList.of(Pair.of(0, new cjx()), Pair.of(1, byu.a(byk::a, cft.O))), ImmutableSet.of(Pair.of(cft.O, cfu.a)), ImmutableSet.of(cft.O));
   }

   private static void c(bxr<cjv> $$0) {
      $$0.a(crz.k, 0, ImmutableList.of(cax.a(cjv::a), can.a(cjw::b), bzp.a(20), byu.a(byk::a, cft.p)), cft.p);
   }

   private static void d(bxr<cjv> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new bzo(45, 90), new bzs(), cjy.a(), new byo(cft.Q)));
   }

   private static void e(bxr<cjv> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, cai.a(bwb.bR, 6.0F, btb.a(30, 60))),
            Pair.of(1, new byc(bwb.h, 0.2F, 2)),
            Pair.of(2, new caf(ImmutableList.of(Pair.of(new byv(cjw::d), 1), Pair.of(byf.a(a, cjw::c), 1)))),
            Pair.of(3, cau.a(cjw::a)),
            Pair.of(3, cbh.a(6, 0.15F)),
            Pair.of(
               4,
               new byw(
                  ImmutableMap.of(cft.n, cfu.b),
                  ImmutableSet.of(),
                  byw.a.a,
                  byw.b.b,
                  ImmutableList.of(
                     Pair.of(caa.c(0.5F), 2),
                     Pair.of(caa.a(0.15F, false), 2),
                     Pair.of(cap.a(cjw::a, cjw::d, 3), 3),
                     Pair.of(cbv.a(bvs::bj), 5),
                     Pair.of(cbv.a(bvs::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bwr $$0) {
      dhp $$1 = $$0.dV();
      Optional<bzw> $$2 = $$0.eb().c(cft.o);
      if ($$2.isPresent()) {
         jj $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bj();
      } else {
         return false;
      }
   }

   public static void a(cjv $$0) {
      bxr<cjv> $$1 = $$0.eb();
      crz $$2 = $$1.g().orElse(null);
      if ($$2 != crz.p) {
         $$1.a(ImmutableList.of(crz.p, crz.k, crz.b));
         if ($$2 == crz.k && $$1.g().orElse(null) != crz.k) {
            $$1.a(cft.V, true, 2400L);
         }
      }
   }

   private static float b(bwr $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float c(bwr $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float d(bwr $$0) {
      return $$0.bj() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bwr> a(arn $$0, cjv $$1) {
      return byk.a($$1) ? Optional.empty() : $$1.eb().c(cft.C);
   }

   public static Predicate<cxy> a() {
      return $$0 -> $$0.a(axi.aC);
   }
}
