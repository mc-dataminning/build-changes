import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class enj extends eko {
   public static final MapCodec<enj> d = a(enj::new);

   public enj(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      return a($$0, dzw.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(elg $$0, eko.a $$1) {
      $$0.a(new eni($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ekx<?> e() {
      return ekx.o;
   }
}
