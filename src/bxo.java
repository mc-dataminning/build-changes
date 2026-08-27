import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bxo {
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

   protected static bly<?> a(bly<bxn> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   private static void b(bly<bxn> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bpi(0.8F), new bmk(2.5F), new bnu(45, 90), new bny(), new bmv(btz.aN), new bmv(btz.aO)));
   }

   private static void c(bly<bxn> $$0) {
      $$0.a(
         cex.b,
         ImmutableList.of(
            Pair.of(0, bnj.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bnf(bxo::b, 2.25F, 20)),
            Pair.of(2, bpc.a(bxo::b, Predicate.not(bxo::c), 4, 16, 2.25F)),
            Pair.of(3, boo.a(6.0F, bib.a(30, 60))),
            Pair.of(4, new bol(ImmutableList.of(Pair.of(bog.b(1.0F), 2), Pair.of(bov.a(1.0F, 3), 2), Pair.of(new bmz(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bxn $$0) {
      $$0.dN().a(ImmutableList.of(cex.b));
   }

   public static void a(bky $$0, ht $$1) {
      bly<?> $$2 = $$0.dN();
      ia $$3 = ia.a($$0.dL().ac(), $$1);
      Optional<ia> $$4 = $$2.c(btz.aM);
      if ($$4.isEmpty()) {
         $$2.a(btz.aM, $$3);
         $$2.a(btz.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(btz.aN, 600);
      }
   }

   private static Optional<boc> b(bky $$0) {
      bly<?> $$1 = $$0.dN();
      Optional<ia> $$2 = $$1.c(btz.aM);
      if ($$2.isPresent()) {
         ia $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bms($$3.b().c()));
         }

         $$1.b(btz.aM);
      }

      return d($$0);
   }

   private static boolean c(bky $$0) {
      bly<?> $$1 = $$0.dN();
      return $$1.a(btz.K);
   }

   private static boolean a(bky $$0, bly<?> $$1, ia $$2) {
      Optional<Integer> $$3 = $$1.c(btz.aN);
      crs $$4 = $$0.dL();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(cuv.aY) && $$3.isPresent();
   }

   private static Optional<boc> d(bky $$0) {
      return a($$0).map($$0x -> new bna($$0x, true));
   }

   public static Optional<amb> a(bky $$0) {
      crs $$1 = $$0.dL();
      if (!$$1.x_() && $$1 instanceof ama $$2) {
         Optional<UUID> $$3 = $$0.dN().c(btz.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof amb $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
