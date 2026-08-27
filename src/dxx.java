import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxx extends dvk {
   public static final Codec<dxx> d = a(dxx::new);

   public dxx(dvk.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvk.b> a(dvk.a $$0) {
      return a($$0, dku.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dwc $$0, dvk.a $$1) {
      $$0.a(new dxw($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dvt<?> e() {
      return dvt.o;
   }
}
