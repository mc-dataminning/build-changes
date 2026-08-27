import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cbe {
   private static final blf a = blf.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bpf<?> a(bpf<cbd> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cbd> $$0) {
      $$0.a(ciu.p, ImmutableList.of(Pair.of(0, new cbf()), Pair.of(1, bqi.a(bpy::a, bxh.N))), ImmutableSet.of(Pair.of(bxh.N, bxi.a)), ImmutableSet.of(bxh.N));
   }

   private static void c(bpf<cbd> $$0) {
      $$0.a(ciu.k, 0, ImmutableList.of(bsl.a(cbd::a), bsb.a(cbe::b), brd.a(20), bqi.a(bpy::a, bxh.o)), bxh.o);
   }

   private static void d(bpf<cbd> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new brc(45, 90), new brg(), cbg.a(), new bqc(bxh.P)));
   }

   private static void e(bpf<cbd> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, brw.a(bnu.bw, 6.0F, blf.a(30, 60))),
            Pair.of(1, new bpq(bnu.g, 0.2F, 2)),
            Pair.of(2, new brt(ImmutableList.of(Pair.of(new bqj(cbe::d), 1), Pair.of(bpt.a(a, cbe::c), 1)))),
            Pair.of(3, bsi.a(cbe::b)),
            Pair.of(3, bsv.a(6, 0.15F)),
            Pair.of(
               4,
               new bqk(
                  ImmutableMap.of(bxh.m, bxi.b),
                  ImmutableSet.of(),
                  bqk.a.a,
                  bqk.b.b,
                  ImmutableList.of(
                     Pair.of(bro.c(0.5F), 2),
                     Pair.of(bro.a(0.15F, false), 2),
                     Pair.of(bsd.a(cbe::a, cbe::d, 3), 3),
                     Pair.of(btj.a(bno::bc), 5),
                     Pair.of(btj.a(bno::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bog $$0) {
      cvn $$1 = $$0.dM();
      Optional<brk> $$2 = $$0.dO().c(bxh.n);
      if ($$2.isPresent()) {
         hz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(cbd $$0) {
      bpf<cbd> $$1 = $$0.dO();
      ciu $$2 = $$1.g().orElse(null);
      if ($$2 != ciu.p) {
         $$1.a(ImmutableList.of(ciu.p, ciu.k, ciu.b));
         if ($$2 == ciu.k && $$1.g().orElse(null) != ciu.k) {
            $$1.a(bxh.U, true, 2400L);
         }
      }
   }

   private static float b(bog $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(bog $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(bog $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bog> b(cbd $$0) {
      return bpy.a($$0) ? Optional.empty() : $$0.dO().c(bxh.B);
   }

   public static cry a() {
      return cry.a(auh.aA);
   }
}
