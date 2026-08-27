import com.mojang.serialization.Codec;
import java.util.Optional;

public class eca extends dzg {
   public static final Codec<eca> d = a(eca::new);

   public eca(dzg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      return a($$0, doq.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dzy $$0, dzg.a $$1) {
      $$0.a(new ebz($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dzp<?> e() {
      return dzp.o;
   }
}
