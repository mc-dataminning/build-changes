import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class bst {
   private static final bdi a = bdi.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bha<?> a(bha<bss> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(bzz.a));
      $$0.b(bzz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bha<bss> $$0) {
      $$0.a(bzz.p, ImmutableList.of(Pair.of(0, new bsu()), Pair.of(1, bid.a(bht::a, bpb.M))), ImmutableSet.of(Pair.of(bpb.M, bpc.a)), ImmutableSet.of(bpb.M));
   }

   private static void c(bha<bss> $$0) {
      $$0.a(bzz.k, 0, ImmutableList.of(bkf.a(bss::a), bjv.a(bst::b), bix.a(20), bid.a(bht::a, bpb.o)), bpb.o);
   }

   private static void d(bha<bss> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new biw(45, 90), new bja(), bsv.a(), new bhx(bpb.O)));
   }

   private static void e(bha<bss> $$0) {
      $$0.a(
         bzz.b,
         ImmutableList.of(
            Pair.of(0, bjq.a(bfn.bt, 6.0F, bdi.a(30, 60))),
            Pair.of(1, new bhl(bfn.f, 0.2F)),
            Pair.of(2, new bjn(ImmutableList.of(Pair.of(new bie(bst::d), 1), Pair.of(bho.a(a, bst::c), 1)))),
            Pair.of(3, bkc.a(bst::b)),
            Pair.of(3, bkp.a(6, 0.15F)),
            Pair.of(
               4,
               new bif(
                  ImmutableMap.of(bpb.m, bpc.b),
                  ImmutableSet.of(),
                  bif.a.a,
                  bif.b.b,
                  ImmutableList.of(
                     Pair.of(bji.c(0.5F), 2),
                     Pair.of(bji.a(0.15F, false), 2),
                     Pair.of(bjx.a(bst::a, bst::d, 3), 3),
                     Pair.of(bld.a(bfj::aY), 5),
                     Pair.of(bld.a(bfj::ay), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(bfz $$0) {
      cmm $$1 = $$0.dI();
      Optional<bje> $$2 = $$0.dK().c(bpb.n);
      if ($$2.isPresent()) {
         gu $$3 = $$2.get().b();
         return $$1.y($$3) == $$0.aY();
      } else {
         return false;
      }
   }

   public static void a(bss $$0) {
      bha<bss> $$1 = $$0.dK();
      bzz $$2 = $$1.g().orElse(null);
      if ($$2 != bzz.p) {
         $$1.a(ImmutableList.of(bzz.p, bzz.k, bzz.b));
         if ($$2 == bzz.k && $$1.g().orElse(null) != bzz.k) {
            $$1.a(bpb.T, true, 2400L);
         }
      }
   }

   private static float b(bfz $$0) {
      return $$0.aY() ? 0.6F : 0.15F;
   }

   private static float c(bfz $$0) {
      return $$0.aY() ? 0.6F : 0.15F;
   }

   private static float d(bfz $$0) {
      return $$0.aY() ? 0.5F : 0.15F;
   }

   private static Optional<? extends bfz> b(bss $$0) {
      return bht.a($$0) ? Optional.empty() : $$0.dK().c(bpb.B);
   }

   public static ciz a() {
      return ciz.a(ane.aA);
   }
}
