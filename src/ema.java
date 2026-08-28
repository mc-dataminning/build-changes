import com.mojang.serialization.MapCodec;
import java.util.Objects;
import java.util.Optional;

public class ema extends ejp {
   public static final MapCodec<ema> d = a(ema::new);

   public ema(ejp.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ejp.b> a(ejp.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (jm<ddw> $$4 : $$0.c().a($$1, $$0.b().f(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(awd.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dyy.a.c, $$1x -> a($$1x, $$0));
   }

   private static ejt a(dcd $$0, dzx $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ji $$4 = ji.c.a.a($$1);
      return new elz.h($$1, $$2, $$3, $$4);
   }

   private static void a(ekh $$0, ejp.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static eke a(dcd $$0, long $$1, eke $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dzx $$3 = new dzx(new dyz(dzn.a()));
         $$3.c($$1, $$0.e, $$0.f);
         ejt $$4 = $$2.c().get(0);
         ejh $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ji $$8 = ji.c.a.a($$3);
         ji $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         ejt $$10 = new elz.h($$3, $$6, $$7, $$9);
         ekh $$11 = new ekh();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public ejy<?> e() {
      return ejy.j;
   }
}
