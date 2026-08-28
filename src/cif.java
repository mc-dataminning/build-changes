import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cif {
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

   protected static bwj<?> a(bwj<cie> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cql.a));
      $$0.b(cql.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<cie> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new bzu(0.8F), new bwv(2.5F), new byg(45, 90), new byk(), new bxg(cel.aO), new bxg(cel.aP)));
   }

   private static void c(bwj<cie> $$0) {
      $$0.a(
         cql.b,
         ImmutableList.of(
            Pair.of(0, bxu.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bxq(cif::b, 2.25F, 20)),
            Pair.of(2, bzo.a(cif::b, Predicate.not(cif::c), 4, 16, 2.25F)),
            Pair.of(3, bza.a(6.0F, brv.a(30, 60))),
            Pair.of(4, new byx(ImmutableList.of(Pair.of(bys.b(1.0F), 2), Pair.of(bzh.a(1.0F, 3), 2), Pair.of(new bxk(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cie $$0) {
      $$0.eb().a(ImmutableList.of(cql.b));
   }

   public static void a(bvh $$0, jh $$1) {
      bwj<?> $$2 = $$0.eb();
      jp $$3 = jp.a($$0.dV().ag(), $$1);
      Optional<jp> $$4 = $$2.c(cel.aN);
      if ($$4.isEmpty()) {
         $$2.a(cel.aN, $$3);
         $$2.a(cel.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(cel.aO, 600);
      }
   }

   private static Optional<byo> b(bvh $$0) {
      bwj<?> $$1 = $$0.eb();
      Optional<jp> $$2 = $$1.c(cel.aN);
      if ($$2.isPresent()) {
         jp $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bxd($$3.b().d()));
         }

         $$1.b(cel.aN);
      }

      return d($$0);
   }

   private static boolean c(bvh $$0) {
      bwj<?> $$1 = $$0.eb();
      return $$1.a(cel.L);
   }

   private static boolean a(bvh $$0, bwj<?> $$1, jp $$2) {
      Optional<Integer> $$3 = $$1.c(cel.aO);
      dfm $$4 = $$0.dV();
      return $$4.ag() == $$2.a() && $$4.a_($$2.b()).a(dis.aY) && $$3.isPresent();
   }

   private static Optional<byo> d(bvh $$0) {
      return a($$0).map($$0x -> new bxl($$0x, true));
   }

   public static Optional<arq> a(bvh $$0) {
      dfm $$1 = $$0.dV();
      if (!$$1.A_() && $$1 instanceof arp $$2) {
         Optional<UUID> $$3 = $$0.eb().c(cel.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof arq $$5 && ($$5.h.d() || $$5.h.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
