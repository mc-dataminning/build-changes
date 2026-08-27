import com.mojang.serialization.Codec;
import java.util.Optional;

public class dzp extends dwv {
   public static final Codec<dzp> d = a(dzp::new);

   public dzp(dwv.c $$0) {
      super($$0);
   }

   @Override
   public Optional<dwv.b> a(dwv.a $$0) {
      return a($$0, dmf.a.a, $$1 -> a($$1, $$0));
   }

   private static void a(dxn $$0, dwv.a $$1) {
      $$0.a(new dzo($$1.f(), $$1.h().d(), $$1.h().e()));
   }

   @Override
   public dxe<?> e() {
      return dxe.o;
   }
}
