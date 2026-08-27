import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwj extends dux {
   public static final Codec<dwj> d = a(dwj::new);

   public dwj(dux.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dux.b> a(dux.a $$0) {
      return a($$0, dkh.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dvp $$0, dux.a $$1) {
      gv $$2 = new gv($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dwi.a($$2));
   }

   @Override
   public dvg<?> e() {
      return dvg.a;
   }
}
