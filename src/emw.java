import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class emw extends elc {
   public static final MapCodec<emw> d = a(emw::new);

   public emw(elc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<elc.b> a(elc.a $$0) {
      return a($$0, eak.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(elu $$0, elc.a $$1) {
      je $$2 = new je($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new emv.a($$2));
   }

   @Override
   public ell<?> e() {
      return ell.a;
   }
}
