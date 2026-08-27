import com.mojang.serialization.Codec;
import java.util.Optional;

public class dza extends dxh {
   public static final Codec<dza> d = a(dza::new);

   public dza(dxh.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dxh.b> a(dxh.a $$0) {
      return a($$0, dmr.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(dxz $$0, dxh.a $$1) {
      ht $$2 = new ht($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new dyz.a($$2));
   }

   @Override
   public dxq<?> e() {
      return dxq.a;
   }
}
