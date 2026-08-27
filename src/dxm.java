import com.mojang.serialization.Codec;
import java.util.Optional;

public class dxm extends dwa {
   public static final Codec<dxm> d = a(dxm::new);

   public dxm(dwa.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwa.b> a(dwa.a $$0) {
      return a($$0, dlk.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dws $$0, dwa.a $$1) {
      ht $$2 = new ht($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dxl.a($$2));
   }

   @Override
   public dwj<?> e() {
      return dwj.a;
   }
}
