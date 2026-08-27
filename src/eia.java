import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.Optional;

public class eia extends efq {
   public static final Codec<eia> d = a(eia::new);

   public eia(efq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      int $$1 = $$0.h().a(9);
      int $$2 = $$0.h().b(9);

      for (in<daf> $$4 : $$0.c().a($$1, $$0.b().e(), $$2, 29, $$0.d().b())) {
         if (!$$4.a(avd.X)) {
            return Optional.empty();
         }
      }

      return a($$0, dva.a.c, $$1x -> a($$1x, $$0));
   }

   private static efu a(cyn $$0, dvz $$1) {
      int $$2 = $$0.d() - 29;
      int $$3 = $$0.e() - 29;
      ij $$4 = ij.c.a.a($$1);
      return new ehz.h($$1, $$2, $$3, $$4);
   }

   private static void a(egi $$0, efq.a $$1) {
      $$0.a(a($$1.h(), $$1.f()));
   }

   public static egf a(cyn $$0, long $$1, egf $$2) {
      if ($$2.a()) {
         return $$2;
      } else {
         dvz $$3 = new dvz(new dvb(dvp.a()));
         $$3.c($$1, $$0.e, $$0.f);
         efu $$4 = $$2.c().get(0);
         efi $$5 = $$4.f();
         int $$6 = $$5.h();
         int $$7 = $$5.j();
         ij $$8 = ij.c.a.a($$3);
         ij $$9 = Objects.requireNonNullElse($$4.i(), $$8);
         efu $$10 = new ehz.h($$3, $$6, $$7, $$9);
         egi $$11 = new egi();
         $$11.a($$10);
         return $$11.a();
      }
   }

   @Override
   public efz<?> e() {
      return efz.j;
   }
}
