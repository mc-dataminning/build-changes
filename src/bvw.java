import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bvw {
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

   protected static bkg<?> a(bkg<bvv> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkg<bvv> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bnq(0.8F), new bks(2.5F), new bmc(45, 90), new bmg(), new bld(bsh.aN), new bld(bsh.aO)));
   }

   private static void c(bkg<bvv> $$0) {
      $$0.a(
         cdf.b,
         ImmutableList.of(
            Pair.of(0, blr.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bln(bvw::b, 2.25F, 20)),
            Pair.of(2, bnk.a(bvw::b, Predicate.not(bvw::c), 4, 16, 2.25F)),
            Pair.of(3, bmw.a(6.0F, bgj.a(30, 60))),
            Pair.of(4, new bmt(ImmutableList.of(Pair.of(bmo.b(1.0F), 2), Pair.of(bnd.a(1.0F, 3), 2), Pair.of(new blh(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bvv $$0) {
      $$0.dN().a(ImmutableList.of(cdf.b));
   }

   public static void a(bjg $$0, gw $$1) {
      bkg<?> $$2 = $$0.dN();
      hd $$3 = hd.a($$0.dL().ac(), $$1);
      Optional<hd> $$4 = $$2.c(bsh.aM);
      if ($$4.isEmpty()) {
         $$2.a(bsh.aM, $$3);
         $$2.a(bsh.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bsh.aN, 600);
      }
   }

   private static Optional<bmk> b(bjg $$0) {
      bkg<?> $$1 = $$0.dN();
      Optional<hd> $$2 = $$1.c(bsh.aM);
      if ($$2.isPresent()) {
         hd $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bla($$3.b().c()));
         }

         $$1.b(bsh.aM);
      }

      return d($$0);
   }

   private static boolean c(bjg $$0) {
      bkg<?> $$1 = $$0.dN();
      return $$1.a(bsh.K);
   }

   private static boolean a(bjg $$0, bkg<?> $$1, hd $$2) {
      Optional<Integer> $$3 = $$1.c(bsh.aN);
      cpv $$4 = $$0.dL();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(csw.aY) && $$3.isPresent();
   }

   private static Optional<bmk> d(bjg $$0) {
      return a($$0).map($$0x -> new bli($$0x, true));
   }

   public static Optional<akr> a(bjg $$0) {
      cpv $$1 = $$0.dL();
      if (!$$1.w_() && $$1 instanceof akq $$2) {
         Optional<UUID> $$3 = $$0.dN().c(bsh.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof akr $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
