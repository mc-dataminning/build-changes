import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class chz {
   private static final brj a = brj.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bvx<?> a(bvx<chy> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvx<chy> $$0) {
      $$0.a(cpz.p, ImmutableList.of(Pair.of(0, new cia()), Pair.of(1, bxa.a(bwq::a, cdz.N))), ImmutableSet.of(Pair.of(cdz.N, cea.a)), ImmutableSet.of(cdz.N));
   }

   private static void c(bvx<chy> $$0) {
      $$0.a(cpz.k, 0, ImmutableList.of(bzd.a(chy::a), byt.a(chz::b), bxv.a(20), bxa.a(bwq::a, cdz.o)), cdz.o);
   }

   private static void d(bvx<chy> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bxu(45, 90), new bxy(), cib.a(), new bwu(cdz.P)));
   }

   private static void e(bvx<chy> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, byo.a(bug.by, 6.0F, brj.a(30, 60))),
            Pair.of(1, new bwi(bug.f, 0.2F, 2)),
            Pair.of(2, new byl(ImmutableList.of(Pair.of(new bxb(chz::d), 1), Pair.of(bwl.a(a, chz::c), 1)))),
            Pair.of(3, bza.a(chz::b)),
            Pair.of(3, bzn.a(6, 0.15F)),
            Pair.of(
               4,
               new bxc(
                  ImmutableMap.of(cdz.m, cea.b),
                  ImmutableSet.of(),
                  bxc.a.a,
                  bxc.b.b,
                  ImmutableList.of(
                     Pair.of(byg.c(0.5F), 2),
                     Pair.of(byg.a(0.15F, false), 2),
                     Pair.of(byv.a(chz::a, chz::d, 3), 3),
                     Pair.of(cab.a(btz::bn), 5),
                     Pair.of(cab.a(btz::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(buv $$0) {
      dev $$1 = $$0.dX();
      Optional<byc> $$2 = $$0.ed().c(cdz.n);
      if ($$2.isPresent()) {
         jg $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bn();
      } else {
         return false;
      }
   }

   public static void a(chy $$0) {
      bvx<chy> $$1 = $$0.ed();
      cpz $$2 = $$1.g().orElse(null);
      if ($$2 != cpz.p) {
         $$1.a(ImmutableList.of(cpz.p, cpz.k, cpz.b));
         if ($$2 == cpz.k && $$1.g().orElse(null) != cpz.k) {
            $$1.a(cdz.U, true, 2400L);
         }
      }
   }

   private static float b(buv $$0) {
      return $$0.bn() ? 0.6F : 0.15F;
   }

   private static float c(buv $$0) {
      return $$0.bn() ? 0.6F : 0.15F;
   }

   private static float d(buv $$0) {
      return $$0.bn() ? 0.5F : 0.15F;
   }

   private static Optional<? extends buv> b(chy $$0) {
      return bwq.a($$0) ? Optional.empty() : $$0.ed().c(cdz.B);
   }

   public static Predicate<cvx> a() {
      return $$0 -> $$0.a(axi.az);
   }
}
