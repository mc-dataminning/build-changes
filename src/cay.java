import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cay {
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

   protected static bpf<?> a(bpf<cax> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ciu.a));
      $$0.b(ciu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpf<cax> $$0) {
      $$0.a(ciu.a, 0, ImmutableList.of(new bsq(0.8F), new bpr(2.5F), new brc(45, 90), new brg(), new bqc(bxh.aO), new bqc(bxh.aP)));
   }

   private static void c(bpf<cax> $$0) {
      $$0.a(
         ciu.b,
         ImmutableList.of(
            Pair.of(0, bqq.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bqm(cay::b, 2.25F, 20)),
            Pair.of(2, bsk.a(cay::b, Predicate.not(cay::c), 4, 16, 2.25F)),
            Pair.of(3, brw.a(6.0F, blf.a(30, 60))),
            Pair.of(4, new brt(ImmutableList.of(Pair.of(bro.b(1.0F), 2), Pair.of(bsd.a(1.0F, 3), 2), Pair.of(new bqg(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cax $$0) {
      $$0.dO().a(ImmutableList.of(ciu.b));
   }

   public static void a(bog $$0, hz $$1) {
      bpf<?> $$2 = $$0.dO();
      ii $$3 = ii.a($$0.dM().ae(), $$1);
      Optional<ii> $$4 = $$2.c(bxh.aN);
      if ($$4.isEmpty()) {
         $$2.a(bxh.aN, $$3);
         $$2.a(bxh.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bxh.aO, 600);
      }
   }

   private static Optional<brk> b(bog $$0) {
      bpf<?> $$1 = $$0.dO();
      Optional<ii> $$2 = $$1.c(bxh.aN);
      if ($$2.isPresent()) {
         ii $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bpz($$3.b().c()));
         }

         $$1.b(bxh.aN);
      }

      return d($$0);
   }

   private static boolean c(bog $$0) {
      bpf<?> $$1 = $$0.dO();
      return $$1.a(bxh.L);
   }

   private static boolean a(bog $$0, bpf<?> $$1, ii $$2) {
      Optional<Integer> $$3 = $$1.c(bxh.aO);
      cvn $$4 = $$0.dM();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(cyq.aY) && $$3.isPresent();
   }

   private static Optional<brk> d(bog $$0) {
      return a($$0).map($$0x -> new bqh($$0x, true));
   }

   public static Optional<aow> a(bog $$0) {
      cvn $$1 = $$0.dM();
      if (!$$1.y_() && $$1 instanceof aov $$2) {
         Optional<UUID> $$3 = $$0.dO().c(bxh.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aow $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
