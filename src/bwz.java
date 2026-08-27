import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bwz {
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

   protected static blj<?> a(blj<bwy> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   private static void b(blj<bwy> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bot(0.8F), new blv(2.5F), new bnf(45, 90), new bnj(), new bmg(btk.aN), new bmg(btk.aO)));
   }

   private static void c(blj<bwy> $$0) {
      $$0.a(
         cei.b,
         ImmutableList.of(
            Pair.of(0, bmu.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bmq(bwz::b, 2.25F, 20)),
            Pair.of(2, bon.a(bwz::b, Predicate.not(bwz::c), 4, 16, 2.25F)),
            Pair.of(3, bnz.a(6.0F, bhm.a(30, 60))),
            Pair.of(4, new bnw(ImmutableList.of(Pair.of(bnr.b(1.0F), 2), Pair.of(bog.a(1.0F, 3), 2), Pair.of(new bmk(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bwy $$0) {
      $$0.dN().a(ImmutableList.of(cei.b));
   }

   public static void a(bkj $$0, ht $$1) {
      blj<?> $$2 = $$0.dN();
      ia $$3 = ia.a($$0.dL().ac(), $$1);
      Optional<ia> $$4 = $$2.c(btk.aM);
      if ($$4.isEmpty()) {
         $$2.a(btk.aM, $$3);
         $$2.a(btk.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(btk.aN, 600);
      }
   }

   private static Optional<bnn> b(bkj $$0) {
      blj<?> $$1 = $$0.dN();
      Optional<ia> $$2 = $$1.c(btk.aM);
      if ($$2.isPresent()) {
         ia $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bmd($$3.b().c()));
         }

         $$1.b(btk.aM);
      }

      return d($$0);
   }

   private static boolean c(bkj $$0) {
      blj<?> $$1 = $$0.dN();
      return $$1.a(btk.K);
   }

   private static boolean a(bkj $$0, blj<?> $$1, ia $$2) {
      Optional<Integer> $$3 = $$1.c(btk.aN);
      cqz $$4 = $$0.dL();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(cuc.aY) && $$3.isPresent();
   }

   private static Optional<bnn> d(bkj $$0) {
      return a($$0).map($$0x -> new bml($$0x, true));
   }

   public static Optional<alr> a(bkj $$0) {
      cqz $$1 = $$0.dL();
      if (!$$1.x_() && $$1 instanceof alq $$2) {
         Optional<UUID> $$3 = $$0.dN().c(btk.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof alr $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
