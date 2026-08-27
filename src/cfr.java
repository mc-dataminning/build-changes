import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cfr {
   private static final bpl a = bpl.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static btp<?> a(btp<cfq> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cfq> $$0) {
      $$0.a(cnq.p, ImmutableList.of(Pair.of(0, new cfs()), Pair.of(1, bus.a(bui::a, cbr.N))), ImmutableSet.of(Pair.of(cbr.N, cbs.a)), ImmutableSet.of(cbr.N));
   }

   private static void c(btp<cfq> $$0) {
      $$0.a(cnq.k, 0, ImmutableList.of(bwv.a(cfq::a), bwl.a(cfr::b), bvn.a(20), bus.a(bui::a, cbr.o)), cbr.o);
   }

   private static void d(btp<cfq> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bvm(45, 90), new bvq(), cft.a(), new bum(cbr.P)));
   }

   private static void e(btp<cfq> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(1, new bua(bsb.g, 0.2F, 2)),
            Pair.of(2, new bwd(ImmutableList.of(Pair.of(new but(cfr::d), 1), Pair.of(bud.a(a, cfr::c), 1)))),
            Pair.of(3, bws.a(cfr::b)),
            Pair.of(3, bxf.a(6, 0.15F)),
            Pair.of(
               4,
               new buu(
                  ImmutableMap.of(cbr.m, cbs.b),
                  ImmutableSet.of(),
                  buu.a.a,
                  buu.b.b,
                  ImmutableList.of(
                     Pair.of(bvy.c(0.5F), 2),
                     Pair.of(bvy.a(0.15F, false), 2),
                     Pair.of(bwn.a(cfr::a, cfr::d, 3), 3),
                     Pair.of(bxt.a(brv::bl), 5),
                     Pair.of(bxt.a(brv::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bso $$0) {
      dca $$1 = $$0.dU();
      Optional<bvu> $$2 = $$0.dZ().c(cbr.n);
      if ($$2.isPresent()) {
         ir $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bl();
      } else {
         return false;
      }
   }

   public static void a(cfq $$0) {
      btp<cfq> $$1 = $$0.dZ();
      cnq $$2 = $$1.g().orElse(null);
      if ($$2 != cnq.p) {
         $$1.a(ImmutableList.of(cnq.p, cnq.k, cnq.b));
         if ($$2 == cnq.k && $$1.g().orElse(null) != cnq.k) {
            $$1.a(cbr.U, true, 2400L);
         }
      }
   }

   private static float b(bso $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float c(bso $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float d(bso $$0) {
      return $$0.bl() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bso> b(cfq $$0) {
      return bui.a($$0) ? Optional.empty() : $$0.dZ().c(cbr.B);
   }

   public static Predicate<cuh> a() {
      return $$0 -> $$0.a(awm.ay);
   }
}
