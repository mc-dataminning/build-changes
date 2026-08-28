import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cjy {
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

   protected static bxz<?> a(bxz<cjx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bxz<cjx> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk(0.8F), new byl(2.5F), new bzw(45, 90), new caa(), new byw(cgb.aP), new byw(cgb.aQ)));
   }

   private static void c(bxz<cjx> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, bzk.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bzg(cjy::b, 2.25F, 20)),
            Pair.of(2, cbe.a(cjy::b, Predicate.not(cjy::c), 4, 16, 2.25F)),
            Pair.of(3, caq.a(6.0F, btj.a(30, 60))),
            Pair.of(4, new can(ImmutableList.of(Pair.of(cai.b(1.0F), 2), Pair.of(cax.a(1.0F, 3), 2), Pair.of(new bza(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cjx $$0) {
      $$0.eb().a(ImmutableList.of(csl.b));
   }

   public static void a(bwz $$0, iu $$1) {
      bxz<?> $$2 = $$0.eb();
      jd $$3 = jd.a($$0.dV().aj(), $$1);
      Optional<jd> $$4 = $$2.c(cgb.aO);
      if ($$4.isEmpty()) {
         $$2.a(cgb.aO, $$3);
         $$2.a(cgb.aP, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cgb.aP, 600);
      }
   }

   private static Optional<cae> b(bwz $$0) {
      bxz<?> $$1 = $$0.eb();
      Optional<jd> $$2 = $$1.c(cgb.aO);
      if ($$2.isPresent()) {
         jd $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new byt($$3.b().d()));
         }

         $$1.b(cgb.aO);
      }

      return d($$0);
   }

   private static boolean c(bwz $$0) {
      bxz<?> $$1 = $$0.eb();
      return $$1.a(cgb.M);
   }

   private static boolean a(bwz $$0, bxz<?> $$1, jd $$2) {
      Optional<Integer> $$3 = $$1.c(cgb.aP);
      dip $$4 = $$0.dV();
      return $$2.a($$4.aj(), $$0.dv(), 1024) && $$4.a_($$2.b()).a(dlw.bf) && $$3.isPresent();
   }

   private static Optional<cae> d(bwz $$0) {
      return a($$0).map($$0x -> new bzb($$0x, true));
   }

   public static Optional<arp> a(bwz $$0) {
      dip $$1 = $$0.dV();
      if (!$$1.w_() && $$1 instanceof aro $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cgb.aN);
         if ($$3.isPresent()) {
            if ($$2.b($$3.get()) instanceof arp $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
