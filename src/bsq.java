import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bsq {
   private static final float a = 1.0F;
   private static final float b = 2.25F;
   private static final float c = 1.75F;
   private static final float d = 2.5F;
   private static final int e = 4;
   private static final int f = 16;
   private static final int g = 6;
   private static final int h = 30;
   private static final int i = 60;
   private static final int j = 600;
   private static final int k = 32;
   private static final int l = 20;

   protected static bha<?> a(bha<bsp> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(bzz.a));
      $$0.b(bzz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bha<bsp> $$0) {
      $$0.a(bzz.a, 0, ImmutableList.of(new bkk(0.8F), new bhm(2.5F), new biw(45, 90), new bja(), new bhx(bpb.aN), new bhx(bpb.aO)));
   }

   private static void c(bha<bsp> $$0) {
      $$0.a(
         bzz.b,
         ImmutableList.of(
            Pair.of(0, bil.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bih(bsq::b, 2.25F, 20)),
            Pair.of(2, bke.a(bsq::b, Predicate.not(bsq::c), 4, 16, 2.25F)),
            Pair.of(3, bjq.a(6.0F, bdi.a(30, 60))),
            Pair.of(4, new bjn(ImmutableList.of(Pair.of(bji.b(1.0F), 2), Pair.of(bjx.a(1.0F, 3), 2), Pair.of(new bib(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bsp $$0) {
      $$0.dK().a(ImmutableList.of(bzz.b));
   }

   public static void a(bfz $$0, gu $$1) {
      bha<?> $$2 = $$0.dK();
      hd $$3 = hd.a($$0.dI().ac(), $$1);
      Optional<hd> $$4 = $$2.c(bpb.aM);
      if ($$4.isEmpty()) {
         $$2.a(bpb.aM, $$3);
         $$2.a(bpb.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bpb.aN, 600);
      }
   }

   private static Optional<bje> b(bfz $$0) {
      bha<?> $$1 = $$0.dK();
      Optional<hd> $$2 = $$1.c(bpb.aM);
      if ($$2.isPresent()) {
         hd $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bhu($$3.b().c()));
         }

         $$1.b(bpb.aM);
      }

      return d($$0);
   }

   private static boolean c(bfz $$0) {
      bha<?> $$1 = $$0.dK();
      return $$1.a(bpb.K);
   }

   private static boolean a(bfz $$0, bha<?> $$1, hd $$2) {
      Optional<Integer> $$3 = $$1.c(bpb.aN);
      cmm $$4 = $$0.dI();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(cpo.aY) && $$3.isPresent();
   }

   private static Optional<bje> d(bfz $$0) {
      return a($$0).map($$0x -> new bic($$0x, true));
   }

   public static Optional<aig> a(bfz $$0) {
      cmm $$1 = $$0.dI();
      if (!$$1.r_() && $$1 instanceof aif $$2) {
         Optional<UUID> $$3 = $$0.dK().c(bpb.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aig $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
