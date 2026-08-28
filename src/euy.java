import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class euy extends esd {
   public static final MapCodec<euy> d = a(euy::new);

   public euy(esd.c $$0) {
      super($$0);
   }

   @Override
   public Optional<esd.b> a(esd.a $$0) {
      return a($$0, ehf.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(esv $$0, esd.a $$1) {
      $$0.a(new eux($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public esm<?> e() {
      return esm.o;
   }
}
