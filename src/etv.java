import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class etv extends esb {
   public static final MapCodec<etv> d = a(etv::new);

   public etv(esb.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esb.b> a(esb.a $$0) {
      return a($$0, ehd.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(est $$0, esb.a $$1) {
      iv $$2 = new iv($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new etu.a($$2));
   }

   @Override
   public esk<?> e() {
      return esk.a;
   }
}
