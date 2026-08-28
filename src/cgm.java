import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cgm {
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

   protected static bur<?> a(bur<cgl> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   private static void b(bur<cgl> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byc(0.8F), new bvd(2.5F), new bwo(45, 90), new bws(), new bvo(cct.aO), new bvo(cct.aP)));
   }

   private static void c(bur<cgl> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, bwc.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvy(cgm::b, 2.25F, 20)),
            Pair.of(2, bxw.a(cgm::b, Predicate.not(cgm::c), 4, 16, 2.25F)),
            Pair.of(3, bxi.a(6.0F, bqf.a(30, 60))),
            Pair.of(4, new bxf(ImmutableList.of(Pair.of(bxa.b(1.0F), 2), Pair.of(bxp.a(1.0F, 3), 2), Pair.of(new bvs(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cgl $$0) {
      $$0.dS().a(ImmutableList.of(com.b));
   }

   public static void a(btp $$0, iz $$1) {
      bur<?> $$2 = $$0.dS();
      jh $$3 = jh.a($$0.dP().af(), $$1);
      Optional<jh> $$4 = $$2.c(cct.aN);
      if ($$4.isEmpty()) {
         $$2.a(cct.aN, $$3);
         $$2.a(cct.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cct.aO, 600);
      }
   }

   private static Optional<bww> b(btp $$0) {
      bur<?> $$1 = $$0.dS();
      Optional<jh> $$2 = $$1.c(cct.aN);
      if ($$2.isPresent()) {
         jh $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bvl($$3.b().c()));
         }

         $$1.b(cct.aN);
      }

      return d($$0);
   }

   private static boolean c(btp $$0) {
      bur<?> $$1 = $$0.dS();
      return $$1.a(cct.L);
   }

   private static boolean a(btp $$0, bur<?> $$1, jh $$2) {
      Optional<Integer> $$3 = $$1.c(cct.aO);
      dby $$4 = $$0.dP();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfb.aY) && $$3.isPresent();
   }

   private static Optional<bww> d(btp $$0) {
      return a($$0).map($$0x -> new bvt($$0x, true));
   }

   public static Optional<arg> a(btp $$0) {
      dby $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof arf $$2) {
         Optional<UUID> $$3 = $$0.dS().c(cct.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arg $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
