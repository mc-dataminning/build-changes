import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cfv {
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

   protected static bua<?> a(bua<cfu> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   private static void b(bua<cfu> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bxl(0.8F), new bum(2.5F), new bvx(45, 90), new bwb(), new bux(ccc.aO), new bux(ccc.aP)));
   }

   private static void c(bua<cfu> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, bvl.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvh(cfv::b, 2.25F, 20)),
            Pair.of(2, bxf.a(cfv::b, Predicate.not(cfv::c), 4, 16, 2.25F)),
            Pair.of(3, bwr.a(6.0F, bpo.a(30, 60))),
            Pair.of(4, new bwo(ImmutableList.of(Pair.of(bwj.b(1.0F), 2), Pair.of(bwy.a(1.0F, 3), 2), Pair.of(new bvb(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cfu $$0) {
      $$0.dT().a(ImmutableList.of(cnw.b));
   }

   public static void a(bsy $$0, ja $$1) {
      bua<?> $$2 = $$0.dT();
      ji $$3 = ji.a($$0.dP().af(), $$1);
      Optional<ji> $$4 = $$2.c(ccc.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccc.aN, $$3);
         $$2.a(ccc.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccc.aO, 600);
      }
   }

   private static Optional<bwf> b(bsy $$0) {
      bua<?> $$1 = $$0.dT();
      Optional<ji> $$2 = $$1.c(ccc.aN);
      if ($$2.isPresent()) {
         ji $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new buu($$3.b().c()));
         }

         $$1.b(ccc.aN);
      }

      return d($$0);
   }

   private static boolean c(bsy $$0) {
      bua<?> $$1 = $$0.dT();
      return $$1.a(ccc.L);
   }

   private static boolean a(bsy $$0, bua<?> $$1, ji $$2) {
      Optional<Integer> $$3 = $$1.c(ccc.aO);
      dcd $$4 = $$0.dP();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfh.aY) && $$3.isPresent();
   }

   private static Optional<bwf> d(bsy $$0) {
      return a($$0).map($$0x -> new bvc($$0x, true));
   }

   public static Optional<aql> a(bsy $$0) {
      dcd $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof aqk $$2) {
         Optional<UUID> $$3 = $$0.dT().c(ccc.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aql $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
