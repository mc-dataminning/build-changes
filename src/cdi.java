import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cdi {
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

   protected static brp<?> a(brp<cdh> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   private static void b(brp<cdh> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bva(0.8F), new bsb(2.5F), new btm(45, 90), new btq(), new bsm(bzr.aO), new bsm(bzr.aP)));
   }

   private static void c(brp<cdh> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, bta.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bsw(cdi::b, 2.25F, 20)),
            Pair.of(2, buu.a(cdi::b, Predicate.not(cdi::c), 4, 16, 2.25F)),
            Pair.of(3, bug.a(6.0F, bnl.a(30, 60))),
            Pair.of(4, new bud(ImmutableList.of(Pair.of(bty.b(1.0F), 2), Pair.of(bun.a(1.0F, 3), 2), Pair.of(new bsq(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cdh $$0) {
      $$0.dP().a(ImmutableList.of(cli.b));
   }

   public static void a(bqo $$0, ib $$1) {
      brp<?> $$2 = $$0.dP();
      ik $$3 = ik.a($$0.dM().ae(), $$1);
      Optional<ik> $$4 = $$2.c(bzr.aN);
      if ($$4.isEmpty()) {
         $$2.a(bzr.aN, $$3);
         $$2.a(bzr.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bzr.aO, 600);
      }
   }

   private static Optional<btu> b(bqo $$0) {
      brp<?> $$1 = $$0.dP();
      Optional<ik> $$2 = $$1.c(bzr.aN);
      if ($$2.isPresent()) {
         ik $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bsj($$3.b().c()));
         }

         $$1.b(bzr.aN);
      }

      return d($$0);
   }

   private static boolean c(bqo $$0) {
      brp<?> $$1 = $$0.dP();
      return $$1.a(bzr.L);
   }

   private static boolean a(bqo $$0, brp<?> $$1, ik $$2) {
      Optional<Integer> $$3 = $$1.c(bzr.aO);
      cyx $$4 = $$0.dM();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(dca.aY) && $$3.isPresent();
   }

   private static Optional<btu> d(bqo $$0) {
      return a($$0).map($$0x -> new bsr($$0x, true));
   }

   public static Optional<apt> a(bqo $$0) {
      cyx $$1 = $$0.dM();
      if (!$$1.x_() && $$1 instanceof aps $$2) {
         Optional<UUID> $$3 = $$0.dP().c(bzr.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof apt $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
