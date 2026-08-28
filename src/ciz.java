import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class ciz {
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

   protected static bxa<?> a(bxa<ciy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxa<ciy> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal(0.8F), new bxm(2.5F), new byx(45, 90), new bzb(), new bxx(cfc.aO), new bxx(cfc.aP)));
   }

   private static void c(bxa<ciy> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, byl.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new byh(ciz::b, 2.25F, 20)),
            Pair.of(2, caf.a(ciz::b, Predicate.not(ciz::c), 4, 16, 2.25F)),
            Pair.of(3, bzr.a(6.0F, bsj.a(30, 60))),
            Pair.of(4, new bzo(ImmutableList.of(Pair.of(bzj.b(1.0F), 2), Pair.of(bzy.a(1.0F, 3), 2), Pair.of(new byb(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ciy $$0) {
      $$0.ea().a(ImmutableList.of(cri.b));
   }

   public static void a(bvy $$0, ji $$1) {
      bxa<?> $$2 = $$0.ea();
      jq $$3 = jq.a($$0.dU().aj(), $$1);
      Optional<jq> $$4 = $$2.c(cfc.aN);
      if ($$4.isEmpty()) {
         $$2.a(cfc.aN, $$3);
         $$2.a(cfc.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cfc.aO, 600);
      }
   }

   private static Optional<bzf> b(bvy $$0) {
      bxa<?> $$1 = $$0.ea();
      Optional<jq> $$2 = $$1.c(cfc.aN);
      if ($$2.isPresent()) {
         jq $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxu($$3.b().d()));
         }

         $$1.b(cfc.aN);
      }

      return d($$0);
   }

   private static boolean c(bvy $$0) {
      bxa<?> $$1 = $$0.ea();
      return $$1.a(cfc.L);
   }

   private static boolean a(bvy $$0, bxa<?> $$1, jq $$2) {
      Optional<Integer> $$3 = $$1.c(cfc.aO);
      dgz $$4 = $$0.dU();
      return $$2.a($$4.aj(), $$0.du(), 1024) && $$4.a_($$2.b()).a(dkg.bf) && $$3.isPresent();
   }

   private static Optional<bzf> d(bvy $$0) {
      return a($$0).map($$0x -> new byc($$0x, true));
   }

   public static Optional<are> a(bvy $$0) {
      dgz $$1 = $$0.dU();
      if (!$$1.w_() && $$1 instanceof ard $$2) {
         Optional<UUID> $$3 = $$0.ea().c(cfc.aM);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof are $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
