import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgp {
   private static final bqb a = bqb.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static buo<?> a(buo<cgo> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<cgo> $$0) {
      $$0.a(cok.p, ImmutableList.of(Pair.of(0, new cgq()), Pair.of(1, bvr.a(bvh::a, ccq.N))), ImmutableSet.of(Pair.of(ccq.N, ccr.a)), ImmutableSet.of(ccq.N));
   }

   private static void c(buo<cgo> $$0) {
      $$0.a(cok.k, 0, ImmutableList.of(bxu.a(cgo::a), bxk.a(cgp::b), bwm.a(20), bvr.a(bvh::a, ccq.o)), ccq.o);
   }

   private static void d(buo<cgo> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwl(45, 90), new bwp(), cgr.a(), new bvl(ccq.P)));
   }

   private static void e(buo<cgo> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxf.a(bsw.by, 6.0F, bqb.a(30, 60))),
            Pair.of(1, new buz(bsw.f, 0.2F, 2)),
            Pair.of(2, new bxc(ImmutableList.of(Pair.of(new bvs(cgp::d), 1), Pair.of(bvc.a(a, cgp::c), 1)))),
            Pair.of(3, bxr.a(cgp::b)),
            Pair.of(3, bye.a(6, 0.15F)),
            Pair.of(
               4,
               new bvt(
                  ImmutableMap.of(ccq.m, ccr.b),
                  ImmutableSet.of(),
                  bvt.a.a,
                  bvt.b.b,
                  ImmutableList.of(
                     Pair.of(bwx.c(0.5F), 2),
                     Pair.of(bwx.a(0.15F, false), 2),
                     Pair.of(bxm.a(cgp::a, cgp::d, 3), 3),
                     Pair.of(bys.a(bsq::bi), 5),
                     Pair.of(bys.a(bsq::aF), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btl $$0) {
      dcu $$1 = $$0.dQ();
      Optional<bwt> $$2 = $$0.dU().c(ccq.n);
      if ($$2.isPresent()) {
         jd $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bi();
      } else {
         return false;
      }
   }

   public static void a(cgo $$0) {
      buo<cgo> $$1 = $$0.dU();
      cok $$2 = $$1.g().orElse(null);
      if ($$2 != cok.p) {
         $$1.a(ImmutableList.of(cok.p, cok.k, cok.b));
         if ($$2 == cok.k && $$1.g().orElse(null) != cok.k) {
            $$1.a(ccq.U, true, 2400L);
         }
      }
   }

   private static float b(btl $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float c(btl $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float d(btl $$0) {
      return $$0.bi() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btl> b(cgo $$0) {
      return bvh.a($$0) ? Optional.empty() : $$0.dU().c(ccq.B);
   }

   public static Predicate<cuo> a() {
      return $$0 -> $$0.a(awm.ay);
   }
}
