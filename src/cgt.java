import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgt {
   private static final bqg a = bqg.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bus<?> a(bus<cgs> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(coo.a));
      $$0.b(coo.b);
      $$0.f();
      return $$0;
   }

   private static void b(bus<cgs> $$0) {
      $$0.a(coo.p, ImmutableList.of(Pair.of(0, new cgu()), Pair.of(1, bvv.a(bvl::a, ccu.N))), ImmutableSet.of(Pair.of(ccu.N, ccv.a)), ImmutableSet.of(ccu.N));
   }

   private static void c(bus<cgs> $$0) {
      $$0.a(coo.k, 0, ImmutableList.of(bxy.a(cgs::a), bxo.a(cgt::b), bwq.a(20), bvv.a(bvl::a, ccu.o)), ccu.o);
   }

   private static void d(bus<cgs> $$0) {
      $$0.a(coo.a, 0, ImmutableList.of(new bwp(45, 90), new bwt(), cgv.a(), new bvp(ccu.P)));
   }

   private static void e(bus<cgs> $$0) {
      $$0.a(
         coo.b,
         ImmutableList.of(
            Pair.of(0, bxj.a(btb.by, 6.0F, bqg.a(30, 60))),
            Pair.of(1, new bvd(btb.f, 0.2F, 2)),
            Pair.of(2, new bxg(ImmutableList.of(Pair.of(new bvw(cgt::d), 1), Pair.of(bvg.a(a, cgt::c), 1)))),
            Pair.of(3, bxv.a(cgt::b)),
            Pair.of(3, byi.a(6, 0.15F)),
            Pair.of(
               4,
               new bvx(
                  ImmutableMap.of(ccu.m, ccv.b),
                  ImmutableSet.of(),
                  bvx.a.a,
                  bvx.b.b,
                  ImmutableList.of(
                     Pair.of(bxb.c(0.5F), 2),
                     Pair.of(bxb.a(0.15F, false), 2),
                     Pair.of(bxq.a(cgt::a, cgt::d, 3), 3),
                     Pair.of(byw.a(bsv::bh), 5),
                     Pair.of(byw.a(bsv::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btq $$0) {
      dbz $$1 = $$0.dP();
      Optional<bwx> $$2 = $$0.dS().c(ccu.n);
      if ($$2.isPresent()) {
         iz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cgs $$0) {
      bus<cgs> $$1 = $$0.dS();
      coo $$2 = $$1.g().orElse(null);
      if ($$2 != coo.p) {
         $$1.a(ImmutableList.of(coo.p, coo.k, coo.b));
         if ($$2 == coo.k && $$1.g().orElse(null) != coo.k) {
            $$1.a(ccu.U, true, 2400L);
         }
      }
   }

   private static float b(btq $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(btq $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(btq $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btq> b(cgs $$0) {
      return bvl.a($$0) ? Optional.empty() : $$0.dS().c(ccu.B);
   }

   public static Predicate<cuq> a() {
      return $$0 -> $$0.a(awy.ay);
   }
}
