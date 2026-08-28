import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekd extends eik {
   public static final MapCodec<ekd> d = a(ekd::new);

   public ekd(eik.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eik.b> a(eik.a $$0) {
      return a($$0, dxu.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(ejc $$0, eik.a $$1) {
      iz $$2 = new iz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ekc.a($$2));
   }

   @Override
   public eit<?> e() {
      return eit.a;
   }
}
