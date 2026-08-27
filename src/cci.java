import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cci {
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

   protected static bqp<?> a(bqp<cch> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqp<cch> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bua(0.8F), new brb(2.5F), new bsm(45, 90), new bsq(), new brm(byr.aO), new brm(byr.aP)));
   }

   private static void c(bqp<cch> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, bsa.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new brw(cci::b, 2.25F, 20)),
            Pair.of(2, btu.a(cci::b, Predicate.not(cci::c), 4, 16, 2.25F)),
            Pair.of(3, btg.a(6.0F, bmn.a(30, 60))),
            Pair.of(4, new btd(ImmutableList.of(Pair.of(bsy.b(1.0F), 2), Pair.of(btn.a(1.0F, 3), 2), Pair.of(new brq(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cch $$0) {
      $$0.dP().a(ImmutableList.of(ckh.b));
   }

   public static void a(bpo $$0, ib $$1) {
      bqp<?> $$2 = $$0.dP();
      ik $$3 = ik.a($$0.dM().ad(), $$1);
      Optional<ik> $$4 = $$2.c(byr.aN);
      if ($$4.isEmpty()) {
         $$2.a(byr.aN, $$3);
         $$2.a(byr.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(byr.aO, 600);
      }
   }

   private static Optional<bsu> b(bpo $$0) {
      bqp<?> $$1 = $$0.dP();
      Optional<ik> $$2 = $$1.c(byr.aN);
      if ($$2.isPresent()) {
         ik $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new brj($$3.b().c()));
         }

         $$1.b(byr.aN);
      }

      return d($$0);
   }

   private static boolean c(bpo $$0) {
      bqp<?> $$1 = $$0.dP();
      return $$1.a(byr.L);
   }

   private static boolean a(bpo $$0, bqp<?> $$1, ik $$2) {
      Optional<Integer> $$3 = $$1.c(byr.aO);
      cwz $$4 = $$0.dM();
      return $$4.ad() == $$2.a() && $$4.a_($$2.b()).a(dac.aY) && $$3.isPresent();
   }

   private static Optional<bsu> d(bpo $$0) {
      return a($$0).map($$0x -> new brr($$0x, true));
   }

   public static Optional<apg> a(bpo $$0) {
      cwz $$1 = $$0.dM();
      if (!$$1.x_() && $$1 instanceof apf $$2) {
         Optional<UUID> $$3 = $$0.dP().c(byr.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof apg $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
