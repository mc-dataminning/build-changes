import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebz extends dzf {
   public static final Codec<ebz> d = a(ebz::new);

   public ebz(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      return a($$0, dop.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dzx $$0, dzf.a $$1) {
      $$0.a(new eby($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dzo<?> e() {
      return dzo.o;
   }
}
