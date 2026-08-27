import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class byx {
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

   protected static bnf<?> a(bnf<byw> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnf<byw> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bqq(0.8F), new bnr(2.5F), new bpc(45, 90), new bpg(), new boc(bvh.aN), new boc(bvh.aO)));
   }

   private static void c(bnf<byw> $$0) {
      $$0.a(
         cgn.b,
         ImmutableList.of(
            Pair.of(0, boq.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bom(byx::b, 2.25F, 20)),
            Pair.of(2, bqk.a(byx::b, Predicate.not(byx::c), 4, 16, 2.25F)),
            Pair.of(3, bpw.a(6.0F, bjg.a(30, 60))),
            Pair.of(4, new bpt(ImmutableList.of(Pair.of(bpo.b(1.0F), 2), Pair.of(bqd.a(1.0F, 3), 2), Pair.of(new bog(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(byw $$0) {
      $$0.dO().a(ImmutableList.of(cgn.b));
   }

   public static void a(bmf $$0, hx $$1) {
      bnf<?> $$2 = $$0.dO();
      ig $$3 = ig.a($$0.dM().ae(), $$1);
      Optional<ig> $$4 = $$2.c(bvh.aM);
      if ($$4.isEmpty()) {
         $$2.a(bvh.aM, $$3);
         $$2.a(bvh.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bvh.aN, 600);
      }
   }

   private static Optional<bpk> b(bmf $$0) {
      bnf<?> $$1 = $$0.dO();
      Optional<ig> $$2 = $$1.c(bvh.aM);
      if ($$2.isPresent()) {
         ig $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bnz($$3.b().c()));
         }

         $$1.b(bvh.aM);
      }

      return d($$0);
   }

   private static boolean c(bmf $$0) {
      bnf<?> $$1 = $$0.dO();
      return $$1.a(bvh.K);
   }

   private static boolean a(bmf $$0, bnf<?> $$1, ig $$2) {
      Optional<Integer> $$3 = $$1.c(bvh.aN);
      cti $$4 = $$0.dM();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(cwl.aY) && $$3.isPresent();
   }

   private static Optional<bpk> d(bmf $$0) {
      return a($$0).map($$0x -> new boh($$0x, true));
   }

   public static Optional<ana> a(bmf $$0) {
      cti $$1 = $$0.dM();
      if (!$$1.y_() && $$1 instanceof amz $$2) {
         Optional<UUID> $$3 = $$0.dO().c(bvh.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof ana $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
