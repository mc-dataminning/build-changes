import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxq extends dvd {
   public static final Codec<dxq> d = a(dxq::new);

   public dxq(dvd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvd.b> a(dvd.a $$0) {
      return a($$0, dkn.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dvv $$0, dvd.a $$1) {
      $$0.a(new dxp($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dvm<?> e() {
      return dvm.o;
   }
}
