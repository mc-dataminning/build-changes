import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class bzc {
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

   protected static bnk<?> a(bnk<bzb> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cgt.a));
      $$0.b(cgt.b);
      $$0.f();
      return $$0;
   }

   private static void b(bnk<bzb> $$0) {
      $$0.a(cgt.a, 0, ImmutableList.of(new bqv(0.8F), new bnw(2.5F), new bph(45, 90), new bpl(), new boh(bvm.aN), new boh(bvm.aO)));
   }

   private static void c(bnk<bzb> $$0) {
      $$0.a(
         cgt.b,
         ImmutableList.of(
            Pair.of(0, bov.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new bor(bzc::b, 2.25F, 20)),
            Pair.of(2, bqp.a(bzc::b, Predicate.not(bzc::c), 4, 16, 2.25F)),
            Pair.of(3, bqb.a(6.0F, bjl.a(30, 60))),
            Pair.of(4, new bpy(ImmutableList.of(Pair.of(bpt.b(1.0F), 2), Pair.of(bqi.a(1.0F, 3), 2), Pair.of(new bol(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(bzb $$0) {
      $$0.dO().a(ImmutableList.of(cgt.b));
   }

   public static void a(bmk $$0, hx $$1) {
      bnk<?> $$2 = $$0.dO();
      ig $$3 = ig.a($$0.dM().ae(), $$1);
      Optional<ig> $$4 = $$2.c(bvm.aM);
      if ($$4.isEmpty()) {
         $$2.a(bvm.aM, $$3);
         $$2.a(bvm.aN, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bvm.aN, 600);
      }
   }

   private static Optional<bpp> b(bmk $$0) {
      bnk<?> $$1 = $$0.dO();
      Optional<ig> $$2 = $$1.c(bvm.aM);
      if ($$2.isPresent()) {
         ig $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new boe($$3.b().c()));
         }

         $$1.b(bvm.aM);
      }

      return d($$0);
   }

   private static boolean c(bmk $$0) {
      bnk<?> $$1 = $$0.dO();
      return $$1.a(bvm.K);
   }

   private static boolean a(bmk $$0, bnk<?> $$1, ig $$2) {
      Optional<Integer> $$3 = $$1.c(bvm.aN);
      cto $$4 = $$0.dM();
      return $$4.ae() == $$2.a() && $$4.a_($$2.b()).a(cwr.aY) && $$3.isPresent();
   }

   private static Optional<bpp> d(bmk $$0) {
      return a($$0).map($$0x -> new bom($$0x, true));
   }

   public static Optional<ane> a(bmk $$0) {
      cto $$1 = $$0.dM();
      if (!$$1.y_() && $$1 instanceof and $$2) {
         Optional<UUID> $$3 = $$0.dO().c(bvm.aL);
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
