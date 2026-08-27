import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cfr {
   private static final bpf a = bpf.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static btq<?> a(btq<cfq> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cfq> $$0) {
      $$0.a(cnl.p, ImmutableList.of(Pair.of(0, new cfs()), Pair.of(1, but.a(buj::a, cbs.N))), ImmutableSet.of(Pair.of(cbs.N, cbt.a)), ImmutableSet.of(cbs.N));
   }

   private static void c(btq<cfq> $$0) {
      $$0.a(cnl.k, 0, ImmutableList.of(bww.a(cfq::a), bwm.a(cfr::b), bvo.a(20), but.a(buj::a, cbs.o)), cbs.o);
   }

   private static void d(btq<cfq> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bvn(45, 90), new bvr(), cft.a(), new bun(cbs.P)));
   }

   private static void e(btq<cfq> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bwh.a(bsa.by, 6.0F, bpf.a(30, 60))),
            Pair.of(1, new bub(bsa.f, 0.2F, 2)),
            Pair.of(2, new bwe(ImmutableList.of(Pair.of(new buu(cfr::d), 1), Pair.of(bue.a(a, cfr::c), 1)))),
            Pair.of(3, bwt.a(cfr::b)),
            Pair.of(3, bxg.a(6, 0.15F)),
            Pair.of(
               4,
               new buv(
                  ImmutableMap.of(cbs.m, cbt.b),
                  ImmutableSet.of(),
                  buv.a.a,
                  buv.b.b,
                  ImmutableList.of(
                     Pair.of(bvz.c(0.5F), 2),
                     Pair.of(bvz.a(0.15F, false), 2),
                     Pair.of(bwo.a(cfr::a, cfr::d, 3), 3),
                     Pair.of(bxu.a(bru::bh), 5),
                     Pair.of(bxu.a(bru::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bso $$0) {
      dax $$1 = $$0.dP();
      Optional<bvv> $$2 = $$0.dS().c(cbs.n);
      if ($$2.isPresent()) {
         io $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cfq $$0) {
      btq<cfq> $$1 = $$0.dS();
      cnl $$2 = $$1.g().orElse(null);
      if ($$2 != cnl.p) {
         $$1.a(ImmutableList.of(cnl.p, cnl.k, cnl.b));
         if ($$2 == cnl.k && $$1.g().orElse(null) != cnl.k) {
            $$1.a(cbs.U, true, 2400L);
         }
      }
   }

   private static float b(bso $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(bso $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(bso $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bso> b(cfq $$0) {
      return buj.a($$0) ? Optional.empty() : $$0.dS().c(cbs.B);
   }

   public static Predicate<cto> a() {
      return $$0 -> $$0.a(awe.ay);
   }
}
