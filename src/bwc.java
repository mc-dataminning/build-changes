import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bwc {
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

   protected static bkm<?> a(bkm<bwb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   private static void b(bkm<bwb> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bnw(0.8F), new bky(2.5F), new bmi(45, 90), new bmm(), new blj(bsn.aN), new blj(bsn.aO)));
   }

   private static void c(bkm<bwb> $$0) {
      $$0.a(
         cdl.b,
         ImmutableList.of(
            Pair.of(0, blx.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new blt(bwc::b, 2.25F, 20)),
            Pair.of(2, bnq.a(bwc::b, Predicate.not(bwc::c), 4, 16, 2.25F)),
            Pair.of(3, bnc.a(6.0F, bgp.a(30, 60))),
            Pair.of(4, new bmz(ImmutableList.of(Pair.of(bmu.b(1.0F), 2), Pair.of(bnj.a(1.0F, 3), 2), Pair.of(new bln(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bwb $$0) {
      $$0.dN().a(ImmutableList.of(cdl.b));
   }

   public static void a(bjm $$0, gw $$1) {
      bkm<?> $$2 = $$0.dN();
      hd $$3 = hd.a($$0.dL().ac(), $$1);
      Optional<hd> $$4 = $$2.c(bsn.aM);
      if ($$4.isEmpty()) {
         $$2.a(bsn.aM, $$3);
         $$2.a(bsn.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bsn.aN, 600);
      }
   }

   private static Optional<bmq> b(bjm $$0) {
      bkm<?> $$1 = $$0.dN();
      Optional<hd> $$2 = $$1.c(bsn.aM);
      if ($$2.isPresent()) {
         hd $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new blg($$3.b().c()));
         }

         $$1.b(bsn.aM);
      }

      return d($$0);
   }

   private static boolean c(bjm $$0) {
      bkm<?> $$1 = $$0.dN();
      return $$1.a(bsn.K);
   }

   private static boolean a(bjm $$0, bkm<?> $$1, hd $$2) {
      Optional<Integer> $$3 = $$1.c(bsn.aN);
      cqb $$4 = $$0.dL();
      return $$4.ac() == $$2.a() && $$4.a_($$2.b()).a(cte.aY) && $$3.isPresent();
   }

   private static Optional<bmq> d(bjm $$0) {
      return a($$0).map($$0x -> new blo($$0x, true));
   }

   public static Optional<aku> a(bjm $$0) {
      cqb $$1 = $$0.dL();
      if (!$$1.w_() && $$1 instanceof akt $$2) {
         Optional<UUID> $$3 = $$0.dN().c(bsn.aL);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aku $$5 && ($$5.e.d() || $$5.e.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
