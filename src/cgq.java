import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgq {
   private static final bqd a = bqd.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bup<?> a(bup<cgp> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(bup<cgp> $$0) {
      $$0.a(cok.p, ImmutableList.of(Pair.of(0, new cgr()), Pair.of(1, bvs.a(bvi::a, ccr.N))), ImmutableSet.of(Pair.of(ccr.N, ccs.a)), ImmutableSet.of(ccr.N));
   }

   private static void c(bup<cgp> $$0) {
      $$0.a(cok.k, 0, ImmutableList.of(bxv.a(cgp::a), bxl.a(cgq::b), bwn.a(20), bvs.a(bvi::a, ccr.o)), ccr.o);
   }

   private static void d(bup<cgp> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bwm(45, 90), new bwq(), cgs.a(), new bvm(ccr.P)));
   }

   private static void e(bup<cgp> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bxg.a(bsy.by, 6.0F, bqd.a(30, 60))),
            Pair.of(1, new bva(bsy.f, 0.2F, 2)),
            Pair.of(2, new bxd(ImmutableList.of(Pair.of(new bvt(cgq::d), 1), Pair.of(bvd.a(a, cgq::c), 1)))),
            Pair.of(3, bxs.a(cgq::b)),
            Pair.of(3, byf.a(6, 0.15F)),
            Pair.of(
               4,
               new bvu(
                  ImmutableMap.of(ccr.m, ccs.b),
                  ImmutableSet.of(),
                  bvu.a.a,
                  bvu.b.b,
                  ImmutableList.of(
                     Pair.of(bwy.c(0.5F), 2),
                     Pair.of(bwy.a(0.15F, false), 2),
                     Pair.of(bxn.a(cgq::a, cgq::d, 3), 3),
                     Pair.of(byt.a(bss::bh), 5),
                     Pair.of(byt.a(bss::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btn $$0) {
      dbw $$1 = $$0.dP();
      Optional<bwu> $$2 = $$0.dS().c(ccr.n);
      if ($$2.isPresent()) {
         iz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cgp $$0) {
      bup<cgp> $$1 = $$0.dS();
      cok $$2 = $$1.g().orElse(null);
      if ($$2 != cok.p) {
         $$1.a(ImmutableList.of(cok.p, cok.k, cok.b));
         if ($$2 == cok.k && $$1.g().orElse(null) != cok.k) {
            $$1.a(ccr.U, true, 2400L);
         }
      }
   }

   private static float b(btn $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(btn $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(btn $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btn> b(cgp $$0) {
      return bvi.a($$0) ? Optional.empty() : $$0.dS().c(ccr.B);
   }

   public static Predicate<cun> a() {
      return $$0 -> $$0.a(awx.ay);
   }
}
