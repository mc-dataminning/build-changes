import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cfn {
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

   protected static bts<?> a(bts<cfm> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bts<cfm> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bxd(0.8F), new bue(2.5F), new bvp(45, 90), new bvt(), new bup(cbu.aO), new bup(cbu.aP)));
   }

   private static void c(bts<cfm> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, bvd.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new buz(cfn::b, 2.25F, 20)),
            Pair.of(2, bwx.a(cfn::b, Predicate.not(cfn::c), 4, 16, 2.25F)),
            Pair.of(3, bwj.a(6.0F, bph.a(30, 60))),
            Pair.of(4, new bwg(ImmutableList.of(Pair.of(bwb.b(1.0F), 2), Pair.of(bwq.a(1.0F, 3), 2), Pair.of(new but(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cfm $$0) {
      $$0.dS().a(ImmutableList.of(cnn.b));
   }

   public static void a(bsq $$0, io $$1) {
      bts<?> $$2 = $$0.dS();
      iw $$3 = iw.a($$0.dP().ae(), $$1);
      Optional<iw> $$4 = $$2.c(cbu.aN);
      if ($$4.isEmpty()) {
         $$2.a(cbu.aN, $$3);
         $$2.a(cbu.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cbu.aO, 600);
      }
   }

   private static Optional<bvx> b(bsq $$0) {
      bts<?> $$1 = $$0.dS();
      Optional<iw> $$2 = $$1.c(cbu.aN);
      if ($$2.isPresent()) {
         iw $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bum($$3.b().c()));
         }

         $$1.b(cbu.aN);
      }

      return d($$0);
   }

   private static boolean c(bsq $$0) {
      bts<?> $$1 = $$0.dS();
      return $$1.a(cbu.L);
   }

   private static boolean a(bsq $$0, bts<?> $$1, iw $$2) {
      Optional<Integer> $$3 = $$1.c(cbu.aO);
      daz $$4 = $$0.dP();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(dec.aY) && $$3.isPresent();
   }

   private static Optional<bvx> d(bsq $$0) {
      return a($$0).map($$0x -> new buu($$0x, true));
   }

   public static Optional<aqo> a(bsq $$0) {
      daz $$1 = $$0.dP();
      if (!$$1.x_() && $$1 instanceof aqn $$2) {
         Optional<UUID> $$3 = $$0.dS().c(cbu.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aqo $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
