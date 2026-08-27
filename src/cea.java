import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cea {
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

   protected static bsf<?> a(bsf<cdz> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cma.a));
      $$0.b(cma.b);
      $$0.f();
      return $$0;
   }

   private static void b(bsf<cdz> $$0) {
      $$0.a(cma.a, 0, ImmutableList.of(new bvq(0.8F), new bsr(2.5F), new buc(45, 90), new bug(), new btc(cah.aO), new btc(cah.aP)));
   }

   private static void c(bsf<cdz> $$0) {
      $$0.a(
         cma.b,
         ImmutableList.of(
            Pair.of(0, btq.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new btm(cea::b, 2.25F, 20)),
            Pair.of(2, bvk.a(cea::b, Predicate.not(cea::c), 4, 16, 2.25F)),
            Pair.of(3, buw.a(6.0F, bob.a(30, 60))),
            Pair.of(4, new but(ImmutableList.of(Pair.of(buo.b(1.0F), 2), Pair.of(bvd.a(1.0F, 3), 2), Pair.of(new btg(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cdz $$0) {
      $$0.dQ().a(ImmutableList.of(cma.b));
   }

   public static void a(bre $$0, im $$1) {
      bsf<?> $$2 = $$0.dQ();
      iu $$3 = iu.a($$0.dN().ae(), $$1);
      Optional<iu> $$4 = $$2.c(cah.aN);
      if ($$4.isEmpty()) {
         $$2.a(cah.aN, $$3);
         $$2.a(cah.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cah.aO, 600);
      }
   }

   private static Optional<buk> b(bre $$0) {
      bsf<?> $$1 = $$0.dQ();
      Optional<iu> $$2 = $$1.c(cah.aN);
      if ($$2.isPresent()) {
         iu $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bsz($$3.b().c()));
         }

         $$1.b(cah.aN);
      }

      return d($$0);
   }

   private static boolean c(bre $$0) {
      bsf<?> $$1 = $$0.dQ();
      return $$1.a(cah.L);
   }

   private static boolean a(bre $$0, bsf<?> $$1, iu $$2) {
      Optional<Integer> $$3 = $$1.c(cah.aO);
      czu $$4 = $$0.dN();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(dcx.aY) && $$3.isPresent();
   }

   private static Optional<buk> d(bre $$0) {
      return a($$0).map($$0x -> new bth($$0x, true));
   }

   public static Optional<aqf> a(bre $$0) {
      czu $$1 = $$0.dN();
      if (!$$1.x_() && $$1 instanceof aqe $$2) {
         Optional<UUID> $$3 = $$0.dQ().c(cah.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aqf $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
