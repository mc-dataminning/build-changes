import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class clf {
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

   protected static bzf<?> a(bzf<cle> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cuc.a));
      $$0.b(cuc.b);
      $$0.f();
      return $$0;
   }

   private static void b(bzf<cle> $$0) {
      $$0.a(cuc.a, 0, ImmutableList.of(new ccq(0.8F), new bzr(2.5F), new cbc(45, 90), new cbg(), new cac(chh.aP), new cac(chh.aQ)));
   }

   private static void c(bzf<cle> $$0) {
      $$0.a(
         cuc.b,
         ImmutableList.of(
            Pair.of(0, caq.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new cam(clf::b, 2.25F, 20)),
            Pair.of(2, cck.a(clf::b, Predicate.not(clf::c), 4, 16, 2.25F)),
            Pair.of(3, cbw.a(6.0F, bun.a(30, 60))),
            Pair.of(4, new cbt(ImmutableList.of(Pair.of(cbo.b(1.0F), 2), Pair.of(ccd.a(1.0F, 3), 2), Pair.of(new cag(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cle $$0) {
      $$0.ec().a(ImmutableList.of(cuc.b));
   }

   public static void a(byf $$0, iw $$1) {
      bzf<?> $$2 = $$0.ec();
      jf $$3 = jf.a($$0.dV().aj(), $$1);
      Optional<jf> $$4 = $$2.c(chh.aO);
      if ($$4.isEmpty()) {
         $$2.a(chh.aO, $$3);
         $$2.a(chh.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(chh.aP, 600);
      }
   }

   private static Optional<cbk> b(byf $$0) {
      bzf<?> $$1 = $$0.ec();
      Optional<jf> $$2 = $$1.c(chh.aO);
      if ($$2.isPresent()) {
         jf $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bzz($$3.b().d()));
         }

         $$1.b(chh.aO);
      }

      return d($$0);
   }

   private static boolean c(byf $$0) {
      bzf<?> $$1 = $$0.ec();
      return $$1.a(chh.M);
   }

   private static boolean a(byf $$0, bzf<?> $$1, jf $$2) {
      Optional<Integer> $$3 = $$1.c(chh.aP);
      dkj $$4 = $$0.dV();
      return $$2.a($$4.aj(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(dnq.bf) && $$3.isPresent();
   }

   private static Optional<cbk> d(byf $$0) {
      return a($$0).map($$0x -> new cah($$0x, true));
   }

   public static Optional<asc> a(byf $$0) {
      dkj $$1 = $$0.dV();
      if (!$$1.A_() && $$1 instanceof asb $$2) {
         Optional<UUID> $$3 = $$0.ec().c(chh.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof asc $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
