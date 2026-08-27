import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bxz {
   private static final bii a = bii.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bmg<?> a(bmg<bxy> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmg<bxy> $$0) {
      $$0.a(cff.p, ImmutableList.of(Pair.of(0, new bya()), Pair.of(1, bnj.a(bmz::a, buh.M))), ImmutableSet.of(Pair.of(buh.M, bui.a)), ImmutableSet.of(buh.M));
   }

   private static void c(bmg<bxy> $$0) {
      $$0.a(cff.k, 0, ImmutableList.of(bpl.a(bxy::a), bpb.a(bxz::b), bod.a(20), bnj.a(bmz::a, buh.o)), buh.o);
   }

   private static void d(bmg<bxy> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new boc(45, 90), new bog(), byb.a(), new bnd(buh.O)));
   }

   private static void e(bmg<bxy> $$0) {
      $$0.a(
         cff.b,
         ImmutableList.of(
            Pair.of(0, bow.a(bku.bt, 6.0F, bii.a(30, 60))),
            Pair.of(1, new bmr(bku.f, 0.2F)),
            Pair.of(2, new bot(ImmutableList.of(Pair.of(new bnk(bxz::d), 1), Pair.of(bmu.a(a, bxz::c), 1)))),
            Pair.of(3, bpi.a(bxz::b)),
            Pair.of(3, bpv.a(6, 0.15F)),
            Pair.of(
               4,
               new bnl(
                  ImmutableMap.of(buh.m, bui.b),
                  ImmutableSet.of(),
                  bnl.a.a,
                  bnl.b.b,
                  ImmutableList.of(
                     Pair.of(boo.c(0.5F), 2),
                     Pair.of(boo.a(0.15F, false), 2),
                     Pair.of(bpd.a(bxz::a, bxz::d, 3), 3),
                     Pair.of(bqj.a(bkq::bc), 5),
                     Pair.of(bqj.a(bkq::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(blg $$0) {
      csa $$1 = $$0.dN();
      Optional<bok> $$2 = $$0.dP().c(buh.n);
      if ($$2.isPresent()) {
         ht $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(bxy $$0) {
      bmg<bxy> $$1 = $$0.dP();
      cff $$2 = $$1.g().orElse(null);
      if ($$2 != cff.p) {
         $$1.a(ImmutableList.of(cff.p, cff.k, cff.b));
         if ($$2 == cff.k && $$1.g().orElse(null) != cff.k) {
            $$1.a(buh.T, true, 2400L);
         }
      }
   }

   private static float b(blg $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(blg $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(blg $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends blg> b(bxy $$0) {
      return bmz.a($$0) ? Optional.empty() : $$0.dP().c(buh.B);
   }

   public static cok a() {
      return cok.a(aro.aA);
   }
}
