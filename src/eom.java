import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eom extends elr {
   public static final MapCodec<eom> d = a(eom::new);

   public eom(elr.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elr.b> a(elr.a $$0) {
      return a($$0, eaz.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(emj $$0, elr.a $$1) {
      $$0.a(new eol($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public ema<?> e() {
      return ema.o;
   }
}
