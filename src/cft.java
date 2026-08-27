import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.function.Predicate;

public class cft {
   private static final bph a = bph.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bts<?> a(bts<cfs> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cfs> $$0) {
      $$0.a(cnn.p, ImmutableList.of(Pair.of(0, new cfu()), Pair.of(1, buv.a(bul::a, cbu.N))), ImmutableSet.of(Pair.of(cbu.N, cbv.a)), ImmutableSet.of(cbu.N));
   }

   private static void c(bts<cfs> $$0) {
      $$0.a(cnn.k, 0, ImmutableList.of(bwy.a(cfs::a), bwo.a(cft::b), bvq.a(20), buv.a(bul::a, cbu.o)), cbu.o);
   }

   private static void d(bts<cfs> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bvp(45, 90), new bvt(), cfv.a(), new bup(cbu.P)));
   }

   private static void e(bts<cfs> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bwj.a(bsc.by, 6.0F, bph.a(30, 60))),
            Pair.of(1, new bud(bsc.f, 0.2F, 2)),
            Pair.of(2, new bwg(ImmutableList.of(Pair.of(new buw(cft::d), 1), Pair.of(bug.a(a, cft::c), 1)))),
            Pair.of(3, bwv.a(cft::b)),
            Pair.of(3, bxi.a(6, 0.15F)),
            Pair.of(
               4,
               new bux(
                  ImmutableMap.of(cbu.m, cbv.b),
                  ImmutableSet.of(),
                  bux.a.a,
                  bux.b.b,
                  ImmutableList.of(
                     Pair.of(bwb.c(0.5F), 2),
                     Pair.of(bwb.a(0.15F, false), 2),
                     Pair.of(bwq.a(cft::a, cft::d, 3), 3),
                     Pair.of(bxw.a(brw::bh), 5),
                     Pair.of(bxw.a(brw::aE), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bsq $$0) {
      daz $$1 = $$0.dP();
      Optional<bvx> $$2 = $$0.dS().c(cbu.n);
      if ($$2.isPresent()) {
         io $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bh();
      } else {
         return false;
      }
   }

   public static void a(cfs $$0) {
      bts<cfs> $$1 = $$0.dS();
      cnn $$2 = $$1.g().orElse(null);
      if ($$2 != cnn.p) {
         $$1.a(ImmutableList.of(cnn.p, cnn.k, cnn.b));
         if ($$2 == cnn.k && $$1.g().orElse(null) != cnn.k) {
            $$1.a(cbu.U, true, 2400L);
         }
      }
   }

   private static float b(bsq $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float c(bsq $$0) {
      return $$0.bh() ? 0.6F : 0.15F;
   }

   private static float d(bsq $$0) {
      return $$0.bh() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bsq> b(cfs $$0) {
      return bul.a($$0) ? Optional.empty() : $$0.dS().c(cbu.B);
   }

   public static Predicate<ctq> a() {
      return $$0 -> $$0.a(awf.ay);
   }
}
