import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cgj {
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

   protected static buo<?> a(buo<cgi> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   private static void b(buo<cgi> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bxz(0.8F), new bva(2.5F), new bwl(45, 90), new bwp(), new bvl(ccq.aO), new bvl(ccq.aP)));
   }

   private static void c(buo<cgi> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, bvz.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bvv(cgj::b, 2.25F, 20)),
            Pair.of(2, bxt.a(cgj::b, Predicate.not(cgj::c), 4, 16, 2.25F)),
            Pair.of(3, bxf.a(6.0F, bqb.a(30, 60))),
            Pair.of(4, new bxc(ImmutableList.of(Pair.of(bwx.b(1.0F), 2), Pair.of(bxm.a(1.0F, 3), 2), Pair.of(new bvp(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cgi $$0) {
      $$0.dU().a(ImmutableList.of(cok.b));
   }

   public static void a(btl $$0, jd $$1) {
      buo<?> $$2 = $$0.dU();
      jl $$3 = jl.a($$0.dQ().af(), $$1);
      Optional<jl> $$4 = $$2.c(ccq.aN);
      if ($$4.isEmpty()) {
         $$2.a(ccq.aN, $$3);
         $$2.a(ccq.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(ccq.aO, 600);
      }
   }

   private static Optional<bwt> b(btl $$0) {
      buo<?> $$1 = $$0.dU();
      Optional<jl> $$2 = $$1.c(ccq.aN);
      if ($$2.isPresent()) {
         jl $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bvi($$3.b().c()));
         }

         $$1.b(ccq.aN);
      }

      return d($$0);
   }

   private static boolean c(btl $$0) {
      buo<?> $$1 = $$0.dU();
      return $$1.a(ccq.L);
   }

   private static boolean a(btl $$0, buo<?> $$1, jl $$2) {
      Optional<Integer> $$3 = $$1.c(ccq.aO);
      dcu $$4 = $$0.dQ();
      return $$4.af() == $$2.a() && $$4.a_($$2.b()).a(dfy.aY) && $$3.isPresent();
   }

   private static Optional<bwt> d(btl $$0) {
      return a($$0).map($$0x -> new bvq($$0x, true));
   }

   public static Optional<aqu> a(btl $$0) {
      dcu $$1 = $$0.dQ();
      if (!$$1.x_() && $$1 instanceof aqt $$2) {
         Optional<UUID> $$3 = $$0.dU().c(ccq.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aqu $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
