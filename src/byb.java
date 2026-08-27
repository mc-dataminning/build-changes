import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class byb {
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

   protected static bml<?> a(bml<bya> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   private static void b(bml<bya> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new bpv(0.8F), new bmx(2.5F), new boh(45, 90), new bol(), new bni(bum.aN), new bni(bum.aO)));
   }

   private static void c(bml<bya> $$0) {
      $$0.a(
         cfk.b,
         ImmutableList.of(
            Pair.of(0, bnw.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bns(byb::b, 2.25F, 20)),
            Pair.of(2, bpp.a(byb::b, Predicate.not(byb::c), 4, 16, 2.25F)),
            Pair.of(3, bpb.a(6.0F, bim.a(30, 60))),
            Pair.of(4, new boy(ImmutableList.of(Pair.of(bot.b(1.0F), 2), Pair.of(bpi.a(1.0F, 3), 2), Pair.of(new bnm(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bya $$0) {
      $$0.dP().a(ImmutableList.of(cfk.b));
   }

   public static void a(bll $$0, hx $$1) {
      bml<?> $$2 = $$0.dP();
      ie $$3 = ie.a($$0.dN().ad(), $$1);
      Optional<ie> $$4 = $$2.c(bum.aM);
      if ($$4.isEmpty()) {
         $$2.a(bum.aM, $$3);
         $$2.a(bum.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bum.aN, 600);
      }
   }

   private static Optional<bop> b(bll $$0) {
      bml<?> $$1 = $$0.dP();
      Optional<ie> $$2 = $$1.c(bum.aM);
      if ($$2.isPresent()) {
         ie $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bnf($$3.b().c()));
         }

         $$1.b(bum.aM);
      }

      return d($$0);
   }

   private static boolean c(bll $$0) {
      bml<?> $$1 = $$0.dP();
      return $$1.a(bum.K);
   }

   private static boolean a(bll $$0, bml<?> $$1, ie $$2) {
      Optional<Integer> $$3 = $$1.c(bum.aN);
      csf $$4 = $$0.dN();
      return $$4.ad() == $$2.a() && $$4.a_($$2.b()).a(cvh.aY) && $$3.isPresent();
   }

   private static Optional<bop> d(bll $$0) {
      return a($$0).map($$0x -> new bnn($$0x, true));
   }

   public static Optional<amj> a(bll $$0) {
      csf $$1 = $$0.dN();
      if (!$$1.y_() && $$1 instanceof ami $$2) {
         Optional<UUID> $$3 = $$0.dP().c(bum.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof amj $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
