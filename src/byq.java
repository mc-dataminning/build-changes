import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class byq {
   private static final biw a = biw.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bmv<?> a(bmv<byp> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<byp> $$0) {
      $$0.a(cgd.p, ImmutableList.of(Pair.of(0, new byr()), Pair.of(1, bny.a(bno::a, bux.M))), ImmutableSet.of(Pair.of(bux.M, buy.a)), ImmutableSet.of(bux.M));
   }

   private static void c(bmv<byp> $$0) {
      $$0.a(cgd.k, 0, ImmutableList.of(bqb.a(byp::a), bpr.a(byq::b), bot.a(20), bny.a(bno::a, bux.o)), bux.o);
   }

   private static void d(bmv<byp> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bos(45, 90), new bow(), bys.a(), new bns(bux.O)));
   }

   private static void e(bmv<byp> $$0) {
      $$0.a(
         cgd.b,
         ImmutableList.of(
            Pair.of(0, bpm.a(blj.bv, 6.0F, biw.a(30, 60))),
            Pair.of(1, new bng(blj.f, 0.2F)),
            Pair.of(2, new bpj(ImmutableList.of(Pair.of(new bnz(byq::d), 1), Pair.of(bnj.a(a, byq::c), 1)))),
            Pair.of(3, bpy.a(byq::b)),
            Pair.of(3, bql.a(6, 0.15F)),
            Pair.of(
               4,
               new boa(
                  ImmutableMap.of(bux.m, buy.b),
                  ImmutableSet.of(),
                  boa.a.a,
                  boa.b.b,
                  ImmutableList.of(
                     Pair.of(bpe.c(0.5F), 2),
                     Pair.of(bpe.a(0.15F, false), 2),
                     Pair.of(bpt.a(byq::a, byq::d, 3), 3),
                     Pair.of(bqz.a(blf::bc), 5),
                     Pair.of(bqz.a(blf::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(blv $$0) {
      csy $$1 = $$0.dM();
      Optional<bpa> $$2 = $$0.dO().c(bux.n);
      if ($$2.isPresent()) {
         hv $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(byp $$0) {
      bmv<byp> $$1 = $$0.dO();
      cgd $$2 = $$1.g().orElse(null);
      if ($$2 != cgd.p) {
         $$1.a(ImmutableList.of(cgd.p, cgd.k, cgd.b));
         if ($$2 == cgd.k && $$1.g().orElse(null) != cgd.k) {
            $$1.a(bux.T, true, 2400L);
         }
      }
   }

   private static float b(blv $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(blv $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(blv $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends blv> b(byp $$0) {
      return bno.a($$0) ? Optional.empty() : $$0.dO().c(bux.B);
   }

   public static cpi a() {
      return cpi.a(arz.aA);
   }
}
