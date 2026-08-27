import com.mojang.serialization.Codec;
import java.util.Optional;

public class eci extends dzo {
   public static final Codec<eci> d = a(eci::new);

   public eci(dzo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      return a($$0, doy.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eag $$0, dzo.a $$1) {
      $$0.a(new ech($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dzx<?> e() {
      return dzx.o;
   }
}
