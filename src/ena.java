import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ena extends elg {
   public static final MapCodec<ena> d = a(ena::new);

   public ena(elg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elg.b> a(elg.a $$0) {
      return a($$0, eao.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ely $$0, elg.a $$1) {
      jf $$2 = new jf($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new emz.a($$2));
   }

   @Override
   public elp<?> e() {
      return elp.a;
   }
}
