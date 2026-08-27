import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class cbr {
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

   protected static bpy<?> a(bpy<cbq> $$0) {
      b($$0);
      c($$0);
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cbq> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new btj(0.8F), new bqk(2.5F), new brv(45, 90), new brz(), new bqv(bya.aO), new bqv(bya.aP)));
   }

   private static void c(bpy<cbq> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, brj.a($$0x -> true, 1.75F, true, 32)),
            Pair.of(1, new brf(cbr::b, 2.25F, 20)),
            Pair.of(2, btd.a(cbr::b, Predicate.not(cbr::c), 4, 16, 2.25F)),
            Pair.of(3, bsp.a(6.0F, blw.a(30, 60))),
            Pair.of(4, new bsm(ImmutableList.of(Pair.of(bsh.b(1.0F), 2), Pair.of(bsw.a(1.0F, 3), 2), Pair.of(new bqz(30, 60), 1))))
         ),
         ImmutableSet.of()
      );
   }

   public static void a(cbq $$0) {
      $$0.dM().a(ImmutableList.of(cjn.b));
   }

   public static void a(box $$0, ib $$1) {
      bpy<?> $$2 = $$0.dM();
      ik $$3 = ik.a($$0.dJ().ad(), $$1);
      Optional<ik> $$4 = $$2.c(bya.aN);
      if ($$4.isEmpty()) {
         $$2.a(bya.aN, $$3);
         $$2.a(bya.aO, 600);
      } else if ($$4.get().equals($$3)) {
         $$2.a(bya.aO, 600);
      }
   }

   private static Optional<bsd> b(box $$0) {
      bpy<?> $$1 = $$0.dM();
      Optional<ik> $$2 = $$1.c(bya.aN);
      if ($$2.isPresent()) {
         ik $$3 = $$2.get();
         if (a($$0, $$1, $$3)) {
            return Optional.of(new bqs($$3.b().c()));
         }

         $$1.b(bya.aN);
      }

      return d($$0);
   }

   private static boolean c(box $$0) {
      bpy<?> $$1 = $$0.dM();
      return $$1.a(bya.L);
   }

   private static boolean a(box $$0, bpy<?> $$1, ik $$2) {
      Optional<Integer> $$3 = $$1.c(bya.aO);
      cwe $$4 = $$0.dJ();
      return $$4.ad() == $$2.a() && $$4.a_($$2.b()).a(czh.aY) && $$3.isPresent();
   }

   private static Optional<bsd> d(box $$0) {
      return a($$0).map($$0x -> new bra($$0x, true));
   }

   public static Optional<apb> a(box $$0) {
      cwe $$1 = $$0.dJ();
      if (!$$1.y_() && $$1 instanceof apa $$2) {
         Optional<UUID> $$3 = $$0.dM().c(bya.aM);
         if ($$3.isPresent()) {
            if ($$2.a($$3.get()) instanceof apb $$5 && ($$5.f.d() || $$5.f.e()) && $$5.a($$0, 64.0)) {
               return Optional.of($$5);
            }

            return Optional.empty();
         }
      }

      return Optional.empty();
   }
}
