import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bvy {
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

   protected static bki<?> a(bki<bvx> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdh.a));
      $$0.b(cdh.b);
      $$0.f();
      return $$0;
   }

   private static void b(bki<bvx> $$0) {
      $$0.a(cdh.a, 0, ImmutableList.of(new bns(0.8F), new bku(2.5F), new bme(45, 90), new bmi(), new blf(bsj.aN), new blf(bsj.aO)));
   }

   private static void c(bki<bvx> $$0) {
      $$0.a(
         cdh.b,
         ImmutableList.of(
            Pair.of(0, blt.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new blp(bvy::b, 2.25F, 20)),
            Pair.of(2, bnm.a(bvy::b, Predicate.not(bvy::c), 4, 16, 2.25F)),
            Pair.of(3, bmy.a(6.0F, bgl.a(30, 60))),
            Pair.of(4, new bmv(ImmutableList.of(Pair.of(bmq.b(1.0F), 2), Pair.of(bnf.a(1.0F, 3), 2), Pair.of(new blj(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bvx $$0) {
      $$0.dN().a(ImmutableList.of(cdh.b));
   }

   public static void a(bji $$0, gw $$1) {
      bki<?> $$2 = $$0.dN();
      hf $$3 = hf.a($$0.dL().ac(), $$1);
      Optional<hf> $$4 = $$2.c(bsj.aM);
      if ($$4.isEmpty()) {
         $$2.a(bsj.aM, $$3);
         $$2.a(bsj.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bsj.aN, 600);
      }
   }

   private static Optional<bmm> b(bji $$0) {
      bki<?> $$1 = $$0.dN();
      Optional<hf> $$2 = $$1.c(bsj.aM);
      if ($$2.isPresent()) {
         hf $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new blc($$3.b().c()));
         }

         $$1.b(bsj.aM);
      }

      return d($$0);
   }

   private static boolean c(bji $$0) {
      bki<?> $$1 = $$0.dN();
      return $$1.a(bsj.K);
   }

   private static boolean a(bji $$0, bki<?> $$1, hf $$2) {
      Optional<Integer> $$3 = $$1.c(bsj.aN);
      cpx $$4 = $$0.dL();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(csy.aY) && $$3.isPresent();
   }

   private static Optional<bmm> d(bji $$0) {
      return a($$0).map($$0x -> new blk($$0x, true));
   }

   public static Optional<akt> a(bji $$0) {
      cpx $$1 = $$0.dL();
      if (!$$1.w_() && $$1 instanceof aks $$2) {
         Optional<UUID> $$3 = $$0.dN().c(bsj.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof akt $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
