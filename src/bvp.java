import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bvp {
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

   protected static bjz<?> a(bjz<bvo> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bjz<bvo> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new bnj(0.8F), new bkl(2.5F), new blv(45, 90), new blz(), new bkw(bsa.aN), new bkw(bsa.aO)));
   }

   private static void c(bjz<bvo> $$0) {
      $$0.a(
         ccy.b,
         ImmutableList.of(
            Pair.of(0, blk.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new blg(bvp::b, 2.25F, 20)),
            Pair.of(2, bnd.a(bvp::b, Predicate.not(bvp::c), 4, 16, 2.25F)),
            Pair.of(3, bmp.a(6.0F, bgb.a(30, 60))),
            Pair.of(4, new bmm(ImmutableList.of(Pair.of(bmh.b(1.0F), 2), Pair.of(bmw.a(1.0F, 3), 2), Pair.of(new bla(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bvo $$0) {
      $$0.dM().a(ImmutableList.of(ccy.b));
   }

   public static void a(biy $$0, gu $$1) {
      bjz<?> $$2 = $$0.dM();
      hd $$3 = hd.a($$0.dK().ac(), $$1);
      Optional<hd> $$4 = $$2.c(bsa.aM);
      if ($$4.isEmpty()) {
         $$2.a(bsa.aM, $$3);
         $$2.a(bsa.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bsa.aN, 600);
      }
   }

   private static Optional<bmd> b(biy $$0) {
      bjz<?> $$1 = $$0.dM();
      Optional<hd> $$2 = $$1.c(bsa.aM);
      if ($$2.isPresent()) {
         hd $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bkt($$3.b().c()));
         }

         $$1.b(bsa.aM);
      }

      return d($$0);
   }

   private static boolean c(biy $$0) {
      bjz<?> $$1 = $$0.dM();
      return $$1.a(bsa.K);
   }

   private static boolean a(biy $$0, bjz<?> $$1, hd $$2) {
      Optional<Integer> $$3 = $$1.c(bsa.aN);
      cpm $$4 = $$0.dK();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(csn.aY) && $$3.isPresent();
   }

   private static Optional<bmd> d(biy $$0) {
      return a($$0).map($$0x -> new blb($$0x, true));
   }

   public static Optional<akl> a(biy $$0) {
      cpm $$1 = $$0.dK();
      if (!$$1.r_() && $$1 instanceof akk $$2) {
         Optional<UUID> $$3 = $$0.dM().c(bsa.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof akl $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
