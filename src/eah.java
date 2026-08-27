import com.mojang.serialization.Codec;
import java.util.Optional;

public class eah extends dyo {
   public static final Codec<eah> d = a(eah::new);

   public eah(dyo.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dyo.b> a(dyo.a $$0) {
      return a($$0, dny.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dzg $$0, dyo.a $$1) {
      hv $$2 = new hv($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eag.a($$2));
   }

   @Override
   public dyx<?> e() {
      return dyx.a;
   }
}
