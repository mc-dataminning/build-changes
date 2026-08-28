import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cku {
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

   protected static byu<?> a(byu<ckt> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctr.a));
      $$0.b(ctr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byu<ckt> $$0) {
      $$0.a(ctr.a, 0, ImmutableList.of(new ccf(0.8F), new bzg(2.5F), new car(45, 90), new cav(), new bzr(cgw.aP), new bzr(cgw.aQ)));
   }

   private static void c(byu<ckt> $$0) {
      $$0.a(
         ctr.b,
         ImmutableList.of(
            Pair.of(0, caf.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new cab(cku::b, 2.25F, 20)),
            Pair.of(2, cbz.a(cku::b, Predicate.not(cku::c), 4, 16, 2.25F)),
            Pair.of(3, cbl.a(6.0F, buc.a(30, 60))),
            Pair.of(4, new cbi(ImmutableList.of(Pair.of(cbd.b(1.0F), 2), Pair.of(cbs.a(1.0F, 3), 2), Pair.of(new bzv(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ckt $$0) {
      $$0.ec().a(ImmutableList.of(ctr.b));
   }

   public static void a(bxu $$0, iv $$1) {
      byu<?> $$2 = $$0.ec();
      je $$3 = je.a($$0.dV().aj(), $$1);
      Optional<je> $$4 = $$2.c(cgw.aO);
      if ($$4.isEmpty()) {
         $$2.a(cgw.aO, $$3);
         $$2.a(cgw.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cgw.aP, 600);
      }
   }

   private static Optional<caz> b(bxu $$0) {
      byu<?> $$1 = $$0.ec();
      Optional<je> $$2 = $$1.c(cgw.aO);
      if ($$2.isPresent()) {
         je $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bzo($$3.b().d()));
         }

         $$1.b(cgw.aO);
      }

      return d($$0);
   }

   private static boolean c(bxu $$0) {
      byu<?> $$1 = $$0.ec();
      return $$1.a(cgw.M);
   }

   private static boolean a(bxu $$0, byu<?> $$1, je $$2) {
      Optional<Integer> $$3 = $$1.c(cgw.aP);
      djx $$4 = $$0.dV();
      return $$2.a($$4.aj(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(dne.bf) && $$3.isPresent();
   }

   private static Optional<caz> d(bxu $$0) {
      return a($$0).map($$0x -> new bzw($$0x, true));
   }

   public static Optional<art> a(bxu $$0) {
      djx $$1 = $$0.dV();
      if (!$$1.A_() && $$1 instanceof ars $$2) {
         Optional<UUID> $$3 = $$0.ec().c(cgw.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof art $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
