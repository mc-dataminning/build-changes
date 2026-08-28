import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class chh {
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

   protected static bvl<?> a(bvl<chg> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   private static void b(bvl<chg> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new byw(0.8F), new bvx(2.5F), new bxi(45, 90), new bxm(), new bwi(cdn.aO), new bwi(cdn.aP)));
   }

   private static void c(bvl<chg> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, bww.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bws(chh::b, 2.25F, 20)),
            Pair.of(2, byq.a(chh::b, Predicate.not(chh::c), 4, 16, 2.25F)),
            Pair.of(3, byc.a(6.0F, bra.a(30, 60))),
            Pair.of(4, new bxz(ImmutableList.of(Pair.of(bxu.b(1.0F), 2), Pair.of(byj.a(1.0F, 3), 2), Pair.of(new bwm(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(chg $$0) {
      $$0.dX().a(ImmutableList.of(cpm.b));
   }

   public static void a(buk $$0, je $$1) {
      bvl<?> $$2 = $$0.dX();
      jm $$3 = jm.a($$0.dS().ag(), $$1);
      Optional<jm> $$4 = $$2.c(cdn.aN);
      if ($$4.isEmpty()) {
         $$2.a(cdn.aN, $$3);
         $$2.a(cdn.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cdn.aO, 600);
      }
   }

   private static Optional<bxq> b(buk $$0) {
      bvl<?> $$1 = $$0.dX();
      Optional<jm> $$2 = $$1.c(cdn.aN);
      if ($$2.isPresent()) {
         jm $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bwf($$3.b().d()));
         }

         $$1.b(cdn.aN);
      }

      return d($$0);
   }

   private static boolean c(buk $$0) {
      bvl<?> $$1 = $$0.dX();
      return $$1.a(cdn.L);
   }

   private static boolean a(buk $$0, bvl<?> $$1, jm $$2) {
      Optional<Integer> $$3 = $$1.c(cdn.aO);
      deg $$4 = $$0.dS();
      return $$4.ag() == $$2.a() && $$4.a_($$2.b()).a(dhl.aY) && $$3.isPresent();
   }

   private static Optional<bxq> d(buk $$0) {
      return a($$0).map($$0x -> new bwn($$0x, true));
   }

   public static Optional<ari> a(buk $$0) {
      deg $$1 = $$0.dS();
      if (!$$1.w_() && $$1 instanceof arh $$2) {
         Optional<UUID> $$3 = $$0.dX().c(cdn.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof ari $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
