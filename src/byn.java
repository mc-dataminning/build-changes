import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class byn {
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

   protected static bmv<?> a(bmv<bym> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   private static void b(bmv<bym> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bqg(0.8F), new bnh(2.5F), new bos(45, 90), new bow(), new bns(bux.aN), new bns(bux.aO)));
   }

   private static void c(bmv<bym> $$0) {
      $$0.a(
         cgd.b,
         ImmutableList.of(
            Pair.of(0, bog.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new boc(byn::b, 2.25F, 20)),
            Pair.of(2, bqa.a(byn::b, Predicate.not(byn::c), 4, 16, 2.25F)),
            Pair.of(3, bpm.a(6.0F, biw.a(30, 60))),
            Pair.of(4, new bpj(ImmutableList.of(Pair.of(bpe.b(1.0F), 2), Pair.of(bpt.a(1.0F, 3), 2), Pair.of(new bnw(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bym $$0) {
      $$0.dO().a(ImmutableList.of(cgd.b));
   }

   public static void a(blv $$0, hv $$1) {
      bmv<?> $$2 = $$0.dO();
      id $$3 = id.a($$0.dM().ad(), $$1);
      Optional<id> $$4 = $$2.c(bux.aM);
      if ($$4.isEmpty()) {
         $$2.a(bux.aM, $$3);
         $$2.a(bux.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bux.aN, 600);
      }
   }

   private static Optional<bpa> b(blv $$0) {
      bmv<?> $$1 = $$0.dO();
      Optional<id> $$2 = $$1.c(bux.aM);
      if ($$2.isPresent()) {
         id $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bnp($$3.b().c()));
         }

         $$1.b(bux.aM);
      }

      return d($$0);
   }

   private static boolean c(blv $$0) {
      bmv<?> $$1 = $$0.dO();
      return $$1.a(bux.K);
   }

   private static boolean a(blv $$0, bmv<?> $$1, id $$2) {
      Optional<Integer> $$3 = $$1.c(bux.aN);
      csy $$4 = $$0.dM();
      return $$4.ad() == $$2.a() && $$4.a_($$2.b()).a(cwb.aY) && $$3.isPresent();
   }

   private static Optional<bpa> d(blv $$0) {
      return a($$0).map($$0x -> new bnx($$0x, true));
   }

   public static Optional<amq> a(blv $$0) {
      csy $$1 = $$0.dM();
      if (!$$1.y_() && $$1 instanceof amp $$2) {
         Optional<UUID> $$3 = $$0.dO().c(bux.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof amq $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
