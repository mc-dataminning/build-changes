import com.mojang.serialization.Codec;
import java.util.Optional;

public class edy extends ebe {
   public static final Codec<edy> d = a(edy::new);

   public edy(ebe.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      return a($$0, dqo.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(ebw $$0, ebe.a $$1) {
      $$0.a(new edx($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ebn<?> e() {
      return ebn.o;
   }
}
