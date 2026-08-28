import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class enn extends elc {
   public static final MapCodec<enn> d = a(enn::new);

   public enn(elc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jn<dfh> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(aws.X)) {
            return Optional.empty();
         }
      }

      return a($$0, eak.a.c, $$1x -> a($$1x, $$0));
   }

   private static elg a(ddm $$0, ebj $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      jj $$4 = jj.c.a.a($$1);
      return new enm.h($$1, $$2, $$3, $$4);
   }

   private static void a(elu $$0, elc.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static elr a(ddm $$0, long $$1, elr $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         ebj $$3 = new ebj(new eal(eaz.a()));
         $$3.c($$1, $$0.e, $$0.f);
         elg $$4 = $$2.c().get(0);
         eku $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         jj $$8 = jj.c.a.a($$3);
         jj $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         elg $$10 = new enm.h($$3, $$6, $$7, $$9);
         elu $$11 = new elu();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ell<?> e() {
      return ell.j;
   }
}
