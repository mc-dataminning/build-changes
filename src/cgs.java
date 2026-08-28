import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgs {
   private static final bqf a = bqf.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bur<?> a(bur<cgr> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<cgr> $$0) {
      $$0.a(com.p, ImmutableList.of(Pair.of(0, new cgt()), Pair.of(1, bvu.a(bvk::a, cct.N))), ImmutableSet.of(Pair.of(cct.N, ccu.a)), ImmutableSet.of(cct.N));
   }

   private static void c(bur<cgr> $$0) {
      $$0.a(com.k, 0, ImmutableList.of(bxx.a(cgr::a), bxn.a(cgs::b), bwp.a(20), bvu.a(bvk::a, cct.o)), cct.o);
   }

   private static void d(bur<cgr> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new bwo(45, 90), new bws(), cgu.a(), new bvo(cct.P)));
   }

   private static void e(bur<cgr> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bxi.a(bta.by, 6.0F, bqf.a(30, 60))),
            Pair.of(1, new bvc(bta.f, 0.2F, 2)),
            Pair.of(2, new bxf(ImmutableList.of(Pair.of(new bvv(cgs::d), 1), Pair.of(bvf.a(a, cgs::c), 1)))),
            Pair.of(3, bxu.a(cgs::b)),
            Pair.of(3, byh.a(6, 0.15F)),
            Pair.of(
               4,
               new bvw(
                  ImmutableMap.of(cct.m, ccu.b),
                  ImmutableSet.of(),
                  bvw.a.a,
                  bvw.b.b,
                  ImmutableList.of(
                     Pair.of(bxa.c(0.5F), 2),
                     Pair.of(bxa.a(0.15F, false), 2),
                     Pair.of(bxp.a(cgs::a, cgs::d, 3), 3),
                     Pair.of(byv.a(bsu::bh), 5),
                     Pair.of(byv.a(bsu::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btp $$0) {
      dby $$1 = $$0.dP();
      Optional<bww> $$2 = $$0.dS().c(cct.n);
      if ($$2.isPresent()) {
         iz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cgr $$0) {
      bur<cgr> $$1 = $$0.dS();
      com $$2 = $$1.g().orElse(null);
      if ($$2 != com.p) {
         $$1.a(ImmutableList.of(com.p, com.k, com.b));
         if ($$2 == com.k && $$1.g().orElse(null) != com.k) {
            $$1.a(cct.U, true, 2400L);
         }
      }
   }

   private static float b(btp $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(btp $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(btp $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btp> b(cgr $$0) {
      return bvk.a($$0) ? Optional.empty() : $$0.dS().c(cct.B);
   }

   public static Predicate<cup> a() {
      return $$0 -> $$0.a(awy.ay);
   }
}
