import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bzg {
   private static final bjm a = bjm.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bnl<?> a(bnl<bzf> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<bzf> $$0) {
      $$0.a(cgu.p, ImmutableList.of(Pair.of(0, new bzh()), Pair.of(1, boo.a(boe::a, bvn.M))), ImmutableSet.of(Pair.of(bvn.M, bvo.a)), ImmutableSet.of(bvn.M));
   }

   private static void c(bnl<bzf> $$0) {
      $$0.a(cgu.k, 0, ImmutableList.of(bqr.a(bzf::a), bqh.a(bzg::b), bpj.a(20), boo.a(boe::a, bvn.o)), bvn.o);
   }

   private static void d(bnl<bzf> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bpi(45, 90), new bpm(), bzi.a(), new boi(bvn.O)));
   }

   private static void e(bnl<bzf> $$0) {
      $$0.a(
         cgu.b,
         ImmutableList.of(
            Pair.of(0, bqc.a(blz.bv, 6.0F, bjm.a(30, 60))),
            Pair.of(1, new bnw(blz.f, 0.2F)),
            Pair.of(2, new bpz(ImmutableList.of(Pair.of(new bop(bzg::d), 1), Pair.of(bnz.a(a, bzg::c), 1)))),
            Pair.of(3, bqo.a(bzg::b)),
            Pair.of(3, brb.a(6, 0.15F)),
            Pair.of(
               4,
               new boq(
                  ImmutableMap.of(bvn.m, bvo.b),
                  ImmutableSet.of(),
                  boq.a.a,
                  boq.b.b,
                  ImmutableList.of(
                     Pair.of(bpu.c(0.5F), 2),
                     Pair.of(bpu.a(0.15F, false), 2),
                     Pair.of(bqj.a(bzg::a, bzg::d, 3), 3),
                     Pair.of(brp.a(blv::bc), 5),
                     Pair.of(brp.a(blv::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bml $$0) {
      ctp $$1 = $$0.dM();
      Optional<bpq> $$2 = $$0.dO().c(bvn.n);
      if ($$2.isPresent()) {
         hx $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(bzf $$0) {
      bnl<bzf> $$1 = $$0.dO();
      cgu $$2 = $$1.g().orElse(null);
      if ($$2 != cgu.p) {
         $$1.a(ImmutableList.of(cgu.p, cgu.k, cgu.b));
         if ($$2 == cgu.k && $$1.g().orElse(null) != cgu.k) {
            $$1.a(bvn.T, true, 2400L);
         }
      }
   }

   private static float b(bml $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(bml $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(bml $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bml> b(bzf $$0) {
      return boe.a($$0) ? Optional.empty() : $$0.dO().c(bvn.B);
   }

   public static cpz a() {
      return cpz.a(asp.aA);
   }
}
