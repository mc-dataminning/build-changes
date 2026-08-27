import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cfl {
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

   protected static btp<?> a(btp<cfk> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cfk> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bxa(0.8F), new bub(2.5F), new bvm(45, 90), new bvq(), new bum(cbr.aO), new bum(cbr.aP)));
   }

   private static void c(btp<cfk> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bva.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new buw(cfl::b, 2.25F, 20)),
            Pair.of(2, bwu.a(cfl::b, Predicate.not(cfl::c), 4, 16, 2.25F)),
            Pair.of(3, bwg.a(6.0F, bpl.a(30, 60))),
            Pair.of(4, new bwd(ImmutableList.of(Pair.of(bvy.b(1.0F), 2), Pair.of(bwn.a(1.0F, 3), 2), Pair.of(new buq(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cfk $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.b));
   }

   public static void a(bso $$0, ir $$1) {
      btp<?> $$2 = $$0.dZ();
      iz $$3 = iz.a($$0.dU().af(), $$1);
      Optional<iz> $$4 = $$2.c(cbr.aN);
      if ($$4.isEmpty()) {
         $$2.a(cbr.aN, $$3);
         $$2.a(cbr.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cbr.aO, 600);
      }
   }

   private static Optional<bvu> b(bso $$0) {
      btp<?> $$1 = $$0.dZ();
      Optional<iz> $$2 = $$1.c(cbr.aN);
      if ($$2.isPresent()) {
         iz $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new buj($$3.b().c()));
         }

         $$1.b(cbr.aN);
      }

      return d($$0);
   }

   private static boolean c(bso $$0) {
      btp<?> $$1 = $$0.dZ();
      return $$1.a(cbr.L);
   }

   private static boolean a(bso $$0, btp<?> $$1, iz $$2) {
      Optional<Integer> $$3 = $$1.c(cbr.aO);
      dca $$4 = $$0.dU();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfe.bI) && $$3.isPresent();
   }

   private static Optional<bvu> d(bso $$0) {
      return a($$0).map($$0x -> new bur($$0x, true));
   }

   public static Optional<aqu> a(bso $$0) {
      dca $$1 = $$0.dU();
      if (!$$1.x_() && $$1 instanceof aqt $$2) {
         Optional<UUID> $$3 = $$0.dZ().c(cbr.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aqu $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
