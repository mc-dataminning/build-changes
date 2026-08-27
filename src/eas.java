import com.mojang.serialization.Codec;
import java.util.Optional;

public class eas extends dyz {
   public static final Codec<eas> d = a(eas::new);

   public eas(dyz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyz.b> a(dyz.a $$0) {
      return a($$0, doj.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dzr $$0, dyz.a $$1) {
      hx $$2 = new hx($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ear.a($$2));
   }

   @Override
   public dzi<?> e() {
      return dzi.a;
   }
}
