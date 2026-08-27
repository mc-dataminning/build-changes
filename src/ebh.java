import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebh extends dzo {
   public static final Codec<ebh> d = a(ebh::new);

   public ebh(dzo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzo.b> a(dzo.a $$0) {
      return a($$0, doy.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eag $$0, dzo.a $$1) {
      hx $$2 = new hx($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ebg.a($$2));
   }

   @Override
   public dzx<?> e() {
      return dzx.a;
   }
}
