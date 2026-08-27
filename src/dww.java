import com.mojang.serialization.Codec;
import java.util.Optional;

public class dww extends dvk {
   public static final Codec<dww> d = a(dww::new);

   public dww(dvk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      return a($$0, dku.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dwc $$0, dvk.a $$1) {
      gw $$2 = new gw($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dwv.a($$2));
   }

   @Override
   public dvt<?> e() {
      return dvt.a;
   }
}
