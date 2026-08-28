import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class enx extends elc {
   public static final MapCodec<enx> d = a(enx::new);

   public enx(elc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      return a($$0, eak.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(elu $$0, elc.a $$1) {
      $$0.a(new enw($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ell<?> e() {
      return ell.o;
   }
}
