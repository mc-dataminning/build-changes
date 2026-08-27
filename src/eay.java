import com.mojang.serialization.Codec;
import java.util.Optional;

public class eay extends dzf {
   public static final Codec<eay> d = a(eay::new);

   public eay(dzf.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzf.b> a(dzf.a $$0) {
      return a($$0, dop.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dzx $$0, dzf.a $$1) {
      hx $$2 = new hx($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eax.a($$2));
   }

   @Override
   public dzo<?> e() {
      return dzo.a;
   }
}
