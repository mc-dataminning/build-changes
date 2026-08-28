import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgu {
   private static final bqh a = bqh.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static but<?> a(but<cgt> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cop.a));
      $$0.b(cop.b);
      $$0.f();
      return $$0;
   }

   private static void b(but<cgt> $$0) {
      $$0.a(cop.p, ImmutableList.of(Pair.of(0, new cgv()), Pair.of(1, bvw.a(bvm::a, ccv.N))), ImmutableSet.of(Pair.of(ccv.N, ccw.a)), ImmutableSet.of(ccv.N));
   }

   private static void c(but<cgt> $$0) {
      $$0.a(cop.k, 0, ImmutableList.of(bxz.a(cgt::a), bxp.a(cgu::b), bwr.a(20), bvw.a(bvm::a, ccv.o)), ccv.o);
   }

   private static void d(but<cgt> $$0) {
      $$0.a(cop.a, 0, ImmutableList.of(new bwq(45, 90), new bwu(), cgw.a(), new bvq(ccv.P)));
   }

   private static void e(but<cgt> $$0) {
      $$0.a(
         cop.b,
         ImmutableList.of(
            Pair.of(0, bxk.a(btc.by, 6.0F, bqh.a(30, 60))),
            Pair.of(1, new bve(btc.f, 0.2F, 2)),
            Pair.of(2, new bxh(ImmutableList.of(Pair.of(new bvx(cgu::d), 1), Pair.of(bvh.a(a, cgu::c), 1)))),
            Pair.of(3, bxw.a(cgu::b)),
            Pair.of(3, byj.a(6, 0.15F)),
            Pair.of(
               4,
               new bvy(
                  ImmutableMap.of(ccv.m, ccw.b),
                  ImmutableSet.of(),
                  bvy.a.a,
                  bvy.b.b,
                  ImmutableList.of(
                     Pair.of(bxc.c(0.5F), 2),
                     Pair.of(bxc.a(0.15F, false), 2),
                     Pair.of(bxr.a(cgu::a, cgu::d, 3), 3),
                     Pair.of(byx.a(bsw::bh), 5),
                     Pair.of(byx.a(bsw::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btr $$0) {
      dca $$1 = $$0.dP();
      Optional<bwy> $$2 = $$0.dS().c(ccv.n);
      if ($$2.isPresent()) {
         iz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cgt $$0) {
      but<cgt> $$1 = $$0.dS();
      cop $$2 = $$1.g().orElse(null);
      if ($$2 != cop.p) {
         $$1.a(ImmutableList.of(cop.p, cop.k, cop.b));
         if ($$2 == cop.k && $$1.g().orElse(null) != cop.k) {
            $$1.a(ccv.U, true, 2400L);
         }
      }
   }

   private static float b(btr $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(btr $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(btr $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btr> b(cgt $$0) {
      return bvm.a($$0) ? Optional.empty() : $$0.dS().c(ccv.B);
   }

   public static Predicate<cur> a() {
      return $$0 -> $$0.a(awy.ay);
   }
}
