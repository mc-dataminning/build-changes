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

   protected static btq<?> a(btq<cfk> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   private static void b(btq<cfk> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bxb(0.8F), new buc(2.5F), new bvn(45, 90), new bvr(), new bun(cbs.aO), new bun(cbs.aP)));
   }

   private static void c(btq<cfk> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, bvb.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bux(cfl::b, 2.25F, 20)),
            Pair.of(2, bwv.a(cfl::b, Predicate.not(cfl::c), 4, 16, 2.25F)),
            Pair.of(3, bwh.a(6.0F, bpf.a(30, 60))),
            Pair.of(4, new bwe(ImmutableList.of(Pair.of(bvz.b(1.0F), 2), Pair.of(bwo.a(1.0F, 3), 2), Pair.of(new bur(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cfk $$0) {
      $$0.dS().a(ImmutableList.of(cnl.b));
   }

   public static void a(bso $$0, io $$1) {
      btq<?> $$2 = $$0.dS();
      iw $$3 = iw.a($$0.dP().ae(), $$1);
      Optional<iw> $$4 = $$2.c(cbs.aN);
      if ($$4.isEmpty()) {
         $$2.a(cbs.aN, $$3);
         $$2.a(cbs.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cbs.aO, 600);
      }
   }

   private static Optional<bvv> b(bso $$0) {
      btq<?> $$1 = $$0.dS();
      Optional<iw> $$2 = $$1.c(cbs.aN);
      if ($$2.isPresent()) {
         iw $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new buk($$3.b().c()));
         }

         $$1.b(cbs.aN);
      }

      return d($$0);
   }

   private static boolean c(bso $$0) {
      btq<?> $$1 = $$0.dS();
      return $$1.a(cbs.L);
   }

   private static boolean a(bso $$0, btq<?> $$1, iw $$2) {
      Optional<Integer> $$3 = $$1.c(cbs.aO);
      dax $$4 = $$0.dP();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(dea.aY) && $$3.isPresent();
   }

   private static Optional<bvv> d(bso $$0) {
      return a($$0).map($$0x -> new bus($$0x, true));
   }

   public static Optional<aqn> a(bso $$0) {
      dax $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof aqm $$2) {
         Optional<UUID> $$3 = $$0.dS().c(cbs.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aqn $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
