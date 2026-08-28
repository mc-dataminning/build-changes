import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class chq {
   private static final brd a = brd.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bvo<?> a(bvo<chp> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvo<chp> $$0) {
      $$0.a(cpp.p, ImmutableList.of(Pair.of(0, new chr()), Pair.of(1, bwr.a(bwh::a, cdq.N))), ImmutableSet.of(Pair.of(cdq.N, cdr.a)), ImmutableSet.of(cdq.N));
   }

   private static void c(bvo<chp> $$0) {
      $$0.a(cpp.k, 0, ImmutableList.of(byu.a(chp::a), byk.a(chq::b), bxm.a(20), bwr.a(bwh::a, cdq.o)), cdq.o);
   }

   private static void d(bvo<chp> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new bxl(45, 90), new bxp(), chs.a(), new bwl(cdq.P)));
   }

   private static void e(bvo<chp> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, byf.a(bty.by, 6.0F, brd.a(30, 60))),
            Pair.of(1, new bvz(bty.f, 0.2F, 2)),
            Pair.of(2, new byc(ImmutableList.of(Pair.of(new bws(chq::d), 1), Pair.of(bwc.a(a, chq::c), 1)))),
            Pair.of(3, byr.a(chq::b)),
            Pair.of(3, bze.a(6, 0.15F)),
            Pair.of(
               4,
               new bwt(
                  ImmutableMap.of(cdq.m, cdr.b),
                  ImmutableSet.of(),
                  bwt.a.a,
                  bwt.b.b,
                  ImmutableList.of(
                     Pair.of(bxx.c(0.5F), 2),
                     Pair.of(bxx.a(0.15F, false), 2),
                     Pair.of(bym.a(chq::a, chq::d, 3), 3),
                     Pair.of(bzs.a(btr::bl), 5),
                     Pair.of(bzs.a(btr::aH), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bun $$0) {
      dej $$1 = $$0.dS();
      Optional<bxt> $$2 = $$0.dY().c(cdq.n);
      if ($$2.isPresent()) {
         jf $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bl();
      } else {
         return false;
      }
   }

   public static void a(chp $$0) {
      bvo<chp> $$1 = $$0.dY();
      cpp $$2 = $$1.g().orElse(null);
      if ($$2 != cpp.p) {
         $$1.a(ImmutableList.of(cpp.p, cpp.k, cpp.b));
         if ($$2 == cpp.k && $$1.g().orElse(null) != cpp.k) {
            $$1.a(cdq.U, true, 2400L);
         }
      }
   }

   private static float b(bun $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float c(bun $$0) {
      return $$0.bl() ? 0.6F : 0.15F;
   }

   private static float d(bun $$0) {
      return $$0.bl() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bun> b(chp $$0) {
      return bwh.a($$0) ? Optional.empty() : $$0.dY().c(cdq.B);
   }

   public static Predicate<cvs> a() {
      return $$0 -> $$0.a(axe.ay);
   }
}
