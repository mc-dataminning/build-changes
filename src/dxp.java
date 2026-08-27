import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxp extends dvc {
   public static final Codec<dxp> d = a(dxp::new);

   public dxp(dvc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      return a($$0, dkm.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dvu $$0, dvc.a $$1) {
      $$0.a(new dxo($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dvl<?> e() {
      return dvl.o;
   }
}
