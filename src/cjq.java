import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cjq {
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

   protected static bxr<?> a(bxr<cjp> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxr<cjp> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc(0.8F), new byd(2.5F), new bzo(45, 90), new bzs(), new byo(cft.aP), new byo(cft.aQ)));
   }

   private static void c(bxr<cjp> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, bzc.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new byy(cjq::b, 2.25F, 20)),
            Pair.of(2, caw.a(cjq::b, Predicate.not(cjq::c), 4, 16, 2.25F)),
            Pair.of(3, cai.a(6.0F, btb.a(30, 60))),
            Pair.of(4, new caf(ImmutableList.of(Pair.of(caa.b(1.0F), 2), Pair.of(cap.a(1.0F, 3), 2), Pair.of(new bys(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cjp $$0) {
      $$0.eb().a(ImmutableList.of(crz.b));
   }

   public static void a(bwr $$0, jj $$1) {
      bxr<?> $$2 = $$0.eb();
      jr $$3 = jr.a($$0.dV().aj(), $$1);
      Optional<jr> $$4 = $$2.c(cft.aO);
      if ($$4.isEmpty()) {
         $$2.a(cft.aO, $$3);
         $$2.a(cft.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cft.aP, 600);
      }
   }

   private static Optional<bzw> b(bwr $$0) {
      bxr<?> $$1 = $$0.eb();
      Optional<jr> $$2 = $$1.c(cft.aO);
      if ($$2.isPresent()) {
         jr $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new byl($$3.b().d()));
         }

         $$1.b(cft.aO);
      }

      return d($$0);
   }

   private static boolean c(bwr $$0) {
      bxr<?> $$1 = $$0.eb();
      return $$1.a(cft.M);
   }

   private static boolean a(bwr $$0, bxr<?> $$1, jr $$2) {
      Optional<Integer> $$3 = $$1.c(cft.aP);
      dhp $$4 = $$0.dV();
      return $$2.a($$4.aj(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(dkw.bf) && $$3.isPresent();
   }

   private static Optional<bzw> d(bwr $$0) {
      return a($$0).map($$0x -> new byt($$0x, true));
   }

   public static Optional<aro> a(bwr $$0) {
      dhp $$1 = $$0.dV();
      if (!$$1.w_() && $$1 instanceof arn $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cft.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof aro $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
