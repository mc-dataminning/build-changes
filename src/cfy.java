import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cfy {
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

   protected static bud<?> a(bud<cfx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnz.a));
      $$0.b(cnz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bud<cfx> $$0) {
      $$0.a(cnz.a, 0, ImmutableList.of(new bxo(0.8F), new bup(2.5F), new bwa(45, 90), new bwe(), new bva(ccf.aO), new bva(ccf.aP)));
   }

   private static void c(bud<cfx> $$0) {
      $$0.a(
         cnz.b,
         ImmutableList.of(
            Pair.of(0, bvo.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvk(cfy::b, 2.25F, 20)),
            Pair.of(2, bxi.a(cfy::b, Predicate.not(cfy::c), 4, 16, 2.25F)),
            Pair.of(3, bwu.a(6.0F, bpr.a(30, 60))),
            Pair.of(4, new bwr(ImmutableList.of(Pair.of(bwm.b(1.0F), 2), Pair.of(bxb.a(1.0F, 3), 2), Pair.of(new bve(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cfx $$0) {
      $$0.dU().a(ImmutableList.of(cnz.b));
   }

   public static void a(btb $$0, ja $$1) {
      bud<?> $$2 = $$0.dU();
      ji $$3 = ji.a($$0.dQ().af(), $$1);
      Optional<ji> $$4 = $$2.c(ccf.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccf.aN, $$3);
         $$2.a(ccf.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccf.aO, 600);
      }
   }

   private static Optional<bwi> b(btb $$0) {
      bud<?> $$1 = $$0.dU();
      Optional<ji> $$2 = $$1.c(ccf.aN);
      if ($$2.isPresent()) {
         ji $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bux($$3.b().c()));
         }

         $$1.b(ccf.aN);
      }

      return d($$0);
   }

   private static boolean c(btb $$0) {
      bud<?> $$1 = $$0.dU();
      return $$1.a(ccf.L);
   }

   private static boolean a(btb $$0, bud<?> $$1, ji $$2) {
      Optional<Integer> $$3 = $$1.c(ccf.aO);
      dcf $$4 = $$0.dQ();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfj.aY) && $$3.isPresent();
   }

   private static Optional<bwi> d(btb $$0) {
      return a($$0).map($$0x -> new bvf($$0x, true));
   }

   public static Optional<aqn> a(btb $$0) {
      dcf $$1 = $$0.dQ();
      if (!$$1.x_() && $$1 instanceof aqm $$2) {
         Optional<UUID> $$3 = $$0.dU().c(ccf.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aqn $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
