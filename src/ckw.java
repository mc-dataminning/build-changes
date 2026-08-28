import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class ckw {
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

   protected static byw<?> a(byw<ckv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   private static void b(byw<ckv> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch(0.8F), new bzi(2.5F), new cat(45, 90), new cax(), new bzt(cgy.aP), new bzt(cgy.aQ)));
   }

   private static void c(byw<ckv> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, cah.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new cad(ckw::b, 2.25F, 20)),
            Pair.of(2, ccb.a(ckw::b, Predicate.not(ckw::c), 4, 16, 2.25F)),
            Pair.of(3, cbn.a(6.0F, bue.a(30, 60))),
            Pair.of(4, new cbk(ImmutableList.of(Pair.of(cbf.b(1.0F), 2), Pair.of(cbu.a(1.0F, 3), 2), Pair.of(new bzx(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ckv $$0) {
      $$0.ec().a(ImmutableList.of(ctt.b));
   }

   public static void a(bxw $$0, iw $$1) {
      byw<?> $$2 = $$0.ec();
      jf $$3 = jf.a($$0.dV().aj(), $$1);
      Optional<jf> $$4 = $$2.c(cgy.aO);
      if ($$4.isEmpty()) {
         $$2.a(cgy.aO, $$3);
         $$2.a(cgy.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cgy.aP, 600);
      }
   }

   private static Optional<cbb> b(bxw $$0) {
      byw<?> $$1 = $$0.ec();
      Optional<jf> $$2 = $$1.c(cgy.aO);
      if ($$2.isPresent()) {
         jf $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bzq($$3.b().d()));
         }

         $$1.b(cgy.aO);
      }

      return d($$0);
   }

   private static boolean c(bxw $$0) {
      byw<?> $$1 = $$0.ec();
      return $$1.a(cgy.M);
   }

   private static boolean a(bxw $$0, byw<?> $$1, jf $$2) {
      Optional<Integer> $$3 = $$1.c(cgy.aP);
      djz $$4 = $$0.dV();
      return $$2.a($$4.aj(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(dng.bf) && $$3.isPresent();
   }

   private static Optional<cbb> d(bxw $$0) {
      return a($$0).map($$0x -> new bzy($$0x, true));
   }

   public static Optional<arv> a(bxw $$0) {
      djz $$1 = $$0.dV();
      if (!$$1.A_() && $$1 instanceof aru $$2) {
         Optional<UUID> $$3 = $$0.ec().c(cgy.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof arv $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
