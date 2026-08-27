import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bza {
   private static final bjg a = bjg.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bnf<?> a(bnf<byz> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<byz> $$0) {
      $$0.a(cgn.p, ImmutableList.of(Pair.of(0, new bzb()), Pair.of(1, boi.a(bny::a, bvh.M))), ImmutableSet.of(Pair.of(bvh.M, bvi.a)), ImmutableSet.of(bvh.M));
   }

   private static void c(bnf<byz> $$0) {
      $$0.a(cgn.k, 0, ImmutableList.of(bql.a(byz::a), bqb.a(bza::b), bpd.a(20), boi.a(bny::a, bvh.o)), bvh.o);
   }

   private static void d(bnf<byz> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bpc(45, 90), new bpg(), bzc.a(), new boc(bvh.O)));
   }

   private static void e(bnf<byz> $$0) {
      $$0.a(
         cgn.b,
         ImmutableList.of(
            Pair.of(0, bpw.a(blt.bv, 6.0F, bjg.a(30, 60))),
            Pair.of(1, new bnq(blt.f, 0.2F)),
            Pair.of(2, new bpt(ImmutableList.of(Pair.of(new boj(bza::d), 1), Pair.of(bnt.a(a, bza::c), 1)))),
            Pair.of(3, bqi.a(bza::b)),
            Pair.of(3, bqv.a(6, 0.15F)),
            Pair.of(
               4,
               new bok(
                  ImmutableMap.of(bvh.m, bvi.b),
                  ImmutableSet.of(),
                  bok.a.a,
                  bok.b.b,
                  ImmutableList.of(
                     Pair.of(bpo.c(0.5F), 2),
                     Pair.of(bpo.a(0.15F, false), 2),
                     Pair.of(bqd.a(bza::a, bza::d, 3), 3),
                     Pair.of(brj.a(blp::bc), 5),
                     Pair.of(brj.a(blp::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bmf $$0) {
      cti $$1 = $$0.dM();
      Optional<bpk> $$2 = $$0.dO().c(bvh.n);
      if ($$2.isPresent()) {
         hx $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(byz $$0) {
      bnf<byz> $$1 = $$0.dO();
      cgn $$2 = $$1.g().orElse(null);
      if ($$2 != cgn.p) {
         $$1.a(ImmutableList.of(cgn.p, cgn.k, cgn.b));
         if ($$2 == cgn.k && $$1.g().orElse(null) != cgn.k) {
            $$1.a(bvh.T, true, 2400L);
         }
      }
   }

   private static float b(bmf $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(bmf $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(bmf $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bmf> b(byz $$0) {
      return bny.a($$0) ? Optional.empty() : $$0.dO().c(bvh.B);
   }

   public static cps a() {
      return cps.a(asj.aA);
   }
}
