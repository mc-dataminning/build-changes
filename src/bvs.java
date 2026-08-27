import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bvs {
   private static final bgb a = bgb.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bjz<?> a(bjz<bvr> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjz<bvr> $$0) {
      $$0.a(ccy.p, ImmutableList.of(Pair.of(0, new bvt()), Pair.of(1, blc.a(bks::a, bsa.M))), ImmutableSet.of(Pair.of(bsa.M, bsb.a)), ImmutableSet.of(bsa.M));
   }

   private static void c(bjz<bvr> $$0) {
      $$0.a(ccy.k, 0, ImmutableList.of(bne.a(bvr::a), bmu.a(bvs::b), blw.a(20), blc.a(bks::a, bsa.o)), bsa.o);
   }

   private static void d(bjz<bvr> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new blv(45, 90), new blz(), bvu.a(), new bkw(bsa.O)));
   }

   private static void e(bjz<bvr> $$0) {
      $$0.a(
         ccy.b,
         ImmutableList.of(
            Pair.of(0, bmp.a(bim.bt, 6.0F, bgb.a(30, 60))),
            Pair.of(1, new bkk(bim.f, 0.2F)),
            Pair.of(2, new bmm(ImmutableList.of(Pair.of(new bld(bvs::d), 1), Pair.of(bkn.a(a, bvs::c), 1)))),
            Pair.of(3, bnb.a(bvs::b)),
            Pair.of(3, bno.a(6, 0.15F)),
            Pair.of(
               4,
               new ble(
                  ImmutableMap.of(bsa.m, bsb.b),
                  ImmutableSet.of(),
                  ble.a.a,
                  ble.b.b,
                  ImmutableList.of(
                     Pair.of(bmh.c(0.5F), 2),
                     Pair.of(bmh.a(0.15F, false), 2),
                     Pair.of(bmw.a(bvs::a, bvs::d, 3), 3),
                     Pair.of(boc.a(bii::ba), 5),
                     Pair.of(boc.a(bii::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(biy $$0) {
      cpm $$1 = $$0.dK();
      Optional<bmd> $$2 = $$0.dM().c(bsa.n);
      if ($$2.isPresent()) {
         gu $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bvr $$0) {
      bjz<bvr> $$1 = $$0.dM();
      ccy $$2 = $$1.g().orElse(null);
      if ($$2 != ccy.p) {
         $$1.a(ImmutableList.of(ccy.p, ccy.k, ccy.b));
         if ($$2 == ccy.k && $$1.g().orElse(null) != ccy.k) {
            $$1.a(bsa.T, true, 2400L);
         }
      }
   }

   private static float b(biy $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(biy $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(biy $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends biy> b(bvr $$0) {
      return bks.a($$0) ? Optional.empty() : $$0.dM().c(bsa.B);
   }

   public static cly a() {
      return cly.a(apt.aA);
   }
}
