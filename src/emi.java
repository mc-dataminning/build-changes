import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class emi extends eko {
   public static final MapCodec<emi> d = a(emi::new);

   public emi(eko.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eko.b> a(eko.a $$0) {
      return a($$0, dzw.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(elg $$0, eko.a $$1) {
      je $$2 = new je($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new emh.a($$2));
   }

   @Override
   public ekx<?> e() {
      return ekx.a;
   }
}
