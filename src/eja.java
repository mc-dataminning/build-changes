import com.mojang.serialization.Codec;
import java.util.Optional;

public class eja extends egg {
   public static final Codec<eja> d = a(eja::new);

   public eja(egg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<egg.b> a(egg.a $$0) {
      return a($$0, dvq.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(egy $$0, egg.a $$1) {
      $$0.a(new eiz($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public egp<?> e() {
      return egp.o;
   }
}
