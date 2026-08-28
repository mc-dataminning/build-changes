import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ekb extends eii {
   public static final MapCodec<ekb> d = a(ekb::new);

   public ekb(eii.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eii.b> a(eii.a $$0) {
      return a($$0, dxs.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eja $$0, eii.a $$1) {
      iz $$2 = new iz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new eka.a($$2));
   }

   @Override
   public eir<?> e() {
      return eir.a;
   }
}
