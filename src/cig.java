import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cig {
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

   protected static bwk<?> a(bwk<cif> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwk<cif> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv(0.8F), new bww(2.5F), new byh(45, 90), new byl(), new bxh(cem.aO), new bxh(cem.aP)));
   }

   private static void c(bwk<cif> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, bxv.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bxr(cig::b, 2.25F, 20)),
            Pair.of(2, bzp.a(cig::b, Predicate.not(cig::c), 4, 16, 2.25F)),
            Pair.of(3, bzb.a(6.0F, brw.a(30, 60))),
            Pair.of(4, new byy(ImmutableList.of(Pair.of(byt.b(1.0F), 2), Pair.of(bzi.a(1.0F, 3), 2), Pair.of(new bxl(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cif $$0) {
      $$0.eb().a(ImmutableList.of(cqp.b));
   }

   public static void a(bvi $$0, ji $$1) {
      bwk<?> $$2 = $$0.eb();
      jq $$3 = jq.a($$0.dV().ai(), $$1);
      Optional<jq> $$4 = $$2.c(cem.aN);
      if ($$4.isEmpty()) {
         $$2.a(cem.aN, $$3);
         $$2.a(cem.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cem.aO, 600);
      }
   }

   private static Optional<byp> b(bvi $$0) {
      bwk<?> $$1 = $$0.eb();
      Optional<jq> $$2 = $$1.c(cem.aN);
      if ($$2.isPresent()) {
         jq $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxe($$3.b().d()));
         }

         $$1.b(cem.aN);
      }

      return d($$0);
   }

   private static boolean c(bvi $$0) {
      bwk<?> $$1 = $$0.eb();
      return $$1.a(cem.L);
   }

   private static boolean a(bvi $$0, bwk<?> $$1, jq $$2) {
      Optional<Integer> $$3 = $$1.c(cem.aO);
      dgj $$4 = $$0.dV();
      return $$2.a($$4.ai(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(djp.bf) && $$3.isPresent();
   }

   private static Optional<byp> d(bvi $$0) {
      return a($$0).map($$0x -> new bxm($$0x, true));
   }

   public static Optional<are> a(bvi $$0) {
      dgj $$1 = $$0.dV();
      if (!$$1.B_() && $$1 instanceof ard $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cem.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof are $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
