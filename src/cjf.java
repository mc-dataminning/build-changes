import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cjf {
   private static final bsj a = bsj.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bxa<?> a(bxa<cje> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<cje> $$0) {
      $$0.a(cri.p, ImmutableList.of(Pair.of(0, new cjg()), Pair.of(1, byd.a(bxt::a, cfc.N))), ImmutableSet.of(Pair.of(cfc.N, cfd.a)), ImmutableSet.of(cfc.N));
   }

   private static void c(bxa<cje> $$0) {
      $$0.a(cri.k, 0, ImmutableList.of(cag.a(cje::a), bzw.a(cjf::b), byy.a(20), byd.a(bxt::a, cfc.o)), cfc.o);
   }

   private static void d(bxa<cje> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new byx(45, 90), new bzb(), cjh.a(), new bxx(cfc.P)));
   }

   private static void e(bxa<cje> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, bzr.a(bvi.bR, 6.0F, bsj.a(30, 60))),
            Pair.of(1, new bxl(bvi.h, 0.2F, 2)),
            Pair.of(2, new bzo(ImmutableList.of(Pair.of(new bye(cjf::d), 1), Pair.of(bxo.a(a, cjf::c), 1)))),
            Pair.of(3, cad.a(cjf::a)),
            Pair.of(3, caq.a(6, 0.15F)),
            Pair.of(
               4,
               new byf(
                  ImmutableMap.of(cfc.m, cfd.b),
                  ImmutableSet.of(),
                  byf.a.a,
                  byf.b.b,
                  ImmutableList.of(
                     Pair.of(bzj.c(0.5F), 2),
                     Pair.of(bzj.a(0.15F, false), 2),
                     Pair.of(bzy.a(cjf::a, cjf::d, 3), 3),
                     Pair.of(cbe.a(bva::bj), 5),
                     Pair.of(cbe.a(bva::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bvy $$0) {
      dgz $$1 = $$0.dU();
      Optional<bzf> $$2 = $$0.ea().c(cfc.n);
      if ($$2.isPresent()) {
         ji $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bj();
      } else {
         return false;
      }
   }

   public static void a(cje $$0) {
      bxa<cje> $$1 = $$0.ea();
      cri $$2 = $$1.g().orElse(null);
      if ($$2 != cri.p) {
         $$1.a(ImmutableList.of(cri.p, cri.k, cri.b));
         if ($$2 == cri.k && $$1.g().orElse(null) != cri.k) {
            $$1.a(cfc.U, true, 2400L);
         }
      }
   }

   private static float b(bvy $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float c(bvy $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float d(bvy $$0) {
      return $$0.bj() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bvy> a(ard $$0, cje $$1) {
      return bxt.a($$1) ? Optional.empty() : $$1.ea().c(cfc.B);
   }

   public static Predicate<cxh> a() {
      return $$0 -> $$0.a(awy.aC);
   }
}
