import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxm extends duz {
   public static final Codec<dxm> d = a(dxm::new);

   public dxm(duz.c $$0) {
      super($$0);
   }

   @Override
   public Optional<duz.b> a(duz.a $$0) {
      return a($$0, dkj.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dvr $$0, duz.a $$1) {
      $$0.a(new dxl($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dvi<?> e() {
      return dvi.o;
   }
}
