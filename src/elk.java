import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class elk extends eiq {
   public static final MapCodec<elk> d = a(elk::new);

   public elk(eiq.c $$0) {
      super($$0);
   }

   @Override
   public Optional<eiq.b> a(eiq.a $$0) {
      return a($$0, dxz.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(eji $$0, eiq.a $$1) {
      $$0.a(new elj($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public eiz<?> e() {
      return eiz.o;
   }
}
