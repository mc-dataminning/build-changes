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

   protected static bxd<?> a(bxd<ciy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxd<ciy> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao(0.8F), new bxp(2.5F), new bza(45, 90), new bze(), new bya(cff.aO), new bya(cff.aP)));
   }

   private static void c(bxd<ciy> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, byo.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new byk(ciz::b, 2.25F, 20)),
            Pair.of(2, cai.a(ciz::b, Predicate.not(ciz::c), 4, 16, 2.25F)),
            Pair.of(3, bzu.a(6.0F, bsp.a(30, 60))),
            Pair.of(4, new bzr(ImmutableList.of(Pair.of(bzm.b(1.0F), 2), Pair.of(cab.a(1.0F, 3), 2), Pair.of(new bye(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ciy $$0) {
      $$0.eb().a(ImmutableList.of(crj.b));
   }

   public static void a(bwb $$0, jh $$1) {
      bxd<?> $$2 = $$0.eb();
      jp $$3 = jp.a($$0.dV().ah(), $$1);
      Optional<jp> $$4 = $$2.c(cff.aN);
      if ($$4.isEmpty()) {
         $$2.a(cff.aN, $$3);
         $$2.a(cff.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cff.aO, 600);
      }
   }

   private static Optional<bzi> b(bwb $$0) {
      bxd<?> $$1 = $$0.eb();
      Optional<jp> $$2 = $$1.c(cff.aN);
      if ($$2.isPresent()) {
         jp $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxx($$3.b().d()));
         }

         $$1.b(cff.aN);
      }

      return d($$0);
   }

   private static boolean c(bwb $$0) {
      bxd<?> $$1 = $$0.eb();
      return $$1.a(cff.L);
   }

   private static boolean a(bwb $$0, bxd<?> $$1, jp $$2) {
      Optional<Integer> $$3 = $$1.c(cff.aO);
      dha $$4 = $$0.dV();
      return $$4.ah() == $$2.a() && $$4.a_($$2.b()).a(dkg.bf) && $$3.isPresent();
   }

   private static Optional<bzi> d(bwb $$0) {
      return a($$0).map($$0x -> new byf($$0x, true));
   }

   public static Optional<asi> a(bwb $$0) {
      dha $$1 = $$0.dV();
      if (!$$1.B_() && $$1 instanceof ash $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cff.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof asi $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
