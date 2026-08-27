import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bvu {
   private static final bge a = bge.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bkb<?> a(bkb<bvt> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkb<bvt> $$0) {
      $$0.a(cda.p, ImmutableList.of(Pair.of(0, new bvv()), Pair.of(1, ble.a(bku::a, bsc.M))), ImmutableSet.of(Pair.of(bsc.M, bsd.a)), ImmutableSet.of(bsc.M));
   }

   private static void c(bkb<bvt> $$0) {
      $$0.a(cda.k, 0, ImmutableList.of(bng.a(bvt::a), bmw.a(bvu::b), bly.a(20), ble.a(bku::a, bsc.o)), bsc.o);
   }

   private static void d(bkb<bvt> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new blx(45, 90), new bmb(), bvw.a(), new bky(bsc.O)));
   }

   private static void e(bkb<bvt> $$0) {
      $$0.a(
         cda.b,
         ImmutableList.of(
            Pair.of(0, bmr.a(bip.bt, 6.0F, bge.a(30, 60))),
            Pair.of(1, new bkm(bip.f, 0.2F)),
            Pair.of(2, new bmo(ImmutableList.of(Pair.of(new blf(bvu::d), 1), Pair.of(bkp.a(a, bvu::c), 1)))),
            Pair.of(3, bnd.a(bvu::b)),
            Pair.of(3, bnq.a(6, 0.15F)),
            Pair.of(
               4,
               new blg(
                  ImmutableMap.of(bsc.m, bsd.b),
                  ImmutableSet.of(),
                  blg.a.a,
                  blg.b.b,
                  ImmutableList.of(
                     Pair.of(bmj.c(0.5F), 2),
                     Pair.of(bmj.a(0.15F, false), 2),
                     Pair.of(bmy.a(bvu::a, bvu::d, 3), 3),
                     Pair.of(boe.a(bil::ba), 5),
                     Pair.of(boe.a(bil::aA), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bjb $$0) {
      cpq $$1 = $$0.dK();
      Optional<bmf> $$2 = $$0.dM().c(bsc.n);
      if ($$2.isPresent()) {
         gw $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.ba();
      } else {
         return false;
      }
   }

   public static void a(bvt $$0) {
      bkb<bvt> $$1 = $$0.dM();
      cda $$2 = $$1.g().orElse(null);
      if ($$2 != cda.p) {
         $$1.a(ImmutableList.of(cda.p, cda.k, cda.b));
         if ($$2 == cda.k && $$1.g().orElse(null) != cda.k) {
            $$1.a(bsc.T, true, 2400L);
         }
      }
   }

   private static float b(bjb $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float c(bjb $$0) {
      return $$0.ba() ? 0.6F : 0.15F;
   }

   private static float d(bjb $$0) {
      return $$0.ba() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bjb> b(bvt $$0) {
      return bku.a($$0) ? Optional.empty() : $$0.dM().c(bsc.B);
   }

   public static cmb a() {
      return cmb.a(apw.aA);
   }
}
