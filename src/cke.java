import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cke {
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

   protected static byc<?> a(byc<ckd> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   private static void b(byc<ckd> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn(0.8F), new byo(2.5F), new bzz(45, 90), new cad(), new byz(cge.aP), new byz(cge.aQ)));
   }

   private static void c(byc<ckd> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, bzn.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bzj(cke::b, 2.25F, 20)),
            Pair.of(2, cbh.a(cke::b, Predicate.not(cke::c), 4, 16, 2.25F)),
            Pair.of(3, cat.a(6.0F, btm.a(30, 60))),
            Pair.of(4, new caq(ImmutableList.of(Pair.of(cal.b(1.0F), 2), Pair.of(cba.a(1.0F, 3), 2), Pair.of(new bzd(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(ckd $$0) {
      $$0.eb().a(ImmutableList.of(csr.b));
   }

   public static void a(bxc $$0, iu $$1) {
      byc<?> $$2 = $$0.eb();
      jd $$3 = jd.a($$0.dV().aj(), $$1);
      Optional<jd> $$4 = $$2.c(cge.aO);
      if ($$4.isEmpty()) {
         $$2.a(cge.aO, $$3);
         $$2.a(cge.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cge.aP, 600);
      }
   }

   private static Optional<cah> b(bxc $$0) {
      byc<?> $$1 = $$0.eb();
      Optional<jd> $$2 = $$1.c(cge.aO);
      if ($$2.isPresent()) {
         jd $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new byw($$3.b().d()));
         }

         $$1.b(cge.aO);
      }

      return d($$0);
   }

   private static boolean c(bxc $$0) {
      byc<?> $$1 = $$0.eb();
      return $$1.a(cge.M);
   }

   private static boolean a(bxc $$0, byc<?> $$1, jd $$2) {
      Optional<Integer> $$3 = $$1.c(cge.aP);
      div $$4 = $$0.dV();
      return $$2.a($$4.aj(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(dmc.bf) && $$3.isPresent();
   }

   private static Optional<cah> d(bxc $$0) {
      return a($$0).map($$0x -> new bze($$0x, true));
   }

   public static Optional<arr> a(bxc $$0) {
      div $$1 = $$0.dV();
      if (!$$1.w_() && $$1 instanceof arq $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cge.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof arr $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
