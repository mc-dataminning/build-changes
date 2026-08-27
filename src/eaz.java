import com.mojang.serialization.Codec;
import java.util.Optional;

public class eaz extends dzg {
   public static final Codec<eaz> d = a(eaz::new);

   public eaz(dzg.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dzg.b> a(dzg.a $$0) {
      return a($$0, doq.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dzy $$0, dzg.a $$1) {
      hx $$2 = new hx($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eay.a($$2));
   }

   @Override
   public dzp<?> e() {
      return dzp.a;
   }
}
