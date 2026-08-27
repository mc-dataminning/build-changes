import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cbc {
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

   protected static bpj<?> a(bpj<cbb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpj<cbb> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bsu(0.8F), new bpv(2.5F), new brg(45, 90), new brk(), new bqg(bxl.aO), new bqg(bxl.aP)));
   }

   private static void c(bpj<cbb> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, bqu.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bqq(cbc::b, 2.25F, 20)),
            Pair.of(2, bso.a(cbc::b, Predicate.not(cbc::c), 4, 16, 2.25F)),
            Pair.of(3, bsa.a(6.0F, blh.a(30, 60))),
            Pair.of(4, new brx(ImmutableList.of(Pair.of(brs.b(1.0F), 2), Pair.of(bsh.a(1.0F, 3), 2), Pair.of(new bqk(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cbb $$0) {
      $$0.dO().a(ImmutableList.of(ciy.b));
   }

   public static void a(boi $$0, hz $$1) {
      bpj<?> $$2 = $$0.dO();
      ii $$3 = ii.a($$0.dM().ad(), $$1);
      Optional<ii> $$4 = $$2.c(bxl.aN);
      if ($$4.isEmpty()) {
         $$2.a(bxl.aN, $$3);
         $$2.a(bxl.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bxl.aO, 600);
      }
   }

   private static Optional<bro> b(boi $$0) {
      bpj<?> $$1 = $$0.dO();
      Optional<ii> $$2 = $$1.c(bxl.aN);
      if ($$2.isPresent()) {
         ii $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bqd($$3.b().c()));
         }

         $$1.b(bxl.aN);
      }

      return d($$0);
   }

   private static boolean c(boi $$0) {
      bpj<?> $$1 = $$0.dO();
      return $$1.a(bxl.L);
   }

   private static boolean a(boi $$0, bpj<?> $$1, ii $$2) {
      Optional<Integer> $$3 = $$1.c(bxl.aO);
      cvr $$4 = $$0.dM();
      return $$4.ad() == $$2.a() && $$4.a_($$2.b()).a(cyu.aY) && $$3.isPresent();
   }

   private static Optional<bro> d(boi $$0) {
      return a($$0).map($$0x -> new bql($$0x, true));
   }

   public static Optional<aox> a(boi $$0) {
      cvr $$1 = $$0.dM();
      if (!$$1.y_() && $$1 instanceof aow $$2) {
         Optional<UUID> $$3 = $$0.dO().c(bxl.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof aox $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
