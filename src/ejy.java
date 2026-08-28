import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class ejy extends eif {
   public static final MapCodec<ejy> d = a(ejy::new);

   public ejy(eif.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eif.b> a(eif.a $$0) {
      return a($$0, dxp.a.c, $$1 -> a($$1, $$0));
   }

   private static void a(eix $$0, eif.a $$1) {
      iz $$2 = new iz($$1.h().a(9), 90, $$1.h().b(9));
      $$0.a(new ejx.a($$2));
   }

   @Override
   public eio<?> e() {
      return eio.a;
   }
}
