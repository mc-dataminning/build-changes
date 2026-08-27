import com.mojang.serialization.Codec;
import java.util.Optional;

public class efy extends ede {
   public static final Codec<efy> d = a(efy::new);

   public efy(ede.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      return a($$0, dso.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(edw $$0, ede.a $$1) {
      $$0.a(new efx($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public edn<?> e() {
      return edn.o;
   }
}
