import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cfz {
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

   protected static bue<?> a(bue<cfy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(coa.a));
      $$0.b(coa.b);
      $$0.f();
      return $$0;
   }

   private static void b(bue<cfy> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bxp(0.8F), new buq(2.5F), new bwb(45, 90), new bwf(), new bvb(ccg.aO), new bvb(ccg.aP)));
   }

   private static void c(bue<cfy> $$0) {
      $$0.a(
         coa.b,
         ImmutableList.of(
            Pair.of(0, bvp.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvl(cfz::b, 2.25F, 20)),
            Pair.of(2, bxj.a(cfz::b, Predicate.not(cfz::c), 4, 16, 2.25F)),
            Pair.of(3, bwv.a(6.0F, bps.a(30, 60))),
            Pair.of(4, new bws(ImmutableList.of(Pair.of(bwn.b(1.0F), 2), Pair.of(bxc.a(1.0F, 3), 2), Pair.of(new bvf(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cfy $$0) {
      $$0.dV().a(ImmutableList.of(coa.b));
   }

   public static void a(btc $$0, ja $$1) {
      bue<?> $$2 = $$0.dV();
      ji $$3 = ji.a($$0.dR().af(), $$1);
      Optional<ji> $$4 = $$2.c(ccg.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccg.aN, $$3);
         $$2.a(ccg.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccg.aO, 600);
      }
   }

   private static Optional<bwj> b(btc $$0) {
      bue<?> $$1 = $$0.dV();
      Optional<ji> $$2 = $$1.c(ccg.aN);
      if ($$2.isPresent()) {
         ji $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new buy($$3.b().c()));
         }

         $$1.b(ccg.aN);
      }

      return d($$0);
   }

   private static boolean c(btc $$0) {
      bue<?> $$1 = $$0.dV();
      return $$1.a(ccg.L);
   }

   private static boolean a(btc $$0, bue<?> $$1, ji $$2) {
      Optional<Integer> $$3 = $$1.c(ccg.aO);
      dcg $$4 = $$0.dR();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfk.aY) && $$3.isPresent();
   }

   private static Optional<bwj> d(btc $$0) {
      return a($$0).map($$0x -> new bvg($$0x, true));
   }

   public static Optional<aqn> a(btc $$0) {
      dcg $$1 = $$0.dR();
      if (!$$1.x_() && $$1 instanceof aqm $$2) {
         Optional<UUID> $$3 = $$0.dV().c(ccg.aM);
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
