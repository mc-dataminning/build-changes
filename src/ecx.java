import com.mojang.serialization.Codec;
import java.util.Optional;

public class ecx extends ebe {
   public static final Codec<ecx> d = a(ecx::new);

   public ecx(ebe.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ebe.b> a(ebe.a $$0) {
      return a($$0, dqo.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ebw $$0, ebe.a $$1) {
      hz $$2 = new hz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ecw.a($$2));
   }

   @Override
   public ebn<?> e() {
      return ebn.a;
   }
}
