import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bzf {
   private static final bjl a = bjl.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bnk<?> a(bnk<bze> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<bze> $$0) {
      $$0.a(cgt.p, ImmutableList.of(Pair.of(0, new bzg()), Pair.of(1, bon.a(bod::a, bvm.M))), ImmutableSet.of(Pair.of(bvm.M, bvn.a)), ImmutableSet.of(bvm.M));
   }

   private static void c(bnk<bze> $$0) {
      $$0.a(cgt.k, 0, ImmutableList.of(bqq.a(bze::a), bqg.a(bzf::b), bpi.a(20), bon.a(bod::a, bvm.o)), bvm.o);
   }

   private static void d(bnk<bze> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bph(45, 90), new bpl(), bzh.a(), new boh(bvm.O)));
   }

   private static void e(bnk<bze> $$0) {
      $$0.a(
         cgt.b,
         ImmutableList.of(
            Pair.of(0, bqb.a(bly.bv, 6.0F, bjl.a(30, 60))),
            Pair.of(1, new bnv(bly.f, 0.2F)),
            Pair.of(2, new bpy(ImmutableList.of(Pair.of(new boo(bzf::d), 1), Pair.of(bny.a(a, bzf::c), 1)))),
            Pair.of(3, bqn.a(bzf::b)),
            Pair.of(3, bra.a(6, 0.15F)),
            Pair.of(
               4,
               new bop(
                  ImmutableMap.of(bvm.m, bvn.b),
                  ImmutableSet.of(),
                  bop.a.a,
                  bop.b.b,
                  ImmutableList.of(
                     Pair.of(bpt.c(0.5F), 2),
                     Pair.of(bpt.a(0.15F, false), 2),
                     Pair.of(bqi.a(bzf::a, bzf::d, 3), 3),
                     Pair.of(bro.a(blu::bc), 5),
                     Pair.of(bro.a(blu::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bmk $$0) {
      cto $$1 = $$0.dM();
      Optional<bpp> $$2 = $$0.dO().c(bvm.n);
      if ($$2.isPresent()) {
         hx $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(bze $$0) {
      bnk<bze> $$1 = $$0.dO();
      cgt $$2 = $$1.g().orElse(null);
      if ($$2 != cgt.p) {
         $$1.a(ImmutableList.of(cgt.p, cgt.k, cgt.b));
         if ($$2 == cgt.k && $$1.g().orElse(null) != cgt.k) {
            $$1.a(bvm.T, true, 2400L);
         }
      }
   }

   private static float b(bmk $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(bmk $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(bmk $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bmk> b(bze $$0) {
      return bod.a($$0) ? Optional.empty() : $$0.dO().c(bvm.B);
   }

   public static cpy a() {
      return cpy.a(aso.aA);
   }
}
