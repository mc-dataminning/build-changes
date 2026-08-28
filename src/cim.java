import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cim {
   private static final brw a = brw.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bwk<?> a(bwk<cil> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<cil> $$0) {
      $$0.a(cqp.p, ImmutableList.of(Pair.of(0, new cin()), Pair.of(1, bxn.a(bxd::a, cem.N))), ImmutableSet.of(Pair.of(cem.N, cen.a)), ImmutableSet.of(cem.N));
   }

   private static void c(bwk<cil> $$0) {
      $$0.a(cqp.k, 0, ImmutableList.of(bzq.a(cil::a), bzg.a(cim::b), byi.a(20), bxn.a(bxd::a, cem.o)), cem.o);
   }

   private static void d(bwk<cil> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new byh(45, 90), new byl(), cio.a(), new bxh(cem.P)));
   }

   private static void e(bwk<cil> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bzb.a(but.bR, 6.0F, brw.a(30, 60))),
            Pair.of(1, new bwv(but.h, 0.2F, 2)),
            Pair.of(2, new byy(ImmutableList.of(Pair.of(new bxo(cim::d), 1), Pair.of(bwy.a(a, cim::c), 1)))),
            Pair.of(3, bzn.a(cim::a)),
            Pair.of(3, caa.a(6, 0.15F)),
            Pair.of(
               4,
               new bxp(
                  ImmutableMap.of(cem.m, cen.b),
                  ImmutableSet.of(),
                  bxp.a.a,
                  bxp.b.b,
                  ImmutableList.of(
                     Pair.of(byt.c(0.5F), 2),
                     Pair.of(byt.a(0.15F, false), 2),
                     Pair.of(bzi.a(cim::a, cim::d, 3), 3),
                     Pair.of(cao.a(bum::bm), 5),
                     Pair.of(cao.a(bum::aJ), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bvi $$0) {
      dgj $$1 = $$0.dV();
      Optional<byp> $$2 = $$0.eb().c(cem.n);
      if ($$2.isPresent()) {
         ji $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bm();
      } else {
         return false;
      }
   }

   public static void a(cil $$0) {
      bwk<cil> $$1 = $$0.eb();
      cqp $$2 = $$1.g().orElse(null);
      if ($$2 != cqp.p) {
         $$1.a(ImmutableList.of(cqp.p, cqp.k, cqp.b));
         if ($$2 == cqp.k && $$1.g().orElse(null) != cqp.k) {
            $$1.a(cem.U, true, 2400L);
         }
      }
   }

   private static float b(bvi $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float c(bvi $$0) {
      return $$0.bm() ? 0.6F : 0.15F;
   }

   private static float d(bvi $$0) {
      return $$0.bm() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bvi> a(ard $$0, cil $$1) {
      return bxd.a($$1) ? Optional.empty() : $$1.eb().c(cem.B);
   }

   public static Predicate<cwq> a() {
      return $$0 -> $$0.a(awy.aC);
   }
}
