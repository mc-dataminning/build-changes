import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cbi {
   private static final blh a = blh.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bpj<?> a(bpj<cbh> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cbh> $$0) {
      $$0.a(ciy.p, ImmutableList.of(Pair.of(0, new cbj()), Pair.of(1, bqm.a(bqc::a, bxl.N))), ImmutableSet.of(Pair.of(bxl.N, bxm.a)), ImmutableSet.of(bxl.N));
   }

   private static void c(bpj<cbh> $$0) {
      $$0.a(ciy.k, 0, ImmutableList.of(bsp.a(cbh::a), bsf.a(cbi::b), brh.a(20), bqm.a(bqc::a, bxl.o)), bxl.o);
   }

   private static void d(bpj<cbh> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new brg(45, 90), new brk(), cbk.a(), new bqg(bxl.P)));
   }

   private static void e(bpj<cbh> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bsa.a(bnw.bw, 6.0F, blh.a(30, 60))),
            Pair.of(1, new bpu(bnw.g, 0.2F, 2)),
            Pair.of(2, new brx(ImmutableList.of(Pair.of(new bqn(cbi::d), 1), Pair.of(bpx.a(a, cbi::c), 1)))),
            Pair.of(3, bsm.a(cbi::b)),
            Pair.of(3, bsz.a(6, 0.15F)),
            Pair.of(
               4,
               new bqo(
                  ImmutableMap.of(bxl.m, bxm.b),
                  ImmutableSet.of(),
                  bqo.a.a,
                  bqo.b.b,
                  ImmutableList.of(
                     Pair.of(brs.c(0.5F), 2),
                     Pair.of(brs.a(0.15F, false), 2),
                     Pair.of(bsh.a(cbi::a, cbi::d, 3), 3),
                     Pair.of(btn.a(bnq::bc), 5),
                     Pair.of(btn.a(bnq::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(boi $$0) {
      cvr $$1 = $$0.dM();
      Optional<bro> $$2 = $$0.dO().c(bxl.n);
      if ($$2.isPresent()) {
         hz $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(cbh $$0) {
      bpj<cbh> $$1 = $$0.dO();
      ciy $$2 = $$1.g().orElse(null);
      if ($$2 != ciy.p) {
         $$1.a(ImmutableList.of(ciy.p, ciy.k, ciy.b));
         if ($$2 == ciy.k && $$1.g().orElse(null) != ciy.k) {
            $$1.a(bxl.U, true, 2400L);
         }
      }
   }

   private static float b(boi $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(boi $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(boi $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends boi> b(cbh $$0) {
      return bqc.a($$0) ? Optional.empty() : $$0.dO().c(bxl.B);
   }

   public static csc a() {
      return csc.a(aui.aA);
   }
}
