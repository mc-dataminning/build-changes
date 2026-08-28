import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class eke extends eil {
   public static final MapCodec<eke> d = a(eke::new);

   public eke(eil.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eil.b> a(eil.a $$0) {
      return a($$0, dxv.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ejd $$0, eil.a $$1) {
      iz $$2 = new iz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ekd.a($$2));
   }

   @Override
   public eiu<?> e() {
      return eiu.a;
   }
}
