import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eth extends ern {
   public static final MapCodec<eth> d = a(eth::new);

   public eth(ern.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ern.b> a(ern.a $$0) {
      return a($$0, egs.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(esf $$0, ern.a $$1) {
      iv $$2 = new iv($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new etg.a($$2));
   }

   @Override
   public erw<?> e() {
      return erw.a;
   }
}
