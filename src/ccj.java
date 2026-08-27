import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class ccj {
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

   protected static bqq<?> a(bqq<cci> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   private static void b(bqq<cci> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bub(0.8F), new brc(2.5F), new bsn(45, 90), new bsr(), new brn(bys.aO), new brn(bys.aP)));
   }

   private static void c(bqq<cci> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, bsb.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new brx(ccj::b, 2.25F, 20)),
            Pair.of(2, btv.a(ccj::b, Predicate.not(ccj::c), 4, 16, 2.25F)),
            Pair.of(3, bth.a(6.0F, bmo.a(30, 60))),
            Pair.of(4, new bte(ImmutableList.of(Pair.of(bsz.b(1.0F), 2), Pair.of(bto.a(1.0F, 3), 2), Pair.of(new brr(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cci $$0) {
      $$0.dP().a(ImmutableList.of(ckj.b));
   }

   public static void a(bpp $$0, ib $$1) {
      bqq<?> $$2 = $$0.dP();
      ik $$3 = ik.a($$0.dM().ad(), $$1);
      Optional<ik> $$4 = $$2.c(bys.aN);
      if ($$4.isEmpty()) {
         $$2.a(bys.aN, $$3);
         $$2.a(bys.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bys.aO, 600);
      }
   }

   private static Optional<bsv> b(bpp $$0) {
      bqq<?> $$1 = $$0.dP();
      Optional<ik> $$2 = $$1.c(bys.aN);
      if ($$2.isPresent()) {
         ik $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new brk($$3.b().c()));
         }

         $$1.b(bys.aN);
      }

      return d($$0);
   }

   private static boolean c(bpp $$0) {
      bqq<?> $$1 = $$0.dP();
      return $$1.a(bys.L);
   }

   private static boolean a(bpp $$0, bqq<?> $$1, ik $$2) {
      Optional<Integer> $$3 = $$1.c(bys.aO);
      cxb $$4 = $$0.dM();
      return $$4.ad() == $$2.a() && $$4.a_($$2.b()).a(dae.aY) && $$3.isPresent();
   }

   private static Optional<bsv> d(bpp $$0) {
      return a($$0).map($$0x -> new brs($$0x, true));
   }

   public static Optional<apg> a(bpp $$0) {
      cxb $$1 = $$0.dM();
      if (!$$1.x_() && $$1 instanceof apf $$2) {
         Optional<UUID> $$3 = $$0.dP().c(bys.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof apg $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
