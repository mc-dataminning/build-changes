import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cla {
   private static final buc a = buc.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static byu<?> a(byu<ckz> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<ckz> $$0) {
      $$0.a(ctr.p, ImmutableList.of(Pair.of(0, new clb()), Pair.of(1, bzx.a(bzn::a, cgw.O))), ImmutableSet.of(Pair.of(cgw.O, cgx.a)), ImmutableSet.of(cgw.O));
   }

   private static void c(byu<ckz> $$0) {
      $$0.a(ctr.k, 0, ImmutableList.of(cca.a(ckz::a), cbq.a(cla::b), cas.a(20), bzx.a(bzn::a, cgw.p)), cgw.p);
   }

   private static void d(byu<ckz> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new car(45, 90), new cav(), clc.a(), new bzr(cgw.Q)));
   }

   private static void e(byu<ckz> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, cbl.a(bxc.bT, 6.0F, buc.a(30, 60))),
            Pair.of(1, new bzf(bxc.i, 0.2F, 2)),
            Pair.of(2, new cbi(ImmutableList.of(Pair.of(new bzy(cla::d), 1), Pair.of(bzi.a(a, cla::c), 1)))),
            Pair.of(3, cbx.a(cla::a)),
            Pair.of(3, cck.a(6, 0.15F)),
            Pair.of(
               4,
               new bzz(
                  ImmutableMap.of(cgw.n, cgx.b),
                  ImmutableSet.of(),
                  bzz.a.a,
                  bzz.b.b,
                  ImmutableList.of(
                     Pair.of(cbd.c(0.5F), 2),
                     Pair.of(cbd.a(0.15F, false), 2),
                     Pair.of(cbs.a(cla::a, cla::d, 3), 3),
                     Pair.of(ccy.a(bwt::bi), 5),
                     Pair.of(ccy.a(bwt::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bxu $$0) {
      djx $$1 = $$0.dV();
      Optional<caz> $$2 = $$0.ec().c(cgw.o);
      if ($$2.isPresent()) {
         iv $$3 = $$2.get().b();
         return $$1.A($$3) == $$0.bi();
      } else {
         return false;
      }
   }

   public static void a(ckz $$0) {
      byu<ckz> $$1 = $$0.ec();
      ctr $$2 = $$1.g().orElse(null);
      if ($$2 != ctr.p) {
         $$1.a(ImmutableList.of(ctr.p, ctr.k, ctr.b));
         if ($$2 == ctr.k && $$1.g().orElse(null) != ctr.k) {
            $$1.a(cgw.V, true, 2400L);
         }
      }
   }

   private static float b(bxu $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float c(bxu $$0) {
      return $$0.bi() ? 0.6F : 0.15F;
   }

   private static float d(bxu $$0) {
      return $$0.bi() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bxu> a(ars $$0, ckz $$1) {
      return bzn.a($$1) ? Optional.empty() : $$1.ec().c(cgw.C);
   }

   public static Predicate<czy> a() {
      return $$0 -> $$0.a(axm.aD);
   }
}
