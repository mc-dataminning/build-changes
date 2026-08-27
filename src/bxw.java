import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bxw {
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

   protected static bmg<?> a(bmg<bxv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cff.a));
      $$0.b(cff.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmg<bxv> $$0) {
      $$0.a(cff.a, 0, ImmutableList.of(new bpq(0.8F), new bms(2.5F), new boc(45, 90), new bog(), new bnd(buh.aN), new bnd(buh.aO)));
   }

   private static void c(bmg<bxv> $$0) {
      $$0.a(
         cff.b,
         ImmutableList.of(
            Pair.of(0, bnr.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bnn(bxw::b, 2.25F, 20)),
            Pair.of(2, bpk.a(bxw::b, Predicate.not(bxw::c), 4, 16, 2.25F)),
            Pair.of(3, bow.a(6.0F, bii.a(30, 60))),
            Pair.of(4, new bot(ImmutableList.of(Pair.of(boo.b(1.0F), 2), Pair.of(bpd.a(1.0F, 3), 2), Pair.of(new bnh(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bxv $$0) {
      $$0.dP().a(ImmutableList.of(cff.b));
   }

   public static void a(blg $$0, ht $$1) {
      bmg<?> $$2 = $$0.dP();
      ia $$3 = ia.a($$0.dN().ad(), $$1);
      Optional<ia> $$4 = $$2.c(buh.aM);
      if ($$4.isEmpty()) {
         $$2.a(buh.aM, $$3);
         $$2.a(buh.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(buh.aN, 600);
      }
   }

   private static Optional<bok> b(blg $$0) {
      bmg<?> $$1 = $$0.dP();
      Optional<ia> $$2 = $$1.c(buh.aM);
      if ($$2.isPresent()) {
         ia $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bna($$3.b().c()));
         }

         $$1.b(buh.aM);
      }

      return d($$0);
   }

   private static boolean c(blg $$0) {
      bmg<?> $$1 = $$0.dP();
      return $$1.a(buh.K);
   }

   private static boolean a(blg $$0, bmg<?> $$1, ia $$2) {
      Optional<Integer> $$3 = $$1.c(buh.aN);
      csa $$4 = $$0.dN();
      return $$4.ad() == $$2.a() && $$4.a_($$2.b()).a(cvc.aY) && $$3.isPresent();
   }

   private static Optional<bok> d(blg $$0) {
      return a($$0).map($$0x -> new bni($$0x, true));
   }

   public static Optional<amf> a(blg $$0) {
      csa $$1 = $$0.dN();
      if (!$$1.x_() && $$1 instanceof ame $$2) {
         Optional<UUID> $$3 = $$0.dP().c(buh.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof amf $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
