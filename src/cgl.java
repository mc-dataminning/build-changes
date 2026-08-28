import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cgl {
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

   protected static buq<?> a(buq<cgk> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(col.a));
      $$0.b(col.b);
      $$0.f();
      return $$0;
   }

   private static void b(buq<cgk> $$0) {
      $$0.a(col.a, 0, ImmutableList.of(new byb(0.8F), new bvc(2.5F), new bwn(45, 90), new bwr(), new bvn(ccs.aO), new bvn(ccs.aP)));
   }

   private static void c(buq<cgk> $$0) {
      $$0.a(
         col.b,
         ImmutableList.of(
            Pair.of(0, bwb.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvx(cgl::b, 2.25F, 20)),
            Pair.of(2, bxv.a(cgl::b, Predicate.not(cgl::c), 4, 16, 2.25F)),
            Pair.of(3, bxh.a(6.0F, bqe.a(30, 60))),
            Pair.of(4, new bxe(ImmutableList.of(Pair.of(bwz.b(1.0F), 2), Pair.of(bxo.a(1.0F, 3), 2), Pair.of(new bvr(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cgk $$0) {
      $$0.dS().a(ImmutableList.of(col.b));
   }

   public static void a(bto $$0, iz $$1) {
      buq<?> $$2 = $$0.dS();
      jh $$3 = jh.a($$0.dP().af(), $$1);
      Optional<jh> $$4 = $$2.c(ccs.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccs.aN, $$3);
         $$2.a(ccs.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccs.aO, 600);
      }
   }

   private static Optional<bwv> b(bto $$0) {
      buq<?> $$1 = $$0.dS();
      Optional<jh> $$2 = $$1.c(ccs.aN);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bvk($$3.b().c()));
         }

         $$1.b(ccs.aN);
      }

      return d($$0);
   }

   private static boolean c(bto $$0) {
      buq<?> $$1 = $$0.dS();
      return $$1.a(ccs.L);
   }

   private static boolean a(bto $$0, buq<?> $$1, jh $$2) {
      Optional<Integer> $$3 = $$1.c(ccs.aO);
      dbx $$4 = $$0.dP();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfa.aY) && $$3.isPresent();
   }

   private static Optional<bwv> d(bto $$0) {
      return a($$0).map($$0x -> new bvs($$0x, true));
   }

   public static Optional<arf> a(bto $$0) {
      dbx $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof are $$2) {
         Optional<UUID> $$3 = $$0.dS().c(ccs.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arf $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
