import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class enl extends elr {
   public static final MapCodec<enl> d = a(enl::new);

   public enl(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      return a($$0, eaz.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(emj $$0, elr.a $$1) {
      jg $$2 = new jg($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new enk.a($$2));
   }

   @Override
   public ema<?> e() {
      return ema.a;
   }
}
