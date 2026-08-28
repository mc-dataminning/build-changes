import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cgf {
   private static final bps a = bps.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bue<?> a(bue<cge> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(coa.a));
      $$0.b(coa.b);
      $$0.f();
      return $$0;
   }

   private static void b(bue<cge> $$0) {
      $$0.a(coa.p, ImmutableList.of(Pair.of(0, new cgg()), Pair.of(1, bvh.a(bux::a, ccg.N))), ImmutableSet.of(Pair.of(ccg.N, cch.a)), ImmutableSet.of(ccg.N));
   }

   private static void c(bue<cge> $$0) {
      $$0.a(coa.k, 0, ImmutableList.of(bxk.a(cge::a), bxa.a(cgf::b), bwc.a(20), bvh.a(bux::a, ccg.o)), ccg.o);
   }

   private static void d(bue<cge> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bwb(45, 90), new bwf(), cgh.a(), new bvb(ccg.P)));
   }

   private static void e(bue<cge> $$0) {
      $$0.a(
         coa.b,
         ImmutableList.of(
            Pair.of(0, bwv.a(bsn.by, 6.0F, bps.a(30, 60))),
            Pair.of(1, new bup(bsn.f, 0.2F, 2)),
            Pair.of(2, new bws(ImmutableList.of(Pair.of(new bvi(cgf::d), 1), Pair.of(bus.a(a, cgf::c), 1)))),
            Pair.of(3, bxh.a(cgf::b)),
            Pair.of(3, bxu.a(6, 0.15F)),
            Pair.of(
               4,
               new bvj(
                  ImmutableMap.of(ccg.m, cch.b),
                  ImmutableSet.of(),
                  bvj.a.a,
                  bvj.b.b,
                  ImmutableList.of(
                     Pair.of(bwn.c(0.5F), 2),
                     Pair.of(bwn.a(0.15F, false), 2),
                     Pair.of(bxc.a(cgf::a, cgf::d, 3), 3),
                     Pair.of(byi.a(bsh::bj), 5),
                     Pair.of(byi.a(bsh::aG), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(btc $$0) {
      dcg $$1 = $$0.dR();
      Optional<bwj> $$2 = $$0.dV().c(ccg.n);
      if ($$2.isPresent()) {
         ja $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bj();
      } else {
         return false;
      }
   }

   public static void a(cge $$0) {
      bue<cge> $$1 = $$0.dV();
      coa $$2 = $$1.g().orElse(null);
      if ($$2 != coa.p) {
         $$1.a(ImmutableList.of(coa.p, coa.k, coa.b));
         if ($$2 == coa.k && $$1.g().orElse(null) != coa.k) {
            $$1.a(ccg.U, true, 2400L);
         }
      }
   }

   private static float b(btc $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float c(btc $$0) {
      return $$0.bj() ? 0.6F : 0.15F;
   }

   private static float d(btc $$0) {
      return $$0.bj() ? 0.5F : 0.15F;
   }

   private static Optional<? extends btc> b(cge $$0) {
      return bux.a($$0) ? Optional.empty() : $$0.dV().c(ccg.B);
   }

   public static Predicate<cud> a() {
      return $$0 -> $$0.a(awf.ay);
   }
}
