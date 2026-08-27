import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwk extends duy {
   public static final Codec<dwk> d = a(dwk::new);

   public dwk(duy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duy.b> a(duy.a $$0) {
      return a($$0, dki.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dvq $$0, duy.a $$1) {
      gu $$2 = new gu($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dwj.a($$2));
   }

   @Override
   public dvh<?> e() {
      return dvh.a;
   }
}
