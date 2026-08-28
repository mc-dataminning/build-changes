import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ekt extends eij {
   public static final MapCodec<ekt> d = a(ekt::new);

   public ekt(eij.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eij.b> a(eij.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (ji<dcw> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awn.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dxt.a.c, $$1x -> a($$1x, $$0));
   }

   private static ein a(dbe $$0, dys $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      je $$4 = je.c.a.a($$1);
      return new eks.h($$1, $$2, $$3, $$4);
   }

   private static void a(ejb $$0, eij.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eiy a(dbe $$0, long $$1, eiy $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dys $$3 = new dys(new dxu(dyi.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ein $$4 = $$2.c().get(0);
         eib $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         je $$8 = je.c.a.a($$3);
         je $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ein $$10 = new eks.h($$3, $$6, $$7, $$9);
         ejb $$11 = new ejb();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public eis<?> e() {
      return eis.j;
   }
}
