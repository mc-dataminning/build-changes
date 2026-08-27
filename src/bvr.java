import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bvr {
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

   protected static bkb<?> a(bkb<bvq> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkb<bvq> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new bnl(0.8F), new bkn(2.5F), new blx(45, 90), new bmb(), new bky(bsc.aN), new bky(bsc.aO)));
   }

   private static void c(bkb<bvq> $$0) {
      $$0.a(
         cda.b,
         ImmutableList.of(
            Pair.of(0, blm.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bli(bvr::b, 2.25F, 20)),
            Pair.of(2, bnf.a(bvr::b, Predicate.not(bvr::c), 4, 16, 2.25F)),
            Pair.of(3, bmr.a(6.0F, bge.a(30, 60))),
            Pair.of(4, new bmo(ImmutableList.of(Pair.of(bmj.b(1.0F), 2), Pair.of(bmy.a(1.0F, 3), 2), Pair.of(new blc(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bvq $$0) {
      $$0.dM().a(ImmutableList.of(cda.b));
   }

   public static void a(bjb $$0, gw $$1) {
      bkb<?> $$2 = $$0.dM();
      hf $$3 = hf.a($$0.dK().ac(), $$1);
      Optional<hf> $$4 = $$2.c(bsc.aM);
      if ($$4.isEmpty()) {
         $$2.a(bsc.aM, $$3);
         $$2.a(bsc.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bsc.aN, 600);
      }
   }

   private static Optional<bmf> b(bjb $$0) {
      bkb<?> $$1 = $$0.dM();
      Optional<hf> $$2 = $$1.c(bsc.aM);
      if ($$2.isPresent()) {
         hf $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bkv($$3.b().c()));
         }

         $$1.b(bsc.aM);
      }

      return d($$0);
   }

   private static boolean c(bjb $$0) {
      bkb<?> $$1 = $$0.dM();
      return $$1.a(bsc.K);
   }

   private static boolean a(bjb $$0, bkb<?> $$1, hf $$2) {
      Optional<Integer> $$3 = $$1.c(bsc.aN);
      cpq $$4 = $$0.dK();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(csr.aY) && $$3.isPresent();
   }

   private static Optional<bmf> d(bjb $$0) {
      return a($$0).map($$0x -> new bld($$0x, true));
   }

   public static Optional<ako> a(bjb $$0) {
      cpq $$1 = $$0.dK();
      if (!$$1.r_() && $$1 instanceof akn $$2) {
         Optional<UUID> $$3 = $$0.dM().c(bsc.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof ako $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
