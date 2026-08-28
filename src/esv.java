import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class esv extends erb {
   public static final MapCodec<esv> d = a(esv::new);

   public esv(erb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<erb.b> a(erb.a $$0) {
      return a($$0, egg.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ert $$0, erb.a $$1) {
      iu $$2 = new iu($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new esu.a($$2));
   }

   @Override
   public erk<?> e() {
      return erk.a;
   }
}
