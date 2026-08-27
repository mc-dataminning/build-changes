import com.mojang.serialization.Codec;
import java.util.Optional;

public class dwo extends dvc {
   public static final Codec<dwo> d = a(dwo::new);

   public dwo(dvc.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dvc.b> a(dvc.a $$0) {
      return a($$0, dkm.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dvu $$0, dvc.a $$1) {
      gw $$2 = new gw($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dwn.a($$2));
   }

   @Override
   public dvl<?> e() {
      return dvl.a;
   }
}
