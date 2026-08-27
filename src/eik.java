import com.mojang.serialization.Codec;
import java.util.Optional;

public class eik extends efq {
   public static final Codec<eik> d = a(eik::new);

   public eik(efq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<efq.b> a(efq.a $$0) {
      return a($$0, dva.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(egi $$0, efq.a $$1) {
      $$0.a(new eij($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public efz<?> e() {
      return efz.o;
   }
}
