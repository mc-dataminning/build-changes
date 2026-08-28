import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cgh {
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

   protected static bum<?> a(bum<cgg> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bum<cgg> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bxx(0.8F), new buy(2.5F), new bwj(45, 90), new bwn(), new bvj(cco.aO), new bvj(cco.aP)));
   }

   private static void c(bum<cgg> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, bvx.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvt(cgh::b, 2.25F, 20)),
            Pair.of(2, bxr.a(cgh::b, Predicate.not(cgh::c), 4, 16, 2.25F)),
            Pair.of(3, bxd.a(6.0F, bqa.a(30, 60))),
            Pair.of(4, new bxa(ImmutableList.of(Pair.of(bwv.b(1.0F), 2), Pair.of(bxk.a(1.0F, 3), 2), Pair.of(new bvn(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cgg $$0) {
      $$0.dS().a(ImmutableList.of(coh.b));
   }

   public static void a(btk $$0, iz $$1) {
      bum<?> $$2 = $$0.dS();
      jh $$3 = jh.a($$0.dP().af(), $$1);
      Optional<jh> $$4 = $$2.c(cco.aN);
      if ($$4.isEmpty()) {
         $$2.a(cco.aN, $$3);
         $$2.a(cco.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cco.aO, 600);
      }
   }

   private static Optional<bwr> b(btk $$0) {
      bum<?> $$1 = $$0.dS();
      Optional<jh> $$2 = $$1.c(cco.aN);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bvg($$3.b().c()));
         }

         $$1.b(cco.aN);
      }

      return d($$0);
   }

   private static boolean c(btk $$0) {
      bum<?> $$1 = $$0.dS();
      return $$1.a(cco.L);
   }

   private static boolean a(btk $$0, bum<?> $$1, jh $$2) {
      Optional<Integer> $$3 = $$1.c(cco.aO);
      dbt $$4 = $$0.dP();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dew.aY) && $$3.isPresent();
   }

   private static Optional<bwr> d(btk $$0) {
      return a($$0).map($$0x -> new bvo($$0x, true));
   }

   public static Optional<arc> a(btk $$0) {
      dbt $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof arb $$2) {
         Optional<UUID> $$3 = $$0.dS().c(cco.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arc $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
