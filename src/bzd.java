import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bzd {
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

   protected static bnl<?> a(bnl<bzc> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnl<bzc> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bqw(0.8F), new bnx(2.5F), new bpi(45, 90), new bpm(), new boi(bvn.aN), new boi(bvn.aO)));
   }

   private static void c(bnl<bzc> $$0) {
      $$0.a(
         cgu.b,
         ImmutableList.of(
            Pair.of(0, bow.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bos(bzd::b, 2.25F, 20)),
            Pair.of(2, bqq.a(bzd::b, Predicate.not(bzd::c), 4, 16, 2.25F)),
            Pair.of(3, bqc.a(6.0F, bjm.a(30, 60))),
            Pair.of(4, new bpz(ImmutableList.of(Pair.of(bpu.b(1.0F), 2), Pair.of(bqj.a(1.0F, 3), 2), Pair.of(new bom(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bzc $$0) {
      $$0.dO().a(ImmutableList.of(cgu.b));
   }

   public static void a(bml $$0, hx $$1) {
      bnl<?> $$2 = $$0.dO();
      ig $$3 = ig.a($$0.dM().ae(), $$1);
      Optional<ig> $$4 = $$2.c(bvn.aM);
      if ($$4.isEmpty()) {
         $$2.a(bvn.aM, $$3);
         $$2.a(bvn.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bvn.aN, 600);
      }
   }

   private static Optional<bpq> b(bml $$0) {
      bnl<?> $$1 = $$0.dO();
      Optional<ig> $$2 = $$1.c(bvn.aM);
      if ($$2.isPresent()) {
         ig $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bof($$3.b().c()));
         }

         $$1.b(bvn.aM);
      }

      return d($$0);
   }

   private static boolean c(bml $$0) {
      bnl<?> $$1 = $$0.dO();
      return $$1.a(bvn.K);
   }

   private static boolean a(bml $$0, bnl<?> $$1, ig $$2) {
      Optional<Integer> $$3 = $$1.c(bvn.aN);
      ctp $$4 = $$0.dM();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(cws.aY) && $$3.isPresent();
   }

   private static Optional<bpq> d(bml $$0) {
      return a($$0).map($$0x -> new bon($$0x, true));
   }

   public static Optional<ane> a(bml $$0) {
      ctp $$1 = $$0.dM();
      if (!$$1.y_() && $$1 instanceof and $$2) {
         Optional<UUID> $$3 = $$0.dO().c(bvn.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof ane $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
