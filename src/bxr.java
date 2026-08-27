import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bxr {
   private static final bib a = bib.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bly<?> a(bly<bxq> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   private static void b(bly<bxq> $$0) {
      $$0.a(cex.p, ImmutableList.of(Pair.of(0, new bxs()), Pair.of(1, bnb.a(bmr::a, btz.M))), ImmutableSet.of(Pair.of(btz.M, bua.a)), ImmutableSet.of(btz.M));
   }

   private static void c(bly<bxq> $$0) {
      $$0.a(cex.k, 0, ImmutableList.of(bpd.a(bxq::a), bot.a(bxr::b), bnv.a(20), bnb.a(bmr::a, btz.o)), btz.o);
   }

   private static void d(bly<bxq> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bnu(45, 90), new bny(), bxt.a(), new bmv(btz.O)));
   }

   private static void e(bly<bxq> $$0) {
      $$0.a(
         cex.b,
         ImmutableList.of(
            Pair.of(0, boo.a(bkm.bt, 6.0F, bib.a(30, 60))),
            Pair.of(1, new bmj(bkm.f, 0.2F)),
            Pair.of(2, new bol(ImmutableList.of(Pair.of(new bnc(bxr::d), 1), Pair.of(bmm.a(a, bxr::c), 1)))),
            Pair.of(3, bpa.a(bxr::b)),
            Pair.of(3, bpn.a(6, 0.15F)),
            Pair.of(
               4,
               new bnd(
                  ImmutableMap.of(btz.m, bua.b),
                  ImmutableSet.of(),
                  bnd.a.a,
                  bnd.b.b,
                  ImmutableList.of(
                     Pair.of(bog.c(0.5F), 2),
                     Pair.of(bog.a(0.15F, false), 2),
                     Pair.of(bov.a(bxr::a, bxr::d, 3), 3),
                     Pair.of(bqb.a(bki::ba), 5),
                     Pair.of(bqb.a(bki::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bky $$0) {
      crs $$1 = $$0.dL();
      Optional<boc> $$2 = $$0.dN().c(btz.n);
      if ($$2.isPresent()) {
         ht $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bxq $$0) {
      bly<bxq> $$1 = $$0.dN();
      cex $$2 = $$1.g().orElse(null);
      if ($$2 != cex.p) {
         $$1.a(ImmutableList.of(cex.p, cex.k, cex.b));
         if ($$2 == cex.k && $$1.g().orElse(null) != cex.k) {
            $$1.a(btz.T, true, 2400L);
         }
      }
   }

   private static float b(bky $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(bky $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(bky $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bky> b(bxq $$0) {
      return bmr.a($$0) ? Optional.empty() : $$0.dN().c(btz.B);
   }

   public static coc a() {
      return coc.a(ark.aA);
   }
}
