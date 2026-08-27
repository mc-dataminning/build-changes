import com.mojang.serialization.Codec;
import java.util.Optional;

public class eex extends ede {
   public static final Codec<eex> d = a(eex::new);

   public eex(ede.c $$0) {
      super($$0);
   }

   @Override
   public Optional<ede.b> a(ede.a $$0) {
      return a($$0, dso.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(edw $$0, ede.a $$1) {
      ib $$2 = new ib($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eew.a($$2));
   }

   @Override
   public edn<?> e() {
      return edn.a;
   }
}
